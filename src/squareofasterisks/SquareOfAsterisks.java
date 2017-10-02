/*
Brett Castellano 
October 2, 2017
Outputs a square of characters, side length and prefered character are given by user.
 */

package squareofasterisks;
import java.util.Scanner;
/**
 * Outputs a square of characters, side length and preferred character are given by user.
 * @author brcas1396
 */
public class SquareOfAsterisks {
/**
 * Draws a square via users inputted side length and character
 * pre: length of type integer, inputted by user, preferred character, inputted by user
 * post: square of given length and character displayed in console.
 */
    public static void squareOfAsterisks(int length, char fillCharacter) {
        /* this is how the square is actually drawn */
        for (int i = 0; i < length; i++) {      //essentially decides height of square
            for (int j = 0; j < length; j++) {      //essentially decides length of square
                          
            System.out.print(fillCharacter);        //print the character in a line
        }
            System.out.println("");     //move to next line
        }
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
       /* declaring variables */
        int side;        
        Scanner input = new Scanner(System.in); 
        
        /* gets preferred side length from user */
        System.out.println("Input the length of the square's sides: ");
        side = input.nextInt();
        
        /* gets preferred character from user */
        System.out.println("What is your prefered character?: ");
        char fill = input.next().charAt(0);
        
        squareOfAsterisks(side, fill);      //calls method that will draw the square
        
        input.close();      //closes input stream
    }
    
}
