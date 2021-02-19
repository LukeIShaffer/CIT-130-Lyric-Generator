
package Arrays;



import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luke Shaffer
 * Client class of lyric generator
 */
public class SongWorld {
    public static void main(String[] args) {
          buildLyricLineArray();     
    }
    
   public static void buildLyricLineArray(){
        Scanner userInput = new Scanner(System.in);

        LyricLine[] Verse1 = new LyricLine[4];
                Verse1[0] =  new LyricLine("Outside is cloudy but I like that better", 4500);
                Verse1[1] =  new LyricLine("Behind the wheel but still ain't on my way", 4500);
                Verse1[2] =  new LyricLine("Some people say they want to live forever", 4500);
                Verse1[3] =  new LyricLine("That's way too long, I'll just get through today\n", 4500);
        LyricLine[] Chorus = new LyricLine[4];
                Chorus[0] = new LyricLine("Without any complications", 4500);
                Chorus[1] = new LyricLine("Does it always gotta, does it always gotta", 4500);
                Chorus[2] = new LyricLine("Gotta be so complicated?", 4500);
                Chorus[3] = new LyricLine("Well I'm way too young to be getting old\n", 4500);
        LyricLine[] Verse2 = new LyricLine[8];
                Verse2[0] = new LyricLine("And all I wanna do is look but I can't see, baby", 4500);
                Verse2[1] = new LyricLine("Who you talking to while you talking to me, baby?", 4500);
                Verse2[2] = new LyricLine("Let me, let me know if I can see you later", 4500);
                Verse2[3] = new LyricLine("We could make it easy", 4500);
                Verse2[4] = new LyricLine("Inside my head is getting pretty cluttered", 4500);
                Verse2[5] = new LyricLine("I try but can't clean up this mess I made", 4500);
                Verse2[6] = new LyricLine("'Fore I start to think about the future", 4500);
                Verse2[7] = new LyricLine("First, can I please get through a day\n", 4500);
        
        
        System.out.println("Song Name: Complicated by Mac Miller\n");
        System.out.println("User Menu: Would you like to...\n");
        System.out.println("1. Display Lyrics (Karaoke Mode)\n2. Edit Lyrics\n3. End Program");
        
        int menuSelection = userInput.nextInt();
        
        switch (menuSelection){
            case 1:
                System.out.println("You selected Display Lyrics in Karaoke Mode!\n Here are the lyrics:\n");
                System.out.println("Verse 1:\n");                
                karaokeSimulation(Verse1);
                
                System.out.println("Chorus:\n");                
                karaokeSimulation(Chorus);
                
                System.out.println("Verse 2:\n");                
                karaokeSimulation(Verse2);
                
                System.out.println("Chorus:\n");
                karaokeSimulation(Chorus);
                
                break;
            case 2:
                System.out.println("You selected Edit Lyrics!\nHere are the lyrics from the song...");
                System.out.println("Verse 1:\n");
                Verse1[0] =  new LyricLine("Outside is cloudy but I like that better", 0);
                Verse1[1] =  new LyricLine("Behind the wheel but still ain't on my way", 0);
                Verse1[2] =  new LyricLine("Some people say they want to live forever", 0);
                Verse1[3] =  new LyricLine("That's way too long, I'll just get through today\n", 0);
                karaokeSimulation(Verse1);
                
                System.out.println("Chorus:\n");
                Chorus[0] = new LyricLine("Without any complications", 0);
                Chorus[1] = new LyricLine("Does it always gotta, does it always gotta", 0);
                Chorus[2] = new LyricLine("Gotta be so complicated?", 0);
                Chorus[3] = new LyricLine("Well I'm way too young to be getting old\n", 0);
                karaokeSimulation(Chorus);
                
                System.out.println("Verse 2:\n");
                Verse2[0] = new LyricLine("And all I wanna do is look but I can't see, baby", 0);
                Verse2[1] = new LyricLine("Who you talking to while you talking to me, baby?", 0);
                Verse2[2] = new LyricLine("Let me, let me know if I can see you later", 0);
                Verse2[3] = new LyricLine("We could make it easy", 0);
                Verse2[4] = new LyricLine("Inside my head is getting pretty cluttered", 0);
                Verse2[5] = new LyricLine("I try but can't clean up this mess I made", 0);
                Verse2[6] = new LyricLine("'Fore I start to think about the future", 0);
                Verse2[7] = new LyricLine("First, can I please get through a day\n", 0);
                karaokeSimulation(Verse2);
                
                System.out.println("What line would you like to edit from 1 - 16?");
                System.out.print("--> ");
                int lineDecision = userInput.nextInt();
                switch (lineDecision){
                    case 1:  
                        Verse1[0] =  new LyricLine("Line 1: Outside is cloudy but I like that better", 0);
                        karaokeSimulation(Verse1);
                        System.out.print("New Lyrics --> ");
                        System.out.print("--> ");
                        String newLyrics = userInput.nextLine();
                        
                        
                }
                
                
                break;
            case 3:
                System.out.println("Ending Program.");
                System.exit(0);
            default:
                System.out.println("Please enter a number between 1 and 3");
                
        }

    } // close test
    
    public static void karaokeSimulation(LyricLine[] kTape){
        Scanner scan = new Scanner(System.in);
        // wait for an enter press
       // String wait = scan.nextLine();
        
        // iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
                // Extract the LyricLine object from our current row
                // and store temporarily
                LyricLine tempLine = kTape[line];
                // dump lyric to console
                System.out.println(tempLine.lineText);
                try {
                    Thread.sleep(tempLine.timeToDisplayMilli);
                }catch (InterruptedException ex) {
                    // DO NOTHING
                }
            } // CLOSE FOR LOOP
            
    } // close Karaoke
    


}
