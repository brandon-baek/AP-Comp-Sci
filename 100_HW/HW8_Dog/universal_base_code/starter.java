/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("Rocket");
		dog1.setAge(2);
		
		Dog dog2 = new Dog("Bucky", "German Shepard");
		
		if (!dog1.isSleeping()) {
			dog1.bark();
			dog2.bark();
		}
	}
}
