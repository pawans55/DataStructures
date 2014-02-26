package misc;

import java.util.Scanner;

public class fibonacci12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner read = new Scanner(System.in);
		System.out.print("Enter the value of read1: ");
		
		int n = read.nextInt();
		 
	
		
		
		
for(int i = 0; i <= n; i++){
	
		
	System.out.print(fibonacci2(i) + " ");
	
}
	}


public static int fibonacci(int number){
	
	if(number == 1 ){
		return 1;
	}else if(number == 0){
		return 0;
		
	}
	else{
		
		return fibonacci(number-1) + fibonacci(number -2);
	}
	}
public static int fibonacci2(int number){
	
	if(number == 0){
		return 0;
	}else if(number == 1){
		return 1;}
	else{
		
		int fibo1 = 0 , fibo2 = 1 , fibonacci = 1;
		
		for(int i = 2 ; i <=number ; i++){
			
			fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
			}
		return fibonacci;
		}
}}





		
	


