package Day2;

;

public class Even10Fibonacci {

	public static void main(String[] args) {
		
		int A = 0;
		int B = 1;
		int R;
		
		int count =0;
		System.out.println("output :");
		for (;count<10;) {
			
			 R= A+B;
			 A=B;
			 B=R;
			 if(R%2==0) {
				 
				 System.out.print(" "+R);
				 count++;
				 
					
			 }
				
		}
		
		}	 
			 
		
	}

