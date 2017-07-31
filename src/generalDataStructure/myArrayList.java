package generalDataStructure;

public class myArrayList<T> {

	private T[] myArray	=	(T[]) new Object[1];
	
	private int currentIndex=0;
	
	public myArrayList add(T input){
	
		if(currentIndex == myArray.length){
			extendArray();
		}
		
		myArray[currentIndex]	=	input;
		currentIndex++;
		
		return this;
	}
	
	public T get(int index) throws IndexOutOfBoundariesException{
		
		rangeCheck(index);
		
		return myArray[index];
	}
	
	public void rangeCheck(int index) throws IndexOutOfBoundariesException{

		if(currentIndex > myArray.length || index > currentIndex){
			throw new IndexOutOfBoundariesException("index out of bounderies");
		}
	}
	
	public int size(){
		return myArray.length;
	}
	
	private void extendArray(){
		
		 T[] temp	=	(T[]) new Object[myArray.length*2];
		 
		 for(int i=0; i< myArray.length; i++){
			 temp[i]	=	myArray[i];
		 }
		 
		 myArray	=	temp;
	}
}
