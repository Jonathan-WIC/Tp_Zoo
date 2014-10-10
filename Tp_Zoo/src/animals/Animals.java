package animals;

public abstract class Animals {
	
	protected String name;
	protected String gender;
	protected long weight;
	protected long height;
	protected boolean isHungry;
	protected boolean isSleeping;
	protected boolean isHealthy;
	
	protected void eat(){
		if(! this.isSleeping){
			System.out.println("Je suis en train de manger!");
			this.isHungry = false;
		}
	}
	
	protected void heal(){
		if(! this.isHealthy){
			System.out.println("I need a medic! hurry!");
			this.isHealthy = true;
		}
	}
	
	protected void sleep(){
		if(this.isSleeping)
			this.isSleeping = false;
		else
			this.isSleeping = true;
	}
	
	abstract void emmitSound();
	
	public String toString(){
		
		String strHungry;
	    if(isHungry)
	    	strHungry = "\nI'm hungry!\n";
	    else 
	    	strHungry = "\nI'm not hungry yet...\n";
	    
	    String strHealthy;
	    if(isHealthy)
	    	strHealthy = "I'm alrgiht!\n";
	    else 
	    	strHealthy = "My body hurts pretty bad...\n";
	    
	    String strSleepy;
	    if(isSleeping)
	    	strSleepy = "I'm sleeping... zzzZZZzzZZZzzz....";
	    else 
	    	strSleepy = "And no, i'm not sleeping.";
		
	    String str = "I'm a  "+ this.gender +" "+ this.getClass() +".\n I weigh "+ this.weight +" kg and I measure"+ this.height+" cm.\n ";
	    
	    return str + strHungry + strHealthy + strSleepy;
	  }
		
}
