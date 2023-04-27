/*A person like to start a business. He has four main categories-branding, travel, food, logistics. Calculate the total
expenses. rate percentage of each categories.

total=branding + travel+food+logistics
rate=(branding/total)*100 

*Also the rate of the categories should be with two numbers after decimal (i.e)0.00 */

import java.util.*;
import java.io.*;
import java.text.*;

public class expenses {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		double branding=sc.nextDouble();
		double travel=sc.nextDouble();
		double food=sc.nextDouble();
		double logistics=sc.nextDouble();
		
		double result=(branding+travel+food+logistics);
		
		System.out.println("Total expenses: "+df.format(result));
		System.out.println("Rate of branding"+df.format((branding/result)*100)+"%");
		System.out.println("Rate of travel"+df.format((travel/result)*100)+"%");
		System.out.println("Rate of food"+df.format((food/result)*100)+"%");
		System.out.println("Rate of logistics"+df.format((logistics/result)*100)+"%");
		
		
		
	}

}
