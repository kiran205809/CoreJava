package test;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
      int num=13;
      boolean flag=true;
      for(int index=2;index<num;index++) {
    	  int remainder=num/index;
    	  if(remainder==0) {
    		 
			flag =false;
    		  break;
    		  
    	  }
      }
      if(flag==true) {
    	  System.out.println("No is prime");
      }else {
    	  System.out.println("No is not prime");
      }
	}

}
