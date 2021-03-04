package presenter;

import demo.Businness;

public class Presenter {

	public static void main(String[] args) {

		Businness b=new Businness();
		try {
			b.openfile("demo.txt");
			System.out.println("\n file reading successfuly");
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("\n cannot find the file");
		}
	}

}
