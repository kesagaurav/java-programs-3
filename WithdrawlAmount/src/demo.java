
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double balance=6858.03;
		Double withdrawl=200.0;
		if(balance>=withdrawl) {
			balance=balance-withdrawl;
			System.out.println(balance);
			

		}else {
			System.out.println("\n sorry insufficeent funds");
		}
		
		
	}

}
