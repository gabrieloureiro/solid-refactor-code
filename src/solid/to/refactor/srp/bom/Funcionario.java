package solid.to.refactor.sip.ruim;

public class Funcionario {
	
	private Cargo cargo;
	private double salarioBase;

	public Cargo getCargo() {
		return cargo;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
