package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1= new Employee();
		emp1.name="kiran";
		emp1.EmployeeID= 2280;
		emp1.salary=10000;
		
		System.out.println(emp1.name);
		
		emp1.PrintName();
		
		Person per=new Person();
		per.display();
		
		Child chi= new Child();
		chi.display();
		chi.print();
		
		Child1 chil=new Child1("kiran",18,"actor" );
		
		
		OverloadingExample obj= new OverloadingExample();
		obj.sum(10, 20);
		obj.sum(1, 2, 5);
		
		
		ICICBank bank= new ICICBank();
		
		bank.creditcard();
		bank.welcome();
		
		
		
		EncapsulationExample Obj=new EncapsulationExample();
		Obj.setCompany("Sun");
		Obj.getCompany();
		System.out.println(Obj.getCompany());
		
		
		
		
		
		
		
		
		
	
		

	}

}
