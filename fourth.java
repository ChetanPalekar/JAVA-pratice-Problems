import java.util.Scanner;
public class fourth{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);

int small,large,i=2;
System.out.println("Num 1:");
int a=sc.nextInt();
small=large=a;

while(i<=10){
System.out.println("Num"+i+":");
int b=sc.nextInt();
if(b>large){
large=b;
}
if(b<small){
small=b;
}
	i++;
}
System.out.println("Small :"+small);
System.out.println("large :"+large);
}


	}