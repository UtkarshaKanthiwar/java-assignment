public class StringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="i love java";
int count=0;
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)!=' ')
	count++;
}
System.out.println("Total no of character "+count);
	}

}
