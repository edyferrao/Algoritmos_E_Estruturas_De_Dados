package recursividade;

public class Recursividade {
	
	
	public int fatorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fatorial(n - 1);
	}
	
	public int multiplicacao(int m, int n) {
		if (m == 0) {
			return 0;
		}
		return n + multiplicacao(m - 1, n);
	}
	
	public int exponecial(int m, int n) {
		if (m == 0) {
			return 1;
		}
		return n * exponecial(m - 1, n);
	}
	
	public int divisao(int m, int n) {
		if (m < n) {
			return 0;
		}
		else {
			return 1 + divisao(m - n, n);		
		}
	}
	
	public int buscaSequencial(int array[], int valor, int indice) {
		if(indice >= array.length) {
			return -1;
		}
		else if (valor == array[indice]) {
			return indice;
		}
		return buscaSequencial(array, valor, indice + 1);
	}
	
	public int buscaBinaria(int[] array, int valor, int indice_esquerda, int indice_direita) {
		
		
		if (indice_esquerda > indice_direita) {
			return -1;
		}
		
		int indice_medio = (indice_esquerda + indice_direita) / 2;
		
		if (valor == array[indice_medio]) {
			return indice_medio;
		}
		else if (valor < array[indice_medio]) {
			return buscaBinaria(array, valor, indice_medio -1 , indice_medio - 1);
		}
		else {
			return buscaBinaria(array, valor, indice_medio + 1, indice_direita);
		}
	}
}
