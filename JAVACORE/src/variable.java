public class variable {

	public static void main(String[] args) {
		int principal;//local variables
		principal=10000;
		System.out.println(principal);
		
		//Size of the primitive data types in bytes
		System.out.println(Integer.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Long.SIZE/8);
		
		//Float values should be represented with 'f' or it will be considered as double
		float rate=45.6f;
		double rate1=43.67;
		
		//final variable is assigned and so it cannot be changed further
		
		final int x;
		x=20;
		
		System.out.println(x);
		

	}

}
