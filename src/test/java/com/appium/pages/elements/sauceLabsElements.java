package com.appium.pages.elements;

import com.appium.stepsDefinitions.mobilePageObject;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class sauceLabsElements extends mobilePageObject {

    // HOME SCREEN

    @AndroidFindBy(accessibility = "open menu")
    public MobileElement HOME_SCREEN_BURGER_BUTTON;

    // SHOP PAGE SCREEN

    public static String productoGenerico = "(//android.widget.TextView[@text=\"%s\"])[1]";

    public static String escogerColor = "//android.view.ViewGroup[@content-desc=\"%s circle\"]";

    public static String sumarMismoProducto = "//android.view.ViewGroup[@content-desc=\"counter plus button\"]/android.widget.ImageView";

    public static String addCarrito = "//android.view.ViewGroup[@content-desc=\"Add To Cart button\"]/android.widget.TextView";

    public static String comprobarCarrito = "(//android.view.ViewGroup[@content-desc=\"product row\"])[1]/android.widget.ImageView";

    // SUCCESSFUL SHOPPING



}
