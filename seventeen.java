import java.util.Scanner;
public class seventeen{
	public static void main(String args[]){
int arr1[]=new int[10];
int arr2[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements of arry 1:");
for(int i=0;i<arr1.length;i++){
	arr1[i]=sc.nextInt();
	
}
System.out.println("Enter elements of arry 2:");
for(int i=0;i<arr2.length;i++){
 arr2[i]=sc.nextInt();
}
for (int i=0;i<arr1.length ;i++ ) {
	for (int j=0;j<arr2.length ;j++ ) {
		if(arr1[i]==arr2[j]){
			System.out.println("Common element:"+arr1[i]);
		}
	}
}


	}

}