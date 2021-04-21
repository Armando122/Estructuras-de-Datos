package proyectos

import org.scalatest.funsuite.AnyFunSuite
import proyectos.Listas

class ListasTest extends AnyFunSuite {

  val lista = new Lista[Int]

  /** Test del método agrega de listas. */
  test("Listas.agrega") {
    lista.agrega(2)
    assert(lista.elementos == 1)
    lista.elimina(2)
    assert(lista.elementos == 0)
  }

  /** Test del método elimina de listas. */
  test("Listas.elimina") {
    lista.agrega(1)
    lista.agrega(2)
    lista.elimina(2)
    assert(lista.elementos == 1)
    lista.elimina(1)
    assert(lista.elementos == 0)
  }

  /** Test del método contiene de listas. */
  test("Listas.contiene") {
    assert(lista.contiene(3) == false)
    lista.agrega(4)
    assert(lista.contiene(4) == true)
    lista.elimina(4)
  }

  /** Test del método esVacia de listas. */
  test("Listas.esVacia") {
    assert(lista.esVacia == true)
    lista.agrega(9)
    assert(lista.esVacia == false)
    lista.elimina(9)
  }

  /** Test del método elementos de listas. */
  test("Listas.elementos") {
    assert(lista.elementos == 0)
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    lista.agrega(4)
    assert(lista.elementos == 4)
    lista.limpia
  }

  /** Test del método limpia de listas. */
  test("Listas.limpia") {
    assert(lista.elementos == 0)
    for(i <- 0 until 10) {
      lista.agrega(i)
    }
    assert(lista.elementos == 10)
    lista.limpia
    assert(lista.elementos == 0)
  }

  /** Test del método toString de listas. */
  test("Listas.toString") {
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    lista.agrega(4)
    lista.agrega(5)
    lista.agrega(6)  //[1,2,3,4,5,6]
    var listaStr = lista.toString
    val prueba = "[1,2,3,4,5,6]"
    assert(listaStr.equals(prueba) == true)
    lista.limpia
  }

  test("Listas.equals") {
    val listaPrueba = new Lista[Int]
    assert(lista.equals(listaPrueba) == true)
    listaPrueba.agrega(1)
    assert(lista.equals(listaPrueba) == false)
    listaPrueba.limpia
    for(i <- 0 until 10) {
      lista.agrega(i)
      listaPrueba.agrega(i)
    }
    assert(lista.equals(listaPrueba) == true)
    lista.limpia
  }

  test("Listas.longitud") {
    assert(lista.longitud == 0)
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    lista.agrega(4)
    assert(lista.longitud == 4)
    lista.limpia
  }

  test("Listas.agregaFinal") {
    lista.agregaFinal(1)
    lista.agregaFinal(2)
    assert(lista.ultimo == 2)
    lista.eliminaUltimo
    assert(lista.ultimo == 1)
    lista.limpia
  }

  test("Listas.agregaInicio") {
    lista.agregaInicio(1)
    lista.agregaInicio(2)
    assert(lista.ultimo == 1)
    lista.eliminaUltimo
    assert(lista.ultimo == 2)
    lista.limpia
  }

  test("Listas.inserta") {
    val listaPrueba = [1,3,2,3]
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    assert(lista.longitud == 3)
    lista.inserta(1,3) //[1,3,2,3]
    assert(lista.longitud == 4)
    assert(lista.equals(listaPrueba))
    lista.limpia
  }

  test("Listas.eliminaPrimero") {}

  test("Listas.eliminaUltimo") {}

  test("Listas.primero") {}

  test("Listas.ultimo") {}

  test("Listas.obtener") {}

  test("Listas.copia") {}

  test("Listas.reversa") {}

  test("Listas.indiceDe") {}

  test("Listas.hasNext") {}

  test("Listas.next") {}

  test("Listas.hasPrevious") {}

  test("Listas.start") {}

  test("Listas.end") {}

}
