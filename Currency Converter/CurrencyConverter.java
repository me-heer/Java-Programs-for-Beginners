class CurrencyConverter
{
	public static void main(String args[]){
		if(args.length != 2)
		{
			System.out.println("Enter a valid number of arguments.");
			System.out.println("e.g.: java CurrencyConverter <currency> <conversionType>");	
			System.out.println("conversionType: 1 to convert USD to INR");
			System.out.println("conversionType: 2 to convert INR to USD");
			System.exit(0);
		}
		int currency = Integer.parseInt(args[0]);
		float rate = 70;
		int currencyType = Integer.parseInt(args[1]);
		if(currencyType == 1)
			System.out.println("$" + currency + " = " + (currency*rate) + "INR");
		else
			System.out.println("INR" + currency + " = " + (currency/rate) + "$");
		
	}
}
