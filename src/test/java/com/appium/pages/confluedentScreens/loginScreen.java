package com.appium.pages.confluedentScreens;

import com.appium.pages.elements.confluedentElements;
import com.appium.scripts.commons;
import com.appium.scripts.confluedentConfiguration;

public class loginScreen extends confluedentElements {
    // ELEMENTS
    //public static String emailTextAreaRef = confluedentConfiguration.LOGIN_SCREEN_EMAIL_TEXT_AREA_REF;
    //public static String loginButtonRef = confluedentConfiguration.LOGIN_SCREEN_LOGIN_BUTTON_REF;
    //public static String passTextAreaRef = confluedentConfiguration.LOGIN_SCREEN_PASS_TEXT_AREA_REF;
    public static String recoveryPassButtonRef = confluedentConfiguration.LOGIN_SCREEN_RECOVERY_PASS_BUTTON_REF;
    public static String signUpButtonRef = confluedentConfiguration.LOGIN_SCREEN_SIGN_UP_BUTTON_REF;

    public static confluedentElements loginElements = new confluedentElements();

    public static void userEnterCredentials(String mail, String pass) {
        setText(loginElements.LOGIN_SCREEN_EMAIL_TEXT_INPUT, mail);
        setText(loginElements.LOGIN_SCREEN_PASS_TEXT_INPUT, pass);
        //commons.setText(emailTextAreaRef, mail);
        //commons.setText(passTextAreaRef, pass);
    }

    public static void clickToLoginButton() {
        click(loginElements.LOGIN_SCREEN_MESSAGE_POPUP);
    }

    public static void clickToRecoveryPassButton() {
      //  click(recoveryPassButtonRef);
    }

    public static void clickToSignUpButton() {
        click(loginElements.LOGIN_SCREEN_SIGN_UP_BUTTON);
        //commons.click(signUpButtonRef);
    }

    public static boolean verifyMessageText(String text) {
        return verifyElementHasText(loginElements.LOGIN_SCREEN_MESSAGE_POPUP, text);
    }
}
