package utkarsha;
import java.util.ArrayList;
import java.util.*;

class ArrayListCollectionsAssi {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Pink");
		list.add("Red");
		list.add("Purple");
		list.add("Yellow");
		list.add("Orange");
		list.add("Green");
		//Traversing list through iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
