package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun arrayFun= new MoreArrayFun();
		String[] strings = {"one", "two", "three", "four", "five"};
		arrayFun.stringPrinter(strings);
		arrayFun.backwardsPrinter(strings);
		arrayFun.otherPrinter(strings);
		arrayFun.randomPrinter(strings);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void stringPrinter(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String string = array[i];
			System.out.println(string);
		}
			
			
		}
	


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	void backwardsPrinter(String[] array) {
		for (int i = array.length-1; i > -1; i--) {
			String string = array[i];
			System.out.println(string);
		}
			
			
		}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
	void otherPrinter(String[] array) {
		for (int i = 0; i < array.length; i+=2) {
			String string = array[i];
			System.out.println(string);
		}
			
			
		}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	void randomPrinter(String[] array) {
		Random rnd = new Random();
 		for (int i = 0; i < array.length; i++) {
 			String string = array[i];
 			int rndNum = rnd.nextInt(array.length);
 			array[i] = array[rndNum];
 			array[rndNum] = string;
			

			}
 			stringPrinter(array);
		}
	}


