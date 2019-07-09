
class ReverseWords {
	public static void main(String args[])
	{
		String cName = args[0];
		String[] cSplit = cName.split(" ");
		StringBuffer[] finalStr = new StringBuffer[cSplit.length];
		
		for(int i = 0; i < cSplit.length ; i++)
			finalStr[i] = new StringBuffer(cSplit[i]);
		
		for(int i = 0; i < finalStr.length; i++)
			finalStr[i].reverse();
		StringBuffer answer = new StringBuffer("");
		for(int i = 0; i <finalStr.length; i++)
		{
			answer.append(finalStr[i]);
			answer.append(" ");
		}
		System.out.println(answer);
	}

}
