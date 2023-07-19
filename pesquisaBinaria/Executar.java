package pesquisaBinaria;

public class Executar {

	public static void main(String[] args) {
		
		PesquisaBinaria pes = new PesquisaBinaria();
		
		int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		System.out.println(pes.buscaBinaria(array, 20));
	}

}
