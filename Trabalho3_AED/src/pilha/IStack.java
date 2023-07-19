package pilha;

// 1. Interface para especificar os métodos por implementar da stack
public interface IStack {
    // Introduz um elemento no topo da pilha
    public abstract void push(int valor);

    // Remove o elemento do topo da pilha
    public abstract int pop();

    // Retorna (sem remover) o valor do elemento no topo da pilha
    public abstract int peek();

    // Verifica se a pilha esta ou nao vazia
    public abstract boolean isEmpty();

    // Retorna o numero de elementos na pilha
    public abstract int count();

    // Lista todos elementos da pilha
    public abstract void listAll();
}
