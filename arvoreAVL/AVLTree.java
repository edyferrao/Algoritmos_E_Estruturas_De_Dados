package arvoreAVL;

public class AVLTree {
	private Node root;

	// Função para obter a altura de um nó
	private int getHeight(Node node) {
		if (node == null) {
			return 0;
		}
		return node.height;
	}

	// Função para obter o fator de balanceamento de um nó
	private int getBalanceFactor(Node node) {
		if (node == null) {
			return 0;
		}
		return getHeight(node.left) - getHeight(node.right);
	}

	// Função para atualizar a altura de um nó
	private void updateHeight(Node node) {
		int leftHeight = getHeight(node.left);
		int rightHeight = getHeight(node.right);
		node.height = Math.max(leftHeight, rightHeight) + 1;
	}

	// Função para realizar uma rotação simples à direita
	private Node rotateRight(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		// Realiza a rotação
		x.right = y;
		y.left = T2;

		// Atualiza as alturas
		updateHeight(y);
		updateHeight(x);

		// Retorna a nova raiz
		return x;
	}

	// Função para realizar uma rotação simples à esquerda
	private Node rotateLeft(Node x) {
		Node y = x.right;
		Node T2 = y.left;

		// Realiza a rotação
		y.left = x;
		x.right = T2;

		// Atualiza as alturas
		updateHeight(x);
		updateHeight(y);

		// Retorna a nova raiz
		return y;
	}

	// Função para inserir um valor na árvore
	public void insert(int value) {
		root = insertNode(root, value);
	}

	// Função auxiliar para inserir um valor em um nó específico
	private Node insertNode(Node node, int value) {
		// Realiza a inserção como em uma BST normal
		if (node == null) {
			return new Node(value);
		}

		if (value < node.value) {
			node.left = insertNode(node.left, value);
		} else if (value > node.value) {
			node.right = insertNode(node.right, value);
		} else {
			// Valor já existe na árvore
			return node;
		}

		// Atualiza a altura do nó atual
		updateHeight(node);

		// Verifica o fator de balanceamento do nó atual
		int balanceFactor = getBalanceFactor(node);

		// Realiza as rotações necessárias para balancear a árvore
		// Rotação simples à direita
		if (balanceFactor > 1 && value < node.left.value) {
			return rotateRight(node);
		}

		// Rotação simples à esquerda
		if (balanceFactor < -1 && value > node.right.value) {
			return rotateLeft(node);
		}

		// Rotação dupla à esquerda
		if (balanceFactor > 1 && value > node.left.value) {
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		} 
		else {
			return node;
		}
	}
}
