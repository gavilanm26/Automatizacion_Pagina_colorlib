package Automatizacion.Pagina.Colorlib.definition;

import java.util.List;

import Automatizacion.Pagina.Colorlib.steps.ColorlibFormValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PopupValidationDefinition {
	
	@Steps
	Automatizacion.Pagina.Colorlib.steps.PopupValidationSteps PopupValidationSteps;
	
	@Steps
	ColorlibFormValidationSteps colorlibFormValidationSteps;
	
	@Given("^Autentico en colorlib con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void autentico_en_colorlib_con_usuario_y_clave(String usuario, String clave){
		PopupValidationSteps.login_colorlib(usuario, clave);
	}

	@Given("^Ingreso a la funcionalidad Forms Validation$")
	public void ingreso_a_la_funcionalidad_Forms_Validation(){
	    PopupValidationSteps.ingresar_form_validation();
	}

	@When("^Diligencio formulario Popup Validation$")
	public void diligencio_formulario_Popup_Validation(DataTable dtDatosForm){
	    List<List<String>> data = dtDatosForm.raw();//Se crea un objeto “data” tipo “List<>” que contendrá toda la matriz. 
	    
	    for(int i = 1; i < data.size(); i++) {//Se crea un ciclo que recorrerá el objeto hasta el tamaño de la matriz
	    	colorlibFormValidationSteps.diligenciar_popup_datos_tabla(data, i);//Se enviar por parámetros al steps la data y el nro de la fila a leer (i) 
	    	try {
	    		Thread.sleep(5000);//Se agrega un delay (Thread.sleep();) para hacer una espera entre ejecuciones, el tiempo está dado en milisegundos. 
	    	}catch(InterruptedException e){}
	    }
	}

	@Then("^Verifico ingreso exitoso$")
	public void verifico_ingreso_exitoso(){
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
	}
	@Then("^Verificar que se presente globo informativo de validación$")
	public void verificar_ingreso_datos_formulario_con_errorers(){
		colorlibFormValidationSteps.verificar_ingreso_datos_formulario_con_errorers();
	}

}
