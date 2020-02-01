package lib;

/**
 * A Player class consists of data from both Name and PairOfDice classes. 
 * 1 default constructor and two custom constructors
 * @author p2447869
 *
 */

public class Player {
	
	//Fields
	
	private Name playerName;
	private Rollable Dice;
	
	//Constructors
	
	public Player () {
		playerName = new Name();
		Dice = new PairOfDice(); //initiates the two Fields of the Player class in a basic constructor
	}
	
	public Player (Name playerName) {
		this.playerName = playerName;
	}
	
	
	public Player (Name playerName, Rollable Dice) {
		this.playerName = playerName;
		this.Dice = Dice;
	}
			
	//Methods
	
	public Name getName() {
		return playerName; //simply returns the playerName that is in storage
	}
	
	public void setName(Name playerName) {
		this.playerName = playerName; //sets the playerName in storage to the one that is being passed in	
	}
	
	public Rollable getRollable() {
		rollDice(); // calls the rollDice() method
		getDiceScore(); // calls the getDiceScore() method
		return Dice; // returns the value of Dice in the memory of Player class
	}
		
	public void rollDice() {
		Dice.roll(); // calls the roll() method from the Die class
	}
		
	public int getDiceScore() {
		return Dice.getScore(); //returns the value of Dice in the memory of Player class after the method from the Die class called getScore() has been completed
	}
		
	public void setFullPlayerName(String playerName) {
		int whitespace = playerName.indexOf(" "); //this line finds the position of the whitespace within the sting
		this.playerName.setFirstName(playerName.substring(0, whitespace)); // creates a sub string of the first name then sets the player's first name back in to the Name class 
		this.playerName.setFamilyName(playerName.substring(whitespace+1, playerName.length())); // creates a sub string for family name then sets the player's family name back in to the Name class
	}
		
	public String toString() {
		return "Player:[Name:" + this.playerName + ", DiceScore=" + this.Dice + "]"; //when called, this prints the first string, playerName stored in 'this' class, second string, the Dice stored in 'this' class, final part of string
	}
	
	
	
}
