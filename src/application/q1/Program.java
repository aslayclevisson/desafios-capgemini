package application.q1;

/** Classe principal que mostra o tamanho N de uma escada por meio de "*", de acordo com a entrada de um valor n.
 * @author Aslay Clevisson
 * */

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor (n) para a construção da escada: ");
		int numeroDegraus = sc.nextInt();

		for (int i = numeroDegraus; i > 0; i--) {

			String aux = "";

			for (int j = 1; j <= numeroDegraus; j++) {
				
				if (i <= j) {
					aux += "*";
				} 
				else {
					aux += " ";
				}
			}

			System.out.println(aux);
		}

		sc.close();
	}

}
