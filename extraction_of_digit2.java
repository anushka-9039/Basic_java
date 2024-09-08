import java.util.Scanner;
public class extraction_of_digit2{
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in); 
   int n=sc.nextInt();
   while(n>0){
    int result=n%10;
    System.out.println(result);
    n=n/10;
   }
}
}
