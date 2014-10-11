package enclos;

public class Aquarium extends Enclos {
	protected int depth;
	protected boolean isSalt;
	
	public Aquarium(int depth, boolean isSalt) {
		super(name, area, maxAnimals, numAnimals, animalsList, cleanliness);
		this.depth=depth;
		this.isSalt=isSalt;
	}
	
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public boolean isSalt() {
		return isSalt;
	}
	public void setSalt(boolean isSalt) {
		this.isSalt = isSalt;
	}

	@Override
	public void clean() {
		if(this.isSalt == isSalt() && this.depth == getDepth()) {
		
		}
	}
}
