package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number; 
	private Date date; 
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer number, Date date, Double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValueDouble) {
		this.totalValue = totalValueDouble;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
}
