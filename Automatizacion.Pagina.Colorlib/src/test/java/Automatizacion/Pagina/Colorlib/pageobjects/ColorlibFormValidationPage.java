package Automatizacion.Pagina.Colorlib.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject{
	
	//campo Required
		@FindBy(xpath="//INPUT[@id='req']")
		public WebElementFacade txtRequired;
		
		//campo seleccion deporte
		@FindBy(xpath="//SELECT[@id='sport']")
		public WebElementFacade cmbSport1;
		
		////campo seleccion multiple de deporte 2
		@FindBy(xpath="//SELECT[@id='sport2']")
		public WebElementFacade cmbSport2;
		
		//campo url
		@FindBy(xpath="//INPUT[@id='url1']")
		public WebElementFacade txtUrl;
		
		// campo email
		@FindBy(xpath="//INPUT[@id='email1']")
		public WebElementFacade txtEmail;
		
		//campo password 1
		@FindBy(xpath="//INPUT[@id='pass1']")
		public WebElementFacade txtPass1;
		
		// campo password 2
		@FindBy(xpath="//INPUT[@id='pass2']")
		public WebElementFacade txtPass2;
		
		//campo minzise
		@FindBy(xpath="//INPUT[@id='minsize1']")
		public WebElementFacade txtMinZise1;
		
		//campo maxzise
		@FindBy(xpath="//INPUT[@id='maxsize1']")
		public WebElementFacade txtMaxZise;
		
		//campo number
		@FindBy(xpath="//INPUT[@id='number2']")
		public WebElementFacade txtNumber;
		
		//campo ip
		@FindBy(xpath="//INPUT[@id='ip']")
		public WebElementFacade txtIp;
		
		//campo date
		@FindBy(xpath="//INPUT[@id='date3']")
		public WebElementFacade txtDate;
		
		//campo date earlier
		@FindBy(xpath="//INPUT[@id='past']")
		public WebElementFacade txtDateEarlier;
		
		//boton validate
		@FindBy(xpath="(//INPUT[@type='submit'])[1]")
		public WebElementFacade btnValidate;
		
		//globo informativo
		@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
		public WebElementFacade globoInformativo;
		
		public void Requiered(String datoPrueba) {
			txtRequired.click();
			txtRequired.clear();
			txtRequired.sendKeys(datoPrueba);
		}
		
		public void Select_Sport(String datoPrueba) {
			cmbSport1.click();
			cmbSport1.selectByVisibleText(datoPrueba);
		}
		//campo seleccion multiple de deporte 2
		public void Multiple_Select(String datoPrueba) {
			cmbSport2.selectByVisibleText(datoPrueba);
		}
		
		public void Url(String datoPrueba) {
			txtUrl.click();
			txtUrl.clear();
			txtUrl.sendKeys(datoPrueba);
		}
		public void Email(String datoPrueba) {
			txtEmail.click();
			txtEmail.clear();
			txtEmail.sendKeys(datoPrueba);
		}
		public void Password(String datoPrueba) {
			txtPass1.click();
			txtPass1.clear();
			txtPass1.sendKeys(datoPrueba);
		}
		public void Confirm_Password(String datoPrueba) {
			txtPass2.click();
			txtPass2.clear();
			txtPass2.sendKeys(datoPrueba);
		}
		public void MinZise(String datoPrueba) {
			txtMinZise1.click();
			txtMinZise1.clear();
			txtMinZise1.sendKeys(datoPrueba);
		}
		public void MaxZise(String datoPrueba) {
			txtMaxZise.click();
			txtMaxZise.clear();
			txtMaxZise.sendKeys(datoPrueba);
		}
		public void Number(String datoPrueba) {
			txtNumber.click();
			txtNumber.clear();
			txtNumber.sendKeys(datoPrueba);
		}
		public void Ip(String datoPrueba) {
			txtIp.click();
			txtIp.clear();
			txtIp.sendKeys(datoPrueba);
		}
		public void Date(String datoPrueba) {
			txtDate.click();
			txtDate.clear();
			txtDate.sendKeys(datoPrueba);
		}
		public void Date_Earlier(String datoPrueba) {
			txtDateEarlier.click();
			txtDateEarlier.clear();
			txtDateEarlier.sendKeys(datoPrueba);
		}
		public void Validate() {
			btnValidate.click();
		}
		public void form_si_errores() {
			assertThat(globoInformativo.isCurrentlyVisible(),is(false));
		}
		public void form_con_errores() {
			assertThat(globoInformativo.isCurrentlyVisible(),is(true));
		}

}
