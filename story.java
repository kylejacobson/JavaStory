package sdfds;

import java.util.*;

public class story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);

System.out.println("What's your name?");
String name = scan.next();

	if (name.equals("Kyle"))
{	
		System.out.println("Wow! What a great name!");
}
	else
{
		System.out.println("Wow, what a stupid name... too bad it's not Kyle.");
}
	
	System.out.println("Let's go on an adventure, " + name + ".");
	System.out.println("Please step inside my McClaren F1.");
	
	
	System.out.println("How fast would you like to go today?(numbers only)");
		int speed = scan.nextInt();
	
	if(speed > 75)
{
		System.out.println("That's what I'm talkin' bout!");
}
	else
{
		System.out.println("I don't think you're ready for this adventure. Please close the book.");
}
	if (speed < 75)
{		
		System.out.println("Just kidding.... but really, we're going to go pedal to the floor.");
}
		System.out.println("Please enter a letter.");
		
	char endForNow;
	endForNow = scan.next().charAt(0);
	switch (endForNow){
		case 'a':
			System.out.println("Whoops we crashed.");
			break;
		case 'b':
			System.out.println("Nice job! We're out of gas");
			break;
		default:
			System.out.println("Did you bring an extra pair of shorts?");
			break;
			
			
	
	}
	
	
	}
	
	
}



