package solid.to.refactor.isp.bom;

public class ProductOwner implements POInterface {

	@Override
	public void priorizarBacklog() {
		System.out.println("Priorizando backlog com base nas minhas necessidades de negócio");
	}

}
