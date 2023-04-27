/*event is conducted where it can help to celebrate parties. They have to calculate name(string), type of party(string), number of people(int), 
 * paid version(yes/no)(char), projected expenses(double).
 * Get all details from the user and also allocate the projected expenses with single value after decimal.
 */

import java.util.*;
import java.io.*;
import java.text.*;

public class event {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.0");
		
		System.out.println("Enter the Event Name");
		String name=sc.nextLine();
		System.out.println("Enter the Event type");
		String type=sc.nextLine();
		System.out.println("Enter the Expexted Count");
		int people=sc.nextInt();
		System.out.println("Enter the Paid Entry");
		char paid=sc.next().charAt(0);
		System.out.println("Enter the Projected Expenses");
		double exp=sc.nextDouble();
		
		System.out.println("Event Name: "+name);
		System.out.println("Event type: "+type);
		System.out.println("Event expexted Count: "+people);
		System.out.println("Event Paid Entry: "+paid);
		System.out.println("Event Projected Expenses: "+df.format(exp)+"L");
		
		
		

	}

}
