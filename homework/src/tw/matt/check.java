package tw.matt;

import java.util.Scanner;

public class check {
 
		public static void main(String[] args) { 
		 String[] ary = {"�s", "��", "�L", "��", "�v", "��", "��", "�m", "��", "�h"}; 
		 
		 Scanner scan = new Scanner(System.in); 
		 System.out.print("�п�J�䲼���B: "); 
		 String s1 = scan.next(); 
		 String s2 = ""; 
		 

		 // �j�餤�|�q s1 ��Ū���C�ӼƦr, ������ ary ������r 
		// �A�[�� s2 �� 
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
		 
