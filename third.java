import java.util.Scanner;
public class third{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter rows:");
int row=sc.nextInt();

System.out.println("Enter col:");
int col=sc.nextInt();

if(row<=0 || col<=00){
	System.out.println("Invalid");
	}
	else{
		for (int i=0;i<row ;i++ ) {
			for (int j=0;j<col;j++ ) {
				System.out.print("B");
				
			}
			System.out.println();
			
		}
	}
}
}