package listasLigadas;

public class TestarListasLigadas {

	public static void main(String[] args) {
		
		 // 1. Criacao
        LinkedList LL = new LinkedList();

        // 2. Listagem de elementos da lista
         LL.listAll();

        // 3. Adicao de um elemento a lista
        LL.add(1);
        LL.add(2);
        LL.listAll();

        // 4. Adicao de um elemento no inicio lista
         LL.addFirst(3);
         LL.listAll();
         
         LL.addAt(4, 2);
         LL.listAll();

        // 5. Adicao de um elemento no fim da lista
        // System.out.println("add(1): " + LL.add(1));
	}
}
