
public class Calculator {
   private int a;
   private int b;
   private int c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator= new Calculator(10,20);
		System.out.println("This project is to demo the GIT functionality");
	    calculator.add();
	    System.out.println("C is:"+calculator.c);
	}

	public Calculator(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		c=a+b;
	}
}
