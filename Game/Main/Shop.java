
import java.util.Scanner;

//building a vendor
public class Shop {
    static int sword;
    static int armor;
    static int swordEquip;
    static int armorEquip;
    static String ArmorEquip;
    static String SwordEquip;
public static void main(String[] args){ 
    shop();  
}
    public static void shop()
    {   System.out.println("Heavy Work is currently in progress. You shouldn't disturb");    //
        Game.decide();
        Scanner vendor = new Scanner(System.in);
        int ka = 0; //no longer needed will replace the while loop with a loopin recursion
        boolean sop = ka==0 ;
        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|    You have entered a small cave.  |\n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|An old dwarf has set up a shop here.|\n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                            try{Thread.sleep(650);}catch(Exception e){}
        while (sop) {                                                                               try{Thread.sleep(1000);}catch(Exception e){} // The loop doesn't work as intended

        System.out.println(    " ____________________________________ ");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|       \"What are you buying?\"       |");                         try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|    said  the dwarven shopkeeper    |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|------------------------------------|");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|           You choose to:           |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|1. Buy Equipment                    |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|2. Buy a Healing Potion (20 G)      |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|3. Leave                            |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|____________________________________|");                           try{Thread.sleep(100);}catch(Exception e){}
        int Talk = vendor.nextInt();

        switch (Talk){  //TODO @SmyloG  Will make it a different module
            case 1:
                equipShop();
            case 2:
            if(Game.money>=20){
                int heal = (int) (Math.random()*3+1);
                System.out.println( " ____________________________________ ");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println( "|      You bought the potion!        |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println( "|And directly drank it. How wasteful.|");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println( "|          You regain " + heal + "HP.           |");                       try{Thread.sleep(100);}catch(Exception e){}
                System.out.println( "|____________________________________|");                                  try{Thread.sleep(100);}catch(Exception e){}
                Game.money=Game.money-20; // was in the wrond line
            } else                      {System.out.println(" ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println("|       You don't have enough G.     |");          try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println("|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                        }
                 
                break;
            case 3:
            System.out.println( " ____________________________________ ");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|         You leave the shop.        |");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|____________________________________|");    try{Thread.sleep(100);}catch(Exception e){}
            try{Thread.sleep(1000);}catch(Exception e){}
            Game.decide();;
            
        }   
       
        }        
    }
        public static void equipCheck() //checks if the player has bought equipment and if the player did, it adds the armor and sword buff
        {
            if(armorEquip==1){armor=2;};
            if(swordEquip==1){sword=2;};
        }

        public static void equipShop(){
            Scanner vendor = new Scanner(System.in);
            if(){

            }
            else if(){

            }
            else if () {}
            else {
            System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                       _    )8(    _  |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|  ____________________ `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<><><>  |  |  <><><>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>      |  |      <>|     |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>      |  |      <>|     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>   .--------.   <>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |     |   ()   |     |     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |_____| (O\\/O) |_____|     |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |     \\   /\\   /     |     |.|       |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |------\\  \\/  /------|     |O|       |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |       '.__.'       |     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |        |  |        |     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| :        |  |        :     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|  \\       |  |       /      |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|   \\<>    |  |    <>/       |.|       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|    \\<>   |  |   <>/        |L|       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|     `\\<> |  | <>/'         |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|       `-.|__|.-`           \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|--------------------------------------| ");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|  \"The cool Sword or a shiny Shield?\" |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 1. Sword (200 G)                     |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 2. Shield (300 G)                    |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 3. none of the above                 |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
                int upgrades = Shop.vendor.nextInt();
                switch (upgrades){
                    case 1:
                    if (swordEquip==1)  {System.out.println(  " ____________________________________ ");                 try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println(  "|    \"You already have the Sword.\"   |");               try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println(  "|____________________________________|");                 try{Thread.sleep(100);}catch(Exception e){}
                                        }
                    else if (Game.money<200){System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|         this cool Sword.           |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            }
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     You bought the cool Sword!     |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     Hopefully it's as useful       |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|       as it's cool looking!        |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    sword=2;
                    Game.money=Game.money-200;
                    swordEquip=1;}
                    break;
                    case 2:
                    if (armorEquip==1) {System.out.println( " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                                        System.out.println( "|   \"You already have that Shield.\"  |");                try{Thread.sleep(100);}catch(Exception e){}
                                        System.out.println( "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                                    }  
                    else if (Game.money<300) {System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "|         this shiny Shield.         |");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            }
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|    You bought the shiny Shield!    |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|      Hopefully it's as useful      |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|           as it's shiny!           |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    armor=2;
                    Game.money=Game.money-300;
                    armorEquip=1;}
                    break;
                    default:
                    System.out.println( " ____________________________________ ");                              try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|         \"Something else\"?          |");                            try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|____________________________________|");                              try{Thread.sleep(100);}catch(Exception e){}
                   }
                break;
            }
            
        }





    }