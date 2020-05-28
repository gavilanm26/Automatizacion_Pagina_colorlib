package Automatizacion.Pagina.Colorlib.steps;

import Automatizacion.Pagina.Colorlib.pageobjects.ColorlibLoginPage;
import Automatizacion.Pagina.Colorlib.pageobjects.ColorlibMenuPage;


import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
	
	ColorlibLoginPage colorlibLoginPage;
	ColorlibMenuPage colorlibMenuPage;
	ColorlibFormValidationSteps colorlibFormValidationSteps;
	
	@Step
	public void login_colorlib(String strUsuario, String strPass) {
//  	a. abrir el navegador con la url de prueba
		
		colorlibLoginPage.open();
//		b. ingresar usuario demo
//		c. ingresar password demo
//		d. click en boton sign in
		
		colorlibLoginPage.IngresarDatos(strUsuario, strPass);
//		e. verificar la autenticacion (label en home)
		colorlibLoginPage.VerificaHome();
		
	}
	
	@Step
	public void ingresar_form_validation() {
		colorlibMenuPage.menuFormValidation();
	}
	
	@Step
	public void colorlibFormValidationSteps() {
		
	}

}
