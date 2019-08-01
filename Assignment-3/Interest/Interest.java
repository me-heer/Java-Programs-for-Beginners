interface Interest{
	void interest(double principal, float rateOfInterest, int numberOfYears);
}

class SimpleInterest implements Interest{
	public void interest(double principal, float rateOfInterest, int numberOfYears)
	{
		double interest = principal * rateOfInterest * numberOfYears;
		System.out.println(interest);
	}
}

class CompoundInterest implements Interest{
	public void interest(double principal, float rateOfInterest, int numberOfYears)
	{
		rateOfInterest = rateOfInterest / 100;
		double interest = principal * Math.pow( (1f + (rateOfInterest/12f)) ,   (double)(12f * numberOfYears) ); 	
		System.out.println(interest);
	}
}

class InterestImplementation{
	public static void main(String args[]){
			System.out.println("Computing simple interest:");
			System.out.println("Principal: 5000");
			System.out.println("Rate of Interest: 5%");
			System.out.println("Number of Years: 5");
			SimpleInterest si = new SimpleInterest();
			si.interest(5000d,5f,5);

			System.out.println("Computing compound interest:");
			System.out.println("Principal: 5000");
			System.out.println("Rate of Interest: 5%");
			System.out.println("Number of Years: 10");

			CompoundInterest ci = new CompoundInterest();
			ci.interest(5000,5,10);
	}
}