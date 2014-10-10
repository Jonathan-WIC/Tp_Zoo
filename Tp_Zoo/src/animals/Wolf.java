package animals;

public class Wolf extends Animals implements Wanderer{

	@Override
	void emmitSound() {
		System.out.println("Ouuuh, Aouuuuh");
	}

	@Override
	public void wander() {
		System.out.println("Let's wandering!");	
	}

}
