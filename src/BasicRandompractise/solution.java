package BasicRandompractise;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int intsum;
                double dsum;
                String  ssum;
                /* Read and save an integer, double, and String to your variables.*/
intsum= i+scan.nextInt();
dsum= d+scan.nextDouble();
ssum= s + scan.next() +  scan.nextLine();


                /* Print the sum of both integer variables on a new line. */

       System.out.println(intsum);


                /* Print the sum of the double variables on a new line. */
       System.out.println(dsum);
        		
                /* Concatenate and print the String variables on a new line; 
                	the 's' variable above should be printed first. */
       System.out.println(ssum);
       
       
                scan.close();
        
    }}