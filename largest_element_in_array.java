
public class largest_element_in_array {
   public static void main(String[]args) {
	   int arr[]= {1,4,6,8,9,3};
	   int largest=arr[0];
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]>largest) {
			   largest=arr[i];
		   }
	   }
	   System.out.println(largest);
   }
}
