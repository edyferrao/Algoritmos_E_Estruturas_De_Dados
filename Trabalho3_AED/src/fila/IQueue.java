package fila;


// 2. Interface para especificar os métodos por implementar da queue
public interface IQueue {
    // Introduz um elemento no final da fila
    public abstract void enqueue(int valor);

    // Remove o elemento no inicio da fila
    public abstract int dequeue();

    // Retorna (sem remover) o valor do elemento no inicio da fila
    public abstract int peek();

    // Verifica se a fila esta ou nao vazia
    public abstract boolean isEmpty();

    // Retorna o numero de elementos na fila
    public abstract int count();

    // Lista todos elementos da fila
    public abstract void listAll();
}
