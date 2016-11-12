class SwapTest {
	public static void main (String[] args)
	{
		int a = 10;
		int b = 20;
		System.out.println("Initial value of a is " + a);
		System.out.println("Initial value of b is " + b);
//
		a = a + b; // here total sum stored in 'a' i.e. 30 now.
		b = a - b; // here b will 10 as a is 30 and b originally as 20.
		a = a - b; // here a will be 20 after 30 minus 10. 
//
		System.out.println();
		System.out.println("Swapped value of a with b is " + a);
		System.out.println("Swapped value of b with a is " + b);				
	}
}