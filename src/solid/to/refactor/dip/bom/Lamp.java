package solid.to.refactor.dip.bom;

public class Lamp implements Button {

	private boolean isOn;
	
	@Override
	public void showButtonState() {
		String message = isOn ? "Lamp is on" : "Lamp is off"
		System.out.println(message);
  }

	@Override
	public void turnOn() {
    showLampState(this.handleButtonState(false));
	}

	@Override
	public void turnOff() {
    showLampState(this.handleButtonState(false));
	}
	

	@Override
	private boolean handleButtonState(boolean state) {
		this.isOn = state;
		return this.isOn;
	}

}
