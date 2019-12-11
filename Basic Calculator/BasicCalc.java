public class BasicCalc
{
	/**
	*	"Number of arguments: 3" 
	*	"java BasicCalc number operationType number" 
	*	"e.g.: java BasicCalc 4 + 5" 	
	**/

	public static void main(String args[])
	{
		if(args.length != 3)
		{
			System.out.println("Invalid number of arguments.");
			System.out.println("java BasicCalc <number> <operationType> <number>");
			System.out.println("e.g.: java BasicCalc 4 + 5");
		}
		int num1 = Integer.parseInt(args[0]);
		char operationType = args[1].charAt(0);
		int num2 = Integer.parseInt(args[2]);

		switch(operationType)
		{
			case '+':
				System.out.print(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case '-':
				System.out.print(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case '*':
				System.out.print(num1 + "*" + num2 + "=" + (num1*num2));
				break;
			case '/':
				System.out.print(num1 + "/" + num2 + "=" + ((float)num1/num2));
				break;
			
		}
	}
}