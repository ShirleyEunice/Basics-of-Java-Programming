/*Art class has been started. on first day was 'x'. On next day, the event gained good response and the number of people who attended 
 * the event on second day was twice the number on 1st day.
 * due to heavy rain on the third day, the number of people attended the event was exactly half the number of persons on 
 * first day.
 * 
 * User gives total number of students attended the event in the first 3 days. calculate specifically for 1st, 2nd, and 3rd day.
 * 
 */
import java.util.*;
import java.io.*;
public class ArtsClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Overall=sc.nextInt();
		
		int result=(Overall*2)/7;
		
		System.out.println("First day: "+result);
		System.out.println("Second day: "+result*2);
		System.out.println("Third day: "+result/2);
		

	}

}
