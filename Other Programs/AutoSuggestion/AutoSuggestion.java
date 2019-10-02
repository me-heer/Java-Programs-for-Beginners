
class AutoSuggestion {

	static boolean checkAnagram(String testString, String testString2)
	{
		boolean notAnagram = false;
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
		return !notAnagram;
	}
	public static void main(String args[])
	{
		String[] defaultWords = { "mihir", "manan", "malay", "mike", "michael", "mason", "mint", "mango"};
		for(int i =0; i<defaultWords.length ; i++)
		{
			boolean flag = checkAnagram (args[0],defaultWords[i]);
			if(flag)
				System.out.println(defaultWords[i]);
		}
	}
}
