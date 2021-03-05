package inh1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n accessing features of mobie v3");
		MobileV3 v3=new MobileV3();
		MobileV2 v2=new MobileV2();
		v3.browsing();
		//v3.calling();
		v3.camera();
		v3.gaming();
		v3.socialApp();
		v2.calling();
		v2.messaging();
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());
	}

}
