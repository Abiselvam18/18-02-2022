package array;

public class Example2 {

	public static void main(String[] args) {
	
		int[] sum_of_values= {2,4,6,8,10,12,14,16,18,20};
		
		System.out.println("Sum of values:"+getsum(sum_of_values));
		
	}
	
	public static int getsum(int[]sum_of_values)
	
	{
		int sum=0;
		for(int a:sum_of_values)
			sum+=a;
		
		return sum;
	}	

}
