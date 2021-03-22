package assignment2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Department department1=new Department();
		department1.id=1;
		department1.name="sale";
		
		Department department2=new Department();
		department2.id=2;
		department2.name="marketting";
		
		Department department3=new Department();
		department3.id=3;
		department3.name="bao ve";
		
		Position position3 = new Position();
		position3.id=3;
		position3.name=PostionName.DEV;
		
		Account account1=new Account();
		account1.id=1;
		account1.email="abcgmail.com";
		account1.userName="van a";
		account1.fullName="nguyen van a";
		account1.department=department2;
		account1.position=position3;
		account1.createDate=new Date("2020/12/12");
		

		Account account2 = new Account();
		account2.id=2;
		account2.email="hoangnam11gmail.com";
		account2.userName="hoang van";
		account2.fullName="hoang van nam";
		account2.department=department2;
		account2.createDate=new Date("2019/10/07");
		
		Account account3 = new Account();
		account3.id=3;
		account3.email="hoangvanb11gmail.com";
		account3.userName="hoang b";
		account3.fullName="hoang van b";
		account3.department=department1;
		account3.createDate=new Date("2021/11/17");
		
		Group group1=new Group();
		group1.id=1;
		group1.name="group1";
		group1.creator=account1;
		group1.createDate=new Date("2021/11/13");
		
		
		
		Group group2=new Group();
		group2.id=2;
		group2.name="group2";
		group2.creator=account2;
		group2.createDate=new Date("2020/07/13");
		
		Group group3=new Group();
		group3.id=3;
		group3.name="group3";
		group3.creator=account1;
		group3.createDate=new Date("2020/02/13");
		
		GroupAccount groupAccount1=new GroupAccount();
		groupAccount1.account=account1;
		groupAccount1.group=group1;
		groupAccount1.joinDate = new Date();
		
		GroupAccount groupAccount2=new GroupAccount();
		groupAccount2.account=account2;
		groupAccount2.group=group1;
		groupAccount2.joinDate = new Date();
		
//		GroupAccount[] groupAccounts= {groupAccount1,groupAccount2};
//		group1.accounts=groupAccounts;
		
		GroupAccount[] groupAccounts= {groupAccount1,groupAccount2};
		account1.groups=groupAccounts;
		
		GroupAccount[] groupAccountt= {};
		account2.groups=groupAccountt;
		
		Account[] accounts = { account1, account2, account3 };
		Department[] departments= { department1, department2,department3 };
//			Question 1:Đ
//			Kiểm tra account thứ 2
//			Nếu không có phòng ban (tức là department == null) thì sẽ in ra text 
//			"Nhân viên này chưa có phòng ban"
//			Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
//	
//		if(account2.department==null) {
//			System.out.println("nhan vien chua co phong ban");
//		}else {
//			System.out.println("phong ban nhan vien 2 la:" + account2.department.name);
//		}
//		
//		Question 2: Đ
//			Kiểm tra account thứ 2
//			Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//			Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên 
//			này là Java Fresher, C# Fresher"
//			Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người 
//			quan trọng, tham gia nhiều group"
//			Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là 
//			người hóng chuyện, tham gia tất cả các group"
//			
//		if (account1.groups==null) {
//			System.out.println("Nhân viên này chưa có group");
//		}  else if (account1.groups.length==1||account1.groups.length==2 )
//		{
//			System.out.println("Group của nhân viênnày là Java Fresher, C# Fresher");
//		}
//		else if(account1.groups.length==3){
//			System.out.println("Nhân viênnày là quan trọng, tham gia nhiều group");
//		}	
//		else if(account1.groups.length==4){
//			System.out.println("Nhân viênnày là người hóng chuyện, tham gia tất cả các group");
//		}
//		Question 3:Đ--Sử dụng toán tử TERNARY để làm Question 1
//		
//		System.out.println(account2.department==null?"nhan vien chua co phong ban":"phong ban nhan vien 2 la:" + account2.department.name);	
//		
//		
//		Question 4:Đ
//			Sử dụng toán tử TERNARY để làm yêu cầu sau:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"
//			PostionName pn = PostionName.DEV;       
//			System.out.println(account1.position==position3? "Đây là Developer" : "Người này không phải là Developer");
//		
//		-----------------------------SWITCH CASE----------------------------------
//		QUESTION 5:Đ
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên
//		
//		switch(group1.accounts.length){
//			case 1:
//				System.out.println("Nhóm có một thành viên");
//				break;
//			case 2:
//				System.out.println("Nhóm có hai thành viên");
//				break;
//			case 3:
//				System.out.println("Nhóm có ba thành viên");
//				break;
//			default:
//				System.out.println("Nhóm có nhiều thành viên");
//				
//		}
// QUESTION 2: Đ
//        Account[] accounts = new Account[]{account1, account2, account3};
//        for (Account account : accounts) {
//            System.out.println("Thong tin account thu " + account.id + " la:");
//            System.out.println("Ten nhan vien: " + account.fullName);
//            System.out.println("Dia chi email: " + account.email);
//            System.out.println("Phong ban: " + account.department.name);
//            System.out.println();
//        }
//		QUESTION 6: Đ
//			Sử dụng switch case để làm lại Question 2
//		switch(account2.groups.length) {
//		case 0:
//			System.out.println("Nhân viên này chưa có group");
//			break;
//		case 1:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 2:
//			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
//			break;
//		case 3:
//			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
//			break;
//		case 4:
//			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
//			break;
//		}
//		
//		QUESTION 7: Đ
//		Sử dụng switch case để làm lại Question 4
//		Question 4:
//			Kiểm tra Position của account thứ 1
//			Nếu Position = Dev thì in ra text "Đây là Developer"
//			Nếu không phải thì in ra text "Người này không phải là Developer"	
//		PostionName pn=PostionName.DEV;
//		switch (pn) {
//		case DEV:
//			System.out.println("Đây là Developer");
//			break;
//		default:
//			System.out.println("Người này không phải là Developer");
//		}
//		---------------------------FOREACH-----------------------------------
//		Question 8: 
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ
//		
//		Account[] accounts = { account1, account2, account3 };
//		for (Account account : accounts) {
//			System.out.println("Email: " + account.email);
//			System.out.println("FullName: " + account.fullName);
//			System.out.println("Name Department: " + account.department.name);
//			System.out.println("\n");
//		}
//		
//		Question 9: 
//		In ra thông tin các phòng ban bao gồm: id và name
//		Department[] departments = {department1,department2,department3};
//		for (Department department : departments) {
//			System.out.println("Id: " +department.id);
//			System.out.println("Department name: " +department.name);
//		}
//		----------------------------FOR---------------------------------------------
//		Question 10: Đ
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là: 
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//		Thông tin account thứ 2 là: 
//		Email: NguyenVanB@gmail.com
//		Full name: Nguyễn Văn B
//		Phòng ban: Marketting
//		for(int i=0; i<accounts.length;i++) {
//			System.out.println("Thông tin account thứ" +(i+1)+"là: ");
//			System.out.println("Email:" +accounts[i].email);
//			System.out.println("Full name:" +accounts[i].fullName);
//			System.out.println("Phòng ban:" +accounts[i].department.name);
//		}
//		Question 11: 
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau: 
//			Thông tin department thứ 1 là: 
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là: 
//			Id: 2
//			Name: Marketing
//		for(int i=0;i<departments.length;i++) {
//			System.out.println("Thông tin department thứ " +(i+1)+" là:");
//			System.out.println("Id: "+ departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//		}
//		Question 12: 
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
//		for(int i=0; i<2;i++) {
//			System.out.println("Thông tin account thứ" +(i+1)+"là: ");
//			System.out.println("Thông tin department thứ " +(i+1)+" là:");
//			System.out.println("Id: "+ departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//		}
//		Question 13: 
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
//		for(int i=0; i<accounts.length;i++) {
//			if(i!=1) {
//			System.out.println("Thông tin account thứ" +(i+1)+"là: ");
//			System.out.println("Email:" +accounts[i].email);
//			System.out.println("Full name:" +accounts[i].fullName);
//			System.out.println("Phòng ban:" +accounts[i].department.name);
//					}
//			}
//		Question 14: In ra thông tin tất cả các account có id < 4
//		for(int i=0; i<accounts.length; i++) {
//			if(accounts[i].id<3) {
//				System.out.println("Thông tin account thứ" +(i+1)+"là: ");
//				System.out.println("Email:" +accounts[i].email);
//				System.out.println("Full name:" +accounts[i].fullName);
//				System.out.println("Phòng ban:" +accounts[i].department.name);
//			}
//		}
//		Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
//		for(int i=2; i<=20;i=i+2) {
//			System.out.println(i);
//		}
//		----------------------------WHILE----------------------------------------
//		Question 16:
//		Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với 
//		lệnh break, continue
//		Question 16~10:
//		In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//		họ theo định dạng như sau:
//		Thông tin account thứ 1 là: 
//		Email: NguyenVanA@gmail.com
//		Full name: Nguyễn Văn A
//		Phòng ban: Sale
//			Thông tin account thứ 2 là: 
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting
//		int i=0;
//		while(i<accounts.length) {
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}

//		Question 16~11: 
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau: 
//			Thông tin department thứ 1 là: 
//			Id: 1
//			Name: Sale
//			Thông tin department thứ 2 là: 
//			Id: 2
//			Name: Marketing
//		int i = 0;
//		while (i < departments.length) {
//			System.out.println("Thông tin department thứ " + (i + 1) + " là :");
//			System.out.println("ID: " + departments[i].id);
//			System.out.println("Name: " + departments[i].name);
//			i++;
//		}
//		Question 16~12:Chỉ in ra thông tin 2 account đầu tiên theo định dạng như Question 10
//		int i=0;
//		while(i<2) {
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}
//		Question 16~13: In ra thông tin tất cả các account ngoại trừ account thứ 2
//		int i=0;
//		while(i<accounts.length) {
//
//			if (i == 1) {
//				i++;
//				continue;
//			}
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}
//		Question 16~14: In ra thông tin tất cả các account có id < 3
//		int i=0;
//		while(i<accounts.length) {
//			if(i>=2) {
//				i++;
//				continue;
//			}
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}
//		Question 16~15: In ra các số chẵn nhỏ hơn hoặc bằng 20
//		int i=2;
//		while(i<=20) {
//			System.out.println(i);
//			i=i+2;
//		}
//		`````````````````````````DO-WHILE``````````````````````````````````````
//		Question 17:
//		Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với 
//		lệnh break, continue
// 		Question17.10:
//		int i=0;	
//		do {
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		} while(i<accounts.length);
// 		Question17.11:
//		int i=0;
//		do {
//			System.out.println("Thông tin department thứ "+(i+1)+" là:");
//			System.out.println("Id: " +departments[i].id);
//			System.out.println("name: "+departments[i].name);
//			i++;
//		}while(i<departments.length);
//		Question 17-12:Chỉ in ra thông tin 2 department đầu tiên
//		int i=0;
//		do {
//			System.out.println("thông tin department thứ "+(i+1)+" là:");
//			System.out.println("id: "+departments[i].id);
//			System.out.println("name: "+ departments[i].name);
//			i++;
//		}while(i<2);
//		Question 17-13:In ra thông tin tất cả các account ngoại trừ account thứ 2__SAI
//		int i=0;
//		
//		do {
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}while(i<accounts.length) {
//			if(i==1) {
//				i++;
//				continue;
//			}
//		};
//		Question 17-14: In ra thông tin tất cả các account có id < 4__SAI
//		int i=0;
//		do {
//			System.out.println("Thông tin account thứ "+(i+1));
//			System.out.println("Email: "+accounts[i].email);
//			System.out.println("Full name: "+accounts[i].fullName);
//			System.out.println("phòng ban: "+accounts[i].department.name+"\n");
//			i++;
//		}while(i<accounts.length){
//			if(i>=3)
//				break;
//			}
//		}
//		In ra các số chẵn nhỏ hơn hoặc bằng 20
//		int i=2;
//		do {
//			System.out.println(i);
//			i=i+2;
//		}while(i<=20);	
//		+++++++++++++++++++EXERCISE 2 (OPTIONAL): SYSTEM OUT PRINTF+++++++++++++++++++++++++++++++++++++++++++
//		Question 1: 
//		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số 
//		nguyên đó
//		 System.out.printf("Integer : %d\n", 5);
//		Question 2: Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in 
//		ra số nguyên đó thành định dạng như sau: 100,000,000
//		System.out.printf(Locale.US, "%,d %n", 10000);
//		Question 3:Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf
//		để in ra số thực đó chỉ bao gồm 4 số đằng sau
//		System.out.printf("'%5.4f'%n",5.567098);
//		Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau:
//			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau: 
//			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.		
//	 	System.out.printf("%s\n%s", "Tên tôi là"  "và tôi đang độc thân.");------------------------sai
//		Question 5. Lấy thời gian bây giờ và in ra theo định dạng sau:24/04/2020 11h:16p:20s 
//		String pattern="yyyy-MM-dd HH:mm:ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date=simpleDateFormat.format(new Date());
//		System.out.println(date);
//		Question 6.In ra thông tin account (như Question 8 phần FOREACH) theo định dạng 
//		table (giống trong Database):n ra thông tin các account bao gồm: Email, FullName và tên phòng ban
		

	}
}
