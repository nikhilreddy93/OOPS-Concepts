package digitalWallet;

import java.util.Date;

public class Transaction {
	
	
	String type,desc,merchant;
	double amount;
	Date date;
	
	
	public void setDesc(String desc) {
		  this.desc = desc;
	}
	public String getDesc() {
		return desc;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		  this.type = type;
	}
	
	
	public void setMerchant(String merchant) {
		  this.merchant = merchant;
	}
	public String getMerchant() {
		return merchant;
	}
	
	
	public void setAmount(double amount) {
		  this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}
	
	
	public void setDate(Date date) {
		  this.date = date;
	}
	public Date getDate() {
		return date;
	}
	
	
  
  
  
  
  
}