package solid.to.refactor.lsp.bom;

public class ContaDeEstudante extends ContaComum {
	
	private int milhas;

	public ContaDeEstudante() {
		super();
		this.milhas = 0;
	}
	
	@Override
	public void rende() {
		this.milhas = milhas;
	}
	
	@Override
	public void deposita(double valor) {
		this.milhas += (int)valor;
		super.deposita(valor);
	}
	
	public int getMilhas() {
		return milhas;
	}	
	
}
