package ro.theredpoint.projecteuler.p004;

import static java.lang.Math.pow;

public class Main
{
	/**
	 * Numara cate cifre are un numar.
	 * @param n
	 * @return
	 */
	public static int digitNum(long n) {
		int digits = 0;
		long temp = n;
		
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		
		return digits;
	}
	
	/**
	 * Extrage cifra cu indicele dat din numarul dat.
	 * @param n
	 * @param index
	 * @param digitsNum
	 * @return
	 */
	public static byte extractDigit(long n, int index, int digitsNum) {
		return (byte)(n / (long)pow(10, digitsNum-index) % 10);
	}
	
	/**
	 * Verifica daca un numar este palindrom.
	 * @param n
	 * @return
	 */
	public static boolean isPalindrom(long n) {
		
		int digits = digitNum(n);
		
		for (int i = 1; i < digits / 2 + 1; i++) {
			byte b1 = extractDigit(n, i, digits);
			byte b2 = extractDigit(n, digits - i + 1, digits);
			if (b1 != b2)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		int max = 0;
		
		for (int i = 999; i >99; i--)
			for (int j = 999; j >99; j--)
				if (isPalindrom(i*j)) {
					if (i*j > max)
						max = i*j;
				}
		
		System.out.println(max);
	}
}
