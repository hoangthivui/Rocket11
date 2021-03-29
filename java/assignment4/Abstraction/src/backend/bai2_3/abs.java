package backend.bai2_3;



import entity.bai2_3.Employee;
import entity.bai2_3.Manager;
import entity.bai2_3.Waiter;

public class abs {
 
	public void bai2_3() {
		Employee employee = new Employee("mai", 6.9);
		employee.displayInfo();

		Manager manager = new Manager("loan", 9.6);
		manager.displayInfo();

		Waiter waiter = new Waiter("vui", 7.0);
		waiter.displayInfo();
	}
}
