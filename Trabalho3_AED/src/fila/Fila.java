package fila;

public class Fila implements IQueue {
	private Node inicio;
	private int tamanho;

	@Override
	public void enqueue(int valor) {
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
	public int dequeue() {
		if (isEmpty() == true) {
    		return -1;
    	}
    	else {
    		inicio = inicio.getNext();
    		tamanho--;
    		return 1;
    	}
	}

	@Override
	public int peek() {
		return inicio.getData();
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
    		System.out.println("Fila Vazia");
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
