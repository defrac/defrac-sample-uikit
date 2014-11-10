package com.defrac.sample.uikit;

import static defrac.ios.uikit.UIKit.applicationMain;

public class UIKitApp {
  public static void main(String[] args) {
    // If we want to write an iOS-only app the most simple
    // way to start is by calling UIApplicationMain with
    // your delegate.
    //
    // This app is a direct translation of the following tutorial:
    //   https://medium.com/on-coding/67cc41319bd8
    applicationMain(args, null, UIKitSampleDelegate.class);
  }
}
