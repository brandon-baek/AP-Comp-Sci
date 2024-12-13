/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class Character {
	String role = "Wizard";
	int strength = 9;
	int dexterity = 10;
	int intelligence = 10;
	int constitution = 0;
	int charisma = 0;
}

class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		
		System.out.println("Role: " + myCharacter.role);
		System.out.println("Strength: " + myCharacter.strength);
		System.out.println("Dexterity: " + myCharacter.dexterity);
		System.out.println("Intelligence: " + myCharacter.intelligence);
		System.out.println("Constitution: " + myCharacter.constitution);
		System.out.println("Charisma: " + myCharacter.charisma);
	}
}