
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
    {   Scanner vendor = new Scanner(System.in);
        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|    You have entered a small cave.  |\n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|An old dwarf has set up a shop here.|\n");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                            try{Thread.sleep(650);}catch(Exception e){}
        try{Thread.sleep(1000);}catch(Exception e){}

        System.out.println(    " ____________________________________ ");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|       \"What are you buying?\"       |");                         try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|     said the dwarven shopkeeper    |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|------------------------------------|");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|           You choose to:           |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|1. Buy Equipment                    |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|2. Buy a Healing Potion (20 G)      |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|3. Leave                            |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|____________________________________|");                           try{Thread.sleep(100);}catch(Exception e){}
        
        int Talk = vendor.nextInt();

        switch (Talk){          //loop was replaced with recursion
            case 1:
                equipShop();
            case 2:
                medicineShop();
            case 3:
            System.out.println( " ____________________________________ ");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|         You leave the shop.        |");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|____________________________________|");    try{Thread.sleep(100);}catch(Exception e){}
            try{Thread.sleep(1000);}catch(Exception e){}
            Game.decide();;
            
        }   
       
        }        
        public static void equipCheck() //checks if the player has bought equipment and if the player did, it adds the armor and sword buff
        {
            if(armorEquip==1){armor=2;};
            if(swordEquip==1){sword=2;};
        }

        public static void equipShop(){
            Scanner vendor = new Scanner(System.in);
            boolean Armor = armor==2;
            boolean Sword = sword==2;            
            boolean ArmorSword = Armor & Sword;

            if(ArmorSword){                         //if the Sword and the Shield has been bought the player will be put backk in shop
            System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|--------------------------------------| ");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| \"There's no Equipment to be bought.\" |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 1. Leave                             |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
            vendor.next();
            shop();
            }
            else if(Armor){                 //if only the Shield has been bought the sword can only be bought  
                try{
                System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                       _    )8(    _  |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                       `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |L|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|                            \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|--------------------------------------| ");                    try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|  \"Are you here to buy this Sword?\" |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "| 1. Sword (200 G)                     |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "| 2. No                                |");                     try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
                int swordBuy = vendor.nextInt();
                switch (swordBuy){
                    case 1:
                    if (Game.money<200)     {System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|         this cool Sword.           |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            shop();}
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     You bought the cool Sword!     |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     Hopefully it's as useful       |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|       as it's cool looking!        |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    sword=2;
                    Game.money=Game.money-200;
                    swordEquip=1;
                    shop();}
                    default:                
                    shop();
                }
            } catch (Exception e){shop();} // just to be sure that there's no Exception that crashes the game
        }
            else if (Sword) {                  ////if only the Shield has been bought the sword can only be bought
            try{
            System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|  ____________________                |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<><><>  |  |  <><><>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>      |  |      <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>      |  |      <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |<>   .--------.   <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |     |   ()   |     |               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |_____| (O\\/O) |_____|               |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |     \\   /\\   /     |               |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |------\\  \\/  /------|               |");                   try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |       '.__.'       |               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| |        |  |        |               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| :        |  |        :               |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|  \\       |  |       /                |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|   \\<>    |  |    <>/                 |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|    \\<>   |  |   <>/                  |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|     `\\<> |  | <>/'                   |");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|       `-.|__|.-`                     |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|--------------------------------------| ");                    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| \"Are you here to buy this Shield?\" |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 1. Yes (200 G)                       |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "| 2. No                                |");                     try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
            int armorBuy = vendor.nextInt();
            switch(armorBuy){
            case 1:
                    if (Game.money<300)     {System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "|         this shiny Shield.         |");          try{Thread.sleep(100);}catch(Exception e){}
                                              System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            shop();}
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|    You bought the shiny Shield!    |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|      Hopefully it's as useful      |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|           as it's shiny!           |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    armor=2;
                    Game.money=Game.money-300;
                    armorEquip=1;}
                    shop();;
            default:
            shop();
            }
        } catch(Exception e){shop();}
    }
            else {
            try{
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
                int upgrades = vendor.nextInt();
                switch (upgrades){
                    case 1:
                    if (Game.money<200)     {System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|         this cool Sword.           |");          try{Thread.sleep(100);}catch(Exception e){}
                                             System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            shop();}
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     You bought the cool Sword!     |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|     Hopefully it's as useful       |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|       as it's cool looking!        |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    sword=2;
                    Game.money=Game.money-200;
                    swordEquip=1;}
                    shop();
                    case 2:
                    if (Game.money<300)    {System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                            System.out.println(   "| You don't have enough money to buy |");          try{Thread.sleep(100);}catch(Exception e){}
                                            System.out.println(   "|         this shiny Shield.         |");          try{Thread.sleep(100);}catch(Exception e){}
                                            System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                            shop();}
                    else {System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|    You bought the shiny Shield!    |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|      Hopefully it's as useful      |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|           as it's shiny!           |");                  try{Thread.sleep(100);}catch(Exception e){}
                          System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
                    armor=2;
                    Game.money=Game.money-300;
                    armorEquip=1;}
                    shop();;
                    default:
                    System.out.println( " ____________________________________ ");                              try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|         \"Something else\"?          |");                            try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|____________________________________|");                              try{Thread.sleep(100);}catch(Exception e){}
                    shop();}
                } catch (Exception e){shop();}
            }   
        }
        public static void medicineShop(){  //just making the health potion shop another module because i can
            if(Game.money>=20){
                int heal = (int) (Math.random()*3+1);

                System.out.println(" ____________________________________ ");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|                _____               |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|               `.___,'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|                (___)               |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|                <   >               |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|                 ) (                |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|                /`-.\\              |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|               /     \\             |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|              / _    _\\            |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|             :,' `-.' `:            |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|             |         |            |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|             :         ;            |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|             \\        /            |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|               `.___.'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|------------------------------------|");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|      You bought the potion!        |");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|And directly drank it. How wasteful.|");                                  try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|          You regain " + heal + "HP.           |");                       try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("|____________________________________|");                                  try{Thread.sleep(100);}catch(Exception e){}

                Enemy.playerHealth = Enemy.playerHealth + heal;
                Game.money=Game.money-20;
                shop();
            } else                      {System.out.println(" ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println("|       You don't have enough G.     |");          try{Thread.sleep(100);}catch(Exception e){}
                                         System.out.println("|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                                        }
                 
                shop();
        }
    }