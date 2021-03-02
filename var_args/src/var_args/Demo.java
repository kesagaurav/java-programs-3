package var_args;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
		System.out.println(sum(1,2,3));
		System.out.println(sum(80,0,93,4,65,6,7,90,100));
		
	}

	
	public static int sum(int ...a) {
		System.out.println("\n no of ars is"+ a.length);
		if(a.length>0) {
			int res=0;
			for(int i=0;i<a.length;i++) {
				res+=a[i];
			}
			return res;
		}
		return 0;
	}
	
}
