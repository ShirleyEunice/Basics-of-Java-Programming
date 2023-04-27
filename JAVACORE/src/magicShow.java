/*There is a show in a City. There comes three magicians. The audience has to choose the magician.After the show
 * they can give ratings to the each magicians between 0 - 10. Calculate the average rate of every magicians.
 */

import java.util.*;
import java.io.*;
import java.text.*;

public class magicShow {
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.0");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the show: ");
		int show1=sc.nextInt();
		int show2=sc.nextInt();
		int show3=sc.nextInt();
		
		System.out.println("Rate the magicians:");
		float show1f=sc.nextFloat();
		float show2f=sc.nextFloat();
		float show3f=sc.nextFloat();
		
		System.out.println(df.format((show1*show1f)+(show2*show2f)+(show3*show3f)/show1+show2+show3));

	}

}
