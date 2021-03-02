package util;

import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayInput {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter the size of an array");
		int n=sc.nextInt();
		System.out.println("\n enter + " +n +"elements");
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("\n before sorting");
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("\n array affter sorting");
		System.out.println(Arrays.toString(ar));

	}

}
