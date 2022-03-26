package array;

public class Example1 {

	public static void main(String[] args) {
		
		// create an array
		   int[] age = {2, 8, 14};

		   // access each array elements
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + age[0]);
		   System.out.println("Second Element: " + age[1]);
		   System.out.println("Third Element: " + age[2]);
		   
		   System.out.println("*****");
		
		   // loop through the array
		   // using for loop
		   System.out.println("Using for Loop:");
		   for(int i=0; i<age.length; i++) {
		     System.out.println(age[i]);
		   }
		
	}

}
