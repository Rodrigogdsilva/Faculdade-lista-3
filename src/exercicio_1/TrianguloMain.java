package exercicio_1;

public class TrianguloMain {

	public static void main(String[] args) {

		float base = 0, altura = 0;

		Triangulo t = new Triangulo(base, altura);

		t.ler(base, altura);
		t.calcTriangulo();

		t.exibir();

	}

}
