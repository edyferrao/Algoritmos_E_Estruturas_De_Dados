package recursividade;

public class Exectar {

	public static void main(String[] args) {
		
		Recursividade rec = new Recursividade();
		
		int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(rec.buscaSequencial(array, 5, 0));
		System.out.println(rec.buscaBinaria(array, 5, 0, array.length - 1));
	}

}
