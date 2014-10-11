package animals;

public class Goldfish extends Animals implements Aquatic, Oviparous{

	private static final int incubationDays = 3;

	Goldfish(String name, String gender, long weight, long height,
			boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("Bloup...");
	}

	@Override
	public void layAnEgg() {
		System.out.println("After "+ incubationDays + "days, the egg is hatching, congratulation, this is a little this.name, it's so cute !");
	}

	@Override
	public void swim() {
		System.out.println("This round aquarium is endless!");
	}

}
