package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer()	{
		customerGrade = "SILVER";
	}
	public String showCustomerInfo(){
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

}
