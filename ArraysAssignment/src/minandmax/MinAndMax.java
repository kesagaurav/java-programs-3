package minandmax;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter how many elements u wnat to input");
		int n = sc.nextInt();
		System.out.println("\n enter the " + n + "elements");
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int max=a[0];

		for (i = 1; i < n; i++) {
			if (a[i] > max) {
			max = a[i];
			}
		}
		System.out.println("\n the max of an element is:" + max);
		
		int min=a[0];
		for (i = 1; i < n; i++) {
			if (a[i] < min) {
			min = a[i];
			}
		}
		System.out.println("\n the min of an element is:" + min);

	}

}
