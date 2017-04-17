package tw.matt;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int week(int y, int m, int d){
		int C = y/100; int Y = (y%100); int M = m-2;
		if(m==1){
			Y=Y-1;M=11;
		}
		if(m==2){
			Y=Y-1;M=12;
		}
		int W =(d + (int)(2.6*M -0.2)+5*(Y%4)+3*Y+5*(C%4))%7; 
		return W;
}
}
