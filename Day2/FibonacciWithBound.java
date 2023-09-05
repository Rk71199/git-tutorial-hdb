package Day2;

import java.util.Scanner;

public class FibonacciWithBound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("lower =");
		int Lower=sc.nextInt();
		System.out.println("upper =");
		int Upper=sc.nextInt();
		
		int A = 0;
		int B = 1;
		int R;
		System.out.println("output :");
		if(Lower==A)
			System.out.print(A+" "+B);
		if (Lower==B)
			System.out.println(B+" ");
		for (int i =0;i<20;++i) {
			
			 R= A+B;
			 A=B;
			 B=R;
			 if(R>=Lower&&R<=Upper)
				
			 System.out.print(" "+R);
			 else if (R> Upper)
				 break;
			
			 sc.close();
		}
		
		
	}

}
