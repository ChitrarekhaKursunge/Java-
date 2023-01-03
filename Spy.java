import java.util.Scanner;
class Spy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();
		int sum=0;
		int mul=1;
		while(a>0)
		{
			int rem=a%10;
			sum=sum+rem;
			mul=mul*rem;
			a=a/10;
		}
			if(sum==mul)
			{
				System.out.println("is Spy number");
			}
			else
			{
				System.out.println("is not a Spy number");
			}
			
	}
}