import java.util.Scanner;
public class sixteen{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int k,l;
		System.out.println("Enter elements:");
		for (int i=0;i<arr.length ;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter number 1:");
		int a=sc.nextInt();
		System.out.println("Enter number 2:");
		int b=sc.nextInt();

		for (k=0;k<arr.length ;k++ ) {
			if (arr[k]==a) {
							break;
						}			
						}
		for (l=0;k<arr.length ;l++ ) {
			
				if (arr[l]==b) {
			break;
		}
	}
	k++;
	l++;
	System.out.println("Element 1 at: "+k+" Element 2 at: "+l);
	k--;
	l--;
int temp=arr[k];
	arr[k]=arr[l];
	arr[l]=temp;
	for (k=0;k<arr.length ;k++ ) {
			System.out.println("Arry now: "+arr[k]);
						}
	}

}