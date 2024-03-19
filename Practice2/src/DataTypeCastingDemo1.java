
public class DataTypeCastingDemo1 {

	public static void main(String[] args) {
		
		int a =10;    //DataTpeCasting s not Required because we gave integer Data only;
		float f = 20;  //DataTpe Casting is Required but jvm will automatically done the type casting process
		// because For implicit Data type casting JVM will automatically done the process.
		// When L.H.S value is Higher than R.H.S we call Implicit Datatype Casting.
		//For above Value Float is decimal value and 20 is Integer and both are Corresponding values so type Casting will be done. 
//		boolean b = 10;  //Error because for boolean data type we Initialized integer value.
		// both are not correspondent values . so, Data type casting is not possible.
		
		System.out.println(a);
		System.out.println(f);
		
	}

}
