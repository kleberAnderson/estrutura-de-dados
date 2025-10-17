package ordenacaoVetores;

import java.util.Random;

public class view {
	public static void main(String[] args) {
		Random gerador = new Random();
		int[] vetor = new int[10];
		System.out.println("Vetor criado e preenchido:");
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(11);
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(" ["+ vetor[i] +"] ");
		}
		
		
		
		bubbleSortController bubble = new bubbleSortController();
		vetor = bubble.bubbleSort(vetor);
		
		bubble.exibirOrdenacao(vetor);
		
	}
}
