package Day2;

import java.util.Scanner;

public class Consine_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angel :");
		double num = sc.nextInt();
		
		double x=Math.toRadians(num);
		
		double sum=1;
		
	    int fact=1;
	      double p = 1;
	      
		for(int i=1; i<=19 ; i++) {
			fact *= i;
			
			if(i%2==0) {
				p = -p*x*x;
				
				sum +=  p/(fact);
				
		sc.close();
			}
			
			
			
		}
		System.out.println(sum);

	}

}
