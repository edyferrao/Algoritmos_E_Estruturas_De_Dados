package pilha;

public class Pilha implements IStack{
	private Node inicio;
	private int tamanho;
	
	@Override
	public void push(int valor) {
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

	@Override
	public int pop() {
		if (isEmpty() == true) {
    		return -1;
    	}
    	else if (count() == 1) {
    		inicio = null;
    		tamanho--;
    		return 1;
    	}
    	else {
    		Node currentNode = inicio;
    		int contador = 1;
    		while(contador < count() -1) {
    			currentNode = currentNode.getNext();
    			contador++;
    		}
    		currentNode.setNext(null);
    		tamanho--;
    		return 1;
    	}
	}

	@Override
	public int peek() {
		Node currentNode = inicio;
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		return currentNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return count() == 0;
	}

	@Override
	public int count() {
		return tamanho;
	}

	@Override
	public void listAll() {
		if(count() == 0) {
    		System.out.println("Pilha vazia");
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

}
