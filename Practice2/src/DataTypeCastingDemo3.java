
public class DataTypeCastingDemo3 {

	public static void main(String[] args) {
		
		double d = 10.1234567890;
		System.out.println(d);
		
	//	int a = d; //Error Because Double Is higher than Integer.
		//So we need to type Caste Explicitly.(Explicit Type Casting).
		
		//Explicit Type Casting Means When R.H.S value is higher than L.H.S value.
		// For Explicit Type Casting We us Round_brackets().
		//That means we are asking JVM to Type Caste forcefully into another Data type.
		
		int a = (int)d; //Explicit Data Type Casting.
		System.out.println(a);
		
		float f =(float)d;
		System.out.println(f);
		
		float f1 = 10.23f; //If we don't give f for float values by default it considered as double data type.
		//If we Give f for float value. By Default JVM will type casting the Data.
		
		//Above 22nd line is like this - float f1 = 10.23f ----> (float)10.23; 
		
		System.out.println(f1);
		

	}

}
