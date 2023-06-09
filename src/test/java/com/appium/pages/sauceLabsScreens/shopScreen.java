package com.appium.pages.sauceLabsScreens;

import com.appium.pages.elements.sauceLabsElements;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.appium.pages.baseAppium.driver;

public class shopScreen extends sauceLabsElements {

    // When: Click en el producto que tu quieras, por el texto.
    public static void genericClickItem(String item) {
        String xpath = String.format(sauceLabsElements.productoGenerico, item);
        click(findElementByXpath(xpath));
    }

    public static MobileElement findElementByXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        return (MobileElement) element;
    }

    // And: Elija el color si se puede, de lo contrario, deje el color predeterminado si lo hay.
    public static void selectColorItem(String item) {
        String xpath = String.format(sauceLabsElements.escogerColor, item);
        if (isPresent(findElementByXpath(xpath))) {
            click(findElementByXpath(xpath));
        }
    }

    // And: Añadir un determinado numero de productos.
    public static void addTheSameItem(String item) {
        String xpath = String.format(sauceLabsElements.sumarMismoProducto, item);
        click(findElementByXpath(xpath));
        String xpath2 = String.format(sauceLabsElements.addCarrito, item);
        click(findElementByXpath(xpath2));
    }

    // Then: Comprobar que el numero de productos es correcto.

    public static void checkCart (String item) {
        String xpath = String.format(sauceLabsElements.comprobarCarrito, item);
    }

}











