import java.time.LocalDate;
import java.util.ArrayList;

public class Statement {
	 
	private ArrayList accounts;

//	Constructors
	public Statement() {
		accounts = new ArrayList();
	}
	
// Accessor methods
	
	private int getNaccounts() {
		return accounts.size();
	}
	
	private void setAccounts(ArrayList newVar) {
		accounts = newVar;
	}
	
	private ArrayList getAccounts() {
		return accounts;
	}
	
//	Other methods
//	Create Statement
	
	public void creatStatement(double b) {
		accounts.add(new Account(b));
	}
	
}
