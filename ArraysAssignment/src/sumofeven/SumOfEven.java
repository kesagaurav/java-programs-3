package sumofeven;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter how many elements u wnat to input");
		int n = sc.nextInt();
		System.out.println("\n enter the " + n + "elements");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}

		}

		System.out.println(" sum of even nos is " + sum);

	}

}
