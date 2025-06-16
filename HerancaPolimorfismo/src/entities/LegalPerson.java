package entities;

public  class LegalPerson extends Person{

	private Integer numberOfEmployees;
	
	
	public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}


	public LegalPerson() {
		super();
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}



	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public double tax() {
		double basicTax;
		if(numberOfEmployees > 10) {
			basicTax = getAnnualIncome() * 0.14;
		}else {
			basicTax = getAnnualIncome() * 0.16;

		}
		return basicTax ;
	}
	
	
}
