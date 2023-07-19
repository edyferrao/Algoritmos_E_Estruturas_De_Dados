package arvoreAVL;

public class Node {
	int value;
    int height;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.height = 1;
    }

}
