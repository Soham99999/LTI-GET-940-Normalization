public class Account {

	
		// TODO Auto-generated method stub
		private int accno;
		private double accbal;
		private String accpass;
		static String bankName;
		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Account(int accountNo, double accountBalance, String accountPassword) {
			super();
			accno = accountNo;
			accbal = accountBalance;
			accpass = accountPassword;
		}
		public int getAccountNo() {
			return accno;
		}
		public void setAccountNo(int accountNo) {
			accno = accountNo;
		}
		public double getAccountBalance() {
			return accbal;
		}
		public void setAccountBalance(double accountBalance) {
			accbal = accountBalance;
		}
		public String getAccountPassword() {
			return accpass;
		}
		public void setAccountPassword(String accountPassword) {
			accpass = accountPassword;
		}
		public static String getBankName() {
			return bankName;
		}
		public static void setBankName(String bankName) {
			Account.bankName = bankName;
		}
		
		void displayAccount()
		{
			System.out.println("Bank Account Details: ");
			System.out.println("Account No."+ accno);
			System.out.println("Account Password is: "+ accpass);
			System.out.println("Account Balance is: "+ accbal);
			System.out.println("Bank Name is: "+ bankName);
		}
	

	}
