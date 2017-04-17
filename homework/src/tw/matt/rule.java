package tw.matt;

public class rule {
	static boolean checkPhoneNumber(String number){
		if(number.matches("^(([2][0-4][0-9]|[2][5][0-5]|[01]?[0-9]?[0-9])[.]){3}([2][0-4][\\d]|[2][5][0-5]|[01]?[\\d][\\d]?)$")){ 
			 			return true; 
		}
          return false;
		
	}
	
       	
	
	

	public static void main(String[] args) {
		// String id = "A123456789";
		 System.out.println(checkPhoneNumber("100.10.100.100")); 
	
   }
}
