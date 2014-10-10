package enclos;

public class Volière extends Enclos {
	private int hauteur;
	
	
	public Volière(int hauteur) {
		if(animalsList == "eagle" || animalsList == "auk") {
			super(name, area, maxAnimals, numAnimals, animalsList, cleanliness);
		}
		
		
	}
}
