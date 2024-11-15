// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{ 
		int numTerms = Integer.parseInt("" + args[0]);
		double dividor = 3;
		double sum = 0;
		boolean flag = false;
        for (int i = 0; i < numTerms; i++) 
		{
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sum = sum + term; 
            } else {
                sum = sum - term; 
            }
        }
		
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:	 " +(4 * sum));
	}
}
