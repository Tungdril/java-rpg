import java.util.Scanner;

public class Game {
    static int day = 1; 
    static String Money;
    static String Day;
    static String userName;
    static int money;
    static int maxHealth = 8;

    public static void main(String[] args) {       
        try{
        Affinity.shopAlchAffinity=1;
        Exp.main(); //initialize Exp
        maxHealth = 8 + Exp.expScaling; //recalculates health based on expScaling
        AudioManager.main(null); //start bgm

        //Titlescreen
        System.out.println("                                                                                    ");    Thread.sleep(100);  //to make it look a cooler
        System.out.println("      O))                                      O)))))))     O)))))))      O))))     ");    Thread.sleep(100);
        System.out.println("      O))                                      O))    O))   O))    O))  O)    O))   ");    Thread.sleep(100);
        System.out.println("      O))    O))    O))     O))   O))           O))    O))   O))    O)) O))         ");    Thread.sleep(100);
        System.out.println("      O))  O))  O))  O))   O))  O))  O))        O) O))       O)))))))   O))         ");    Thread.sleep(100);
        System.out.println("      O)) O))   O))   O)) O))  O))   O))        O))  O))     O))        O))   O)))) ");    Thread.sleep(100);
        System.out.println(" O)   O))  O))   O))   O)O))   O))   O))        O))    O))   O))         O))    O)  ");    Thread.sleep(100);
        System.out.println("  O))))     O)) O)))    O))      O)) O)))       O))      O)) O))          O)))))    ");    Thread.sleep(100);
        Thread.sleep(1500);
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------------------------------"    ); Thread.sleep(550);
        System.out.println( "In the search of adventure you left your village and went to the nearest city."                               ); Thread.sleep(550);
        System.out.println( "There you joined a guild which was made by the older generations of people with the same motives as you."                  ); Thread.sleep(550);
        System.out.println( "After the registration you were left pennyless but they would give you a place to sleep and food for free."                           ); Thread.sleep(550);
        System.out.println( "You also learned about a place called the \"training\" dungeon and it seems like one only truly joins the guild if they clear it."                           ); Thread.sleep(550);
        System.out.println( "The drunkard mentioned that you would get even better treatment!"                                                                                                                  ); Thread.sleep(550);
        System.out.println( "So you decide that you must clear the dungeon."                                                                                                                  ); Thread.sleep(550);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------"    ); Thread.sleep(550);
        System.out.println("Press [ENTER] to depart on your adventure!");}
        catch(Exception e){} //if there's an exception in the Titlescreen it will loop
        //System.out.println("Day: "+ day);  
        //System.out.println(Encounters.playerHealth);
        //Wait for user Input
        try{
            System.in.read();
        } catch(Exception e){e.printStackTrace(); System.exit(0);}
            createSaveFolder.SaveLoad(); //loads and Saves the Games if there's an Exception the Titlescreen will be called
         
        Shop.equipCheck();
        City.guild(); //this is easier to check if the Loading didn't fuck up
        
        //explore();
    }
        

          
    

    public static void decide(){
        //try {Thread.sleep(5000);} catch(Exception e) {System.out.println("shit");}
        Exp.main(); //not sure why I made this call everytime, but scared to remove
        System.out.println("----------------------------------------------------------------------");   try{Thread.sleep(100);}catch(Exception e){}
        Dungeon.dungeon();
        GraphicUi.status();
        try{Thread.sleep(600);}catch(Exception e){}
        System.out.println("Decide what to do next."                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Continue deeper into the dungeon"       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Go back to the city"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Leave the Game"                      );          try{Thread.sleep(100);}catch(Exception e){}
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
            day++;
                explore();
            break;
            case 2: 
                City.cityCenter(); 
            break;
            case 3: //ends the code
            System.exit(0);
            default: 
            System.out.println("That's not an option!");
            decide();
        }
    }

    public static void explore(){
    int exploreEvent = (int) (Math.random()*100+1); //generate encounter 
       if(exploreEvent<=40){
        AudioManager.stopBgm();
        AudioManager.mainBattle();
        Encounters.fight();
        Encounters.combat();
        Encounters.healthCalc();              
       } else if(exploreEvent >40 && exploreEvent <=70 && day>1){
           Shop.shop();
       } else if(exploreEvent>70 && exploreEvent <= 90){
           Encounters.nothing();
       } else{
           Encounters.loot();
       }
    }
}