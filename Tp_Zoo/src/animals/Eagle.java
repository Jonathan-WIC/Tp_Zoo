package animals;

public class Eagle extends Animals implements Flying, Oviparous {

	private static final int incubationDays = 43;

	Eagle(String name, String gender, long weight, long height,
			boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	public void layAnEgg() {
		System.out.println("After "+ incubationDays + "days, the egg is hatching, congratulation, this is a little"+ this.name+", it's so cute !");
	}

	@Override
	void emmitSound() {
		System.out.println("*Glatit* *Glatit* *Glatit*");
	}

	@Override
	public void fly() {
		System.out.println("I believe I can fly. I believe I can touch the sky!");
	}

}
