package enclos;

public class Volière extends Enclos {
	private int height;
	
	
	public Volière(int height) {
		if(animalsList == "eagle" || animalsList == "auk") {
			super(name, area, maxAnimals, numAnimals, animalsList, cleanliness);
		}
		this.height=height;
	}
	
	@Override
	public void clean() {
		System.out.println("vérification du toit de la cage");
		super.clean();
	}
}
