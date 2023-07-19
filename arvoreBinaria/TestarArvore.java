package arvoreBinaria;

public class TestarArvore {
	
	public static void main(String[] args) {
		
		ArvoreBinariaDePesquisa abp = new ArvoreBinariaDePesquisa();
		
		abp.add(21);
		abp.add(7);
		abp.add(10);
		abp.add(-1);
		abp.add(35);
		abp.add(15);
		abp.add(41);
		abp.add(98);
		abp.add(50);
		//abp.add(20);
		
		abp.listPreOrder(abp.getRoot());
		System.out.println();
		abp.listInOrder(abp.getRoot());
		System.out.println();
		abp.listPostOrder(abp.getRoot());
		System.out.println();
		
		abp.searchNode(abp.getRoot(), 5);
		
	}
}
