package util;
import java.util.Arrays;

public class ArrayUtilClassDemo {
public static void main(String[] args) {
	int ar[]= {1,2,3,4,5,6,7};
	
	System.out.println(Arrays.toString(ar));
	Arrays.sort(ar);
	System.out.println(Arrays.binarySearch(ar, 6));
	
	int ar1[]=Arrays.copyOf(ar, ar.length);
	System.out.println("ar1 : "  + Arrays.toString(ar1));
	
}
}
