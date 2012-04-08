package ro.theredpoint.projecteuler.p009;

public class Main
{
	public static void main(String[] args)
	{
		for (long i = 1; i < 1000; i++)
			for (long j = i+1; j < 1000; j++)
				for (long k = j+1; k < 1000; k++)
					if (i+j+k == 1000 && i*i+j*j==k*k) {
						System.out.print(i*j*k);
					}
					
	}

}
