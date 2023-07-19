package listaDuplamenteLigada;


public class DoubleLinkedList {
	private Node inicio;
	private Node fim;
	private int tamanho;
	
	
	public DoubleLinkedList(Node inicio, Node fim, int tamanho) {
		this.inicio = inicio;
		this.fim = fim;
		this.tamanho = tamanho;
	}


	public Node getInicio() {
		return inicio;
	}
	public void setInicio(Node inicio) {
		this.inicio = inicio;
	}
	public Node getFim() {
		return fim;
	}
	public void setFim(Node fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int count() {
        return this.tamanho;
    }

    public boolean isEmpty() {
        return this.count() == 0;
    }

    // 2. Listagem de todos elementos da lista
    // order: 1 crescente, -1 decrescente
    public void listAllCrescente() {
        Node currentNode = this.inicio;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getNext();
        }
    }
    
    public void listAllDecrescente() {
        Node currentNode = this.fim;
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " ");
            currentNode = currentNode.getPrev();
        }
    }
    public void listAll(int order) {
        if (this.count() == 0) {
            System.out.println("Lista Vazia");
        } else {
            if (order == 1) {
                listAllCrescente();
            } else {
                listAllDecrescente();
            }
        }
    }
    
    public void add(int valor) {
    	if (count() == 0) {
    		
    	}
    }
    //Agílio Pedro Jamisse
    //Edilson do Rosário Henriques Ferrão
    //Geraldo Arantes Saidina Júnior
    //Raúl Messo Júnior
    //Yannick Rafael Alberto Matimbe
    public boolean addAt(int valor, int indice) {
    	if (indice < 0 || indice > tamanho) {
    		return false;
    	}
    	else {
    		Node newNode = new Node (valor, null, null);
    		Node currentNode = inicio;
    		int contador = 0;
    		while(currentNode.getNext() != null && contador < indice -1) {
    			currentNode = currentNode.getNext();
    			contador++;
    		}
    		newNode.setNext(currentNode.getNext());
    		newNode.setPrev(currentNode);
    		currentNode.setNext(newNode);
    		tamanho++;
    		return true;
    	}
    }
}
