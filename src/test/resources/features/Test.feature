#language: es
# Se puede definir cualquier lenguaje con la anterior linea

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Lista de escenarios.
#Scenario: Regla de negocio mediante lista de pasos con argumentos
#Given: Precondiciones
#When: Acciones
#Then: Validaciones
#Y,E, Pero: Para enumerar más pasos de Given,When,Then
#Scenario Outline: Lista de pasos para el manejo de datos como Ejemplos y <placeholder>
#Examples: Contenido del table
#Background: Lista de pasos ejecutados antes de cada uno de los escenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)x|
#Sample Feature Definition Template
Característica: Modulos internos al loguearse


  Escenario: Actualizacion de datos
    Dado Que me encuentro logueado en la pagina de pruebas
    Cuando Ingreso a la opcion de mi cuenta
    Y luego a la opcion editar
    E ingreso unos datos nuevos
    Entonces Validación que los datos se actualicen correctamente

