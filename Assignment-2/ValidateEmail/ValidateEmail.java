
public class ValidateEmail {

	static boolean checkFirstCharacter(String emailAddress)
	{
		String firstChar = emailAddress.substring(0,1);
		char[] firstCharacter = firstChar.toCharArray();
		if(	(firstCharacter[0] >= 'a' & firstCharacter[0] <= 'z') |
				(firstCharacter[0] >= '0' & firstCharacter[0] <= '9'))
			return true;
		else
		{
			System.out.println("Enter a valid first character.");
			if(firstCharacter[0] >= 'A' & firstCharacter[0] <= 'Z')
				System.out.println("The first character can't be in Uppercase.");
			else
				System.out.println("The first character can't be a special symbol.");
			return false;
		}			
	}
	
	static boolean notAtSymbol(String emailAddress)
	{
		boolean containsIndex = emailAddress.contains("@");
		if(!containsIndex)
		{
			System.out.println("Enter an e-mail with @");
			return true;
		}
		else 
			return false;
	}
	
	static boolean notDotSymbol(String emailAddress)
	{
		int atIndex = emailAddress.indexOf("@");
		String dotSubstring = emailAddress.substring(atIndex);
		boolean containsDot = dotSubstring.contains(".");
		if(!containsDot)
		{
			System.out.println("Enter an e-mail with . after @");
			return true;
		}
		else 
			return false;
	}
	
	static boolean checkUsernameLength(String testEmail)
	{
		String[] atSplit = testEmail.split("@");
		//atSplit[0] should be username: mihir67mj
		int usernameLength = atSplit[0].length();
		if(usernameLength >= 8 & usernameLength <= 20)
			return true;
		else 
		{
			System.out.println("Enter a valid username.");
			System.out.println("Username length must be between 8-20.");
			System.exit(0);
			return false;
		}
	}
	
	static boolean mailServiceLength(String testEmail)
	{
		int atIndex = testEmail.indexOf("@");
		int dotIndex = testEmail.indexOf(".", atIndex);
		String domainName = testEmail.substring(atIndex + 1,dotIndex);
		int domainLength = domainName.length();
		if(domainLength >= 2)
			return true;
		else
		{
			System.out.println("MailServiceName must be at least 2 characters long.");
			System.exit(0);
			return false;
		}
	}
	
	static boolean invalidSpecialChar(String testEmail)
	{
		String[] atSplit = testEmail.split("@");
		boolean invalid = false;
		//at this point we only need to check if username contains _ or .
		//as the only available special characters
		//atSplit[0] = "mihir67mj"
		char[] username = atSplit[0].toCharArray();
		for(int i=0; i<atSplit[0].length(); i++)
		{
			if( !((username[i] >= 'a' & username[i] <= 'z') |
					(username[i] == '_' | username[i] == '.') |
					(username[i] >= '0' & username[i] <= '9')) )
			{
				System.out.println(username[i]);
				invalid = true;
				break;
			}
		}
		return invalid;
	}
	
	static boolean validDomain(String testEmail)
	{
		int dotIndex = testEmail.indexOf(".");
		String domainName = testEmail.substring(dotIndex);
		int domainLength = domainName.length();
		if(domainLength >= 3)
			return true;
		else 
			return false;
	}
	
	public static void main(String args[])
	{
		//args[0] contains an e-mail address
		//mihir67mj@gmail.com
		if(args.length != 1)
		{
			System.out.println("Enter valid number of arguments.");
			System.out.println("java ValidateEmail <emailAddress>");
			System.exit(0);
		}
		String emailAddress = args[0];
		if(checkFirstCharacter(emailAddress))
			if(notAtSymbol(emailAddress)) System.exit(0);
			else
				if(notDotSymbol(emailAddress)) System.exit(0);
				else
					if(checkUsernameLength(emailAddress))
						if(mailServiceLength(emailAddress))
							if(invalidSpecialChar(emailAddress))
								System.out.println("Enter a valid username: only a-z, underscore and dot are allowed.");
							else
								if(validDomain(emailAddress)) 
									System.out.println("Congratulations. Your E-mail is valid.");
								else
								{
									System.out.println("Enter a valid domain.");
									System.out.println("e.g.: .com or .org");
								}
		
	}

}
