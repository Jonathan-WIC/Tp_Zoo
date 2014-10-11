package animals;

public class Whale extends Animals implements Mammal, Aquatic{
	
	private static final int gestationDays = 336;
	
	Whale(String name, String gender, long weight, long height, boolean isHungry, boolean isSleeping, boolean isHealthy){
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("Baunnn");
	}

	@Override
	public void birth() {
		System.out.println("After "+ gestationDays + "days, a cute little whale is born, so swwet :3");
	}

	@Override
	public void swim() {
		System.out.println("*humming*\nI'm swimming in the seas,\n I'm swimming in the seas");
	}

}
