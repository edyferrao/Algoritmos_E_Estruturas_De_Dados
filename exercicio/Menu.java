package exercicio;

import javax.swing.JOptionPane;

import ordenamento.*;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import pesquisaLinear.*;
import pesquisaBinaria.*;

public class Menu {
	
	Operacoes op = new Operacoes();
	Pesquisar pL = new Pesquisar();
	PesquisaBinaria pB = new PesquisaBinaria();
	Ordenar ord = new Ordenar();
	int numeroDesejado;
	
	public void menu() {
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Pesquisa Sequencial \n2-Pesquisa Binaria"));
		if (escolha == 1) {
			int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de elementos que predente colocar na lista"));
			int [] array = new int [numeroElementos];
			op.criarArray(array, numeroElementos);
			numeroDesejado = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero que deseja procurar"));
			int index = pL.buscaSequencial(array, numeroDesejado);
			if (index == -1) {
				JOptionPane.showMessageDialog(null, "O numero: "+numeroDesejado+" não esta na lista", "Erro", ERROR_MESSAGE );
			}
			else {
				JOptionPane.showMessageDialog(null, numeroDesejado+" encontra-se na lista na posicão "+index);
			}
			menu();
		}
		else if (escolha == 2) {
			int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de elementos que predente colocar na lista"));
			int [] array = new int [numeroElementos];
			op.criarArray(array, numeroElementos);
			boolean verf = ord.ordenado(array);
			if (verf == false) {
				JOptionPane.showMessageDialog(null, "Impossivel realizar uma busca binaria! \nA lista não esta ordenada", "Erro", ERROR_MESSAGE );
			}
			else {
				numeroDesejado = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero que deseja procurar"));
				int index = pB.buscaBinaria(array, numeroDesejado);
				if (index == -1) {
					JOptionPane.showMessageDialog(null, "O numero: "+numeroDesejado+" não esta na lista", "Erro", ERROR_MESSAGE );
				}
				else {
					JOptionPane.showMessageDialog(null, numeroDesejado+" encontra-se na lista na posicão "+index);
				}
			}
			menu();
		}
		else {
			JOptionPane.showMessageDialog(null, "Opção inavalida!", "Erro", ERROR_MESSAGE );
			menu();
		}
	}
}
