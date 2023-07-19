package fila;

public class Test {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.listAll();
		fila.dequeue();
		fila.listAll();
		System.out.println(fila.isEmpty());
		System.out.println(fila.peek());
		System.out.println(fila.count());
	}

}
