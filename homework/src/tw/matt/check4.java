package tw.matt;

public class check4 {			
	              public static void main(String[] args) {		
						 int s2;
						 String n2="";
						 String s3="01223";
						 String s4=check(s3);
						 StringBuffer convert = new StringBuffer();
						 for(int i=0;i<s4.length();i++)
						 {
						 convert =convert.append(s4.charAt(i));
					
					 }
						 String line = convert.toString();
						  		
						 		char [] chs = line.toCharArray(); 					 
						 		String result = "";			 
						 		for(int x=chs.length-1;x>=0;x--){
						 			s2=x;
									 n2= check2(s2);
						 		result += 	n2; 
						 		
						 		} 
						 		for(int i=0 ; i<convert.length();i++){
						 		 System.out.print(convert.substring(i, i+1));
						 		System.out.print(result.substring(i, i+1));	 
						 		}
                            
					}
			     
			         static String  check2(int a){
			        	 String  c="";
			        	 
			        	 if(a<9){
			        		 c="億";
			        	 }
			        	 if(a<8){
			        		 c="千";
			        	 }
			        	 if(a<7){
			        		 c="百";
			        	 }
			        	 if(a<6){
			        		 c="拾";
			        	 }
			        	 if(a<5){
			        		 c="萬";
			        	 }
			        	 if(a<4){
			        		 c="千";
			        	 }
			        	 if(a<3){
			        		 c="百";
			        	 }
			        	 if(a<2){
			        		 c="拾";
			        	 }
			        	 if(a<1){
			        		 c="元";
			        	 }
			        	 return c;
			         } 
			         static String  check(String a){
			        	a=a.replace('0', '零'); 
			            a=a.replace('1', '壹'); 
			        	a=a.replace('2', '貳');
			        	a=a.replace('3', '參');	
			        	a=a.replace('4', '肆');
			        	a=a.replace('5', '伍');
			        	a=a.replace('6', '陸');
			        	a=a.replace('7', '柒');
			        	a=a.replace('8', '柒');
			        	a=a.replace('9', '玖');
			        	 return a;
				}
}




