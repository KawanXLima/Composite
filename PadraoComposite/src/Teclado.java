import java.util.List;

public class Teclado implements Computador {

	private List<Character> digitos;
	
	
	public void digitos(char digitos) {
		this.digitos.add(digitos);
	}
	
	public String texto() {
		return "Texto";
	}
	
	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		return "Liguei";
	}

	@Override
	public String deligar() {
		// TODO Auto-generated method stub
		return "Desliguei";
	}

	@Override
	public String toString() {
		return "Teclado [texto=" + texto() + ", ligar=" + ligar() + ", deligar="+ deligar() + "]";
	}

}
