class CurrencyConverter
{
	public static void main(String args[]){
		int currency = Integer.parseInt(args[0]);
		float rate = 70;
		int currencyType = Integer.parseInt(args[1]);
		if(currencyType == 1)
			System.out.println("$" + currency + " = " + (currency*rate) + "INR");
		else
			System.out.println("INR" + currency + " = " + (currency/rate) + "$");
		
	}
}
