package assignment1;

import java.util.Date;

public class Program {
	public static void main(String[] args) {
		Department department1=new Department();
		department1.id=1;
		department1.name="sale";
		
		Department department2=new Department();
		department2.id=2;
		department2.name="marketting";
		
		Department department3=new Department();
		department2.id=3;
		department2.name="bao ve";
		
		/*Position position1=new Position();
		position1.id=1;
		position1.name= "DEV";
		
		Position position2 = new Position();
		position2.id=2;
		position2.name="TEST";*/
		
		Position position3 = new Position();
		position3.id=3;
		position3.name=PositionName.DEV;
		
		Account account1=new Account();
		account1.id=1;
		account1.email="abcgmail.com";
		account1.userName="van a";
		account1.fullName="nguyen van a";
		account1.department=department2;
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
				
		GroupAccount[] groupAccounts= {groupAccount1,groupAccount2};
		account1.groups=groupAccounts;
		
		Exam exam1 =new Exam();
		exam1.id=1;
		exam1.categoryID="thi java";
		
//		
//		System.out.println(group3.id);
//		System.out.println("account 1: "+account1.fullName);
//		in ra so le <100		
//		for(int i=1;i<100;i=i+2) {
//			System.out.println(i);
//		}
//	
		
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//		Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//		Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//		Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//		Còn lại in ra "Nhóm có nhiều thành viên"
		int a = group1.accounts.length;
		switch (a) {
		case 1:
		System.out.println("nhom co 1 thanh vien");
			break;
		case 2:
		System.out.println("nhom co 2 thanh vien");
		break;
		}
//	
//	
//	Account[] accounts= {account1,account2};
//	for(Account account : accounts) {
//		System.out.println(account.fullName);}
//	
//	for (int i = 0; i < accounts.length; i++) {
//		System.out.println("Thông tin account thứ " + (i + 1) + " là :");
//		System.out.println("Email: " + accounts[i].email);
//		System.out.println("Fullname: " + accounts[i].fullName);
//		System.out.println("Department: " + accounts[i].department.name);
//	}		
	}
}
