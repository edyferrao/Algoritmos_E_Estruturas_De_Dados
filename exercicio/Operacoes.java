package exercicio;

import javax.swing.JOptionPane;

public class Operacoes {
	
	public int[] criarArray(int [] array, int numeroElementos) {
		for (int i = 0; i < numeroElementos; i++) {
			int elementos = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
			array[i] =  elementos;
		}
		return array;
	}
}
