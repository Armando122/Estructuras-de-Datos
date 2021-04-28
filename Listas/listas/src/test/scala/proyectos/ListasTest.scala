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

  /** Test del método equals de listas. */
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

  /** Test del método longitud de listas. */
  test("Listas.longitud") {
    assert(lista.longitud == 0)
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    lista.agrega(4)
    assert(lista.longitud == 4)
    lista.limpia
  }

  /** Test del método agregaFinal de listas. */
  test("Listas.agregaFinal") {
    lista.agregaFinal(1)
    lista.agregaFinal(2)
    assert(lista.ultimo == 2)
    lista.eliminaUltimo
    assert(lista.ultimo == 1)
    lista.limpia
  }

  /** Test del método agregaInicio de listas. */
  test("Listas.agregaInicio") {
    lista.agregaInicio(1)
    lista.agregaInicio(2)
    assert(lista.ultimo == 1)
    lista.eliminaUltimo
    assert(lista.ultimo == 2)
    lista.limpia
  }

  /** Test del método inserta de listas. */
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

  /** Test del método eliminaPrimero de listas. */
  test("Listas.eliminaPrimero") {
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    val valor = lista.eliminaPrimero
    assert(valor == 1)
    lista.limpia
  }

  /** Test del método eliminaUltimo de listas. */
  test("Listas.eliminaUltimo") {
    lista.agrega(1)
    lista.agrega(2)
    lista.agrega(3)
    val valor = lista.eliminaUltimo
    assert(valor == 3)
    lista.limpia
  }

  /** Test del método primero de listas. */
  test("Listas.primero") {}

  /** Test del método ultimo de listas. */
  test("Listas.ultimo") {}

  /** Test del método obtener de listas. */
  test("Listas.obtener") {}

  /** Test del método copia de listas. */
  test("Listas.copia") {}

  /** Test del método reversa de listas. */
  test("Listas.reversa") {}

  /** Test del método indiceDe de listas. */
  test("Listas.indiceDe") {}

  /** Test del método hasNext de listas. */
  test("Listas.hasNext") {}

  /** Test del método next de listas. */
  test("Listas.next") {}

  /** Test del método hasPrevious de listas. */
  test("Listas.hasPrevious") {}

  /** Test del método start de listas. */
  test("Listas.start") {}

  /** Test del método end de listas. */
  test("Listas.end") {}

}
