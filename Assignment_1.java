import java.util.*;
public class Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		double price;
		if(n<=100)
		{
			price =n*1.2;
			System.out.println("The amount to be paid is: Rs."+price);
		}
		else if(n>100 && n<=300)
		{
			price = (100*1.2)+(n-100)*2;
			System.out.println("The amount to be paid is: Rs."+price);
		}
		else 
		{
			price=(100*1.2)+(200*2)+(n-300)*3;
			System.out.println("The amount to be paid is: Rs."+price);
		}
		sc.close();
	}

}
