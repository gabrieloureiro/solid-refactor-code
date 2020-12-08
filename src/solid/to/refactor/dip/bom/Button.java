package solid.to.refactor.dip.bom;

public interface Button {

	public boolean handleButtonState(state);
	
	public void showButtonState(state);

	public void turnOn();

	public void turnOff();
	
}
