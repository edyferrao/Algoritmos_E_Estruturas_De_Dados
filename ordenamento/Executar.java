package ordenamento;

public class Executar {

	public static void main(String[] args) {
		
		Ordenar ord = new Ordenar();
		
		int [] array = {10, 4, 9, 1, 5, 9, 7};
		int [] arraycres = {1,2,3,4};
		int [] arraydesc = {4,3,2,1};
		int [] test = {1,2,4,3};
		int [] test2 = {4,3,1,2};
		//ord.maiorMenor(array);
		System.out.println(ord.ordenado(array));
		
		//System.out.println(ord.ordenadoDesc(arraydesc));
		//System.out.println(ord.ordenadoDesc(arraycres));
		//System.out.println(ord.ordenado(test));
		System.out.println(ord.ordenadoDesc(arraydesc));
		System.out.println(ord.ordenadoDesc(test));
		System.out.println(ord.ordenadoDesc(arraycres));
		System.out.println(ord.ordenadoDesc(test2));
		

	}

}
