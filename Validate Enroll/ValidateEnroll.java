class ValidateEnroll
{
	static boolean validateString(String enrollString)
	{
		boolean valid = false;
		String yearString = enrollString.substring(0,2);
		String collegeString = enrollString.substring(2,5);
		String numString = enrollString.substring(5,7);
		String branchString = enrollString.substring(7,9);
		String rollString = enrollString.substring(9,12);
		int rollNumber = Integer.parseInt(rollString);
		if(yearString.equals("16") | yearString.equals("17") | yearString.equals("18") )
			if(collegeString.equals("047"))
				if(numString.equals("01") | numString.equals("31"))
					if(branchString.equals("07"))
						if(rollNumber >= 0 & rollNumber <= 70)
						{
							valid = true;
						}
		return valid;
		
	}
	
	public static void main(String args[])
	{
		//args[0] is 170470107023
		boolean valid = false;
		valid = validateString(args[0]);
		if(valid)
			System.out.println("Enrollment Number is valid.");
		else
			System.out.println("Invalid Enrollment Number.");
	}
}