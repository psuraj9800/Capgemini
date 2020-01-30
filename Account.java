
public class Account {
	public static final int INIT_ACC_NO = 1001;
	protected static int autogen;
	protected int accNo;
	//private String holder;
	protected double balance;
	protected double draft = 10000;
	public static final double OVERDRAFT_LIMIT=10000;
	protected final double MIN_BAL=500;
	protected Person accHolder;
protected boolean limit;
	static {
		autogen = INIT_ACC_NO;
	}
	 public String toString(){ 
		  //return accNo+" "++" "+balance;
		 return accHolder.toString();
		 }  

	public Account() {
	}

	public Account(Person accHolder, double balance) {
		this.accNo = autogen++;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount)
	{
		if(MIN_BAL<(balance-amount))
		{
			System.out.println("Insufficient balance");
			
		}
		else 
		{
			balance -= amount;
			
		}
	}
	public void summary() {
		System.out.println("Name : "+accHolder.getName());
		System.out.println("Age :"+accHolder.getAge());
		System.out.println("Account No :" + accNo);
		System.out.println("Account balance :" + balance);
		//System.out.println("");
	}

}
