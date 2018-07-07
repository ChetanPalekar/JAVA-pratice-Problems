import java.util.Scanner;
public class ningth{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number :");
int d=sc.nextInt();
int resul=1;
int res=d/10;
do{
	res=res/10;
	resul++;
}
while(res!=0);
System.out.println(resul);
	}
}