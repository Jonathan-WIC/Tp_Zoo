package animals;

public class Bears extends Animals implements Mammal {

	private static final int gestationDays = 244;
	

	Bears(String name, String gender, long weight, long height,
			boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("Grrww");
	}

	@Override
	public void birth() {
		System.out.println("After "+ gestationDays + "days, a cute little bear is born, so swwet :3");
	}

}
