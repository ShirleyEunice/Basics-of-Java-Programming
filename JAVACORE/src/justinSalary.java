/*Justin works as a part time job after college.
 * Weekdays=80/hour
 * Weekends=50/hour
 * 
 * Given that justin works 10 more than the number of hours he had worked in the weekends.
 * 
 * If total salary is given. Calculate the salary given in weekdays and weekends.
 */
import java.util.*;
import java.io.*;

public class justinSalary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		
		int result=(salary-800)/130;
		int r=result+10;
		System.out.println("Weekdays: "+r);
		System.out.println("Weekends: "+result);

	}

}
