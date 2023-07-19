package listasSequenciais;

import java.util.Arrays;
import pesquisaLinear.Pesquisar;

public class ListaSequencial {
	private int lista[];
    private int tamanho;
    
    Pesquisar pl = new Pesquisar();
    
    public int [] getLista() {
    	return lista;
    }
    
    // 1. Criacao
    public ListaSequencial(int capacidade) {
        this.lista = new int[capacidade];
        this.tamanho = 0;
    } 

    // 2. Determinar o numero de elementos presentes na lista
    public int count () {
    	return tamanho;
    }

    // 3. Determinar se esta ou nao vazia
    public boolean isEmpty() {
    	return count() == 0;
    }
    
    public boolean isFull() {
    	return count() == lista.length;
    }
    
    // 4. Listagem de todos elementos presentes na lista
    public void listAll() {
    	if (isEmpty()) {
    		System.out.println("Lista Vazia");
    	}
    	else {
    		for (int i = 0; i < lista.length; i++) {
    			if (lista[i] != 0) {
    				System.out.print(lista[i]);
    			}
        	}
    		System.out.println(Arrays.toString(lista));
    	}
    }

    // 5. Adicionar um elemento à lista
    public boolean add(int elemento){
    	if (isFull()) {
    		return false;
    	}
    	else {
    		return addAt(elemento, tamanho);
    	}
    }

    // 6. Adicionar um elemento à lista em um indice especifico
    public boolean addAt(int elemento, int indice){
    	if (lista[indice] == 0 && indice >= 0 && indice < lista.length) {
    		lista[indice] = elemento;
    		tamanho ++;
    		return true;
    	}
    	else {
    		return false;
    	}
    }

    // 7. Verificar se um elemento existe ou nao na lista
    public boolean exists(int elemento) {
		if (pl.buscaSequencial(lista, elemento) == -1) {
			return false;
		}
		else{
			return true;
		}
    }

    // 8. Remover um elemento da lista
    public boolean remove(int elemento){
    	if(pl.buscaSequencial(lista, elemento) == -1) {
    		return false;
    	}
    	else {
    		return removeAt(pl.buscaSequencial(lista, elemento));
    	}
    }

    // 9. Remover um elemento da lista de um indice especifico
    public boolean removeAt(int indice){
    		if(lista[indice] != 0 && indice >= 0 && indice < lista.length) {
    			lista[indice] = 0;
    			tamanho --;
    			return true;
    		}
    		else {
    			return false;
    			}
    }

}
