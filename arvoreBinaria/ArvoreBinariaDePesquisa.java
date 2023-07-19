package arvoreBinaria;

public class ArvoreBinariaDePesquisa {
	private int size;
	private Node root;

	public ArvoreBinariaDePesquisa() {
		this.size = 0;
		this.root = null;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean addNode(Node parent, int data) {
		if (data < parent.getData()) {
			if (parent.getLeft() == null) {
				parent.setLeft(new Node(data));
				size++;
				return true;
			} else {
				return addNode(parent.getLeft(), data);
			}
		} else if (data > parent.getData()) {
			if (parent.getRight() == null) {
				parent.setRight(new Node(data));
				size++;
				return true;
			} else {
				return addNode(parent.getRight(), data);
			}
		} else {
			return false;
		}
	}

	public void add(int data) {
		if (root == null) {
			root = new Node(data);
			size++;
		} else {
			addNode(root, data);
		}
	}

	public void listPreOrder(Node parent) {
		// Raiz
		System.out.print(parent.getData() + " ");

		// Esquerda
		if (parent.getLeft() != null) {
			if ((parent.getLeft()).getLeft() == null && (parent.getLeft()).getRight() == null) {
				System.out.print(parent.getLeft().getData() + " ");
			} else {
				listPreOrder(parent.getLeft());
			}
		}

		// Direita
		if (parent.getRight() != null) {
			if ((parent.getRight()).getLeft() == null && (parent.getRight()).getRight() == null) {
				System.out.print(parent.getRight().getData() + " ");
			} else {
				listPreOrder(parent.getRight());
			}
		}
	}

	public void listInOrder(Node parent) {
		if (parent != null) {
			listInOrder(parent.getLeft());
			System.out.print(parent.getData() + " ");
			listInOrder(parent.getRight());
		}
	}

	public void listPostOrder(Node parent) {
		if (parent != null) {
			listPostOrder(parent.getLeft());
			listPostOrder(parent.getRight());
			System.out.print(parent.getData() + " ");
		}
	}

	public void searchNode(Node parent, int value) {
		if (parent != null) {
			if (value < parent.getData()) {
				searchNode(parent.getLeft(), value);
			}
			else if (value > parent.getData()) {
				searchNode(parent.getRight(), value);
			}
			else {
				System.out.println("Elemento " + value + " encontrado");
			}
		}
		else {
			System.out.println("Elemento " + value + " nao encontrado");
		}
	}
}
