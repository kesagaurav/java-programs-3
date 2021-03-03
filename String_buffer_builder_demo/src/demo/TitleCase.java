package demo;

public class TitleCase {

	public static void main(String[] args) {

		String s="string is immutable and stringbuffer is not";
		
		String ar[] =s.split(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<ar.length;i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(3))).append(ar[i].substring(3)).append(" " );
		}
		System.out.println(sb.toString().trim());
	}

}
