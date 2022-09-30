package own_creation;
import java.util.Scanner;

public class EB_calculator {
   Scanner sc=new Scanner(System.in);
		   
   public static void main(String[] args) {
		EB_calculator pride = new EB_calculator();
		     pride.calci();

	}
	public void calci()

	{
		System.out.println("Enter the Number of Units used:");
		 double rupee=0;
		double unit = sc.nextInt();
		if(unit<100)
		{
			System.out.println("No money for first 100 units");
		}
		else if(unit<300)
		{
			rupee = 100*1.20+(unit-100)*2;
			
		}
		else if(unit>=300)
		{
			rupee=100*1.20+200*2+(unit-300)*3;
		}
		System.out.println("Bill pay is :"+rupee);
	}

}
