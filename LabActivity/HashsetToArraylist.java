import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashsetToArraylist {
public static void main (String[] args) {
	HashSet <String> nameSet= new HashSet<>();
	nameSet.add("Monika");
	nameSet.add("Neha");
	nameSet.add("Nikita");
	nameSet.add("Ankita");
	nameSet.add("Monika");
	System.out.println("HashSet contains: " + nameSet);
	
	List<String>list=new ArrayList <>(nameSet);
	System.out.println("ArrayList contains: "+ nameSet);
}
}
