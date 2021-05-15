public class Game {
     
    static int day = 0; //Current day, not implemented yet
    static String Exp;
    static String Money;
    static String Day;
    static String userName;
    // exp, money, day only defined for test reasons
    static int exp=200;
    static int money=2000;



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
                Encounters.fight();
                Encounters.combat();
                Encounters.healthCalc();
				 //Starts fight encounter                 
                day++;
				break;
			case 2:
                Encounters.nothing(); //not sure what exactly it should do
                day++;
				break;
        }

        System.out.println("Day: "+ day); 


        //Encounters encounters = new Encounters();
        //System.out.print(Encounters.fight());        
    }



}



 


    
     






