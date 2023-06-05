package com.appium.pages.elements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class confluedentElements extends mobilePageObject {

    // LOGIN SCREEN
    @AndroidFindBy(id = "com.example.confluedent:id/loginButton")
    public MobileElement LOGIN_SCREEN_LOGIN_BUTTON;

    @AndroidFindBy(id = "com.example.confluedent:id/emailEditText")
    public MobileElement LOGIN_SCREEN_EMAIL_TEXT_INPUT;

    @AndroidFindBy(id = "com.example.confluedent:id/passwordEditText")
    public MobileElement LOGIN_SCREEN_PASS_TEXT_INPUT;

    @AndroidFindBy(id = "android:id/message")
    public MobileElement LOGIN_SCREEN_MESSAGE_POPUP;

    @AndroidFindBy(id = "com.example.confluedent:id/signUpButton")
    public MobileElement LOGIN_SCREEN_SIGN_UP_BUTTON;

    // REGISTER SCREEN
    @AndroidFindBy(id = "com.example.confluedent:id/NombreTextView")
    public MobileElement REGISTER_SCREEN_NAME_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/ApellidosTextView")
    public MobileElement REGISTER_SCREEN_LAST_NAME_TEXT_Input;
    @AndroidFindBy(id = "com.example.confluedent:id/dniTextView")
    public MobileElement REGISTER_SCREEN_DNI_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/addressTextView2")
    public MobileElement REGISTER_SCREEN_ADDRESS_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/phoneTextView")
    public MobileElement REGISTER_SCREEN_PHONE_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/EmailTextView")
    public MobileElement REGISTER_SCREEN_EMAIL_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/passTextView")
    public MobileElement REGISTER_SCREEN_PASS_TEXT_INPUT;
    @AndroidFindBy(id = "com.example.confluedent:id/saveButton")
    public MobileElement REGISTER_SCREEN_SAVE_BUTTON;
}
