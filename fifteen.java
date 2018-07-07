import java.util.Scanner;
public class fifteen{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
int i;
System.out.println("Enter array elements:");
for (int j=0;j<arr.length;j++ ) {
	arr[j]=sc.nextInt();
}
System.out.println("Enter the elemnet to search:");
int a=sc.nextInt();
for (i=0;i<arr.length;i++ ) {
	if (a==arr[i]) {
		i++;
System.out.println("FOUND at: "+i);
i--;
	}
}

	}
}