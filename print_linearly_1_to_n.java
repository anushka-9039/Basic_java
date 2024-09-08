import java.util.*;
public class print_linearly_1_to_n {
	 public static void main(String[]args) {
	    	Scanner sc=new Scanner(System.in);
	    	int i=sc.nextInt();
	    	int n=sc.nextInt();
	    	 print(i,n);
}
	 
	 public static void print(int i,int n) {
		 if(i>n) {
			 return;
		 }
		 System.out.println(i);
		 print(i+1,n);
	 }
}