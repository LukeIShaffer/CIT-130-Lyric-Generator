
package Arrays;

import java.util.Scanner;

/**
 *
 * @author Luke Shaffer
 * Object "blueprint" class
 */
public class LyricGenerator {
    String[][] lyrics;
    String songTitle;
    String artist;
    int releaseYear;
    
    // Method to create the Multi Dimensional Array of a particular size
        public void initializeArray(int maxLinesInVerse, int numVerses){
        // check input parameters to ensure both are above zero
        if(maxLinesInVerse > 0 && numVerses > 0 ){
            // inititalize array of a given size
            lyrics = new String[maxLinesInVerse][numVerses];
            System.out.println("Created array with max line count: " + lyrics.length);
            System.out.println("Created array with verse count: " + lyrics[0].length);
        } else {
            System.out.println("Incorrect size input: lines and verses must be above 0");
        } // close if/else
        
    } // close initialize array
    
    // Method to read in lyrics, one line at a time
    public void readInLyrics(){
        // Create scanner
        Scanner inScan = new Scanner(System.in);
        
        // Read in first verse only
        // Loop that will ask user for line, then inject into current row of col 1
        for(int line=0;line < lyrics.length; line++){
            // Read in a single line from user, store temp in userLine
            String userLine = inScan.nextLine();
            // inject userLine into the array
            lyrics[line][0] = userLine;
        } // end for over first column
        
        
    } // close readInLyrics

    public void displayLyrics(){
        // Display values of the array
        // outer for loop iterates over the rows of our 6x3 array
        for(int row=0; row < lyrics.length; row++){
            // this inner for() loops over each column in our CURRENT row
            for(int col=0; col < lyrics[row].length; col++ ){
                // now, send to console the value of the current row and col
                System.out.println("Bin contents: " + lyrics[row][col]);
            } // close inner for over the columns
            // add a return character to start a new row on console
            System.out.println();
        } // close outer for over the rows
    }
    
} // close class
