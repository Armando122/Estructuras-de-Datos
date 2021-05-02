package proyectos

import scala.collection.Iterator
import java.util.NoSuchElementException

/**
 * Trait para iteradores de lista. Un iterador de lista se puede visualizar
 * como que está siempre entre dos elementos de la lista, o antes del primero, o
 * después del último.
 */
trait iteradorLista[T] extends Iterator[T] {

    /**
     * Nos dice si hay un elemento anterior. El método regresa
     * true, excepto cuando la lista esté vacía, o el iterador esté
     * antes del primer elemento.
     * @return true si el iterador tiene un elemento a su
     *         izquierda, false en otro caso.
     */
    def hasPrevious(): Boolean

    /**
     * Regresa el elemento anterior al iterador, y lo mueve a la izquierda.
     * @return el elemento anterior al iterador.
     * @throws NoSuchElementException si el iterador no tiene elemento anterior.
     */
    def previous(): T

    /**
     * Mueve el iterador a la izquierda del primer elemento.
     */
    def start(): Unit

    /**
     * Mueve el iterador a la derecha del último elemento.
     */
    def end(): Unit
}
