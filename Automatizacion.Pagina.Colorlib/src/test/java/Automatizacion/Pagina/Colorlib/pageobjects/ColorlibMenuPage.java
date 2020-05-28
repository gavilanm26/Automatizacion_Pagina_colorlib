package Automatizacion.Pagina.Colorlib.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibMenuPage extends PageObject{
	
	//menu forms
	@FindBy (xpath="(//SPAN[@class='fa arrow'])[3]")
	public WebElementFacade menuForms;
	
	/*sub menu forms general
	@FindBy (xpath="(//A[@href='form-validation.html'])[2]")
	public WebElementFacade menuFormsGeneral;*/
	
	//sub menu forms validation
	@FindBy (xpath="(//A[@href='form-validation.html'])[2]")
	public WebElementFacade menuFormValidation;
	
	//form validation label
	@FindBy (xpath="//H5[text()='Popup Validation']")
	public WebElementFacade lblFormValidation;
	
	public void menuFormValidation(){
		menuForms.click();
		menuFormValidation.click();
		String strMensaje = lblFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
	}


}
