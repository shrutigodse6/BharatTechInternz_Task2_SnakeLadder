# BharatTechInternz_Task2_SnakeLadder
By ShrutI Dilip Godse
BharatTech Internship Java Development

 Task 2:- Snake Ladder game.
 Snakes and Ladder is the most common board game played. The rules of the
 game are as follows:

 The first person to reach 100 wins.
 
 Each player gets only one chance in a single traversing.
 Snakes decrease your points while the ladder increases them.
 
 # Rules for this game:

 Two players can enter a single game.
 Random values can be attained using dice to increase or decrease
 the value.
 Points will be maintained using variables.
 The gamewill end after any player attains 100 points

 
Here's how the program works:


The WINNING_SCORE constant is set to 100, as per the game rules.

The snakes and ladders arrays store the positions of snakes and ladders, respectively.

The program prompts the user to enter the names of the two players.

The game loop continues until either player reaches the WINNING_SCORE.

In each iteration of the loop, the current player rolls a dice (simulated using Random), and their score is updated accordingly using the movePlayer method.

The movePlayer method checks if the new position is a snake or a ladder. If it's a snake, the player's score is reduced to the snake's head position. If it's a ladder, the player's score is increased to the ladder's top position.

The game ends when either player reaches or exceeds the WINNING_SCORE, and the winner is announced.

The getSnakeHead and getLadderTop methods return the respective positions for the given snake or ladder.

When you run the program, it will prompt you to enter the names of the two players. After that, the game will start, and each player will take turns rolling the dice and moving their pieces. The current scores and any encounters with snakes or ladders will be displayed. The game will continue until one of the players reaches the winning score of 100, and the winner will be announced.
