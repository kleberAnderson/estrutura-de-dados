package recursividade;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Recursividade exec = new Recursividade();
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um número para realizar sua somatória até 1: ");
		System.out.println("Resultado ==> " + exec.realizarSoma(leitura.nextInt()));
		System.out.println("Fim do Programa.");
		leitura.close();
	}
}