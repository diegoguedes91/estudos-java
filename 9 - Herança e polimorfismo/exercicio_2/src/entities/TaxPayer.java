package entities;

public abstract class TaxPayer {

	private String Name; 
	private Double anualIncome;
	
	public TaxPayer(String name, Double anualIncome) {
		super();
		Name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
	
}
