import java.util.Scanner;
public class eighteen{
	public static void main(String args[]){
		System.out.println("Enter Chars :");
		Scanner sc=new Scanner(System.in);
		char s[]=new char[10];
		char b[]={'a','e','i','o','u'};
		for (int i=0;i<10 ;i++ ) {
			s[i]=sc.next().charAt(0);

		}
		System.out.println();
		for (int i=0;i<s.length ;i++ ) {
			
				if (s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {

				System.out.print(s[i]+",");
			
			
			}
			
		}
		System.out.println();
		for (int j=0;j<s.length ;j++ ){
				
				System.out.print(s[j]+",");
			



	}
}
}