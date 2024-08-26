import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
public class TicTacToeGUI extends JFrame implements ActionListener{
		private final  int x =1280,y=720 ;
		private final  int x1 =600,y1=400 ;
		private JButton buttons [][] =new JButton[3][3];
		private	JPanel A,B,C,c1,c2,c3,c4,c5,c6;
		private JLabel GameName,Name, select,score,scoreName,AIscore;
		private JTextField nameField,scoreNameField,scodreAIField;
		private JRadioButton X,O;
		private ButtonGroup group;
		private JButton Play,Reset,Quit;
		private	Font labelFont = new Font("labelFont",Font.BOLD+Font.ITALIC,40);
		private	Font Fonts = new Font("labelFont",Font.BOLD,13);
		private	Font ScoreFont = new Font("labelFont",Font.BOLD,15);
		private	JMenuBar menuBar;
		private JMenu menuFile,menuhelp,menuEdit;
		private JMenuItem Hard,Easy,Medium;
		private String scorename;
		private boolean isSelectX = false ;
		public TicTacToeGUI() {	
			super("Tic-Tac-Toe");
		 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	setSize(x1,y1);
		 	setMinimumSize(getSize());
		 	setResizable(false); 	
		 	setLocationRelativeTo(null);
		 	//Bar
		 	menuBar= new JMenuBar();
			Hard = new  JMenuItem("Hard");
			Easy = new  JMenuItem("Easy");
			Medium = new  JMenuItem("Medium");
			
			menuFile = new JMenu("Difficulty Levels");
			menuhelp = new JMenu("help");
			menuEdit = new JMenu("Preferences");
			
			menuFile.add(Hard);
			menuFile.add(Medium);
			menuFile.add(Easy);

			menuBar.add(menuFile);
			menuBar.add(menuEdit);
			menuBar.add(menuhelp);	
			setJMenuBar(menuBar);
		 	A = new JPanel();
			B = new JPanel(new GridLayout(3,3));
			C = new JPanel(new GridLayout(6,1));
			c1= new JPanel();
			c2= new JPanel();
			c3= new JPanel();
			c4= new JPanel();
			c5= new JPanel();
			c6= new JPanel();
			
			c1.setLayout(new FlowLayout());
			c2.setLayout(new FlowLayout());
			c3.setLayout(new FlowLayout());
			c4.setLayout(new FlowLayout());
			c5.setLayout(new FlowLayout());
			c6.setLayout(new FlowLayout());
			
			O = new JRadioButton("O");
			O.addItemListener( new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					isSelectX= false ;
				}} );
			
			X = new JRadioButton("X");
			X.addItemListener( new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					isSelectX= true ;
				}} );
			
			group = new ButtonGroup();
			group.add(O);group.add(X);
			
			Play = new JButton("Play");
			Reset = new JButton("Reset");
			Quit = new JButton("Quit");
			Play.addActionListener(this);
			Reset.addActionListener(this);
			Quit.addActionListener(this);
			C.add(c1);C.add(c2);C.add(c3);C.add(c4);C.add(c5);C.add(c6);
			scorename = "Null";
			Name = new JLabel("Player Name: ");
			select = new JLabel("Select:");
			score = new JLabel("Score");
			
			nameField = new JTextField(15);
			nameField.setFont(ScoreFont);

			scoreName = new JLabel("Player("+scorename+")");
			AIscore = new JLabel("Computer:           ");
			GameName = new JLabel("X-O Game");
	
			Name.setFont(Fonts);
			select.setFont(Fonts);
			score.setFont(ScoreFont);
			scoreName.setFont(Fonts);
			AIscore.setFont(Fonts);	
			GameName.setFont(labelFont);
			
			nameField = new JTextField(15);
			nameField.setFont(ScoreFont);
			scoreNameField = new JTextField("0",12);
			scodreAIField= new JTextField("0",12);	
			scodreAIField.setFont(ScoreFont);
			scoreNameField.setFont(ScoreFont);
			scodreAIField.setEditable(false);
			scoreNameField.setEditable(false);
			
			A.add(GameName);
			c1.add(Name);
			c1.add(nameField);
			c2.add(select);
			c2.add(X);
			c2.add(O);
			c3.add(Play);
			c3.add(Reset);
			c3.add(Quit);
			c4.add(score);
			c5.add(scoreName);
			c5.add(scoreNameField);
			c6.add(AIscore);	
			c6.add(scodreAIField);	
			
			add(A,BorderLayout.NORTH);
			add(B,BorderLayout.CENTER);
			add(C,BorderLayout.EAST);
	
		 	for(int i = 0 ; i< 3 ; i++) {
		 		for(int j = 0 ; j< 3 ; j++) {
		 			buttons[i][j]=new JButton("");		 			
			 		B.add(buttons[i][j]);	
			 	//	buttons[i][j].setBackground(Color.decode("#222023"));
			 		buttons[i][j].addActionListener(this);
		 		}	
		 	}
		 	setVisible(true);
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi Ameed");
		new TicTacToeGUI();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 scorename = nameField.getText();
		if(e.getSource() == Play ) {	
			scoreName.setText("Player("+scorename+")");
			}	
		if(e.getSource() == Reset ) {			
			if( JOptionPane.showConfirmDialog(this, "Do you want to Reset the Game and start over?", "Reset Game", JOptionPane.OK_CANCEL_OPTION) == 0) {
				scoreNameField.setText("0");
				scodreAIField.setText("0");
				nameField.setText("");
				scoreName.setText("Player("+")");
				O.setSelected(false);
				X.setSelected(true);
			}
		}
		if(e.getSource() == Quit ){		
			if( JOptionPane.showConfirmDialog(this, "Do you want to quit the game and lose your progress?", "Exit Game", JOptionPane.OK_CANCEL_OPTION) == 0) {
				System.exit(0);
			}	
		}
	    for (int i = 0; i < 3; i++)
	      for (int j = 0; j < 3; j++)
	        if (buttons[i][j] == e.getSource())
	        {
	        	if(buttons[i][j].getText()== "") {
		        	if(isSelectX==true) {
		        	buttons[i][j].setText("X");		        	
		        	}
		        	else buttons[i][j].setText("O");
	        	}
	        }
	}
}