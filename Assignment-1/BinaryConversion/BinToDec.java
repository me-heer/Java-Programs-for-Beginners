class BinaryConversion
{
	public static void main(String args[])
	{
		int i;
		int conversionType = Integer.parseInt(args[1]);
		int value = Integer.parseInt(args[0]);
		if(conversionType == 1)
		{
			int decimalValue = Integer.parseInt(args[0]);
			int[] binaryString = new int[10];
			for(i=0;value>0;i++)
			{
				binaryString[i] = (value % 2);
				value = value/2;
			}
			i--;
			for(	;i>=0;i--)
			{
				System.out.print(binaryString[i]);	
			}
		}
		if(conversionType == 2)
		{
			int binaryValue = Integer.parseInt(args[0]);
			int decimalResult=0; i=0;
			while(binaryValue > 0)
			{
				int temp = (binaryValue % 10);
				decimalResult = decimalResult + (temp * (int)Math.pow(2,i));
				i++;
				binaryValue = binaryValue / 10;
			}
			System.out.println(decimalResult);
		}
		
	}

}