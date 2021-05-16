import java.util.Scanner;
public class Game {
     
    static int day = 1; 
    static String Money;
    static String Day;
    static String userName;
    static int money;
    static int healthPotion;

    public static void main(String[] args) {
        Exp.main();
        //Titlescreen
        System.out.println(
                "      O))                                      O)))))))     O)))))))      O))))     \n" +           
                "      O))                                      O))    O))   O))    O))  O)    O))  \n" +
                "      O))    O))    O))     O))   O))           O))    O))   O))    O)) O))     \n" +
                "      O))  O))  O))  O))   O))  O))  O))        O) O))       O)))))))   O))   \n" +
                "      O)) O))   O))   O)) O))  O))   O))        O))  O))     O))        O))   O))))\n" +
                " O)   O))  O))   O))   O)O))   O))   O))        O))    O))   O))         O))    O)  \n" +
                "  O))))     O)) O)))    O))      O)) O)))       O))      O)) O))          O)))))\n"+
                "------------------------------------------------------------------------------------");
   
        System.out.println("Tired of your boring life as a carriage driver for crippeled Lords and Ladies, you feel the urge to explore the wide world.\nAfter wandering a whole 140 feet from your home, you begin to feel very exhausted and decide to have a rest near\nthe entrance to a cave.You have a short nap. After waking up again the sun is already beginning to set, but you still feel the urge to enter the cave.\nSo you light your torch and head inside.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Press [ENTER] to depart on your adventure!");
        //System.out.println(Encounters.playerHealth);
        //Wait for user Input
        try{
            System.in.read();
        } catch(Exception e){}
        Scanner Name = new Scanner(System.in);
        System.out.println("Please enter your Username");
        userName = Name.nextLine();
        System.out.println("Do you wish to \n1. create \nor \n2. load \na save file");
        int savefile = Name.nextInt();
        switch(savefile){
            case 1: Save.creatingSave(); break; 
            case 2: Load.readingPain2(); break;
            default: System.out.print("Please use 1 or 2 the next time"); break;
        } 
        Name.close();

        explore();
        

        System.out.println("Day: "+ day);    
    }

    public static void decide(){
        try {Thread.sleep(5000);} catch(Exception e) {System.out.println("shit");}
        Exp.main();
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ____________________ \n"+ 
                           "|                    |\n"+
                           "      Health: "+ Encounters.playerHealth+"\n"+
                           "      Money: "+ money+"\n"+
                           "      Exp: "+Exp.exp +"\n"+
                           "|____________________|\n");
        System.out.println("Decide what to do next.\n"+
                           "1. Continue deeper into the cave\n"+
                           "2. Go back home to heal your wounds");
        Scanner choice = new Scanner(System.in);
        int option = choice.nextInt();
        switch (option) {
            case 1:
                explore();
            break;
            case 2:
                Encounters.home();
            break;
            default: 
            System.out.println("That's not an option!");
            decide();
        }  
    }

    public static void explore(){
    int exploreEvent = (int) (Math.random()*100+1); //Generate encounter 
       if(exploreEvent<=40){ //Starts fight encounter 40%
        Encounters.fight();
        Encounters.combat();
        Encounters.healthCalc();              
        day++;
       } else if(exploreEvent >40 && exploreEvent <=70 && day>1){
           Shop.shop();
           day++;
       } else if(exploreEvent>70 && exploreEvent <= 90){
           Encounters.nothing();
           day++;
       } else{
           Encounters.loot();
           day++;
       }
    }
}



 


    
     






