package exercicio_2;

import javax.swing.JOptionPane;

public class Equacao {

	double a, b, c, delta, R1, R2;

	public Equacao(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double Ler(double a, double b, double c) {
		this.a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de a"));
		this.b = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de b"));
		this.c = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor de c"));
		return this.a + this.b + this.c;
	}

	public double Cdelta(double a, double b, double c) {
		delta = (this.b * this.b) - 4 * this.a * this.c;
		return delta;
	}

	public double Rdelta() {
		R1 = ((-this.b) + (Math.sqrt(delta))) / (2 * this.a);
		R2 = ((-this.b) - (Math.sqrt(delta))) / (2 * this.a);
		return R1 + R2;
	}

}
