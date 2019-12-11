class DivisibleNumbers
{
	public static void main(String args[])
	{
		//args[0] is n
		//args[1] is n1
		//args[2] is n2
		int n = Integer.parseInt(args[0]);
		int n1 = Integer.parseInt(args[1]);
		int n2 = Integer.parseInt(args[2]);
		while(n1<=n2)
		{
			if((n1 % n) == 0 & n1 != 0)
				System.out.println(n1);
			n1++;
		}
	}
}