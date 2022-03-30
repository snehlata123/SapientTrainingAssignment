package enc;

import java.math.BigDecimal;

public class Rate {
	String startDate;
	BigDecimal amountBeforeTax;
	String endDate;
	String currencyCode;
	public Rate(){}
	public Rate(String startDate, BigDecimal amountBeforeTax, String endDate, String currencyCode) {
		super();
		this.startDate = startDate;
		this.amountBeforeTax = amountBeforeTax;
		this.endDate = endDate;
		this.currencyCode = currencyCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public BigDecimal getAmountBeforeTax() {
		return amountBeforeTax;
	}
	public void setAmountBeforeTax(BigDecimal amountBeforeTax) {
		this.amountBeforeTax = amountBeforeTax;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	

}
