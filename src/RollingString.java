import java.util.ArrayList;
import java.util.Iterator;

public class RollingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num[] = {1,2,3,4},sum = 0, count = 0;
		ArrayList<Integer> al = new ArrayList<>();
        int i= 0;
        for( i =0 ; i < num.length; i++) {
            
                al.add(num[i]);
            	
        }

        i = 0;        
        while(i+1 < al.size()) {
        	
        	sum = al.get(i) + al.get(i+1);
        	al.add(sum);
        	count = count + sum;
        	i = i + 2;
        	System.out.println(sum);
     
       
        }
        
     
       System.out.println(count);
        
       
       
   

	}

}
