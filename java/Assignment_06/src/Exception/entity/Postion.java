package Exception.entity;

import Exception.ScannerUtils;

public class Postion {
	private int id;
	private String name;

	public Postion() {
		input();
	}

	public Postion(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private void input() {
		System.out.println("Nhập id : ");
		id = ScannerUtils.inputInt("Please input a id as int, please input again.");

		System.out.println("Nhập tên : ");
		name = ScannerUtils.inputString("Please input a name, please input again.");
	}

	@Override
	public String toString() {
		return "Position{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

}
