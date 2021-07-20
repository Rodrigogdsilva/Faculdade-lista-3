package exercicio_2;

public class EquacaoMain {

	public static void main(String[] args) {

		double a = 0, b = 0, c = 0, delta = 0;

		Equacao x = new Equacao(a, b, c);

		x.Ler(a, b, c);
		x.Cdelta(a, b, c);
		x.Rdelta();

		System.out.println("a = " + x.a + "b" + x.b + "c" + x.c);
		System.out.println("delta" + x.delta);
		System.out.println("X' = " + x.R1 + " e " + "X'' = " + x.R2);
	}

}
