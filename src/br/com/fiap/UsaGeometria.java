package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaGeometria {
	public static void main(String[] args) {
		Geometria G1 = new Geometria();
		String aux, escolha = "sim";
		int area;

		while (escolha.equalsIgnoreCase("sim")) {
			try {
				aux = JOptionPane.showInputDialog("Escolha o que vc quer calcular: \n(1)Quadrado  \n(2)Retangulo  \n(3)Circulo");
				area = Integer.parseInt(aux);
				switch (area) {
				case 1:
					aux = JOptionPane.showInputDialog("Digite o Valor do lado: ");
					float lado1 = Float.parseFloat(aux);
					G1.calculaArea(lado1);
					break;
				case 2:
					aux = JOptionPane.showInputDialog("Digite o valo do lado: ");
					float lado2 = Float.parseFloat(aux);
					aux = JOptionPane.showInputDialog("Digite o valor da altura");
					float altura = Float.parseFloat(aux);
					G1.calculaArea(lado2, altura);
					break;
				case 3:
					aux = JOptionPane.showInputDialog("Digite o valor do Raio: ");
					double raio = Double.parseDouble(aux);
					G1.calculaArea(raio);
					break;
				default:
					throw new Exception("Opção Invalida");
				}
				escolha = JOptionPane.showInputDialog("Deseja continuar? sim - nao");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}

		}
		JOptionPane.showMessageDialog(null, "Fim de programa, Até breve");
	}
}