package utkarsha;
import java.util.*;
import java.util.ArrayList;

class ArrayListCollectionAssi {
	public static void main(String[] args) {
			
		ArrayList list=new ArrayList<String>(); //Creating arraylist  
			
			list.add("Green");   //Adding object in arraylist  
			list.add("Yellow");  
			list.add("Pink");  
			list.add("Red");  
			
			//Traversing list through Iterator  
			
			Iterator<String>itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}
		}

	}
