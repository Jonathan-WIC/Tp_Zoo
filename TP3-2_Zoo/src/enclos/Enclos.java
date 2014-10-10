package enclos;

import java.util.ArrayList;

public class Enclos {
	private String name;
	private int area;
	private int maxAnimals;
	private int numAnimals;
	private ArrayList<Animal> animalsList;
	private static String cleanliness;
	
	
	public Enclos(String name, int area, int maxAnimals, int numAnimals,
				  ArrayList<Animal> animalsList) {
		this.name = name;
		this.area = area;
		this.maxAnimals = maxAnimals;
		this.numAnimals = numAnimals;
		this.animalsList = animalsList;
		this.cleanliness="bon";
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

	public int getMaxAnimals() {
		return maxAnimals;
	}
	public void setMaxAnimals(int maxAnimals) {
		this.maxAnimals = maxAnimals;
	}

	public int getNumAnimals() {
		return numAnimals;
	}
	public void setNumAnimals(int numAnimals) {
		this.numAnimals = numAnimals;
	}

	public ArrayList<Animal> getAnimals() {
		return animalsList;
	}
	public void setAnimals(ArrayList<Animal> animalsList) {
		this.animalsList = animalsList;
	}

	public static String getCleanliness() {
		return cleanliness;
	}
	public static void setCleanliness(String cleanliness) {
		if(cleanliness=="mauvais" || cleanliness=="correct" || cleanliness=="bon") {
			Enclos.cleanliness = cleanliness;
		} else {
			System.err.println("wrong cleanliness !\n"
					+ "It have to be \"mauvais\", \"correct\" or \"bon\"");
		}
	}


	public void caracteristics() {
		System.out.println( toString() + '\n' + this.animalsList.toString() );
	}
	
	public void addAnimals(ArrayList<Animal> animalsList) {
		if(numAnimals+animalsList.size() <= maxAnimals) {
			this.animalsList.add(animalsList);
			numAnimals+=1;
		} else {
			System.err.println("The run is already full, we can't add another animal...");
		}
	}
	public void removeAnimals(ArrayList<Animal> animalsList) {
		for(Animal a : this.animalsList){
		    if (a == animalsList) {
		        this.animalsList.remove(animalsList);
		        --numAnimals;
		    }
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Enclos [name=" + name + ", area=" + area + ", maxAnimals=" + maxAnimals
				+ ", numAnimals=" + numAnimals + ", animalsList=" + animalsList
				+ ", cleanliness" + cleanliness + "]";
	}
}
