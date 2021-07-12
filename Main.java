public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(103,10000,"saac12312");
		Account ac1 = new Account();
		ac1.setAccountNo(105);
		ac1.setAccountPassword("ddlj12345");
		ac1.setAccountBalance(50000);
		Account.bankName = "SBI";
		ac.displayAccount();
		System.out.println("");
		ac1.displayAccount();
	}

}
