package ro.theredpoint.projecteuler.p028;

public class Main
{
	public static void main(String[] args)
	{
		int s = 1;
		int crt = 1;
		
		for (int i = 2; i<1001; i=i+2) {
			crt+=i; s+=crt;
			crt+=i; s+=crt;
			crt+=i; s+=crt;
			crt+=i; s+=crt;
		}
		
		System.out.println(s);
			
	}

}
