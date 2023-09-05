package Day2;

import java.util.Scanner;

public class Coordinate {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter X-Axis value :");
		int X = Sc.nextInt();
		System.out.println("Enter y-Axis value :");
		int y = Sc.nextInt();

		if (X>0&&y>0) System.out.println("1st Quadrant");
		else if (X<0&&y>0) System.out.println("2nd Quadrant");
		else if (X<0&&y<0) System.out.println("3nd Quadrant");
		else if (X>0&&y<0) System.out.println("4nd Quadrant");
		else if (X==0&&y!=0) System.out.println("y-Asix");
		else if (X!=0&&y==0) System.out.println("X-Asix");
		else   System.out.println("origin");
		
		Sc.close();
	}

}
