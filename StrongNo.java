import java.util.Scanner;
class StrongNo
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
			sum=sum+m1(a%10);
			a=a/10;
		}
		if(temp==sum)
		System.out.println("strong no");
		else
		System.out.println("not a strong no");
	}
	public static int m1(int a)
	{
		int fact=1;
		for(int i=1; i<=a; i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
}