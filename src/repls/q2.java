package repls;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String c = "Hello i love java";
		  boolean var;
		  var = c.startsWith("hello");
		  System.out.println(var);
		  
		  
		  String obj = "I LIKE JAVA";
          System.out.println(obj.charAt(3));
          
          String str = "0123456789";
          System.out.println(str.substring(4));
          
          String str_Sample = "RockStar";
          System.out.println("EndsWith character 'r': " + str_Sample.endsWith("r"));
          
          System.out.println("==========Reverse Example========================");
          
          String a="Liam Martinez";
          
          for(int i=a.length()-1; i>=0; i--) {
        	  System.out.print(a.charAt(i));
        	  
        	  
   
        	
        	
        
          }
          
          //create a paramader
          System.out.println();
    	System.out.println("==================PARAMEDER EXAMPLE===================================") ; 
     	 String b="Word";
     	 String d="";
   
     	for (int j=b.length()-1; j>=0;j--) {
     		d+=b.charAt(j);
     		
     	}
     	if(b.equals(d)) {
     		System.out.println("true");
     	}else {
     		System.out.println("false");
     	}
     	
	}

}
