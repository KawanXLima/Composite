
public class principal {
	public static void main(String[] args) {
		ComposicaoComputador computador = new ComposicaoComputador(new Mouse(), new Teclado());
		System.out.println(computador.exibirSetup());
	}
}
