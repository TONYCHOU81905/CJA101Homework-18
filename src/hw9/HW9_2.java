package hw9;

class Bank{
	int amount = 0;
	
	synchronized public void deposit(int depositAmount) {
		
		while(amount>=3000) {
			try {
				System.out.println("媽媽看到餘額在3000以上，暫停匯款");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(amount<=0) {
			System.out.println("媽媽被熊大要求匯款");
		}
		
		amount+=depositAmount;
		
		System.out.println("媽媽存了"+depositAmount+"，銀行共有"+amount);
		notify();
		
	}
	
	synchronized public void withdraw(int withdrawAmount) {
		
		while(amount<=0) {
			try {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		amount-=withdrawAmount;
		if(amount<=2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
		}
		System.out.println("熊大領了"+withdrawAmount+"，銀行共有"+amount);
		notify();
		
	}
}

class MomThread extends Thread{
	Bank bank;
	  public MomThread(Bank bank) {
		  this.bank = bank;
		// TODO Auto-generated constructor stub
	}
	  @Override
	public void run() {
		  for(int i=0;i<10;i++) {
			  bank.deposit(2000);
		  }
		  System.out.println("存款已經十次");
		super.run();
	}
}

class BearThread extends Thread{
	Bank bank;
	  public BearThread(Bank bank) {
		  this.bank=bank;
		// TODO Auto-generated constructor stub
	}
	  @Override
	public void run() {
		  for(int i=0;i<10;i++) {
			  bank.withdraw(1000);
		  }
		  System.out.println("提款已經十次");
		super.run();
	}
}


public class HW9_2 {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		MomThread mom = new MomThread(bank);
		BearThread bear = new BearThread(bank);
		mom.start();
		bear.start();
	}

}
