package com.appium.pages.confluedentScreens;

import com.appium.pages.elements.confluedentElements;
import com.appium.scripts.configuration;

import java.util.Properties;

public class singUpScreen extends confluedentElements {
    // PROPERTIES

    private static Properties properties = configuration.USER_INFO_PROPERTIES_FILE("Confluedent");

    // ELEMENTS
  /*  private static String
            nameTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_NAME_TEXT_AREA_REF;
    private static String lastNameTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_LAST_NAME_TEXT_AREA_REF;
    private static String NIFTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_NIF_TEXT_AREA_REF;
    private static String addressTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_ADDRESS_TEXT_AREA_REF;
    private static String phoneTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_PHONE_NUMBER_TEXT_AREA_REF;
    private static String emailTextAreaRef = confluedentConfiguration.REGISTER_SCREEN_EMAIL_TEXT_AREA_REF;
    private static String passTextAredRef = confluedentConfiguration.REGISTER_SCREEN_PASSWORD_TEXT_AREA_REF;
    private static String saveButtonRef = confluedentConfiguration.REGISTER_SCREEN_REGISTER_BUTTON_REF;*/
    public static confluedentElements registerElements = new confluedentElements();

    public static void fillsFields() {
        String address = properties.getProperty("country") + ", "
                + properties.getProperty("province") + ", "
                + properties.getProperty("city") + ", "
                + properties.getProperty("zip_code") + ", "
                + properties.getProperty("type_street") + ", "
                + properties.getProperty("street") + ", "
                + properties.getProperty("home_number") + ", "
                + properties.getProperty("buildin_block") + ", "
                + properties.getProperty("stairs") + ", "
                + properties.getProperty("floor") + ", "
                + properties.getProperty("door");
        setText(registerElements.REGISTER_SCREEN_NAME_TEXT_INPUT, properties.getProperty("first_name"));
        setText(registerElements.REGISTER_SCREEN_LAST_NAME_TEXT_Input, properties.getProperty("last_name"));
        setText(registerElements.REGISTER_SCREEN_DNI_TEXT_INPUT, properties.getProperty("nif"));
        setText(registerElements.REGISTER_SCREEN_ADDRESS_TEXT_INPUT, address);
        setText(registerElements.REGISTER_SCREEN_PHONE_TEXT_INPUT, properties.getProperty("prefix_phone") + properties.getProperty("phone_number"));
        setText(registerElements.REGISTER_SCREEN_EMAIL_TEXT_INPUT, "");
        setText(registerElements.REGISTER_SCREEN_PASS_TEXT_INPUT, "");
    }

    public static void clickToRegisterButton() {
        click(registerElements.REGISTER_SCREEN_SAVE_BUTTON);
        //commons.click(saveButtonRef);
    }

}
