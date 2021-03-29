package backend.abstraction_1;

import entity.abstraction_1.Phone;
import entity.abstraction_1.VietnamesePhone;

public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("hà", "123456");
		phone.removeContact("hà ");
		phone.updateContact("lan", "782832893");
		phone.searchContact("lan");
	}



}
