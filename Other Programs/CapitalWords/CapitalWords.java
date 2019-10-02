class CapitalWords{
	public static void main(String args[])
	{
		boolean capitalFlag = false;
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
				System.out.println(wordString[i]);
			}
			capitalFlag = false;
		}
		
	}
}