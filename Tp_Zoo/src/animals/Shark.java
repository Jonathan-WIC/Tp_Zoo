package animals;

public class Shark extends Animals implements Aquatic, Oviparous{

	private static final int incubationDays = 336;

	Shark(String name, String gender, long weight, long height,
			boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	void emmitSound() {
		System.out.println("...");
	}

	@Override
	public void layAnEgg() {
		System.out.println("After "+ incubationDays + "days, the egg is hatching, congratulation, this is a little"+ this.name+", it's so cute !");
	}

	@Override
	public void swim() {
		System.out.println("*Swim* *Swim* *Swim*");
	}

}
