import java.util.Scanner;
class HarshadNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		if(temp%sum==0)
		{
			System.out.println("harshad no");
		}
		else
		{
			System.out.println("not a harshad no");
		}
		
	}
}