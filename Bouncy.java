import java.util.Scanner;
class Bouncy
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();
		boolean inc= false;
		boolean dec= false;
		while(a>9)
		{
			int rem1=a%10;
			a=a/10;
			int rem2=a%10;
			if(rem1<rem2)
			{
				dec=true;
			}
			if(rem1>rem2)
			{
				inc=true;
			}
			if(inc==true && dec==true)
			{
				System.out.println("Bouncy Number");
				System.exit(1);
			}
		}
		System.out.println("Not a Bouncy number");
		
	}
}