
public class Objeto {
	private double base = 0, exponente = 0, resultado = 0;
	private double potencia[] = new double[3];

	public void get(double base, double exponente) {
		this.base = base;
		this.exponente = exponente;

	}

	public void mostrar() {
		for (int i = 0; i < potencia.length; i++) {
			System.out.print("[" + potencia[i] + "]");
			if (i == 2) {
				System.out.println();
			}
		}
	}

	public void rellenar() {
		potencia[0] = base;
		potencia[1] = exponente;
		potencia[2] = Math.pow(base, exponente);

	}
}
