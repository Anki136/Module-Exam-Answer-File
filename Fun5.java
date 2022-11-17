import java.util.ArrayList;
class Fun5
{
	public static void main(String args[])
	{
	ArrayList<String>ele=new ArrayList<String>();
	ele.add("Ankita");
	ele.add("Anjana");
	ele.add("Apurva");
	ele.add("Anushka");
	ele.add("Arti");
	System.out.println("ArrayList is :" + ele);
	System.out.println("Printing the collection :");
	for(String elements : ele)
	{
		System.out.println(elements);
	}
	}
}