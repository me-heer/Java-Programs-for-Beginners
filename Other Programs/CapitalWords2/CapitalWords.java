class CapitalWords{
	public static void main(String args[])
	{
		boolean capitalFlag = false;
		int capitalCounter = 0;
		String[] wordString = args[0].split(" ");
		int[] capitalIndex = new int[wordString.length];
		for(int i=0; i < wordString.length; i++)
		{
			char[] tempCharArray = wordString[i].toCharArray();
			for(int j = 0; j < wordString[i].length(); j++)
			{
				if((tempCharArray[j] >= 'A' & tempCharArray[j] <= 'Z') | (tempCharArray[j] == '.' | tempCharArray[j] == ',' ) )
				{
					capitalFlag = true;
					continue;
				}
				else
				{
					capitalFlag = false;
					break;	
				}	
			}
			if(capitalFlag)
			{
				capitalIndex[i] = 1;
			}
			capitalFlag = false;
		}
		for(int i = (capitalIndex.length - 1); i >= 0 ; i--)
		{
			if(capitalIndex[i] == 1)
				capitalCounter++;
			if(capitalIndex[i] == 1 & capitalCounter > 1)
			{
				System.out.println(wordString[i]);
				break;
			}	
		}
		
	}
}