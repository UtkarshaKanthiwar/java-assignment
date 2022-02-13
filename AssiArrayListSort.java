package utkarsha;
import java.util.ArrayList;
import java.util.*;

class AssiArrayListSort {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();//Creating arraylist
		list.add("Riya"); //adding object in arraylist
		list.add("Chiya");
		list.add("Piya");
		list.add("Diya");
		list.add("Riya");// can be used for storing duplicate data
		Collections.sort(list);
		
		//Traveling list through iterator
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
