/*NGO has raised funds for charity. Suzan volunteer from NGO. She sold 'X' more adult tickets than children tickets and she 
 * sold twice as many senior tickets as children tickets. Assume adult ticket costs 5, children ticket costs 2 and
 * senior ticket costs 3
 * Suzan made 'Y' dollars from ticket sales. Find the number of adult tickets, children tickets and senior tickets sold.
 */

import java.util.*;
import java.io.*;


public class ticketSold {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int a=(y-(5*x))/13;
		
		System.out.println("Number of childern ticket sold: "+a);
		System.out.println("Number of adult ticket sold: "+a+x);
		System.out.println("Number of senior ticket sold: "+a*y);
		

	}

}
