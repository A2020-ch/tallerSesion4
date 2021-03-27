Feature:  calculadora app
  @calculadora

  Scenario: Como un usuario simple
            Quiero sumar dos numeros
            Para poder obtener el resultado.

    Given yo tengo abierto mi calculadora app
    When yo presiono el boton 2
    And yo presiono el boton suma
    And yo presiono el boton 9
    Then el resultado deberia ser "11"