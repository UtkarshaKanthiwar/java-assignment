package utkarsha;
import java.util.*;
import java.util.ArrayList;

public class ArrayListUpdatesAssi {
public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("Green");
	list.add("Red");
	list.add("Yellow");
	list.add("Orange");
	list.add("Blue");
	System.out.println(list);
	
	list.set(2, "Pink");
	list.set(4, "Black");
	System.out.println(list);
	}

}
