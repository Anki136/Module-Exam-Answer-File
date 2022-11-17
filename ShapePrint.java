class Shape
{
	void draw()
	{
		System.out.println("Draw Shape");
	}
	void erase()
	{ 
	    System.out.println("Erase shape");
	}
}
class Circle
{
	void draw()
	{
		System.out.println("Draw Circle");
	}
	void erase()
	{ 
	    System.out.println("Erase Circle");
	}
}
class Triangle
{
	void draw()
	{
		System.out.println("Draw Triangle");
	}
	void erase()
	{
		 System.out.println("Erase Triangle");
	}
}
class Square
{
	void draw()
	{
		System.out.println("Draw Square");
	}
	void erase()
	{
		 System.out.println("Erase Square");
	}
}
class ShapePrint
{
	public static void main(String args[])
	{
		Shape shape=new Shape();
		Circle c=new Circle();
		Triangle t=new Triangle();
		Square sq=new Square();
		shape.draw();
		shape.erase();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		sq.draw();
		sq.erase();
	}
}
