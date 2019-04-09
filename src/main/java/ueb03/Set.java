package ueb03;

interface Set<T extends Comparable> {
	/**
	 * Fügt das übergebene Element in das Set ein.
	 * @param t
	 * @return true, wenn `s` neu eingefügt wurde, false wenn es bereits enthalten war
	 */
	boolean add(T t);

	/**
	 * Prüft, ob ein Element im Set enthalten ist.
	 */
	boolean contains(T t);

	/**
	 * Entfernt ein Element aus dem Set; wirft eine NoSuchElementException
	 * wenn das Element nicht enthalten war.
	 *
	 * @return Das entfernte Element
	 * @throws java.util.NoSuchElementException Wenn das Element nicht vorhanden war.
	 */
	T remove(T t);

	/**
	 * Gibt die Größe des Sets zurück
	 */
	int size();
}
