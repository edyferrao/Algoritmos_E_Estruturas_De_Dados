package listasLigadas;

public class LinkedList {
	private Node inicio;
	private int tamanho;
	
	 // 1. Criacao de uma Lista Vazia
    public LinkedList() {
    	this.inicio = null;
    	this.tamanho = 0;
    }
    
    //Contagem de elementos
    public int count() {
    	return tamanho;
    }
    
    // 2. Listagem de todos elementos da lista
    public void listAll() {
    	if(count() == 0) {
    		System.out.println("Lista Vazia");
    	}
    	else {
    		Node currentNode = inicio;
    		while(currentNode.getNext() != null) {
    			System.out.print(currentNode.getData()+ " ");
    			currentNode = currentNode.getNext();
    		}
    		System.out.println(currentNode.getData());
    	}
    }

    // 3. Adicao de um elemento a lista
    public void add(int valor){
    	Node newNode = new Node (valor, null);
    	if(count() == 0) {
    		inicio = newNode;
    	}
    	else {
    		Node currentNode = inicio;
    		while(currentNode.getNext() != null) {
    			currentNode = currentNode.getNext();
    		}
    		currentNode.setNext(newNode);
    	}
    	tamanho++;
    }

    
    public void addFirst(int valor) {
    	Node newNode = new Node (valor, null);
    	newNode.setNext(inicio);
    	inicio = newNode;
    	tamanho++;
    }

    // 5. Adicao de um elemento no fim da lista
    public void addLast(int valor) {
        add(valor);
        tamanho++;
    }
    
    // 6. Adicao de um elemento a uma determinada posicao da lista
    public boolean addAt(int valor, int indice) {
    	if (indice < 0 || indice > tamanho) {
    		return false;
    	}
    	else {
    		Node newNode = new Node (valor, null);
    		Node currentNode = inicio;
    		int contador = 0;
    		while(currentNode.getNext() != null && contador < indice -1) {
    			currentNode = currentNode.getNext();
    			contador++;
    		}
    		newNode.setNext(currentNode.getNext());
    		currentNode.setNext(newNode);
    		tamanho++;
    		return true;
    	}
    }
}
