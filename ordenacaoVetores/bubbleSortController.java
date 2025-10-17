package ordenacaoVetores;

public class bubbleSortController {
	public bubbleSortController() {
		super();
	}
	
	public int[] bubbleSort(int[] vetor) {
		boolean troca = true;
		for (int i = 0; i < vetor.length && troca; i++) {
			troca = false;
			for( int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] > vetor[j]) {
					int auxiliar = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = auxiliar;
					troca = true;
				}
			}
		}
		return vetor;
		
		/*int aux;
		for(int i = 0; i < (vetor.length); i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		exibirOrdenacao(vetor);*/
	}
	
	public void exibirOrdenacao(int[] vetor) {
		System.out.println("\nVetor ordenado: ");
		for(int elemento : vetor) {
			System.out.print(" [" + elemento + "] ");
		}
	}
}
