
public class ObjectDemo1 {
	
	int a = 10;
	boolean b = true;
	static int c = 30;

	public static void main(String[] args) {
		
		System.out.println(c); //We can access static variables without objects.
		
		ObjectDemo1 a = new ObjectDemo1(); //The Creation of Object. 'a' is Object Variable.
		// From using Object Reference Variable we can access Non-Static Members.
		
		System.out.println(a.a);
		System.out.println(a.b);

	}

}
