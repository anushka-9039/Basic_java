import java.util.*;
public class print_n_to_1 {
	 public static void main(String[]args) {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int i=sc.nextInt();
	    	 print(n,i);
}
	 public static void print(int n,int i) {
		 if(n<i) {
			 return;
		 }
		 System.out.println(n);
		 print(n-1,i);
	 }
}