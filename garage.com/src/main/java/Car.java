public class Car extends MotorizedVehicle{
	private int odometer;
	public String color;

	
	
	
	public Car(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	
	}
	
	
	boolean getIsOn(){
		return true;
	}
	
	
	public int getOdometer() {
		return odometer;
	}
	
	public boolean SetisOn() {
		return true;
	}
	
	
	public boolean getIsStarted() {
		return this.getIsOn() && this.SetisOn();
	}




	
	
}
