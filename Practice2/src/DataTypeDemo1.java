
public class DataTypeDemo1 {
	
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static boolean bl;

	public static void main(String[] args) {
		
		System.out.println(b);  //If we don't initialized values for global variables. JVM will automatically print default values.
		System.out.println(s);   //For local Variables we have to be Initialized.
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bl);
		
//		int a;
//		System.out.println(a);    //If we don't initialized value for local variables it shows compile time error when printing time.
//   	By Default Every Class name will be considered as Non-Primitive Data type.
	}

}
