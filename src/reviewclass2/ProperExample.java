package reviewclass2;

public class ProperExample {

	public static void main(String[] args) {

		String username="Salma";
		String password="Salma123";
		boolean isAllowed=true;
		double accountBalance=1000;
		double amountToTransfer=3000;
		
		if(username.equals("Salma")) {
			if(password.equals("Salma123")) {
				System.out.println("Welcome to bank of America");
				
				
				if (accountBalance>=amountToTransfer) {
					System.out.println("Amount Transfered");
				}else {
					System.out.println("insufficientbalance");
				}
			}else {
				System.out.println("Incorrect password");
			}
			
			
			
			
			
	}else {
		System.out.println("your username is not correct please try again later");
	}
	}
}
