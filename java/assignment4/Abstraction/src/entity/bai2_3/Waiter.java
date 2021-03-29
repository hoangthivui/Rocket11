package entity.bai2_3;

public class Waiter extends User {

	

	public Waiter(String name2, double salaryRatio2) {
		super(name2, salaryRatio2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return salaryRatio * 220;
	}

}