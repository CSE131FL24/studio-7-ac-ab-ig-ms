package studio7;

public class Die {

	public class Dice{
		private int sides;
		
	public Dice (int sides) {
		this.sides = sides;
	}
		
	public int Random() {
		int random = (int)(Math.random()*this.sides +1);
		 return random;
		}
		
		
		
		
	}
	
	
	
}
