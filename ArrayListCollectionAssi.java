//WAP to create a new array list,add some colors (String) and print out the collection

package utkarsha;

import java.util.*;

public class ArrayListCollectionAssi {


	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //Creating arraylist  
		
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
