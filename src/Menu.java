import java.util.Scanner;

public class Menu {
	public int menu() {
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("1----------------------Potencia");
		System.out.println("2----------------------Imprimir");
		System.out.println("3----------------------Salir");
		System.out.println();
		System.out.println("---------------------------------");

		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
}
