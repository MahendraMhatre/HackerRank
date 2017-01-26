import java.util.Stack;

public class Parantheses {

	
	public static String[] para(String [] values) {
		
		int n= values.length;
		int x,count=0;
		String[] str = new String[n];
		
		for(int i=0;i<n;i++) {
			char c[] = values[i].toCharArray();
			x=check(c);
			if(x==1) 
				str[count++] = "YES";
			else
				str[count++] = "NO";
			
		}
		
		return str;
	}
	
	public static int check(char []values) {
		
		Stack<Character> s = new Stack();
		char c;
		for(int i=0; i< values.length;i++) {
			if(values[i]=='(' || values[i]=='{'|| values[i]=='[')
				s.push(values[i]);
			else 
			{
				if(!s.isEmpty()) {
					 c= s.pop();
				
				
					switch(values[i]) {
						case ')':
							if(c=='(') {}
							else {
								return 0;
							}
							break;
						case ']':
							if(c=='[') {}
							else {
								return 0;
							}
							break;
						case '}':
							if(c=='{') {}
							else {
								return 0;
							}	
							break;
				 
				
					}
				
				}	//if
				else {
					return 0;
				}
				
			} // else
			
		} // for
		
		if(s.empty()) {
			return 1;
		} else {
			return 0;
		}
		
	
	}
	
	public static void main(String[] args) {
		
	   String values[] = {"()[]{}", "{{[(]}}", ")", "(","{[()]}"};
	   String val[] ;
	   
	  val=para(values);
	   for(int i=0; i< val.length; i++) {
		   System.out.println(val[i]);
	   }
	   
	
	}

}
