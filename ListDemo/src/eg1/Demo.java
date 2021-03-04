package eg1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Players> pl=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n eneter no of players");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("\n enter details of players " +(i+1));
			System.out.println("\n enter PlayerId");
			int id=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Player Name");
			String name = sc.nextLine();
			pl.add(new Players(id, name));
		}
		
		printPlayerList(pl);
		

	}

	
	public static void printPlayerList(List<Players> pl) {
		System.out.println("Printing " + pl.size() + " no of player/s");
		for (Players p : pl) {
			System.out.println(p);
		}
	}
	
	
}
