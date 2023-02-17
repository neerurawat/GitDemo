class Parent
{
int a=50;
void display()
{
System.out.println(" Parent class");
}

}

class Child extends Parent
{
int a=40;

void dis()
{
System.out.println(" Child class");
System.out.println(a);
System.out.println(super.a);
display();
}
}
class ParentChild
{
	public static void main(String arg[])
	{
		int c=10;
		
		Child obj=new Child();
		c=c+obj.a;
		System.out.println(c);
		
		obj.dis();
		
		
	}
	
	
}

