import java.util.*;
public class ninteen{
	public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char a[]=new char[5];
char b[]=new char[5];
char c[]=new char[5];
System.out.println("Enter 5 charA:");
	for (int i=0;i<a.length ;i++ ) {
		a[i]=sc.next().charAt(0);
	}
System.out.println("Enter 5 charB:");
for (int j=0;j<b.length ;j++ ) {
	b[j]=sc.next().charAt(0);
}
for (int i=0;i<a.length ;i++ ) {
	c[i]=a[i];
}
for (int i=0;i<a.length ;i++ ) {
	a[i]=b[i];
}
for (int i=0;i<a.length ;i++ ) {
	b[i]=c[i];
}
System.out.println();
for (int i=0;i<a.length ;i++ ) {
	System.out.print(a[i]);
}
System.out.println();
for (int i=0;i<a.length ;i++ ) {
	System.out.print(b[i]);
}

	}

}