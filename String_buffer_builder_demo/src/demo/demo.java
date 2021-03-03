package demo;

public class demo {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("hello"); // create an empty buffer
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb);
		sb.append("hi").append("how are you").append("i think you aer good");
		System.out.println(sb);
		
		sb.insert(1, "JAVA");
		System.out.println(sb);
		
		sb.delete(1, 3);
		System.out.println(sb);
		
		sb.deleteCharAt(4);
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("raj");
		StringBuffer sb2=new StringBuffer("rajesh");
		
		if(sb1.toString().equals(sb2.toString())) {
			System.out.println("\n both are same");
		}else {
			System.out.println("\n both are not same");
		}

		
		
	}

}
