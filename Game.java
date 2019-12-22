/*
    This is a Java program that demonstrates a simple dice game. 
    There are two players, each one throws dice, and the one with the highest score wins.

    Future plans:
    - Names for the players
    - Input-output
    - Scenarios if-else (or switch) 
    - Scoreboard 
    - GUI (far ahead)

    Note: this is also my first Java project that I put on Github.
*/

public class Game {
    public static void main(String args[]) {
        
        // Creating the players
        Players player0 = new Players("Mike");
        Players player1 = new Players("John");

        // Printing the names
        System.out.println("The names of our players are " + player0.name + 
                            " and " + player1.name + ".");

        Generate gen = new Generate(); // driver
        System.out.println(gen.getNumber()); // printing the result of the first throw
        
    }
}