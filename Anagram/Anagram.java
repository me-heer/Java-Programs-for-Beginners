
class Anagram {
	public static void main(String args[])
	{
		boolean notAnagram = false;
		String testString = args[0];
		String testString2 = args[1];
		int[] arrA = new int[26];
		int[] arrB = new int[26];
		for(int i = 0; i < testString.length(); i++)
		{
			char c = testString.charAt(i);
			arrA[c - 96]++;
		}
		for(int i = 0; i < testString2.length(); i++)
		{
			char c = testString2.charAt(i);
			arrB[c - 96]++;
		}
		for(int i = 0;i<26;i++)
		{
			if(arrA[i] != arrB[i])
			{
				notAnagram = true;
				break;
			}
		}
		if(notAnagram)
			System.out.println("Not Anagram.");
		else
			System.out.println("Anagram.");
	}

}
