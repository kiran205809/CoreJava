package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reversal of string
		
		String str1= "Clean india green india";
		String revstr1= "";
		for(int index=str1.length()-1;index>=0;index--) {
			revstr1 = revstr1+str1.charAt(index);
		}
System.out.println("reversal of string " + revstr1);
	}

}
