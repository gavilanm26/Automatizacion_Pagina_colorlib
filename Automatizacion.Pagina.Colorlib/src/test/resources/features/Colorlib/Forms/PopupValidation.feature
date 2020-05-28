#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Popup Validation
  el usuario debe poder ingresar al formulario los datos requeridos.
  cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a través un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup validation,
  					no se presenta ningún mensaje de validación.
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Popup Validation
    | Required | Select | MultipleS1 | MultipleS2 | Url              | Email             | Password1 | Password2 | Minsize   | Maxsize | Number      | IP          | Date         | Date Earlier |
		| choucair | Golf   | Tennis     | Football   | http://mauro.com | gavilan@gmail.com | 12345     | 12345     | 123456    | 6       | 99       | 200.200.5.4 | 2018-01-22   | 2012-09-12   |   
    Then Verifico ingreso exitoso
    
  @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Popup Validation,
  					se presenta globo informativo indicando errores en el 
  					diligenciamiento de algunos de los campos.
  					
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio formulario Popup Validation
    | Required | Select | MultipleS1 | MultipleS2 | Url              | Email             | Password1 | Password2 | Minsize   | Maxsize | Number      | IP          | Date         | Date Earlier |
		|          | Golf   | Tennis     | Football   | http://mauro.com | gavilan@gmail.com | 12345     | 12345     | 123456    | 6       | 99          | 200.200.5.4 | 2018-01-22   | 2012-09-12   |
		| holaaa   | Choose a sport   | Tennis     | Football   | http://mauro.com | gavilan@gmail.com | 12345     | 12345     | 123456    | 6       | 99          | 200.200.5.4 | 2018-01-22   | 2012-09-12   |   
    Then Verificar que se presente globo informativo de validación


  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
