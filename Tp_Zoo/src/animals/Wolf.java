package animals;

public class Wolf extends Animals implements Mammal, Wanderer{
	
	private static final int gestationDays = 60;
	
	Wolf(String name, String gender, long weight, long height, boolean isHungry, boolean isSleeping, boolean isHealthy){
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("Ouuuh, Aouuuuh");
	}

	@Override
	public void wander() {
		System.out.println("Let's wandering!");	
	}

	@Override
	public void birth() {
		System.out.println("After "+ gestationDays + "days, a cute little wolf is born, so swwet :3");
	}

}
