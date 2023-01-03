import java.util.Scanner;
class Neon
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();
		int sum=0;
		int square=a*a;
		while(square>0)
		{
			
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(a==sum)
		{	
			System.out.println(a + " " +"neon number");
		}
		else
		{
			System.out.println(a + " " +"not a neon number");
		}
		
	}
	
	
}