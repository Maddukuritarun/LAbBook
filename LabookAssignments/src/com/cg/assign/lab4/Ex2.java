package com.cg.assign.lab4;

abstract class BankAccount{
	
    long AccNum;
	double balance;
	
	public abstract long getAccNum();
	public abstract void setAccNum(long accNum);
	public abstract double getBalance();
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);

}

class Person extends BankAccount{
	
	private String name;
	private int age;
	final double minimumBalance = 500;
	final double overdraft = 10000;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name,int age, long accNum){
		this.name = name;
		this.age = age;
		this.AccNum = accNum;
	}	
	
	static boolean overdraftCheck(double amount) {
		if (amount<=10000) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setAccNum(long accNum) {
		this.AccNum = accNum;
	}
	@Override
	public long getAccNum() {
		return AccNum;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public void deposit(double amount) {
		balance = balance+amount;
	}
	
	@Override
	public void withdraw(double amount) {	
		if (overdraftCheck(amount)) {		
			if ((balance-amount)<500) {
				System.out.println("Warnings :");
				System.out.println();
				System.out.println("Minimum balance for account holder "+name+" should be "+minimumBalance);
				System.out.println();
				System.out.println("---------------------------------------------------------------------");
			}
			else {
				balance = balance - amount;
			}	
		}
		else {
			System.out.println("Maximum amount that can be withdrawn by "+name+" is "+overdraft);
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
		}
	}
}



public class Ex2 {
   public static void main(String[] args) {
	   Person obj1 = new Person("Tarun",20,623123);
	   Person obj2 = new Person("Milky",19,392266910);
	   obj1.deposit(60000);
	   obj1.withdraw(30000);

	   obj2.deposit(50000);
	   obj2.withdraw(25000);

	   System.out.println("Displaying details of "+obj1.getName());
	   System.out.println("------------------------------------");
	   System.out.println("Account Number :"+obj1.getAccNum());
	   System.out.println("Account Holder : "+obj1.getName());
	   System.out.println("Account Holder Age : "+obj1.getAge());
	   System.out.println("Account Balance : "+obj1.getBalance());
	   System.out.println("------------------------------------");
	   System.out.println("Displaying details of "+obj2.getName());
	   System.out.println("------------------------------------");
	   System.out.println("Account Number :"+obj2.getAccNum());
	   System.out.println("Account Holder : "+obj2.getName());
	   System.out.println("Account Holder Age : "+obj2.getAge());
	   System.out.println("Account Balance : "+obj2.getBalance());
	   System.out.println("------------------------------------");
   }
}