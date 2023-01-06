import java.util.Scanner;
class ArmStrong 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
		int a = sc.nextInt();
		int temp = a;
		int count = 0;
		int sum = 0;				

		while(a > 0)	
		{
			a=a/10;
			count++;
		} 							
		a = temp;
		while(a > 0)
	 	{
	 		int rem =a%10;
			int k=1;
			for(int i=1; i<=count; i++)
			{	
				k=k*rem;
			}
			a=a/10;
			sum=sum + k;
		}	
        if(sum == temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }    
    }
}