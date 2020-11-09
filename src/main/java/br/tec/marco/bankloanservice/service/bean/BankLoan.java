/**
 * 
 */
package br.tec.marco.bankloanservice.service.bean;

/**
 * @author marcoyf
 *
 */
public class BankLoan {
	
	private String bankName;
	private double interestRate;
	private double presentValue;
	private double paymentAmount;
	
	/**
	 * 
	 */
	public BankLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bankName
	 * @param interestRate
	 * @param presentValue
	 * @param paymentAmount
	 */
	public BankLoan(String bankName, double interestRate, double presentValue, double paymentAmount) {
		super();
		this.bankName = bankName;
		this.interestRate = interestRate;
		this.presentValue = presentValue;
		this.paymentAmount = paymentAmount;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the presentValue
	 */
	public double getPresentValue() {
		return presentValue;
	}

	/**
	 * @param presentValue the presentValue to set
	 */
	public void setPresentValue(double presentValue) {
		this.presentValue = presentValue;
	}

	/**
	 * @return the paymentAmount
	 */
	public double getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * @param paymentAmount the paymentAmount to set
	 */
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BankLoan [bankName=" + bankName + ", interestRate=" + interestRate + ", presentValue=" + presentValue
				+ ", paymentAmount=" + paymentAmount + "]";
	}
}
