package ordenamento;

public class Ordenar {
	
	public int maiorDeDois(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	
	public int maiorDeTres(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		}
		else if (a <= b && b >= c) {
			return b;
		}
		return c;
	}
	
	public void maiorMenor (int [] array) {
		int maior = array[0];
		int menor = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
			else if (array[i] < menor) {
				menor = array[i];
			}
		}
		System.out.println("O maior valor do array é: "+maior+" e o menor é: "+menor);
	}
	
	public boolean ordenado (int [] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean ordenadoDesc(int [] array) {
		for (int i = 0; i < array.length -1; i++) {
			if (array[i] < array[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public boolean cresOuDesc (int [] array) {
		if (array[0] < array[1]) {
			return ordenado(array);
		}
		else {
			return ordenadoDesc(array);
		}
	}
}
