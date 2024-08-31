import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
@SuppressWarnings("serial")
public class TicTacToeGUI extends JFrame implements ActionListener{
	//	private final  int x =1280,y=720 ;
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
		//private boolean playerIN  ;	
		private	int choiseLevel = 3,moveCount=0;
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
			
			Hard.addActionListener(e -> choiseLevel  = 1 );
			Medium.addActionListener(e -> choiseLevel  = 2 );
			Easy.addActionListener(e -> choiseLevel  = 3 );	
			
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
			O.addItemListener( e -> isSelectX = false );
			
			X = new JRadioButton("X");
			X.addItemListener( e -> isSelectX = true);
			
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
			 		buttons[i][j].setBackground(Color.white);
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
		new TicTacToeGUI();
	}	
	void resetgame() {
		moveCount=0;
		for (int q = 0; q < 3; q++)
		      for (int q1 = 0; q1 < 3; q1++) {
		    	editable[q][q1] = true;
		    	buttons[q][q1].setText(""); 
		    	buttons[q][q1].setEnabled(true);
		    	buttons[q][q1].setBackground(Color.white);
		   }
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
			int xrandx,yrandy;
			do{
			xrandx=l.nextInt(3);
			yrandy=l.nextInt(3);				
			}while(!editable[xrandx][yrandy]);			 
			buttons[xrandx][yrandy].setText("" +s);
            editable[xrandx][yrandy] = false;
            moveCount++;			 	 
		 }		
	}
	boolean checkWin(char player){
	for(int  i = 0 ; i < 3 ; i ++ ){
		 if ((buttons[i][0].getText().equals("" + player)) &&
		     (buttons[i][1].getText().equals("" + player)) &&
		     (buttons[i][2].getText().equals("" + player)) ||
		     (buttons[0][i].getText().equals("" + player)) &&
		     (buttons[1][i].getText().equals("" + player)) &&
		     (buttons[2][i].getText().equals("" + player))
				 ){
			 if(buttons[i][0].getText().equals("" + player)) {
				 buttons[i][0].setBackground(Color.green);
				 buttons[i][1].setBackground(Color.green);
				 buttons[i][2].setBackground(Color.green);
			 }
			 else if((buttons[0][i].getText().equals("" + player))) { 
			buttons[0][i].setBackground(Color.green);
			buttons[1][i].setBackground(Color.green);
			buttons[2][i].setBackground(Color.green);}
			 return true ;}
	}
		 if ((buttons[0][0].getText().equals("" +player)) &&
		     (buttons[1][1].getText().equals("" +player)) &&
		     (buttons[2][2].getText().equals("" +player)) ||
		     (buttons[2][0].getText().equals("" +player)) &&
		     (buttons[1][1].getText().equals("" +player)) &&
		     (buttons[0][2].getText().equals("" +player))
				){
			 if((buttons[0][0].getText().equals("" +player))) {
				 buttons[0][0].setBackground(Color.green);
				 buttons[1][1].setBackground(Color.green);
				 buttons[2][2].setBackground(Color.green);
			 }
			 else if(buttons[2][0].getText().equals(""+player)) {
				 buttons[2][0].setBackground(Color.green);
				 buttons[1][1].setBackground(Color.green);
				 buttons[0][2].setBackground(Color.green);
			 }
			 return true ;
			 }
		return false ;
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
			for(int t = 0 ;t < 3 ; t++) {
				for(int y = 0 ;y < 3 ; y++) {
					//buttons[t][y].setText("");
					buttons[t][y].setEnabled(true);
				}								
			}
			return;
		}	
		else if(e.getSource() == Reset ) {		
			if( JOptionPane.showConfirmDialog(this, "Do you want to Reset the Game and start over?", "Reset Game", JOptionPane.OK_CANCEL_OPTION) == 0) {
				resetgame();
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
				for (int q = 0; q < 3; q++)
				      for (int q1 = 0; q1 < 3; q1++) {
				    	buttons[q][q1].setEnabled(false);
				   }				
			}
			return;
		}
		else if(e.getSource() == Quit ){		
			if( JOptionPane.showConfirmDialog(this, "Do you want to quit the game and lose your progress?", "Exit Game", JOptionPane.OK_CANCEL_OPTION) == 0) {
				System.exit(0);
			}
			return;
		}
	else {
	    for (int i = 0; i < 3; i++) {
	      for (int j = 0; j < 3; j++) {
	        if (buttons[i][j] == e.getSource() && editable[i][j])
	        { 	buttons[i][j].setText(isSelectX ? "X" : "O");
                        editable[i][j] = false;
                        moveCount++;
	        	       			
                        if(checkWin(isSelectX ? 'X' : 'O')) {
                        	scorePlaye++;
                            JOptionPane.showMessageDialog(null, nameField.getText()+" wins!");
                            scoreNameField.setText("" + scorePlaye);
                            resetgame();
                            return;
	        		}
	        			if (moveCount == 9) {
                            JOptionPane.showMessageDialog(null, "NO One Win !");
                            resetgame();
                            return;
                        }
	        			Start(choiseLevel, AICoice);
                        if (checkWin(AICoice)) {
                            scoreAI++;
                            JOptionPane.showMessageDialog(null, "AI wins!");
                            scodreAIField.setText("" + scoreAI);
                            resetgame();
                            return;
                        }
                        if (moveCount == 9) {
                            JOptionPane.showMessageDialog(null, "NO One Win !");
                            resetgame();
                            return;
                        } 
					}
				}
			}
	    }
	}
}
