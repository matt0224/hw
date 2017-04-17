package tw.matt;

import java.util.Scanner;

public class check3 {

	public static void main(String[] args) {
        
		
         String[] decimal = {"","¶ê","¬B","¨Õ","¥a","¸U","¬B","¨Õ","¥a","»õ","¬B","¨Õ","¥a"
				    ,"¥ü","¬B","¨Õ","¥a"};
		 Scanner scan = new Scanner(System.in); 
		 //System.out.print("½Ð¿é¤J¤ä²¼ª÷ÃB: "); 
		// String s1 = scan.next(); 
		 String dec="";
		 String dec2="";
		 int s2 = 16; 
		// int money=Integer.parseInt(s2);		 
	          
		 String s4=Integer.toString(s2);
		
		 int b=check(s2);
		 int c=check2(s2);
		 System.out.println(b);
		 String s3=Integer.toString(b);
		 for (int i = 0; i < s3.length(); i++) { 
			 int x = Integer.parseInt(s3.substring(i, i+1));
			 int x2 = Integer.parseInt(s3.substring(i, i+1));
			 dec += decimal[x]; 
			 dec2 += decimal[x2];
			 System.out.println(""+ dec+dec2); 
			 } 
		 
		 String result=unit(s4);
		 
		 System.out.println(""+result+dec);
		 	
		
		
//		 }
         System.out.println(s2);
      //   System.out.println(s3);
         System.out.println(b);
        System.out.println("---------");
     
		 }
	
	
 static int check (int a){
	 check2(a);	
	 int b=0;  
  
	 while(a>10  ){
		  a/=10;
			   b++;
	 } 
	  return b+1;
	}
 
      static String unit (String s4){
    	    String result="";
  
		switch(s4){
			case "1": 
				System.out.println("³ü");
				result="³ü";
				break;
			case "2": 
				System.out.println("¶L");
				result="¶L";
				break;
			case "3": 
				System.out.println("°Ñ");
				result="°Ñ";
				break;
			case "4": 
				System.out.println("¸v");
				result="¸v";
				break;
			case "5": 
				System.out.println("¥î");
				result="¥î";
				break;
			case "6": 
				System.out.println("³°");
				result="³°";
				break;
			case "7": 
				System.out.println("¬m");
				result="¬m";
				break;
			case "8": 
				System.out.println("®Ã");
				result="®Ã";
				break;
			case "9": 
				System.out.println("¨h");
				result="¨h";
				break;	
		}     	  
			  return result;  
      } 
			  static int check2 (int a){
					 int c=0;  
			  
				 while(a>10  ){
					  a=a&10;
						   c++;
				 } 
				  return c;  
	
		  

      }

}

