Feature: Contact

  @contacto
  Scenario: como un usuario adminstrador
  quiero guardar un contacto
  para almacenar  y poder llarlo mas adelante

  Scenario: Crear contacto

    Given tengo abierto mi app de contacto
    When yo hago click en el boton "add"
    And yo lleno la caja de texto "name" con el valor "AAAREMOVE"
    And yo lleno la caja de texto "phone" con el valor "121321325"
    And yo hago click en el boton "done"
    And yo hago click en el boton "back"
    Then el contacto "AAAREMOVE" deberia ser mostrado