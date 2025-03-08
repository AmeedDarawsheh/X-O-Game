# TicTacToeGUI

TicTacToeGUI is a Java-based graphical Tic-Tac-Toe game developed using the Swing framework. The game allows a single player to compete against an AI opponent with selectable difficulty levels. It offers an intuitive interface, allowing players to track scores and enjoy a seamless gaming experience.

## Table of Contents
- [Features](#features)
- [Screenshots](#screenshots)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Features
- Single-player mode against AI with configurable difficulty levels.
- Score tracking for both player and AI.
- User interface with easy-to-navigate buttons and labels.
- Reset and Quit options to restart or exit the game.
- Win detection and highlighting, marking winning cells with a green color.

## Screenshots
![Screenshot 1](https://github.com/user-attachments/assets/db81e0ff-c1f7-44ee-8791-325ab4a5aef1)
![Screenshot 2](https://github.com/user-attachments/assets/be293162-a7b6-4a1f-ae26-e254fdd7be8e)
![Screenshot 3](https://github.com/user-attachments/assets/dcba889a-1273-496f-9ac6-485f5eadd38f)
![Screenshot 4](https://github.com/user-attachments/assets/d87614ea-34f7-4b75-b885-2c40dc7e14fd)

## Usage
1. Launch the game by running `java TicTacToeGUI`.
2. Enter a player name in the text field on the right.
3. Select your symbol (X or O) and click "Play" to start.
4. Choose a difficulty level from the "Difficulty Levels" menu (Easy, Medium, Hard).
5. Make your move by clicking a grid cell; the AI will respond with its move.
6. Winning: The game detects and announces the winner, updating the score and highlighting the winning cells.
7. Reset: Use "Reset" to clear the board and reset scores.
8. Quit: Exit the game using the "Quit" button or the "X" button on the window.

## Code Structure
- **Main Game Panel**: Divided into sections to display the game grid, player options, and scores.
- **AI Logic**: Built into the `Start()` method, with difficulty modes that affect the AI’s move decision-making.
- **Event Handling**: Button clicks are managed with an `ActionListener`, responding to grid cell clicks, game reset, and quitting.

## Installation
1. Clone the repository:
    ```sh
    git clone https://github.com/AmeedDarawsheh/X-O-Game.git
    ```
2. Navigate to the project directory:
    ```sh
    cd X-O-Game
    ```
3. Compile the Java files:
    ```sh
    javac TicTacToeGUI.java
    ```
4. Run the application:
    ```sh
    java TicTacToeGUI
    ```

## Contributing
Contributions are welcome! Please fork this repository and open a pull request with a detailed explanation of your changes.

## License
This project is licensed under the [MIT License](LICENSE).
