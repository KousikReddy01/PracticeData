
public class VariableDemo3 {
	
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		
		System.out.println(b);
		
		b = 30;    //replacing the static value
		System.out.println(b);
		
		int b = 40;  //Local variable declaring and Initializing .
		System.out.println(b);
		
	//	System.out.println(a); //Shows Error because there is no local variable a.
		// for accessing the non-static variables we should create object. without object we cannot access Non-Static Members.
		// for Local Variables no need to create Objects.

	}

}
