/*Ajay has birthday. His friends bought cake in rectangular shape. He has to cut the cakes into square. How many times he can able to
 * cut the cake(i,e) max number of times
 */

import java.util.*;
import java.io.*;

public class cakeCutting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length in cm: ");
		int l=sc.nextInt();
		System.out.println("Enter the breadth in cm: ");
		int b=sc.nextInt();
		
		int result=(l*b)-1;
		
		System.out.println(result);

	}

}
