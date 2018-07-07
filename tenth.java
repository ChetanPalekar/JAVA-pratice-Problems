import java.util.Scanner;
public class tenth{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number 1:");
int a=sc.nextInt();
System.out.println("Enter the number 2:");
int b=sc.nextInt();
int sum=0,mul=1;
if(a<b){
	for (int i=a+1;i<b;i++) {
		sum=sum+i;
		mul=mul*i;
	}
	System.out.println("SUM :"+sum+" Mul :"+mul);
	}
	else{
		System.out.println("Please enter 1st number less then 2nd number");
	}
	
}
}