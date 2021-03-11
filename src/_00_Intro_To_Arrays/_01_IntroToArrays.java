package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String [] shrek = new String[5];
    	shrek[3] = "hola";
        // 2. print the third element in the array
    	System.out.println(shrek[3]);
        // 3. set the third element to a different value
    	shrek[3] = "sushi";
        // 4. print the third element again
    	System.out.println(shrek[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for (int i=0;i<shrek.length;i++) {
    		shrek[i] = "gummy worms";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for (int i=0;i<shrek.length;i++) {
    		System.out.println(shrek[i]);
    	}
        // 7. make an array of 50 integers
    	int [] heehee = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	Random rnd = new Random();
    	for (int i=0;i<heehee.length;i++) {
    		heehee[i] = rnd.nextInt(100);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	int Num = heehee[0];
    	for (int i = 1; i < heehee.length; i++) {
			int j = heehee[i];
			if (heehee[i] < Num) {
				Num = heehee[i];
			}
		}
    	System.out.println(Num);
        // 10 print the entire array to see if step 8 was correct
    	for (int i = 0; i < heehee.length; i++) {
			int j = heehee[i];
			System.out.println(heehee[i]);
		}
        // 11. print the largest number in the array.
    	for (int i = 1; i < heehee.length; i++) {
			int j = heehee[i];
			if (heehee[i] > Num) {
				Num = heehee[i];
			}
		}
    	System.out.println(Num);
        // 12. print only the last element in the array
    	System.out.println(heehee[49]);
    }
}
