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
		List<Integer> tgtList = initialList(); //get initial list

		//print initial values
		printValues(tgtList);

		//call function to do fizz buzz
		doFizzBuzz(tgtList); 
	}

	//function definitions below
	//initialList function will initialize a list full of integers 	
	public static List<Integer> initialList() {
		//local declarations
		List<Integer> tgtList = new ArrayList<Integer>();
		Random rand = new Random();
		int i = 0, max = 10;

		//loop through and insert random integers up to 10
		while(i < max) {
			tgtList.add(rand.nextInt(max));
			i++;
		}

		return tgtList;
	}

	//doFizzBuzz will take a list and call functions to print appropriate values
	public static void doFizzBuzz(List<Integer> tgtList) {
		//local declarations
		int i = 0;

		//go through each item in tgtList
		while(i < tgtList.size()) {
			//call printVals function
			printVals(tgtList.get(i));
			i++;
		}
	}

	//printVals will print values up to the tgt value
	public static void printVals(int tgtVal) {
		//local declarations
		int i = 0;

		//print values up to tgtVal
		while(i < tgtVal) {
			//condition to check for fizz, buzz, and fizzbuzz respectively
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}
}