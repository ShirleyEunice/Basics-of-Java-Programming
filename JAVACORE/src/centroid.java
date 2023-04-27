import java.util.Scanner;
import java.text.DecimalFormat;
public class centroid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat(".#");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		
		float xValues=((float)(x1+x2+x3)/3);
		float yValues=((y1+y2+y3)/3);
		
		System.out.println("Centroid of Shirley Home is ("+ df.format(xValues)+" , "+df.format(yValues)+" )" );
	}

}
