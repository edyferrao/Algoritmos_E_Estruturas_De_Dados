package pesquisaLinear;

public class Executar {

	public static void main(String[] args) {
		
		Pesquisar pesquisa = new Pesquisar ();
		
		int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(pesquisa.buscaSequencial(array, 10));
	}

}
