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
                "  O))))     O)) O)))    O))      O)) O)))       O))      O)) O))          O)))))\n");
        
        System.out.println("Press Enter Key to start..."); 
        
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
       } else if(exploreEvent >40 && exploreEvent <=70){
           Shop.main;
           day++;
       } else if(exploreEvent>70 && exploreEvent <= 90){
           Encounters.nothing();
           day++;
       } else{
           Encounters.loot;
           day++;
       }
    
    
    
    
    
    switch (exploreEvent)
    {
        case 1:
            
            break;
        case 2:
            Encounters.nothing(); //not sure what exactly it should do
            day++;
            break;
    }  
    }
   


}



 


    
     






