package Automatizacion.Pagina.Colorlib.steps;

import java.util.List;

import Automatizacion.Pagina.Colorlib.pageobjects.ColorlibFormValidationPage;

import net.thucydides.core.annotations.Step;

public class ColorlibFormValidationSteps {
	
	
	ColorlibFormValidationPage ColorlibFormValidationPage;
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id) {
		ColorlibFormValidationPage.Requiered(data.get(id).get(0).trim());
		ColorlibFormValidationPage.Select_Sport(data.get(id).get(1).trim());
		ColorlibFormValidationPage.Multiple_Select(data.get(id).get(2).trim());
		ColorlibFormValidationPage.Multiple_Select(data.get(id).get(3).trim());
		ColorlibFormValidationPage.Url(data.get(id).get(4).trim());
		ColorlibFormValidationPage.Email(data.get(id).get(5).trim());
		ColorlibFormValidationPage.Password(data.get(id).get(6).trim());
		ColorlibFormValidationPage.Confirm_Password(data.get(id).get(7).trim());
		ColorlibFormValidationPage.MinZise(data.get(id).get(8).trim());
		ColorlibFormValidationPage.MaxZise(data.get(id).get(9).trim());
		ColorlibFormValidationPage.Number(data.get(id).get(10).trim());
		ColorlibFormValidationPage.Ip(data.get(id).get(11).trim());
		ColorlibFormValidationPage.Date(data.get(id).get(12).trim());
		ColorlibFormValidationPage.Date_Earlier(data.get(id).get(13).trim());
		ColorlibFormValidationPage.Validate();
	}
	
	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		ColorlibFormValidationPage.form_si_errores();
	}
	@Step
	public void verificar_ingreso_datos_formulario_con_errorers() {
		ColorlibFormValidationPage.form_con_errores();
	}

}
