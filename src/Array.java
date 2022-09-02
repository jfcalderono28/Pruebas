
public class Array {
	private Objeto array[] = new Objeto[5];
	int i = 0;

	public void llenarArray(Objeto a) {
		array[i] = a;
		i++;

	}

	public void mostrarArray() {
		for (Objeto objeto : array) {
			try {
				objeto.mostrar();

			} catch (Exception e) {
				System.out.println("No hay datos");
			}

		}
	}
}
