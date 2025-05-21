class BankAccount{
private int accountNumber;
private String accountHolder;
private double balance;

BankAccount(int accountNumber, String accountHolder,double balance){
	this.accountHolder=accountHolder;
	this.accountNumber=accountNumber;
	this.balance=balance;
}

public void setAccountHolder(String accountHolder){
	this.accountHolder=accountHolder;
}
public String getAccountHolder(){
	return accountHolder;
}

public void setAccountNumber(int accountNumber){
	this.accountNumber=accountNumber;
}
public int getAccountNumber(){
	return accountNumber;
}

public void setBance(double balance){
	this.balance=balance;
}
public double getBalance(){
	return balance;
}

void withdraw(double amount)throws IllegalArgumentException {
        if (amount<this.balance) {
            System.out.println("Succcessful withdraw");
			System.out.println("Current Acoount Balance is: "+(this.balance - amount));
        }
        else {
            throw new IllegalArgumentException("Insufficient balance.");
			}
      
		}
	}
	
class Bank{
	private BankAccount[] bankarray=new BankAccount[5];
	private int accountCount=0;
	
	void addAccount(BankAccount account){
		if(accountCount<bankarray.length){
			bankarray[accountCount]=account;
		accountCount++;
	}
	else{
		System.out.println("You can add only five accounts");
		}
	}
	
	
	void withdrawMoney(int accountNumber, double amount){
		for(int i=0; i<accountCount; i++){
			if(bankarray[i].getAccountNumber() == accountNumber)
			{
				try{
				bankarray[i].withdraw(amount);
				System.out.println("Withrawal is successful"+accountNumber+". New Balance: "+(bankarray[i].getBalance()-amount));
				return;}
				catch(IllegalArgumentException e){
					System.out.println("Withdrawal failed"+ accountNumber + ": " + e.getMessage());
					return;
				}
			}
		}
		
	}
	
	  void displayDetails(){
	 for(int i=0;i<accountCount;i++){
		System.out.println("Account "+bankarray[i].getAccountNumber()+" Holder:"+bankarray[i].getAccountHolder()+"Balance "+bankarray[i].getBalance()); 
	 }
	 if(accountCount==0){
		 System.out.println("Account balance is empty");
	 }
}

 
}
class SimpleBank{
	public static void main(String[]args){
	 Bank b1=new Bank();
	 
	 
	 b1.addAccount(new BankAccount(1001,"Alice",5000.0));
	  b1.addAccount(new BankAccount(1002,"Bob",3000.0));
	   
	   b1.withdrawMoney(1001,6000.0);
	      b1.withdrawMoney(1002,1000.0);
	   
	   
	   b1.displayDetails();
 }
}