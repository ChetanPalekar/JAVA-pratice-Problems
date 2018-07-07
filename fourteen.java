public class fourteen{
	public static void main(String srgs[]){
		int arr1[]={5,2,3,7,9,8,60,11,6,87};

		int large=arr1[0],small=arr1[0],s_small=-1,s_large=-1;
		
		for (int i=1;i<arr1.length ;i++ ) {
				
				if (arr1[i]<small) {
					s_small=small;
					small=arr1[i];
				}
				
				if (arr1[i]>large) {
					s_large=large;
					large=arr1[i];
				}
			
		}
System.out.println("Second Small: "+s_small+" Second large: "+s_large);
	}
}