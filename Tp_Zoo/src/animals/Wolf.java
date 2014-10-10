package animals;

public class Wolf extends Animals implements Mammal, Wanderer{

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
		System.out.println("accouche");		
	}

}
