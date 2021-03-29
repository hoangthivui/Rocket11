package com.vti.Question02.backend.Abstraction;

import com.vti.Question02.frontend.Abstraction.question1.Phone;
import com.vti.Question02.frontend.Abstraction.question1.VietnamesePhone;

public class Abstraction {
	public void question1() {
		Phone phone = new VietnamesePhone();
		phone.insertContact("Đăng Black", "0825294200");
		phone.removeContact("Đăng Black");
		phone.updateContact("Đăng Black", "0962282193");
		phone.searchContact("Đăng Black");
	}

}
