package Automatizacion.Pagina.Colorlib.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject{
	
	//campo usuario
	@FindBy(xpath="(//INPUT[@type='text'])[1]")
	public WebElementFacade txtUsername;
	
	//campo password
	@FindBy (xpath="(//INPUT[@type='password'])[1]")
	public WebElementFacade txtpassword;
	
	//boton
	@FindBy (xpath="//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']")
	public WebElementFacade btnSignIn;
	
	//label del home a verificar
	@FindBy (xpath="//H1[@id='bootstrap-admin-template']")
	public WebElementFacade lblHomePpal;
	
	public void IngresarDatos(String strUsuario, String strPass) {
		txtUsername.sendKeys(strUsuario);
		txtpassword.sendKeys(strPass);
		btnSignIn.click();
	}
	
	public void VerificaHome() {
		String labelv = "Bootstrap-Admin-Template";//Definamos una variable con el texto que queremos verificar. 
		String strMensaje = lblHomePpal.getText();//Asignamos el valor obtenido del objeto con el método .getText()
		assertThat(strMensaje, containsString(labelv));//Y con la sentencia assertThat, comparamos si los dos valores son iguales. 
		
		
	}
	

}
