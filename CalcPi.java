// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int n = Integer.parseInt("" + args[0]);
		double dividor = 3;
		double sum = 1;
		boolean flag = false;
		for (int i=0; i<=n; i++)
		{
			if (flag == false)
				{
					sum = sum - (1.0/dividor);
					flag = true;
				}

			else
				{
					sum = sum + (1.0/dividor);
					flag = false;
				}
			System.out.println(sum);
			dividor = dividor +2;

		}
		
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated: " + (sum)*4.0);
	}
}
