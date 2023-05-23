package kraken.qa.stepdefinitions;


import Utils.KrakenWeb;
import io.cucumber.java.es.*;
import kraken.web.steps.StepsPage;
import net.thucydides.core.annotations.Steps;

public class StepDefinitions extends KrakenWeb {

    @Steps
    StepsPage stepsPage;



    @Dado("Que me encuentro logueado en la pagina de pruebas")
    public void queMeEncuentroLogueadoEnLaPaginaDePruebas() {
        configuracionesIniciales();
        stepsPage.openUrlPage();
    }
    @Cuando("Ingreso a la opcion de mi cuenta")
    public void ingresoALaOpcionDeMiCuenta() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Cuando("luego a la opcion editar")
    public void luegoALaOpcionEditar() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Cuando("ingreso unos datos nuevos")
    public void ingresoUnosDatosNuevos() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Entonces("Validación que los datos se actualicen correctamente")
    public void validaciónQueLosDatosSeActualicenCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
    }

}
