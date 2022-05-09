package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaAdicao {
	public static void main(String[] args) {
		Adicao a1 = new Adicao();
		String aux, escolha = "sim";
		int Resultado;
		while (escolha.equalsIgnoreCase("sim")) {
			aux = JOptionPane.showInputDialog("Escolha qual Numeros voce quer somar: \n (1) Inteiros \n (2) Reais");
			Resultado = Integer.parseInt(aux);
			try {
				switch (Resultado) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o primeiro numero Inteiro: ");
					int n1 = Integer.parseInt(aux);
					aux = JOptionPane.showInputDialog("Digite o segundo numero Inteiro: ");
					int n2 = Integer.parseInt(aux);
					a1.somaNumeros(n1, n2);
					JOptionPane.showMessageDialog(null, "Numeros Digitados: " + a1.getNumInteiro1() + "," + a1.getNumInteiro2() +"\n Operação: Inteiros" + "\nResultado dos numeros Inteiros: " + a1.somaNumeros(n1, n2));
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o primeiro numero Real: ");
					double n3 = Double.parseDouble(aux);
					aux = JOptionPane.showInputDialog("Digite o segundo numero Real: ");
					double n4 = Double.parseDouble(aux);
					a1.somaNumeros(n3, n4);
					JOptionPane.showMessageDialog(null, "Numeros Digitados: " + a1.getNumReal1() +","+ a1.getNumReal2() + "\n Operação: Reais" + "\nResultado dos numeros Inteiros: " + a1.somaNumeros(n3, n4));
					break;
				default:
					throw new Exception("Opção Incorreta");
				}
				escolha = JOptionPane.showInputDialog("Deseja Continuar: sim - nao");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		JOptionPane.showMessageDialog(null, "Fim do programa, Até breve");
	}
}
