package pesquisaLinear;

public class Pesquisar {
	
	public int buscaSequencial(int array[], int valor) {
		for (int i=0; i < array.length; i++) {
			if (valor == array[i]) {
				return i;
			}
		}
		return -1;
	}
}
