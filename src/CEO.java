
public class CEO extends Employee {



	public CEO(String firstnameInput, String lastnameInput, double salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		creator.creatorWebsite("some template", "Codecamp3");
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 2;
	}
}
