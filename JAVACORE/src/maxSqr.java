/*A child has to find maximum number of square from a large square tiles. Help her!
 */

import java.util.*;
import java.io.*;

public class maxSqr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sides=sc.nextInt();
		int tiles=sc.nextInt();
		
		int sqr=(int)Math.sqrt(tiles);
		int pow=(int)Math.pow((tiles*sides),2);
		
		System.out.println("Area of the largest possible square is: "+pow);
	}
}
