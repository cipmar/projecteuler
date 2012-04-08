package ro.theredpoint.projecteuler.p010;

import java.util.Iterator;
import java.util.List;

import ro.theredpoint.projecteuler.prime.PrimeGenerator;

public class Main
{

	public static void main(String[] args)
	{
		List<Long> list = PrimeGenerator.generatePrimes(100000);
		
		for (Iterator<Long> iterator = list.iterator(); iterator.hasNext();)
		{
			Long long1 = iterator.next();
			System.out.println(long1);
		}
	}

}
