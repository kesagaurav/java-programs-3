package ex3;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {

		Integer i1=20;
		Integer i2=20;
		Integer i3=new Integer(10);
		System.out.println("i1==i2 " + (i1==i2));
		System.out.println("i2==i3 " + (i2==i3));
		System.out.println("i1==i2 " + (i1.equals(i2)));
		System.out.println("i2==i3 " + (i2.equals(i3)));
		System.out.println(Integer.MAX_VALUE);
		
		String s="123";
		int d=Integer.parseInt(s);
		System.out.println(d);


String s1="gaurva";
System.out.println(s1.substring(2,6));

String s2="hello world";
for(int i=0;i<s2.length();i++) {
	System.out.println(s2.charAt(i));
}

char[] ar=s2.toCharArray();
System.out.println(Arrays.toString(ar));

String s4="hi are you hungry";
String s5[]=s4.split(" ");
for(String e:s5) {
	System.out.println(e);
}


for(int i=0;i<s5.length;i++) {
	if(i%2==0) {
		System.out.println(s5[i].toUpperCase());
	}else {
		System.out.println(s5[i]);
	}
}

	}

}
