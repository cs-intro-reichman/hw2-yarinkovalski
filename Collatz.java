// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int n = Integer.parseInt("" + args[0]);
		char variable = args[1].charAt(0);
		int finalNumber = 0;
		int counter = 1;
		int counterFinalOne=0;
		for (int i=1; i<=n; i++)
		{
			int seed = i;
			if (variable=='v')
				System.out.print(seed+" ");
			while (finalNumber != 1)
			{
				counter = counter+1;
				if (seed%2==0)
					{
						seed = seed/2;
						if (variable=='v')
							System.out.print(seed+" ");
						finalNumber = seed;
					}
				else
					{
						seed = (seed*3)+1;
						if (variable=='v')
							System.out.print(seed+" ");
						finalNumber = seed;
					}
			}
			counterFinalOne = counterFinalOne+1;
			finalNumber = 0;
			if (variable=='v')
			{
				System.out.print("("+counter+")");
				System.out.println();
			}
			counter = 1;
		}

		if (counterFinalOne==n)
		{
			System.out.println("Every one of the first "+n+" hailstone sequences reached 1.");
		}
	}
}
