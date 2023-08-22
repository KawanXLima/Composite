
public class Mouse implements Computador{

	private int movimento = 0;
	
	
	public Mouse() {
		
	}
	
	public void movimento() {
		this.movimento += 1;
	}
	
	public int getMovimento() {
		return movimento;
	}
	
	@Override
	public String ligar() {
		return "Liguei";
	}

	@Override
	public String deligar() {
		// TODO Auto-generated method stub
		return "Desliguei";
	}

	@Override
	public String toString() {
		return "Mouse [movimento=" + getMovimento() + ", ligar=" + ligar() +"]";
	}
	
	
	
}
