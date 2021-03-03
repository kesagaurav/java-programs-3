package demo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="madam";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		String temp=sb.toString();
		if(s.equals(temp)) {
			System.out.println(s + " is palindrome ");
		}else {
			System.out.println(s + "is not palindrome");
		}
		
		String s2="pojo";
		
		if(new StringBuffer(s2).reverse().toString().equals(s2)) {
			System.out.println(s2 + " is pallin");
		}else {
			System.out.println(s2 + " is not  pallin");

		}
		
		int x=1001;
		String s3=x+ "";
		
		if(new StringBuffer(s3).reverse().toString().equals(s3)) {
			System.out.println(s3 + " is palin");
		}else {
			System.out.println(s3 + " is not palin");

		}
		

	}

}
