
class Q11
{
	public static void main(String args[])
	{
		int p=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=p;k++)
			{
				System.out.print(" *");
			}
			
			p+=2;
			
			System.out.println();
		}
	}
}