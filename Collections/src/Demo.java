import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a=new ArrayList<>();

		List<Integer> b=new ArrayList<>();
		
		a.add(1);
		a.add(12);
		a.add(13);
		a.add(14);
		
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		
		b.add(10);
		b.add(11);
		b.add(100);
		b.add(120);
		
		for(int i=0;i<b.size();i++)
			System.out.println(b.get(i));
		
		
		for(int i=0;i<a.size();i++) {
			for(int y=0;y<b.size();y++) {
				if(a.get(i)>b.get(y)) {
					System.out.println("the greatests nos of a " + a.get(i));
				}else {
					System.out.println(" the greatest nos of b " + b.get(y));
				}
			}
		}
		
		
		
		
		
	}

}
