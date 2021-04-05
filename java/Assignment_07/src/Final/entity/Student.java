package Final.entity;

public final class Student {

//	Tạo class Student có property id, name hãy thiết kế class Student sao 
//	cho khi đã khởi tạo Student thì id là không thể thay đổi trong suốt quá 
//	trình chạy chương trình chương trình
	
	private final int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student:id=" + getId() + "," + "name=" + name;
	}
}
