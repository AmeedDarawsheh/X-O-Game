# TicTacToeGUI
# Abstract
TicTacToeGUI is a Java-based graphical Tic-Tac-Toe game developed using the Swing framework. The game allows a single player to compete against an AI opponent with selectable difficulty levels (Easy, Medium, and Hard). Users can choose to play as either 'X' or 'O', track scores, and restart or quit the game at any time. The AI opponent logic adapts based on difficulty, providing a balanced challenge for the player. The game’s intuitive graphical interface makes it easy and enjoyable for users of all ages.

# Features
* Single-player mode against AI with configurable difficulty levels.
* Score tracking for both player and AI.
* User interface with easy-to-navigate buttons and labels.
* Reset and Quit options to restart or exit the game.
* Win detection and highlighting, marking winning cells with a green color.

# Usage
* Launch the game by running java TicTacToeGUI.
* Enter a player name in the text field on the right.
* Select your symbol (X or O) and click "Play" to start.
* Choose a difficulty level from the "Difficulty Levels" menu (Easy, Medium, Hard).
* Make your move by clicking a grid cell; the AI will respond with its move.
* Winning: The game detects and announces the winner, updating the score and highlighting the winning cells.
* Reset: Use "Reset" to clear the board and reset scores.
* Quit: Exit the game using the "Quit" button or the "X" button on the window.
#Code Structure
* Main Game Panel: Divided into sections to display the game grid, player options, and scores.
* AI Logic: Built into the Start() method, with difficulty modes that affect the AI’s move decision-making.
* Event Handling: Button clicks are managed with an ActionListener, responding to grid cell clicks, game reset, and quitting.
# Contributing
 Contributions are welcome! Please fork this repository and open a pull request with a detailed explanation of your changes.
