import java.util.Scanner;
public class amstrong_number {
	public static void main(String[]args) {
	   Scanner sc= new Scanner(System.in); 
	   int n=sc.nextInt();
	   int c=n;
	   int sum=0;
	while(n>0) {
		int result=n%10;
		int an= result*result*result;
		n=n/10;
		sum=sum+an;
	}
	if(c==sum) {
		System.out.println("amstrong");
	}
	else {
		System.out.println("not amstrong");
	}
}

}