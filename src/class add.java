class ScannerMultiplyNumbers  ;
{
	 public static void main (String [] args)
	 {
	  Scanner consoleInput= new Scanner(System.in); 
	  System.out.println("please enter two numbers: ");
	  int num1 = consoleInput.nextInt();
	  int num2 = consoleInput.nextInt();
	  int prode = num1*num2;
	  System.out.println("product is: "+prode);

	 }
}