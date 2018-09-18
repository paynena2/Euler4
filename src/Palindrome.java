import java.util.ArrayList;
import java.util.Collections;

//Nathaniel Payne
//Project Euler #4
// Largest Palindrome made of 2 3-digit numbers

public class Palindrome {
	public static void main(String[] args) {
		ArrayList<Integer> results = new ArrayList<Integer>();
		for(int x = 999; x>99; x--) { // loop through the first number from 999 -> 100 after the second number cycles from 999->100
			for(int y = 999; y > 99; y--) {
				int product = x*y; // find the product of the two numbers
				StringBuilder productSB = new StringBuilder(); //useful for reversing the number
				productSB.append(product);
				productSB.reverse(); //reverses the number
				String productReverse = productSB.toString(); //changes the StringBuilder back to a string to manipulate
				int reversed = Integer.parseInt(productReverse); //gets the integer from the string
				if(product == reversed) { //if the number is the same forwards and backwards, its a palindrome
					results.add(product); //add the number to the list if palindrome
				}
				
			}
		}
		Collections.sort(results); // sorts in ascending order
		Collections.reverse(results); //sorts in descending order
		System.out.println(results.get(0)); //prints the result
	}
}
