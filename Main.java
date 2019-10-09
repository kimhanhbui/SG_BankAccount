import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance;
		LocalDate date;
		
		Account a1 = new Account(50.);
		Account a2 = new Account(100.0);
		Account a3 = new Account(0.);
		
		Statement s1 = new Statement();
		s1.creatStatement(1000.);
		
		a1.deposit(100.);
		a2.withdrawal(20.);
		a3.withdrawal(50.);
		
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		

		
	}

}
