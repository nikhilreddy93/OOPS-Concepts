package digitalWallet;

import java.util.ArrayList;

public class DigitalWallet {
  
  /* Store all the Add Money, Pay and Reward transactions as transaction objects */

  /* implement all the methods given below */

  /* Default constructor */
	
	String name;
	Transaction tx = new Transaction();
	double walletMoney;
	ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	ArrayList<Transaction> rewardTransactions = new ArrayList<Transaction>();
	
  public DigitalWallet(String name ) {
	  this.name=name;
  }

  /* Add money to the wallet */
  public boolean addMoney(Transaction tx) {
	  walletMoney = walletMoney+tx.getAmount();
	  transactions.add(tx);
	  return true; 
  }

  /* Return the balance in the wallet */
  public double getBalance() {
	  
	  return walletMoney;
	  
  }

  /* Make a payment */
  public boolean pay(Transaction tx) {
	  int x=(int)tx.getAmount()/100;
	  double discount = x*10;
	 
	 // getRewardTransactions(tx1);
	  if(tx.getAmount()<getBalance()){
		  Transaction tx1 = new Transaction();
		  walletMoney = walletMoney-tx.getAmount()+discount;
		  transactions.add(tx);
		  tx1.setType("Reward");
		  tx1.setAmount(discount);
		  rewardTransactions.add(tx1);
		  transactions.add(tx1);
		  return true;
	  }
	  else
	  return false; 
  }

  /* print statement */
  public void printStatement() {
	  
	  for(Transaction i:transactions){
		  System.out.println("Date : " + i.getDate() + ", Transaction Type : " + i.getType() + ", Description : " + i.getDesc() );
	  }
	  
  }

  /* Return the list of reward transactions */
  public Transaction[] getRewardTransactions() {

	
	  return rewardTransactions.toArray(new Transaction[rewardTransactions.size()]);
  }

  /* Return all the transactions */
  public Transaction[] getAllTransactions() {
	  
	  return transactions.toArray(new Transaction[transactions.size()]);
  }

  /* Return the transactions that match the merchant name */
  public Transaction[] getTransactions(String merchantName) {
	  ArrayList<Transaction> merchantTransactions = new ArrayList<Transaction>();
	  for(Transaction i:transactions){
		  if(!i.getType().equals("Reward") && i.getMerchant().equals(merchantName)){
			  merchantTransactions.add(i);
		  }
	  }
	 //System.out.println("String  = " + list.toString());
	  return merchantTransactions.toArray(new Transaction[merchantTransactions.size()]);
  }
}