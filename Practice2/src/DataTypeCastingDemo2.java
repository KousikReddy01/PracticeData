
public class DataTypeCastingDemo2 {

	public static void main(String[] args) {
		
		int a =10;
		System.out.println(a);
		
		float f = a;      //Implicit DataTypeCasting. Float Data type is higher than Integer.
		// When L.H.S value is Higher than R.H.S we call Implicit Data type Casting.
		System.out.println(f);
		
		long l = a;   //Implicit DataTypeCasting
		System.out.println(l); //Long Data type is higher than Integer.
		
		double d = f; //Implicit DataTypeCasting. double Data type is higher than float.
		System.out.println(d);
		
		long c = 2000; 
		float f2 = c;  //Implicit DataTypeCasting. Float Data type is higher than Long.
		System.out.println(f2);
		
		
		//By Default all Numerical Values are considered as Integer Data type.
		//By Default all Decimal Values are Considered as Double Data Type.
		// Implicit Data Type Casting is Default.
		
	}

}
