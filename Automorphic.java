import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int m=sc.nextInt();
		int sq=m*m;//square
		int temp=m;
		int s=1;//starting point
		while(temp>0)
		{
			temp=temp/10;
			s=s*10;
			
		}
		sq=sq%s;
		if(m==sq)
		{
			System.out.println(m +" "+"is automorphic no");
		}
		else
		{
			System.out.println(m +" " +"is not a automorphic no");
		}
		
	}
}