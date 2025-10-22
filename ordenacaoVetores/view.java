package ordenacaoVetores;

import java.util.Random;

import javax.swing.JOptionPane;

public class view {
	public static void main(String[] args) {
			
		int[] vetor = new int[10];
			
		bubbleSortController bubble = new bubbleSortController();
		mergeSortController sort = new mergeSortController();
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu de Ordenação\n 1 - preencher vetor\n 2 - mostrar vetor\n 3 - BubbleSort\n 4 - mergeSort\n 9 - Encerrar"));
			switch (opc) {
			case 1: preencherVetor(vetor);
				break;
			case 2: mostrarVetor(vetor);
				break;
			case 3: bubble.bubbleSort(vetor);
				break;
			case 4: sort.ordenar(vetor);
				break;
			case 9: System.out.println("\nFim do programa!");
				break;
			default:
				System.out.println("Opção inválida, Digite novamente");;
			}
			
		}while(opc != 9);
		
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
