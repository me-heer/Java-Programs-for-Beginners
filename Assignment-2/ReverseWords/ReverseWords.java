
class ReverseWords {
	public static void main(String args[])
	{
		String cName = args[0];
		String[] cSplit = cName.split(" ");
		StringBuffer[] finalStr = new StringBuffer[cSplit.length];
		StringBuffer answer = new StringBuffer();
		for(int i = 0; i < cSplit.length ; i++)
		{
			finalStr[i] = new StringBuffer(cSplit[i]);
			finalStr[i].reverse();
			answer.append(finalStr[i]);
			answer.append(" ");
		}
		System.out.println(answer);
	}

}
