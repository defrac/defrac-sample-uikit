package com.defrac.sample.uikit;


import defrac.ios.foundation.NSDictionary;
import defrac.ios.uikit.*;

public class UIKitSampleDelegate extends UIApplicationDelegate.SimpleDelegate {
  private UIWindow window;

  @Override
  public boolean applicationDidFinishLaunchingWithOptions(UIApplication application, NSDictionary launchOptions) {
    // The job of the delegate is to create a UIWindow and
    // assign a rootViewController for the application
    window = new UIWindow(UIScreen.mainScreen().bounds);
    window.backgroundColor = UIColor.whiteColor();
    window.rootViewController = new UIKitSampleViewController();
    window.makeKeyAndVisible();

    return true;
  }
}
