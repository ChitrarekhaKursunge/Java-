import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();
		int rev=0;//reverse
		int temp=a;
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if(temp==rev)
		{
			System.out.println(temp +" "+"is palindrome no");
		}
		else
		{
			System.out.println(temp +" " +"is not a palindrome no");
		}
	}
}