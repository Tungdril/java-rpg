import java.lang.module.FindException;
import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

public class Game {
     
    static int day = 0; //Current day, not implemented yet

    public static void main(String[] args) {

        //Titlescreen
        System.out.println(
                "      O))                                      O)))))))     O)))))))      O))))     \n" +           
                "      O))                                      O))    O))   O))    O))  O)    O))  \n" +
                "      O))    O))    O))     O))   O))           O))    O))   O))    O)) O))     \n" +
                "      O))  O))  O))  O))   O))  O))  O))        O) O))       O)))))))   O))   \n" +
                "      O)) O))   O))   O)) O))  O))   O))        O))  O))     O))        O))   O))))\n" +
                " O)   O))  O))   O))   O)O))   O))   O))        O))    O))   O))         O))    O)  \n" +
                "  O))))     O)) O)))    O))      O)) O)))       O))      O)) O))          O)))))\n");
        
        System.out.println("Press Enter Key to start..."); 
        
        //Wait for user Input
        try{
            System.in.read();
        } catch(Exception e){}

        int exploreEvent = (int) (Math.random()*2+1); //Generate encounter, 33.3% chance

        switch (exploreEvent)
		{
			case 1:
				Encounters.fight(); //Starts fight encounter 
                day++;
				break;
			case 2:
                Encounters.nothing(); //not sure what exactly it should do
                day++;
				break;
        }

        System.out.println(day); 


        //Encounters encounters = new Encounters();
        //System.out.print(Encounters.fight());        
    }



}



 


    
     






