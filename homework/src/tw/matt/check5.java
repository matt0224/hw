package tw.matt;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class check5 {

	public static void main(String[] args) {
		int a=100000;
		check2(a);

	}
     static void check1 (int a){
    	 if(a>1000){
    		 thousand(a) ;
    	 }
     }	 
   	  static void check2 (int a){
	    		 chinese(a) ;
	    		 System.out.println("111");
         }
     
     static void thousand (int a){
    	 System.out.println("¤d");
     }
    
		static void chinese (int a){
			 System.out.println("³ü");
}
}		
