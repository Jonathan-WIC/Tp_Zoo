package enclos;

public class Voli�re extends Enclos {
	private int height;
	
	
	public Voli�re(int height) {
		if(animalsList == "eagle" || animalsList == "auk") {
			super(name, area, maxAnimals, numAnimals, animalsList, cleanliness);
		}
		this.height=height;
	}
	
	@Override
	public void clean() {
		System.out.println("v�rification du toit de la cage");
		super.clean();
	}
}
