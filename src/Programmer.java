import java.util.Date;

public class Programmer extends Employee implements IWebsiteCreator,IWindowsInstaller{


	
	public Programmer(String firstnameInput, String lastnameInput, double salaryInput, String positionInput) {
		super(firstnameInput, lastnameInput, salaryInput, positionInput);
		// TODO Auto-generated constructor stub
	}
	
	public void FixPC(String serialNumber) {
		System.out.println("I'm trying to fix PC serialNumber:"+ serialNumber);
	}
	public void createWebsite(String template, String titleName) {
		System.out.println("Setup template: "+ template);
		System.out.println("Set Title name: "+ titleName);
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public void formatWindows(String drive) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getLastInstalledWindowsVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void creatorWebsite(String template, String titleName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void installWindows(String version, String productKey) {
		// TODO Auto-generated method stub
		
	}

}
