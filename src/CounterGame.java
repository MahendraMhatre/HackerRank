import java.util.Scanner;

public class CounterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt(),count = 0,turn = 0;
	       long  n = 0, x =0 ;

	       for(int i = 0; i < t ; i++) {
	           n =  sc.nextLong();
             turn = 0;
	           while(n>=1) {
	        	 
	        	   if( (n & (n-1)) == 0 ) {
	                 n = n>>1; 
                   
	                turn++;
	                
	            }
	            else {
                       x = n;
	                     count = 0;
	                     while(x >= 1) {
	                       x = x >> 1;
	                       count++;  
	                     }
	                     x = 1 << (count-1);
	                     n = n&x;
	                   turn++;  
	            }
                     
	          }  // while   
             if((turn-1)%2 == 0)
                 System.out.println("Louise");
              else
                  System.out.println("Richard");
                  
             
	       } //for
	       //6703734870638684097
	}

}
