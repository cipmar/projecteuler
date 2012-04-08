package ro.theredpoint.projecteuler.p005;

public class Main
{

	public static boolean isDivide(int n, int k) {
		for (int i = 1; i <=k; i++)
			if (n % i != 0)
				return false;
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int n = 20;
		
		while (!isDivide(n, 20))
			n+=20;
		
		System.out.println(n);
	}

}
