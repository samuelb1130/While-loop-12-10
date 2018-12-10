import  java.util.Scanner;

 class loop_HW {

	public static void main(String[] args) {
	
		Scanner bread = new Scanner (System.in);
		
	System.out.print("Please enter an int greater than 1");
	int number = bread.nextInt();
	
	int  mult = 0;
	
		
		//USE WHILE LOOP
	
	while (number <= 1)
	{
		System.out.print("Please enter an int greater than 1");
		number = bread.nextInt();
	}
		
		//MULTIPLYER
	
	while (number < 100 )
	{
		number*= 2;
		++mult;
	}
		
		System.out.println("\nYour number was multiplyed " + mult + " time before it reahed 100");
		
		System.out.println("\n\nEnd");
		
	}
		

	

}
