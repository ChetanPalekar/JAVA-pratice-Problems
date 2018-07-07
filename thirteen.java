import java.util.Scanner;
public class thirteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr1[]=new int[10];
		int arr2[]=new int[10];
		int arr3[]=new int[20];
		int index=0;
		System.out.println("Enter elements of arry 1 :");
		for (int i=0;i<=9 ;i++ ) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of arry 2 :");
		for (int i=0;i<=9 ;i++ ) {
			arr2[i]=sc.nextInt();
		}


		for (int i=0;i<arr1.length ;i++ ) {
			arr3[index++]=arr1[i];
			arr3[index++]=arr2[i];
		}
		for (int i=0;i<arr3.length ;i++ ) {
			System.out.println(arr3[i]);
			
		}
		



}	
	
}