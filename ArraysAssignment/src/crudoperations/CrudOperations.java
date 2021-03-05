package crudoperations;

public class CrudOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]=new int[6];
		ar[0]=1;
		ar[1]=2;
		ar[2]=3;
		ar[3]=4;
		int n=4;
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		int ele=100;
		int pos=1;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];//updating
		}
		ar[pos-1]=ele;// inserting
		n++;
		System.out.println("\n after insertion");
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		//delete an array
		int delpos=3;
		for(int i=delpos-1;i<n;i++) {
			ar[i]=ar[i+1];
			
		}
		n--;
		
		System.out.println("\n after deletion " + delpos);
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]);
		}
		


	}

}
