package pilha;

public class Test {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(5);
		pilha.push(8);
		pilha.listAll();
		pilha.pop();
		pilha.listAll();
		System.out.println(pilha.peek());
	}

}
