public class first{
	public static void main(String arg[]){
		for(int i=1;i<=6;i++){
			for (int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for (int j=5;j>=i;j--) {
				System.out.print("*");	
			}
			System.out.println();
		
		}
System.out.println();

		for (int i=6;i>=1;i--) {
			for (int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for (int j=5;j>=i;j--) {
				System.out.print("*");
			}
		System.out.println();	
		}
System.out.println();
System.out.println("@");
		for(int i=0;i<=5;i++){
			System.out.print("@");
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
System.out.println("@");
	}
	System.out.println("@@@@@@@@");
		}
}