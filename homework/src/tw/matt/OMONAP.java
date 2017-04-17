package tw.matt;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;


public class OMONAP extends JPanel{
	
	public OMONAP(){

		setBackground(Color.DARK_GRAY);
	    addMouseListener(new MyMouseAdapter01());
	}
	     public void savefile() { 
		   System.out.println("save"); //測試方法有無跑到這邊
			repaint(); //
			} 

	class MyMouseAdapter01 extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
		}
			// TODO Auto-generated constructor stub
		}
		
	}

