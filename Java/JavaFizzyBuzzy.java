/*
Kevin Nguyen
Basic Java program when given an input, it will print "Fizz," "Buzz," or "FizzBuzz" respectively.

How to run (linux):
	1.) open command line and cd into directory folder of where this code is
	2.) type in "javac *.java" to compile java files
	3.) type in "java JavaFizzyBuzzy"
*/

//imports
import java.io.*;
import java.util.*;

//class
class JavaFizzyBuzzy {
	//Global Declarations

	//main driver
	public static void main(String[] args) {
		//local Declarations
		List<Integer> tgtList = initialList();

		System.out.println("HelloWorld");
	}

	//function definitions below	
	public static ArrayList<Integer> initialList() {
		List<Integer> tgtList = new ArrayList<Integer>();
		Random rand = new Random();
		int i = 0, max = 10;

		while(i<max) {
			tgtList.add(rand.nextInt(max));
			i++;
		}

		return tgtList;
	}

}