import java.util.Scanner;
public class twelth{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of prime numbers to print: ");
int a=sc.nextInt();
int count=0,sum=0;
boolean prime=true;
if(a>0){
for (int i=1;i<=100 ;i++ ) {
	prime=true;

	for (int j=2;j<i ;j++ ) {
		if (i%j==0) {
			prime=false;
			break;
		}
	}
	if (prime && i!=2 && count<a) {
		count++;
		sum=sum+i;
		System.out.println(i);
	}
}System.out.println("Count: "+count+" Sum :"+sum);
	}
}
}