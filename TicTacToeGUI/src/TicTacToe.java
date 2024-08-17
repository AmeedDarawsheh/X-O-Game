import javax.swing.*;
import java.awt.*;
import java.util.*;

@SuppressWarnings("serial")
public class TicTacToe extends JFrame{

		final  int x =1280,y=720 ;
		private JButton buttons [][] =new JButton[3][3];
	//	private JButton buttonss [][] =new JButton[3][3];
		
		
		JLabel namel,playerscorel,computerscorel;
		

		
		JPanel l1 ;
		 JPanel l2  ;
		 JPanel l3  ;
		 JPanel l4  ;
		 JPanel l5  ;
		 JPanel l6  ;
			
		
		JLabel label ;
		JPanel A ;
	 	JPanel B ;
	 	JPanel C ;
	 	JTextField name ;
	 	JTextField playerscore;
	 	JTextField computerscore; 	
	 	JButton play ;
	 	JButton reset;
	 	JButton Quit ;	
	 	JRadioButton xg ;
	 	JRadioButton o ;
	 	ButtonGroup group ;
	 	JPanel inner ;
	 	Font labelFont = new Font("labelFont",Font.BOLD+Font.ITALIC,40);		
		public TicTacToe() {	
			super("Tic-Tac-Toe");
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	setVisible(true);
		 	setSize(x,y);
		 	setMinimumSize(getSize());
// 	JFrame c;
		 	setResizable(false); 		
			//setLayout(new FlowLayout());
			 label = new JLabel ("XO-Game");
			 label.setFont(labelFont);
			 A = new JPanel () ;		
			 A.add(label);
			 B = new JPanel () ;
			 C = new JPanel () ;
			 inner = new JPanel();
			 B.setLayout(new GridLayout(3,3));
			 
			 
			 
			 
			  l1 = new JPanel () ;
			  l2 = new JPanel () ;
			  l3 = new JPanel () ;
			  l4 = new JPanel () ;
			  l5 = new JPanel () ;
			  l6 = new JPanel () ;
	 
			 namel = new JLabel("Name");
			 playerscorel = new JLabel("playerscore");
			 computerscorel = new JLabel("computerscore");
			 name = new JTextField(15);
			 playerscore = new JTextField(15);
			 computerscore = new JTextField(15);
			 l1.add(namel);
			 l1.add(name);
			 l5.add(playerscorel);
			 l5.add(playerscore);
			 l6.add(computerscorel);
			 l6.add(computerscore);
 
			 play = new JButton ("play");
			 reset = new JButton ("reset");
			 Quit = new JButton ("Quit");
			 l3.setLayout(new GridLayout(1,3));
			 l3.add(play);
			 l3.add(reset);
			 l3.add(Quit);
			 C.add(l1);
			 C.add(l3);
			 C.add(l5);
			 C.add(l6);
			 
			 
//			 
//			 
//			namel = new JLabel("Name");
//			playerscorel = new JLabel("playerscore");
//			computerscorel = new JLabel("computerscore");
//		 	
//		 	name = new JTextField(15);
//		 	playerscore = new JTextField(15);
//		 	playerscore.setEditable(false);
//		 	computerscore = new JTextField(15);
//		 	computerscore.setEditable(false);
//		 	
//		 	
//		 	namep = new JPanel () ;
//		 	namep.add(namel);
//		 	namep.add(name);
//		 	playerscorep = new JPanel () ;
//		 	playerscorep.add(playerscorel);
//		 	playerscorep.add(playerscore);
//		 	computerscorep = new JPanel () ;
//		 	computerscorep.add(computerscorel);
//		 	computerscorep.add(computerscore);
//		 	
		 	
//		 	play = new JButton ("play");
//		 	reset = new JButton ("reset");
//		 	Quit = new JButton ("Quit");	
//		 	inner.setLayout(new GridLayout(1,3));
//		 	inner.add(play);
//		 	inner.add(reset);
//		 	inner.add(Quit);
		 	//C.add(inner);
		 	//C.setLayout(new FlowLayout());
//		 	xg = new  JRadioButton("x");
//		 	o = new  JRadioButton("o");
//		 	group = new ButtonGroup();
//		 	group.add(xg);
//		 	group.add(o);		 	
//		 	C.add(namep);
//		 	C.add(xg);
//		 	C.add(o);
//		 	C.add(play);
//		 	C.add(reset);
//		 	C.add(Quit);
//		 	C.add(playerscorep);
//		 	C.add(computerscorep);	
			
		 	
		 	
		 	add(A,BorderLayout.NORTH);
			add(B,BorderLayout.CENTER);
			add(C,BorderLayout.EAST);
			
		 	for(int i = 0 ; i< 3 ; i++) {
		 		for(int j = 0 ; j< 3 ; j++) {
		 			buttons[i][j]=new JButton("1");		 			
			 		B.add(buttons[i][j]);			 					 		
			 	}	
		 	}
	 	
		}
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi Ameed");
		new TicTacToe();
	}
}
