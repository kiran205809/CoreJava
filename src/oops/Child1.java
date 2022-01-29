package oops;

public class Child1 extends Person1{
	
	String profession;
	
	
	public Child1() {
		
	}
	public Child1(String name,int age,String profession) {
		
		
		super(name, age);
		this.profession=profession;
	}
		public void print() {
			
			System.out.println("Inside child");
		}
	}


