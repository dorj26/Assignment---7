
public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				//for(k=i;k<=j;k++)
				System.out.print(j);
			}
			System.out.print("\n");
		}
		for(i=4;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
	
	}
