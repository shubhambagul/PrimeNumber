package Primenumber;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=7;
	 int count=0;  // boolean flag=true;
	System.out.println("prime number demo");
	   
	for(int i=2; i<n; i++) {
		if(n%i==0) {
		System.out.println("num is not prime");	
    	count++;	                                      //flag=false;
		break;
		}
		
	}
	
        if(count==0) {                                     	//if(flag==true) {
	System.out.println("is a prime num");
	//}
	}
       
	}
}
