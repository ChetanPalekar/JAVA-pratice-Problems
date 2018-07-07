public class seventh{
	public static void main(String arg[]){

		for (int i=1;i<=7 ;i++ ) {
			for (int j=6;j>=i ;j-- ) {
				System.out.print(" ");
			}
			for (int j=1;j<=i ;j++ ) {
				System.out.print("%");
			}
			for (int j=1;j<=i ;j++ ) {
				System.out.print("%");
			}
			for (int j=6;j>=i ;j-- ) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		System.out.println();
		System.out.print("        #");
		System.out.println();

		for (int i=1;i<=7;i++) {
			for (int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("#");
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}

			System.out.print("#");
			System.out.println();
		}
		System.out.print("################");
System.out.println();
System.out.print("        @");
System.out.println();

for (int i=1;i<=7;i++ ) {
	for (int j=6;j>=i;j--) {
System.out.print(" ");		
	}
	System.out.print("@");
	for (int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	for (int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	System.out.print("@");

	// for (int j=1;j<=i;j++) {
	// 	System.out.print("#");
	// }
	System.out.println();
	
}
for (int i=1;i<=7;i++ ) {
	for (int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	System.out.print("@");
	for (int j=6;j>=i;j--) {
System.out.print(" ");		
	}
	for (int j=6;j>=i;j--) {
System.out.print(" ");		
	}
	System.out.print("@");
	System.out.println();
	
}

	}
}

