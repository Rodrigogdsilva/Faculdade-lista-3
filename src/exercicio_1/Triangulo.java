package exercicio_1;

import javax.swing.JOptionPane;

public class Triangulo {

	float area, base, altura;

	public Triangulo(float base, float altura) {

		this.base = base;
		this.altura = altura;

	}

	public float calcTriangulo() {

		area = (base * altura) / 2;

		return area;

	}

	public void exibir() {

		JOptionPane.showMessageDialog(null, "Área do triangulo: " + area);

	}

	public float ler(float base, float altura) {

		this.base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base do      triangulo:"));
		this.altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura do triangulo:"));

		return this.base + this.altura;
	}

}
