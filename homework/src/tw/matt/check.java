package tw.matt;

import java.util.Scanner;

public class check {
 
		public static void main(String[] args) { 
		 String[] ary = {"零", "壹", "貳", "參", "肆", "伍", "陸", "柒", "捌", "玖"}; 
		 
		 Scanner scan = new Scanner(System.in); 
		 System.out.print("請輸入支票金額: "); 
		 String s1 = scan.next(); 
		 String s2 = ""; 
		 

		 // 迴圈中會從 s1 中讀取每個數字, 對應到 ary 中的國字 
		// 再加到 s2 中 
		for (int i = 0; i < s1.length(); i++) { 
		 int x = Integer.parseInt(s1.substring(i, i+1)); 
		 s2 += ary[x]; 
		 } 
		
		 System.out.println("OUTPUT: " + s2); 
		
			 
		 }
		 static int check (int a){
			 int b=0;  
			 if(a>10){
				   a/=10;
				   b++;
			 } 
			  return b;
		 }
		 
			static int digit(int a){
				int b=0;
				while(a>=10){
					a /= 10;
					b++;
				}
				return b;
			}
		 } 
		 
