package application.q1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor n para a construção da escada: ");
		int n = sc.nextInt();
		
		for(int i = n; i > 0; i--) {
			System.out.println(escada(n, i));			
		}
		
		sc.close();
	}
	
	public static String escada(int n, int decress) {
		String aux = "";
		
		for(int i = 1; i <= n; i++) {
			if(i >= decress) {
				aux += "*";
			}
			else {
				aux += " ";				
			}
		}
		return aux;
		

		
	}
}
