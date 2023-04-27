/*Ram and ravi lives in same bed room.
 * Their bed room is very large. so that when they have to meet, they have to walk more.
 * So they decided to place the their beds at the centre of the room.
 * room is square in shape.
 * 
 * Can you help them to calculate the exact center for them.
 */

import java.util.*;
import java.io.*;

public class centreOfSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		int sides=sc.nextInt();
		
		int resultX=(sides/2+length);
		int resultY=(sides/2+breadth);
		
		System.out.println("The centre of the room is: ("+resultX+","+resultY+")");

	}

}
