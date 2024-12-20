package com.mobile.stepsdefinitions;
import com.mobile.steps.storeSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class StoreStepsDef {
    @Steps
    storeSteps prodScreen;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {

    }
    @Given("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        // Write code here that turns the phrase above into concrete actions
        prodScreen.welcomeSuccess();
    }
    @When("agrego {int} del siguiente producto {string}")
    public void agrego_del_siguiente_producto(int cantidad, String nomProducto) {
        prodScreen.btnprod();
        prodScreen.valProducto(nomProducto);
        prodScreen.valCantidad(cantidad);
        prodScreen.Agregar();
        prodScreen.ClickCarrito();
    }
    @Then("valido el carrito de compra actualice correctamente")
    public void valido_el_carrito_de_compra_actualice_correctamente() {
        prodScreen.ValCarrito();
    }
}
