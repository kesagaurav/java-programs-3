package eg1;

import java.util.Scanner;

public class MaximunAndMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "string is immutable and stringbuffer and stringbuilder is not!";
		String ar[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length() - 1))
					.append(Character.toUpperCase(ar[i].charAt(ar[i].length() - 1))).append(" ");
		}
		System.out.println(sb.toString().trim());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Input: ");
		String input = sc.nextLine();
		String arr[] = input.split(" ");
		StringBuilder sb2 = new StringBuilder();
		int maxWordLetters = 0;
		int minWordLetters = arr[0].length();
		String maxWord = "";
		String minWord = "";
		int middle = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() % 2 == 0) {
				sb2.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
			} else {
				middle = (arr[i].length()%2)+(arr[i].length()/2);
				System.out.println(sb2.append(arr[i].substring(0, middle-1))
						.append(Character.toUpperCase(arr[i].charAt(arr[i].length()- middle))).append(arr[i].substring(middle)).append(" "));
				
			}
			if (arr[i].length() > maxWordLetters) {
				maxWordLetters = arr[i].length();
				maxWord = arr[i];
			}
			if (arr[i].length() < minWordLetters) {
				minWordLetters = arr[i].length();
				minWord = arr[i];
			}
		}
		System.out.println(sb2.toString().trim());
		System.out.println("Word with Maximum letters(" + maxWordLetters + "): \"" + maxWord + "\"");
		System.out.println("Word with Minimum letters(" + minWordLetters + ") \"" + minWord + "\"");
		sc.close();

	}

}
