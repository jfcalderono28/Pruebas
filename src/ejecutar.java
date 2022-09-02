import java.util.Scanner;

public class ejecutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int con = 0, i = 0;
		Scanner entrada = new Scanner(System.in);
		Array array = new Array();
		Menu men = new Menu();

		while (con != 3) {

			con = men.menu();
			if (con == 1) {
				Objeto obj = new Objeto();
				System.out.println("Base");
				double base = entrada.nextDouble();

				System.out.println("Exponente");
				double exponente = entrada.nextDouble();

				obj.get(base, exponente);
				obj.rellenar();
				array.llenarArray(obj);
				i++;
			} else if (con == 2) {
				array.mostrarArray();
				break;
			} else if (con == 3) {
				System.out.println("Saliendo");

				break;
			} else {
				System.out.println("Opción incorrecta");
				array.mostrarArray();
				System.out.println("Saliendo");
				break;
			}
			if (i == 4) {
				System.out.println("Solo queda espacio para una potencia más");
			} else if (i == 5) {
				con = 3;
				array.mostrarArray();
			}

		}

	}

}
