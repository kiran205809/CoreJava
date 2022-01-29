package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//While loop is the simplest one
		
		int num1=1;
		
		while(num1<=10) {
			System.out.println(num1);
			num1=num1+1;
			
		}
		
		//for loop
		for(int count=1;count<=10;count++) {
			//System.out.println("For loop "+count);
			
			
			// Tp to skip the no
			if(count==5) {
				continue;
			}
		System.out.println(count);
		}
		//For loop to print 10 to 1
		for(int num=10;num>=1;num--) {
			System.out .println(num);
		}
		//Array for loop
		int[] num= {20,30,40,50};
		for(int index=0;index<num.length;index++) {
			System.out.println(num[index]);
			
		}

	}

}
