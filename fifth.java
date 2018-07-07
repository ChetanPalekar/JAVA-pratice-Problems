import java.util.Scanner;
public class fifth{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int base,exp,result=1,i=1;
System.out.println("Base :");
base=sc.nextInt();
System.out.println("Exp :");
exp=sc.nextInt();

do{
	result=result*base;
i++;
	}while(i<=exp);
	System.out.println("result :"+result);
}
}