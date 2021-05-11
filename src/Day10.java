import java.util.ArrayList;

public class Day10 {
	public static void main(String[] args) {
		Employee dang = new Employee("Dang", "Red", 10000, "Manager");
		CEO ceo = (CEO) new Employee("Captain", "Marvel", 30000, "CEO");
		Programmer prog = new Programmer("Thummanoon", "Hwanchaeam", 5000, "DEV");
//		CEO ceo2 = (CEO) ceo;

		ArrayList<Employee> employees = new ArrayList<>();
//		employees.add(ceo2);
		employees.add(dang);
		employees.add(prog);
//		CEO ceo3 = (CEO) employees.get(0);
		Employee dang2 = employees.get(0);
		Programmer programmer = (Programmer) employees.get(1);
//		ceo3.hello();
		programmer.hello();

		IWebsiteCreator dangCreator = new Programmer("Dang", "Red", 10000, "Ceo");
		Programmer dangProgrammer = (Programmer) dangCreator;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;

//		ceo.orderWebsite(dang);
//		ceo.orderWebsite(dang2);
		ceo.orderWebsite(alphaGo);
		ceo.orderWebsite(alphaGo2);
		final int a=0;
		Status myStatus = Status.HEALTHY;
		switch (myStatus) {
		case HEALTHY:
			System.out.println("พร้อมจะลุยกันมานานแล้วววว!!");
			break;
		case SLEEPY:
			System.out.println("ง่วงจังขอกาแฟหน่อย");
			break;
		case DEAD:
			System.out.println("ไม่ไหวแล้วไปนอนละบายยย");
			break;

		}

	}

	enum Status {
		HEALTHY, SLEEPY, DEAD
	}

}
