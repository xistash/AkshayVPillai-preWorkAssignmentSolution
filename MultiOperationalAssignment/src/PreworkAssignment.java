import java.util.Scanner;
class PreworkAssignment {
	
	Scanner sc = new Scanner(System.in);
	
	
	
	
	
	//function to checkPalindrome 
	 public void checkPalindrome() {
		 System.out.println("Enter the number");
		 String reverse = "";
		 String num = sc.nextLine();
		 int length = num.length();
		 for(int i = length-1;i>=0;i--)
			 reverse = reverse + num.charAt(i);
		 if(num.equals(reverse))
			 System.out.println("the entered string"   +num+   "is a palindrome");
	 } 
	 
	 
		 
	 
	
	
	//function to check print pattern
	
	 public void printPattern() {
		 System.out.println("Enter the number of rows needed to print the pattern");
		 
		 int rows = sc.nextInt();
		 System.out.println("## Printing the pattern ##");
		 
		 for(int i=1;i<=rows;i++) {
			 
			 for(int k=rows;k>=i;k--) {
				 System.out.print("*");
			 }
			 for(int j=1;j<i;j++) {
				 System.out.print(" ");
			 }
			 System.out.println();
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 }
	 //function to check if number is prime number or not
	 public void checkPrimeNumber() {
		 System.out.println("enter a number to know if its a prime number or not");
		 int number = sc.nextInt();
		 if(isPrime1(number)) {
			 System.out.println(number  +  "  is a prime number");
		 } else {
			 System.out.println(number  +  "  is not a prime number");
		 }
	 }
	 static boolean isPrime1(int num) {
		return false;
	 }
	@SuppressWarnings("unused")
	private boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return false;
		
		
		
		
		
		
	}
	//function to print ]
	 public void printFibonacciSeries() {
		 @SuppressWarnings("unused")
		int n, a = 0, b = 0, c = 1;
		 System.out.println("Enter the value of n");
		 int N = sc.nextInt();
		 System.out.println("Fibonacci Series");
		 for(int i = 1;i<=N;i++) {
			 a = b;
			 b = c;
			 c = a + b;
			 System.out.println(a +" ");
			 
			 
			 
			 
			 
		 }
		 
	 }
	 public static void main(String[]args) {
		 PreworkAssignment obj = new PreworkAssignment();
		 int choice = 0;
		 Scanner sc = new Scanner(System.in);

	do {
		System.out.println("Enter your choice from below list");
		System.out.println("1. find palindroem of the number");
		System.out.println("2. print the patterns");
		System.out.println("3. check if the given number is prime number or not");
		System.out.println("4. print Fibonacci Series");
		System.out.println("0. to exit ");
		
		System.out.println();
		
		
		choice = sc.nextInt();
		switch(choice) {
		
		case 0:
		choice = 0;
		break;
		
		
		case 1:{
			obj.checkPalindrome();
		}
		break;
		
		case 2: {
			obj.printPattern();
		}
		break;
		
		case 3: {
			obj.checkPrimeNumber();
		}
		break;
		
		case 4: {
			obj.printFibonacciSeries();
		}
		break;
		
		default:
			System.out.println("Enter a valid number");
		}
		
		
	}while (choice != 0);
	

System.out.println("Exited Successfully!!!");

sc.close();
		 
		 
			 
			 
		 
	 }
			 
}
	 

