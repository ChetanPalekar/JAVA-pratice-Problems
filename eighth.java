import java.util.Scanner;
public class eighth{
	public static void main(String srgs[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number :");
int p=sc.nextInt();
boolean prime=true;
for (int i=2;i<p/2;i++){
	if(p%i==0){
prime=false;
	}
	}
if (prime) {
	System.out.println("Yes");
}
else{
	System.out.println("NO");
}
}
}
