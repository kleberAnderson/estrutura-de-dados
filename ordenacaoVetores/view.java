package ordenacaoVetores;

import java.util.Random;
import java.util.Scanner;

public class view {
	public static void main(String[] args) {
			
		int[] vetor = new int[10];
			
		bubbleSortController bubble = new bubbleSortController();
		mergeSortController sort = new mergeSortController();
		
		Scanner leitor = new Scanner(System.in);
		int opc = 0;
		
		do {
			System.out.println("\nMenu de Ordenação\n 1 - preencher vetor\n 2 - mostrar vetor\n 3 - BubbleSort\n 4 - mergeSort");
			System.out.print("Digite uma das opções: ");
			opc = leitor.nextInt();
			leitor.nextLine();
			switch (opc) {
			case 1: preencherVetor(vetor);
				break;
			case 2: mostrarVetor(vetor);
				break;
			case 3: bubble.bubbleSort(vetor);
				break;
			case 4: sort.ordenar(vetor);
				break;
			default:
				System.out.println("Opção inválida.");;
			}
			
		}while(opc != 9);
		
		System.out.println("Fim do Programa.");
		leitor.close();
	}

	private static void mostrarVetor(int[] vetor) {
		System.out.println("\nVetor atual:");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" ["+ vetor[i] +"] ");
		}
		System.out.println();
	}

	private static int[] preencherVetor(int [] vetor) {
		Random gerador = new Random();
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(11);
		}
		System.out.println("\nVetor preenchido com sucesso!\n");
		return vetor;
	}
}
