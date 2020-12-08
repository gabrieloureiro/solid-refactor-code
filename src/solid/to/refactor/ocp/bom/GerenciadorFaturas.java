package solid.to.refactor.ocp.bom;

public class GerenciadorFaturas {

	private FilaContabilidade filaContabilidade;
	private EnviadorEmail enviadorEmail;
	
	public void pagarFatura(Fatura fatura) {
		fatura.setPaga(true);
		
		filaContabilidade.enviarParaFila(fatura);
		enviadorEmail.enviar("email@email.com");
	}

}
