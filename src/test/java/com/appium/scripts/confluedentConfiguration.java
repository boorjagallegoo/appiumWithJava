package com.appium.scripts;

import java.util.Properties;

import static com.appium.scripts.configuration.KEY_PROPERTIES_FILE_PATH;

public class confluedentConfiguration {
    ///////////////////////////////////////////////////////////////////////////////
    // OBJECT REPOSITORY
    ///////////////////////////////////////////////////////////////////////////////

    public static final String OBJECTS_PATH = "com.example.confluedent:id/";

    // LOGIN SCREEN
    public static final String LOGIN_SCREEN_EMAIL_TEXT_AREA_REF = OBJECTS_PATH + "emailEditText";
    public static final String LOGIN_SCREEN_LOGIN_BUTTON_REF = OBJECTS_PATH + "loginButton";
    public static final String LOGIN_SCREEN_PASS_TEXT_AREA_REF = OBJECTS_PATH + "passwordEditText";
    public static final String LOGIN_SCREEN_RECOVERY_PASS_BUTTON_REF = OBJECTS_PATH + "recoveryPass";
    public static final String LOGIN_SCREEN_SIGN_UP_BUTTON_REF = OBJECTS_PATH + "singUpButton";

    // REGISTER SCREEN
    public static final String REGISTER_SCREEN_NAME_TEXT_AREA_REF = OBJECTS_PATH + "NombreTextView";
    public static final String REGISTER_SCREEN_LAST_NAME_TEXT_AREA_REF = OBJECTS_PATH + "ApellidosTextView";
    public static final String REGISTER_SCREEN_NIF_TEXT_AREA_REF = OBJECTS_PATH + "dniTextView";
    public static final String REGISTER_SCREEN_ADDRESS_TEXT_AREA_REF = OBJECTS_PATH + "addressTextView2";
    public static final String REGISTER_SCREEN_PHONE_NUMBER_TEXT_AREA_REF = OBJECTS_PATH + "iphoneTextView";
    public static final String REGISTER_SCREEN_EMAIL_TEXT_AREA_REF = OBJECTS_PATH + "EmailTextView";
    public static final String REGISTER_SCREEN_PASSWORD_TEXT_AREA_REF = OBJECTS_PATH + "passTextView";
    public static final String REGISTER_SCREEN_REGISTER_BUTTON_REF = OBJECTS_PATH + "saveButton";


}
