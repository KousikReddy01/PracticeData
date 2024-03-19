
public class ObjectDemo2 {
	
	int a = 10;
	boolean b = true;
	static int c = 30;

	public static void main(String[] args) {
		
//		ObjectDemo2 a = 10;
//		ObjectDemo2 b = true;
		
		//Above both lines are Error Because ObjectDemo2 is a Non-Primitive Data Type.
		//For Non -primitive Data Type we Cannot assign Primitive data type values.
		//For Non-Primitive Data Type we Can Assign Object Address or Null value.
		//By Default Non-Primitive Data type value Considered as Null.
		
		
//		int a = new ObjectDemo2();
//		boolean b = new ObjectDemo2();
		
		//As well as For above both lines we cannot assign Object for Primitive Data types.

			ObjectDemo2 od = new ObjectDemo2();
			System.out.println(od); //It will print ObjectDemo2 Object Address.
			//Because od has object address.
			
			//In above 22nd line is 
			//ObjectDemo2 is a Non-Primitive Data type.
			//od is a Object Reference Variable.
			//new ObjectDemo2(); is Reserved area for Non-static Members.
			
			System.out.println(od.a);  //Through Object Reference Variable we are accessing the Non-static variables.
			System.out.println(od.b);
	}

}
