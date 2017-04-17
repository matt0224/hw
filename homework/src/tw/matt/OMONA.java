package tw.matt;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;







public class OMONA extends JFrame{
	
	private JButton open, save, exit;
	private OMONAP myOMONAP;
	private Component JTA;
	
	OMONA(){
		 super("µøµ¡µ{¦¡"); 
		
			setLayout(new BorderLayout());
			
			open = new JButton("Open");
			save = new JButton("Save");
			exit = new JButton("Exit");
			myOMONAP=new OMONAP();
			
			JPanel top = new JPanel(new FlowLayout());
			top.add(open); top.add(save); top.add(exit);
			
		//	JFileChooser chooser = new JFileChooser();
			//chooser.showOpenDialog(open);
			add(top, BorderLayout.NORTH);
		
//			JTA = new  JTextArea() ; 
			add( new JTextArea(), BorderLayout.CENTER); 
//			JFileChooser chooser = new JFileChooser();
//			open.add(chooser);
			
			save.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
					chooser.showSaveDialog(save);
					myOMONAP.savefile();
					
				}
			});
			open.addActionListener(new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					//JFileChooser fc = new JFileChooser(JTA);
				
					JFileChooser chooser = new JFileChooser();
					
					//chooser.showOpenDialog(JTA); 
					//JTextArea JTA = new  JTextArea() ;
					
					
				}
			});
			
			setSize(640, 480);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
	}



	public static void main(String[] args) {
		 new OMONA();

	}

}
