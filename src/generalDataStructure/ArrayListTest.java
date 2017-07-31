package generalDataStructure;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) throws IndexOutOfBoundariesException  {
	
		myArrayList<String> a	=	new myArrayList<String>();
		a.add("belal")
		.add("mostafa");
		
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
			
		}
		
		a.add("belal")
		.add("mostafa")
		.add("mostafa")
		.add("mostafa")
		.add("mostafa")
		.add("mostafa")
		.add("mostafa");
		
		System.out.println("second round");
		
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
	}

}
