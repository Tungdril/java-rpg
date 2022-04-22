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
        System.out.println( "Tired of your boring life as a carriage driver for the fat aristocracy, you feel the urge to explore the wide world."                               ); Thread.sleep(550);
        System.out.println( "After wandering a whole 140 feet from your home, you begin to feel very exhausted and decide to have a rest near the entrance to a cave."                  ); Thread.sleep(550);
        System.out.println( "You have a short nap. After waking up again the sun is already beginning to set, but you still feel the urge to enter the cave."                           ); Thread.sleep(550);
        System.out.println( "So you light your torch and head inside."                                                                                                                  ); Thread.sleep(550);
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
        decide(); //this is easier to check if the Loading didn't fuck up
        
        //explore();
    }
        

          
    

    public static void decide(){
        //try {Thread.sleep(5000);} catch(Exception e) {System.out.println("shit");}
        Exp.main(); //not sure why I made this call everytime, but scared to remove
        GraphicUi.healthometer();
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("----------------------------------------------------------------------");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(" _______________________ "             );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("|        Health:        |"             );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(""+ GraphicUi.HealthBar+""        );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("      Money: "+ money               );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("      Exp: "+(int)Exp.exp           );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("      Day: "+day                    );                                      try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("|_______________________|"             );                                      try{Thread.sleep(100);}catch(Exception e){}
        try{Thread.sleep(600);}catch(Exception e){}
        Save.creatingSave();
        System.out.println("Decide what to do next."                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Continue deeper into the cave"       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Go back home to heal your wounds"    );          try{Thread.sleep(100);}catch(Exception e){}
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
            day++; 
                Encounters.home(); 
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