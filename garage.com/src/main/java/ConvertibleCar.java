public class ConvertibleCar extends Car implements ICar {
	private boolean topDown;
	private boolean topRaise;
	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	
		}

	

	public boolean getToplowered()
	{
		this.topDown = true;
		return this.topDown;
	}

	public boolean getTopRaised()
	{
		this.topRaise = true;
		return this.topRaise;
	}

	
	

}
