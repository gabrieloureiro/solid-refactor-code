package solid.to.refactor.srp.bom;

public class CalculadoraSalario {

	public double calcularSalario(Dba funcionario) {
		return funcionario.getSalarioBase() * 1.2;
	}

	public double calcularSalario(Desenvolvedor funcionario) {
		return funcionario.getSalarioBase() * 1.3;
	}

	public double calcularSalario(Gerente funcionario) {
		return funcionario.getSalarioBase() * 1.1;
	}

}
