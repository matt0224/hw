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
			        		 c="��";
			        	 }
			        	 if(a<8){
			        		 c="�d";
			        	 }
			        	 if(a<7){
			        		 c="��";
			        	 }
			        	 if(a<6){
			        		 c="�B";
			        	 }
			        	 if(a<5){
			        		 c="�U";
			        	 }
			        	 if(a<4){
			        		 c="�d";
			        	 }
			        	 if(a<3){
			        		 c="��";
			        	 }
			        	 if(a<2){
			        		 c="�B";
			        	 }
			        	 if(a<1){
			        		 c="��";
			        	 }
			        	 return c;
			         } 
			         static String  check(String a){
			        	a=a.replace('0', '�s'); 
			            a=a.replace('1', '��'); 
			        	a=a.replace('2', '�L');
			        	a=a.replace('3', '��');	
			        	a=a.replace('4', '�v');
			        	a=a.replace('5', '��');
			        	a=a.replace('6', '��');
			        	a=a.replace('7', '�m');
			        	a=a.replace('8', '�m');
			        	a=a.replace('9', '�h');
			        	 return a;
				}
}




