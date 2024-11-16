![Screenshot 2024-11-16 201233](https://github.com/user-attachments/assets/db81e0ff-c1f7-44ee-8791-325ab4a5aef1)

![Screenshot 2024-11-16 201028](https://github.com/user-attachments/assets/be293162-a7b6-4a1f-ae26-e254fdd7be8e)

![Screenshot 2024-11-16 200226](https://github.com/user-attachments/assets/dcba889a-1273-496f-9ac6-485f5eadd38f)

![Screenshot 2024-11-16 200141](https://github.com/user-attachments/assets/d87614ea-34f7-4b75-b885-2c40dc7e14fd)


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
