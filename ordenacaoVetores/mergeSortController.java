package ordenacaoVetores;

public class mergeSortController {
	public mergeSortController() {
		super();
	}
	
	public void ordenar(int[] vetor) {
		int[] vetorAuxiliar = new int[vetor.length];
		merge(vetor, 0, vetor.length - 1, vetorAuxiliar);
		showFinalMessage();
	}

	private void showFinalMessage() {
		System.out.print("\nOrdenacao realizada com sucesso!\n");
	}

	private void merge(int[] vetor, int inicio, int fim, int[] vetorAuxiliar) {
		int meio = (fim + inicio) / 2;
		if(inicio < fim) {
			
			merge(vetor, inicio, meio, vetorAuxiliar);
			merge(vetor, meio + 1, fim, vetorAuxiliar);
			performOrdination(vetor, inicio, meio, fim, vetorAuxiliar);
		}
		
	}

	private void performOrdination(int[] vetor, int inicio, int meio, int fim, int[]vetorAuxiliar) {
		int i = inicio;
		int j = meio + 1;
		int k = 0;
		while(i <= meio && j <= fim) {
			if(vetor[i] <= vetor[j]) {
				vetorAuxiliar[k] = vetor[i];
				k++;
				i++;
			} else {
				vetorAuxiliar[k] = vetor[j];
				k++;
				j++;
			}
		}
		while(i <= meio) {
			vetorAuxiliar[k] = vetor[i];
			k++;
			i++;
		}
		while(j <= fim) {
			vetorAuxiliar[k] = vetor[j];
			k++;
			j++;
		}
		i = inicio;
		k = 0;
		while(i <= fim) {
			vetor[i] = vetorAuxiliar[k];
			i++;
			k++;
		}
	}
}
