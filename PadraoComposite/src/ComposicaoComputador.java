import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComposicaoComputador implements Computador {

	protected List<Computador> filho = new ArrayList<>();
	
	
	public ComposicaoComputador(Computador...computadors) {
		this.filho.addAll(Arrays.asList(computadors));
	}
	
	public void add(Computador computador) {
		this.filho.add(computador);
	}
	
	public void remove(Computador computador) {
		this.filho.remove(computador);
	}
	
	public List<Computador> exibirSetup(){
		return this.filho;
	}
	
	
	@Override
	public String ligar() {
		// TODO Auto-generated method stub
		return "Todos ligados";
	}

	@Override
	public String deligar() {
		// TODO Auto-generated method stub
		return "Todos desligados";
	}

}
