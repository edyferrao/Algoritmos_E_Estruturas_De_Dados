package listasSequenciais;

public class Executar {

	public static void main(String[] args) {
		// 1. Criacao de uma ListaSequencial
        ListaSequencial LS = new ListaSequencial(5);

        // 2. Retornar a contagem de elementos presentes na lista
         //System.out.println(LS.count());
        
        // 3. Determinacao se esta ou nao vazia
         //System.out.println(LS.isEmpty());

        // 4. Mostrar todos elementos da lista
         //LS.listAll();
  
        // 5. Adicionar um elemento à lista
         //System.out.println(LS.add(1));
         //System.out.println(LS.count());

        // 6. Adicionar um elemento à lista em uma posição 
        //System.out.println(LS.addAt(2, 2));
         //System.out.println(LS.count());

        // 7. Verificar a existencia de um elemento
         //System.out.println(LS.exists(2));

        // 8. Remover um elemento, se existir
         //System.out.println(LS.remove(3));
         //System.out.println(LS.remove(2));
         //System.out.println(LS.count());

        // 9. Remover um elemento em um indice
        // LS.removeAt(1)
         //System.out.println(LS.addAt(5,3));
         LS.listAll();
	}

}
