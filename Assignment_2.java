import java.util.*;
public class innings_statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[30];
		int a=0,b=0,c=0,d=0,e=0,f=0;
		double total=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			total=arr[i]+total;
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]==0) {
				a++;
			}
			else if(arr[j]==1) {
				b++;
			}
			else if(arr[j]==2) {
				c++;
			}
			else if(arr[j]==3) {
				d++;
			}
			else if(arr[j]==4) {
				e++;
			}
			else {
				f++;
			}
		}
		double sr = (total/n)*100;
		System.out.println("Total runs scored:" +total);
		System.out.println("0's:" +a);
		System.out.println("1's:" +b);
		System.out.println("2's:" +c);
		System.out.println("3's:" +d);
		System.out.println("4's:" +e);
		System.out.println("6's:" +f);
		System.out.println("Strike Rate: " +sr);
		sc.close();
		
		

	}

}