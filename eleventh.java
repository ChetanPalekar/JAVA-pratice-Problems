import java.util.Scanner;
public class eleventh{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number :");
int a=sc.nextInt();
boolean prime=true;
int result,count=0,large=0;

for (int i=1;i<a;i++ ) {
	prime=true;
	for (int j=2;j<i ;j++ ) {
	if(i%j==0){
		prime=false;
		break;
	}
	}
	if (prime && i!=2) {
		count++;
		System.out.println(" "+i);
		large=i;
		prime=false;
		
	}
}System.out.println("Total: "+count+" Large:"+large);
	}
}