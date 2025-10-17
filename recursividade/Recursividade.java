package recursividade;

public class Recursividade {
	
	public Recursividade() {
		super();
	}
	
	public int realizarSoma(int numero) {
		int soma = 0;
		if( numero >= 1 ) {
			soma = numero + realizarSoma(numero - 1);
			return soma;
		} else {
			return numero;
		}
	}
}
