package solid.to.refactor.ocp.bom;

public class FilaContabilidade implements Fila {
	
	public void enviarParaFila(Fatura fatura) {
		System.out.println("Enviando fatura " + fatura.getNumero() + " para a fila de processamento...");
	}

}
