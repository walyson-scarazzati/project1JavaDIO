package project1JavaDIO;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO:Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Exibir as mensagens para o nosso usuário
		
		//Obter pela scanner os valores digitados no terminal
		System.out.println("número:");
		int numero = scanner.nextInt();
		
		System.out.println("agência:");
		String agencia = scanner.next();
		
		System.out.println("nome:");
		String nome = scanner.next();
		
		System.out.println("saldo:");
		double saldo = scanner.nextDouble();
		
		//Exibir a mensagem conta criada
		System.out.println("Olá " + numero + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque ");
	}

}
