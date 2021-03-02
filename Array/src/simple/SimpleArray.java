package simple;

public class SimpleArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7};
		System.out.println(ar.length);
		System.out.println(ar[0]);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("ar["+i+"]:" + ar[i]);
		}
		
		for(int i=0;i<ar.length;i++) {
			if(i%2==0) {
				System.out.println(ar[i]);
			}
		}
	}

}
