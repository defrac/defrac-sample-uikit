package com.defrac.sample.uikit;

import cocoa.coreGraphics.CGRect;
import cocoa.touch.uikit.*;

public class UIKitSampleViewController extends UIViewController implements Runnable {
  private UITextField textField;
  private UILabel label;
  private UITextFieldDelegate delegate = new UITextFieldDelegate.SimpleDelegate() {
    @Override
    public boolean textFieldShouldReturn(UITextField textField) {
      textField.resignFirstResponder();
      return false;
    }
  };

  @Override
  public void viewDidLoad() {
    super.viewDidLoad();

    textField = UITextField.alloc().initWithFrame(CGRect.make(10.0f, 30.0f, 300.0f, 30.0f));
    textField.borderStyle = UITextBorderStyle.RoundedRect;
    textField.delegate = delegate;
    view.addSubview(textField);

    UIButton button = UIButton.buttonWithType(UIButtonType.RoundedRect);
    button.frame = CGRect.make(110.0f, 200.0f, 100.0f, 30.0f);
    button.setTitle("Press Me!", UIControlState.Normal);
    view.addSubview(button);

    // There are multiple options when adding a callback.
    // You can create a selector using SEL.of and defrac checks that the method
    // is valid (and makes sure to compile it!). We also provide a more convenient
    // method that accepts a Runnable and does everything for you.
    //
    // The version using SEL:
    // button.addTarget(this, SEL.of("buttonPressed"), UIControlEvents.TouchUpInside);
    //
    button.addTarget(this, UIControlEvents.TouchUpInside);

    label = UILabel.alloc().initWithFrame(CGRect.make(115.0f, 150.0f, 200.0f, 30.0f));
    label.text = "Hello World!";
    view.addSubview(label);
  }

  // This method is unused. It is an example to show how you could
  // create the selector manually and it would be called on button press
  public void buttonPressed() {
    label.text = textField.text;
  }

  // We implement the Runnable interface and add the controller
  // as a target to the button. The run() method is executed
  // when the button is pressed
  @Override
  public void run() {
    label.text = textField.text;
  }
}
