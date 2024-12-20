package com.mobile.steps;

import com.mobile.screens.ProdsScreen;
import org.junit.Assert;

public class storeSteps {

    ProdsScreen prodsScreen;


    public void welcomeSuccess() {
        Assert.assertTrue("Visibilidad de los products", prodsScreen.isProductDisplayed());
    }

    public void btnprod() {
        prodsScreen.btnProductClick();
    }

    public void valProducto(String nomProducto) {
        Assert.assertEquals("Nombre del producto",nomProducto,prodsScreen.prodName());
    }

    public void valCantidad(int cantidad) {
        for(int i=0;i<cantidad;i++) {
            prodsScreen.AddQuantity();
        }
    }

    public void Agregar() {
        prodsScreen.agregarCart();
    }

    public void ClickCarrito() {
        prodsScreen.logoCart();
    }

    public void ValCarrito() {
        prodsScreen.valQuant();
    }
}
