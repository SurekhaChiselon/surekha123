package practice1;

public class Third {
	//program to print odd numbers from 1 to the given limit
		public static void main(String[] args) {
			int l1=50;
			System.out.println("printing odd numbers between 1 and  "+ l1);
	  for (int i=1; i<=l1; i++)
			{
				if (i%2!=0)
				{
					System.out.print(i+ " ");
				}
			}
	
		}
}