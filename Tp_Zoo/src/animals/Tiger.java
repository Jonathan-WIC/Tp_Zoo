package animals;

public class Tiger extends Animals implements Mammal, Wanderer {

	Tiger(String name, String gender, long weight, long height,boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("Roooaaarrrrrr!!!");
	}

	@Override
	public void wander() {
		System.out.println("Let's wandering!");	
	}

	@Override
	public void birth() {
		System.out.println("After "+ gestationDays + "days, a cute little tiger is born, so swwet :3");
	}

}
