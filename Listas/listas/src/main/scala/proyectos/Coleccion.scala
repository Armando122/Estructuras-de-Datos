package proyectos

/**
 * Trait para colecciones, con operaciones para agregar y eliminar
 * elementos, y consultar si un elemento está contenido, así como para obtener
 * el número de elementos en la colección. Además, Las colecciones son
 * iterables.
 */
trait Coleccion[T] extends Iterable[T] {

  /**
   * Agrega un elemento a la colección.
   * @param elemento el elemento a agregar.
   */
  def agrega(elemento: T): Unit

  /**
   * Elimina un elemento de la colección.
   * @param elemento el elemento a eliminar.
   */
  def elimina(elemento: T): Unit

  /**
   * Nos dice si un elemento está contenido en la colección.
   * @param elemento el elemento que queremos verificar si está contenido en
   *                 la colección.
   * @return true si el elemento está contenido en la colección,
   *         false en otro caso.
   */
  def contiene(elemento: T): Boolean

  /**
   * Nos dice si la colección es vacía.
   * @return true si la colección es vacía, false en
   *         otro caso.
   */
  def esVacia(): Boolean

  /** Regresa el número de elementos en la colección. */
  def getElementos(): Int

  /** Limpia la colección de elementos, dejándola vacía. */
  def limpia(): Unit
  
}
