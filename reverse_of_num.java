import java.util.Scanner;
public class reverse_of_num {
	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in); 
		   int n=sc.nextInt();
		   int rev_no=0;
		   while(n>0){
		    int result=n%10;
		    
		    n=n/10;
		   
		   rev_no=(rev_no*10)+result;
		}
		   System.out.println(rev_no);
}
}
