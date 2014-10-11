package animals;

public class Razorbill extends Animals implements Oviparous, Flying, Aquatic {

	private static final int incubationDays = 30;
	
	Razorbill(String name, String gender, long weight, long height,
			boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super(name, gender, weight, height, isHungry, isSleeping, isHealthy);
	}

	@Override
	public void swim() {
		System.out.println("Héhé! I can swim!");
	}

	@Override
	public void fly() {
		System.out.println("Amazing! I can Fly!");
	}

	@Override
	public void layAnEgg() {
		System.out.println("After "+ incubationDays + "days, the egg is hatching, congratulation, this is a little"+ this.name+", it's so cute !");
	}

	@Override
	void emmitSound() {
		System.out.println("*Jabote* *Jabote* *Jabote*");
	}

}
