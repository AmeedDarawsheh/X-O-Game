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
		private	Font XO = new Font("labelFont",Font.BOLD,20);
		private	JMenuBar menuBar;
		private JMenu DifficultyLevels,menuhelp,Preferences;
		private JMenuItem Hard,Easy,Medium;
		private String scorename;
		private int scoreAI = 0 ,scorePlaye = 0;
		private boolean isSelectX;
		private boolean AISelect;
		private boolean playerIN  ;	
		private	int choiseLevel = 3;
		private	Random l  = new  Random();
		char AICoice ;	
		
		private boolean editable [][] =new boolean[3][3];
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
			
			DifficultyLevels = new JMenu("Difficulty Levels");
			menuhelp = new JMenu("help");
			Preferences = new JMenu("Preferences");
			
			DifficultyLevels.add(Hard);
			DifficultyLevels.add(Medium);
			DifficultyLevels.add(Easy);

			menuBar.add(DifficultyLevels);
			menuBar.add(Preferences);
			menuBar.add(menuhelp);	
			setJMenuBar(menuBar);
			
			Hard.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					choiseLevel = 1;
				//	Start(1);
				}});
			Medium.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					choiseLevel = 2;
				//	Start(2);
				}});
			Easy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub	
					choiseLevel = 3;
				//	Start(3);
				}});		
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
			scoreNameField = new JTextField(""+scorePlaye,12);
			scodreAIField= new JTextField(""+scoreAI,12);	
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
			 		buttons[i][j].setFont(XO);
			 		buttons[i][j].setEnabled(false);
			 		editable[i][j]=true;
		 		}	
		 	}
		 	setVisible(true);
		}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hi Ameed");
		new TicTacToeGUI();
	}

	
	
	
	
	
	
	
	
	
	void Start(int x , char s) {
		AISelect = !isSelectX;
		if(AISelect == false ) {
			 AICoice = 'O';
		 }
		 if(AISelect == true ) {
			 AICoice = 'X';
		 }	
		 
		 
		 
		 if (x==1) {
			System.out.println("Hard");			
		 }
		 if (x==2) {
			 System.out.println("Med"); 
		 }
		 if (x==3) {
			 System.out.println(""+s);
		 }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 scorename = nameField.getText();
		if(e.getSource() == Play ) {	
			scoreName.setText("Player("+scorename+")");
			X.setEnabled(false);
			O.setEnabled(false);
			nameField.setEditable(false);
			Play.setEnabled(false);
			DifficultyLevels.setEnabled(false);
			playerIN = true ;
			for(int t = 0 ;t < 3 ; t++) {
				for(int y = 0 ;y < 3 ; y++) {
					//buttons[t][y].setText("");
					buttons[t][y].setEnabled(true);
				}								
			}			
		}	
		if(e.getSource() == Reset ) {			
			if( JOptionPane.showConfirmDialog(this, "Do you want to Reset the Game and start over?", "Reset Game", JOptionPane.OK_CANCEL_OPTION) == 0) {
				scoreNameField.setText("0");
				scodreAIField.setText("0");
				nameField.setText("");
				scoreName.setText("Player("+")");
				O.setSelected(false);
				X.setSelected(true);
				X.setEnabled(true);
				O.setEnabled(true);
				nameField.setEditable(true);
				Play.setEnabled(true);
				DifficultyLevels.setEnabled(true);
				scorePlaye= 0 ;
				scoreAI= 0 ;
				for(int o = 0 ;o < 3 ; o++) {
					for(int d = 0 ;d < 3 ; d++) {
						buttons[o][d].setText("");
						buttons[o][d].setEnabled(false);
						editable[o][d]=true;
					}
				}
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
	        	if(buttons[i][j].getText()== "" && editable[i][j]) {
		        	if(isSelectX==true) {
		        		buttons[i][j].setText("X");	
		        		Start(choiseLevel ,'O');
		        		editable[i][j]=false;
		        	}
		        	else if (isSelectX==false) {
		        		buttons[i][j].setText("O");
		        		Start(choiseLevel ,'X');
		        		editable[i][j]=false;
		        		}
	        	}
	        	
	        	if(!(editable[0][j]&&editable[0][j]&&editable[0][j]||
	        		 editable[1][j]&&editable[1][j]&&editable[1][j]||
	        		 editable[2][j]&&editable[2][j]&&editable[2][j])){
	        		if(buttons[i][j].getText()== "X" && isSelectX||buttons[i][j].getText()== "O" && !isSelectX ) {
	        			scorePlaye+=1;
	        			scoreNameField.setText(""+scorePlaye);
	        			}
	        		else {
	        			scoreAI+=1;
	    				scodreAIField.setText(""+scoreAI);
	        		}	        		
	        	}
	        	if(!(editable[i][0]&&editable[i][0]&&editable[i][0]||
	        		 editable[i][1]&&editable[i][1]&&editable[i][1]||
	        		 editable[i][2]&&editable[i][2]&&editable[i][2])) {
	        		if( buttons[i][j].getText()== "X" && isSelectX ||
	        			buttons[i][j].getText()== "O" && !isSelectX ) {
	        			scorePlaye+=1;
	        			scoreNameField.setText(""+scorePlaye);
	        			}
	        		else {
	        			scoreAI+=1;
	    				scodreAIField.setText(""+scoreAI);
	        		}
	        	}
	     // TODO fix it
	        	if(!(editable[0][0]&&editable[1][1]&&editable[2][2]||
		        	 editable[2][0]&&editable[1][1]&&editable[0][2])) {
		        		if( buttons[i][j].getText()== "X" && isSelectX ||
		        			buttons[i][j].getText()== "O" && !isSelectX ) {
		        			scorePlaye+=1;
		        			scoreNameField.setText(""+scorePlaye);
		        			}
		        		else {
		        			scoreAI+=1;
		    				scodreAIField.setText(""+scoreAI);
		        		}
		        	}
	        }
	}
}



















// win
/*if ((board[0] + board[1] + board[2] == (whoseTurnItIs * 3)) // first row 
   || (board[3] + board[4] + board[5] == (whoseTurnItIs * 3)) // second row
   || (board[6] + board[7] + board[8] == (whoseTurnItIs * 3)) // third row
   || (board[0] + board[3] + board[6] == (whoseTurnItIs * 3)) // first column
   || (board[1] + board[4] + board[7] == (whoseTurnItIs * 3)) // second column
   || (board[2] + board[5] + board[8] == (whoseTurnItIs * 3)) // third column
   || (board[0] + board[4] + board[8] == (whoseTurnItIs * 3)) // first diagonal
   || (board[2] + board[4] + board[6] == (whoseTurnItIs * 3)) // second diagonal
) 
{
  printTheBoard(board);
  System.out.println("You won!!! Congratulations!");
  break;
} else {
  numberOfSquaresPlayed++;
  whoseTurnItIs = (whoseTurnItIs == 'x') ? 'o' : 'x';
} */
