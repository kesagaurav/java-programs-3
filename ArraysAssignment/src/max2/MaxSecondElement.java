package max2;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSecondElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter how many elements u wnat to input");
		int n = sc.nextInt();
		System.out.println("\n enter the " + n + "elements");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
				
			}

		}
		System.out.println("\n the second  max of an element is:" + a[1]);

	}

}
