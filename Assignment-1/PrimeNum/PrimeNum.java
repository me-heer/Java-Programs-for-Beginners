class PrimeNum
{
	static boolean checkPrime(int number)
	{
		boolean prime = false;
		int temp = 2;
		while(temp <= (number/2) )
		{
			if( (number % temp) == 0)
			{
				return false;
			}
			temp++;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		int count = Integer.parseInt(args[0]);
		int i=2;
		while(count > 0)
		{
			boolean prime = false;
			prime = checkPrime(i);
			if(prime)
			{
				System.out.print(i + "\n");
				count--;
			}
			i++;
		}
		
	}
}