package solid.to.refactor.ocp.bom;

public class EnviadorEmail implements Email {

	public void enviar(String string) {
		System.out.println("Enviando email...");
	}

}
