package pesquisaBinaria;

public class PesquisaBinaria {
	
	public int buscaBinaria(int[] array, int valor) {
		int indice_esquerda = 0; 
		int indice_direita = array.length - 1; 
		int indice_meio;
		
		while (indice_esquerda <= indice_direita) {
			indice_meio = (indice_esquerda + indice_direita) / 2;
			if (array[indice_meio] < valor) {
				indice_esquerda = indice_meio + 1;
			} 
			else if (array[indice_meio] > valor) {
				indice_direita = indice_meio - 1;
			} 
			else {
				return indice_meio;
			}
		}
		return -1;
	}
}
