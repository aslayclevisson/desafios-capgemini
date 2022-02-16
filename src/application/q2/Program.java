package application.q2;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, descreva seus dados para prosseguirmos com o cadastro.");
		
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.print("Senha: ");
		String senha = sc.next();
		
		while(senha.length() < 6) {	
			System.out.print("Senha insuficiente, digite mais " + (6 - senha.length()) + " caracteres: " + senha);
			String auxSenha = sc.next();
			senha += auxSenha;
		}

		if(senhaForte(senha)) {
			System.out.println("Usuário cadastrado com sucesso.");
		}
		else {
			System.out.println("A senha precisa conter números, letras minúsculas e maíscula e ter pelo menos 1 símbolo.");
		}
		
		
		sc.close();
	}
	
	public static boolean senhaForte(String senha) {
		boolean numero = false;
		boolean simbolo = false;
		boolean maiusculo = false;
		boolean minusculo = false;
		
		String simbolosPermitidos = "!@#$%^&*()-+";
		
		
		for(char caracterer : senha.toCharArray()) {
			if(caracterer >= '0' && caracterer <= '9') {
				numero = true;
			}
			else if(caracterer >= 'a' && caracterer <= 'z') {
				minusculo = true;
			}
			else if(caracterer >= 'A' && caracterer <= 'Z') {
				maiusculo = true;
			}
			else {
				for(char simb : simbolosPermitidos.toCharArray()) {
					if(simb == caracterer) {
						simbolo = true;
					}
				}
				
				if(!simbolo) {
					throw new ProgramException("Caracterer desconhecido e não válido encontrado: " + caracterer);
				}
			}
		}
		
		return numero && simbolo && maiusculo && minusculo;
	}
	
	
}
