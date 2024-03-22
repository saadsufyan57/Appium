package org.savyour;

import io.appium.java_client.remote.MobileCapabilityType;

public interface MobileCapabilityTypeEx extends MobileCapabilityType {
    String APP_ACTIVITY = "appActivity";
    String APP_PACKAGE = "appPackage";
    String UNICODE_KEYBOARD = "unicodeKeyboard";
    String RESET_KEYBOARD = "resetKeyboard";

}
