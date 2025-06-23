package entities;

public class NaturalPerson extends Person {

	private Double healthcareExpenses;

	public NaturalPerson(String name, Double annualIncome, Double healthcareExpenses) {
		super(name, annualIncome);
		this.healthcareExpenses = healthcareExpenses;
	}

	public NaturalPerson() {
		super();
	}

	public Double getHealthcareExpenses() {
		return healthcareExpenses;
	}

	public void setHealthcareExpenses(Double healthcareExpenses) {
		this.healthcareExpenses = healthcareExpenses;
	}

	@Override
	public double tax() {
		double basicTax;
		if(getAnnualIncome() < 20000) {
			basicTax = getAnnualIncome() * 0.15;
		}else {
			basicTax = getAnnualIncome() * 0.25;
		}
		basicTax = basicTax - (getHealthcareExpenses() * 0.5);
		return basicTax;
	}

	
	
}
	
