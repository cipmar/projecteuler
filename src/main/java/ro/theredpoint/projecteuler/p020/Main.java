package ro.theredpoint.projecteuler.p020;

import java.math.BigDecimal;

public class Main
{
	public static void main(String[] args)
	{
		BigDecimal s = new BigDecimal(1);

		for (int i = 1; i <= 100; i++)
		{
			s = s.multiply(new BigDecimal(i));
			System.out.println(s);
		}

		System.out.println(s);
		String str = s.toString();
		long sum = 0;

		for (int i = 0; i < str.length(); i++)
		{
			int c = Integer.parseInt(str.substring(i, i+1));
			sum += c;
		}
		
		System.out.println(sum);
	}

}
