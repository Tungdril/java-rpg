public class Game {
     
    static int day = 1; //Current day, not implemented yet
    static String Exp;
    static String Money;
    static String Day;
    static String userName;
    // exp, money, day only defined for test reasons
    static int exp;
    static int money;
    static int healthPotion;

    public static void main(String[] args) {

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
        //Wait for user Input
        try{
            System.in.read();
        } catch(Exception e){}

        explore();

        System.out.println("Day: "+ day);    
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



 


    
     






