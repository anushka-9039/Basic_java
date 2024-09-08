
public class factorial_of_n_numbers {
	public static void main(String[]args) {
  fact(0);
}
	public static void fact(int n) {
		int fact=1;
	
		if(n==0) {
			System.out.println("0");
			return;
		}
	    fact=n*(n-1)*(n-2);
	    System.out.println(fact);
	}
}