package entities;

public abstract class  Person {
	private String name;
	private Double annualIncome;
	
	
	public Person(String name, Double annualIncome) {
		super();
		this.name = name;
		this.annualIncome = annualIncome;
	}

	

	public Person() {
		
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getAnnualIncome() {
		return annualIncome;
	}


	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax ();

	
	
}
