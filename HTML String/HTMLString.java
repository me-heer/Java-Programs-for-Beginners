class HTMLString{
	public static void main(String args[])
	{
		//args[0] = <a href = # > click <span> Here </span> <a/>
		//the answer should be "click Here"
		boolean lessFlag = false, greatFlag = false;
		String answerString = args[0];
		String answer = new String("");
		char[] tempString = answerString.toCharArray();
		for(int i=0; i < answerString.length(); i++)
		{
			if(tempString[i] == '<')
			{
				lessFlag = true;
				continue;
			}		
			if(tempString[i] == '>')
			{
				lessFlag = false;
				greatFlag = true;
				continue;
			}
			if( !lessFlag & greatFlag)
			{
				System.out.print(tempString[i]);		
			}
		}
		
	}
}