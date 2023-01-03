import java.util.Scanner;
class PerfectNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int b=1;//stating pt
		int sum=0;
		while(b<=a)
		{
			if(a%b==0)
			{
				sum=sum+b;
			}
			b++;
		}
		if(a==sum-a)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}
		
	}
}