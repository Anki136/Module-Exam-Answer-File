class GrandParent
{
	public String grandFatherName;
	public String grandMotherName;
	public GrandParent(String grandFatherName,String grandMotherName)
	{
		this.grandFatherName=grandFatherName;
		this.grandMotherName=grandMotherName;
		System.out.println("Name of GrandFather :" +grandFatherName);
		System.out.println("Name of GrandMother :" +grandMotherName);
	}
}
class Parent extends GrandParent
{
	public String fatherName;
	public String motherName;
	public Parent(String fatherName,String motherName,String grandFatherName,String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
		this.fatherName=fatherName;
		this.motherName=motherName;
		
		
		System.out.println("Name of Father :" +fatherName);
		System.out.println("Name of Mother :" +motherName);
	}
	public Parent(String grandFatherName,String grandMotherName)
	{
		super(grandFatherName,grandMotherName);
	}
}
class Child extends Parent
{
	public Child(String fatherName,String motherName,String grandFatherName,String grandMotherName)
	{
		super(fatherName,motherName,grandFatherName,grandMotherName);
	}
	public static void main(String args[])
	{
		Child ch=new Child("Rohit Singh","Meera Singh","Mohit Singh","Neetu Singh");
		System.out.println(ch.fatherName+" "+ch.motherName+" "+ch.grandFatherName+" "+ch.grandMotherName);
	}
}