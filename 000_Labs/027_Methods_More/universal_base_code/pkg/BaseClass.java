/*
 *	Author:  
 *  Date: 
*/

package pkg;

class Character {
	// Global Variables
	public String role;
	public int strength;
	public int dexterity;
	public int intelligence;
	public int constitution;
	public int charisma;
	
	// Constructors
	public Character(){
		role = "No role";
	}
	
	public Character(String r){
		role = r;
	}
	
	// Methods
	public void myToString(){
		System.out.println("Your role is " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your constitution is " + constitution);
		System.out.println("Your charisma is " + charisma);
	}
	
	public void setRole(String r){
		role = r;
	}
}