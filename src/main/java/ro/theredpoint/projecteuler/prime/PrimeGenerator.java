package ro.theredpoint.projecteuler.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator
{
	public static List<Long> generatePrimes(int max) {
		
		List<Long> list = new ArrayList<Long>(max);
		List<Long> primes = new ArrayList<Long>();
		
		for (long i = 2; i < max; i++) {
			list.add(i);
		}
		
		while (list.size() > 0) {
			Long l = list.remove(0);
			
			primes.add(l);
			
			int i = 0;
			
			while (i < list.size()) {
				if (list.get(i) % l == 0)
					list.remove(i);
				i++;
			}
			
		}
		
		return primes;
	}
}
