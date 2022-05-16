import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		ConvertibleCar car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel() , "Did not return the correct model name");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;
		
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "Did not return the correct boolean");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;
		
		boolean toplowered = car.getToplowered();

		assertTrue(toplowered , "toplowered boolean did not return true");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;
		
		boolean topRaised = car.getTopRaised();

		assertTrue(topRaised , "topRaised boolean did not return true");
		
		
	}
}
