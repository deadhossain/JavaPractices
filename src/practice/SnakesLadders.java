/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;

/**
 *
 * @author Hossain
 */
public class SnakesLadders {
    
    private int currentPlayer = 0; // Which player turn now
    private final int[] positionOfPlayers = new int[2]; // Players in array indicating their position
    private boolean GameFinished = false; // Game Status if finished or not
    private String message = ""; // Set game status as message
    
    private static final HashMap<Integer, Integer> AlterPosition = new HashMap<Integer, Integer>(); // set alter position 
    static{
        AlterPosition.put(2, 38);
        AlterPosition.put(7, 14);
        AlterPosition.put(8, 31);
        AlterPosition.put(15, 26);
        AlterPosition.put(16, 6);
        AlterPosition.put(21, 42);
        AlterPosition.put(28, 84);
        AlterPosition.put(36, 44);
        AlterPosition.put(46, 25);
        AlterPosition.put(49, 11);
        AlterPosition.put(51, 67);
        AlterPosition.put(62, 19);
        AlterPosition.put(64, 60);
        AlterPosition.put(71, 91);
        AlterPosition.put(74, 53);
        AlterPosition.put(78, 98);
        AlterPosition.put(87, 94);
        AlterPosition.put(89, 68);
        AlterPosition.put(92, 88);
        AlterPosition.put(95, 75);
        AlterPosition.put(99, 80);       
    }

    public SnakesLadders() {}
    
    
    public String play(int die1, int die2) {
        if(GameFinished) return "Game over!";
        int sum = die1+die2;
        positionOfPlayers[currentPlayer] = move(positionOfPlayers[currentPlayer]+sum);
        message = GameStatus(currentPlayer);
        if(die1!=die2)currentPlayer = (currentPlayer==1)?0:1;
        return message;
    }
    
    // set status of the game 
    public String GameStatus(int currentPlayer)
    {
        if(positionOfPlayers[currentPlayer]==100)
        {
            GameFinished = true; // No more turn
            return "Player " + (currentPlayer+1) + " Wins!";
        }
        else{
            return "Player " + (currentPlayer+1) + " is on square " + positionOfPlayers[currentPlayer] ; // player current position
        }
    }
    
    // how a player will move
    public int move(Integer placeNumber)
    {
        if(placeNumber>100)placeNumber = 100 - (placeNumber-100); // if greater than hundred than bounce back
        if(AlterPosition.containsKey(placeNumber))return AlterPosition.get(placeNumber); // check if player is in snake or ladder 
        return placeNumber;
    }
}
