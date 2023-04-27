/*Ravi bought a scooter(CP) . after he made a repair. Later he sold the scooter(SP). What is his profit?
 */
import java.util.*;
import java.io.*;
import java.text.*;

public class profit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		int CP=sc.nextInt();
		int repair=sc.nextInt();
		int SP=sc.nextInt();
		
		int profit=SP-(CP+repair);
		
		float result=((float)profit*100)/(float)(CP+repair);
		
		System.out.println("The profit gained is: "+df.format(result)+"%");

	}

}
