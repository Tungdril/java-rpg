
import java.util.Scanner;

//building a vendor
public class Shop {
    static int sword;
    static int armor;
    static int heal;
    static int swordEquip;
    static int armorEquip;
    static String ArmorEquip;
    static String SwordEquip;
    static int metBefore;
    static int metAlchBefore;
public static void main(String[] args){shop();}

    public static void shop(){
        int ShopChance = (int) (Math.random()*100+1);
        if(ShopChance>=51){
            dwarfShop();
        }else {
            Affinity.Affi();
            alchemistShop();
        }
    }
public static void dwarfShop(){
        GraphicUi.Affimeter(); 
        Scanner vendor = new Scanner(System.in);
        Affinity.Affi();                            //calls the Affinity System
        greetingKeeper();
        try{Thread.sleep(650);}catch(Exception e){}
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(    " ____________________________________ ");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|       \"What are you buying?\"       |");                         try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|"+ GraphicUi.AffinityMeter +"|");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|           You choose to:           |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|1. Buy Equipment                    |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|2. Buy a Healing Potion [20 G]      |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|3. Buy the Dwarf a Beer [50 G]      |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|4. Leave                            |");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "|____________________________________|");                           try{Thread.sleep(100);}catch(Exception e){}
        GraphicUi.Affimeter();
        int Talk = vendor.nextInt();

        switch (Talk){          //loop was replaced with recursion
            case 1:
                metBefore=metBefore+1;
                Affinity.Affi();
                try{Thread.sleep(300);}catch(Exception e){}   
                equipShop();
            case 2:
                metBefore=metBefore+1;
                Affinity.Affi();
                try{Thread.sleep(300);}catch(Exception e){}
                medicineShop();
            case 3:
                metBefore=metBefore+1;
                Affinity.Affi();
                try{Thread.sleep(300);}catch(Exception e){}
                beerEvent();
            case 4:
            metBefore=1;
            System.out.println( " ____________________________________ ");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|         You leave the shop.        |");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "|____________________________________|");    try{Thread.sleep(100);}catch(Exception e){}
            try{Thread.sleep(1000);}catch(Exception e){}
            Affinity.Affi();
            Game.decide();
            
        }
        GraphicUi.Affimeter();
    }
    public static void alchemistShop(){
        Scanner vendor = new Scanner(System.in);
        Affinity.Affi();
        GraphicUi.AffiAlchmeter();
        greetingAlchemist();
        try{Thread.sleep(650);}catch(Exception e){}
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println(    "┌─                                  ─┐");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "        \"What are you buying?\"        ");                         try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    " "+ GraphicUi.AffinityAlchMeter +" ");                              try{Thread.sleep(100);}catch(Exception e){} 
        System.out.println(    "            You choose to:            ");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    " 1. Buy Potions                     ");                             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    " 2. Give some money to charity [50 G]       ");                     try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    " 3. Leave                             ");                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "└─                                  ─┘");                           try{Thread.sleep(100);}catch(Exception e){}
        int Talk = vendor.nextInt();

        switch (Talk){
            case 1:
            metAlchBefore=metAlchBefore+1;
                Affinity.Affi();
                try{Thread.sleep(300);}catch(Exception e){}   
                potionShop();
            case 2:
            metAlchBefore=metAlchBefore+1;
                Affinity.Affi();
                try{Thread.sleep(300);}catch(Exception e){}
                herbEvent();
            case 3:
            metAlchBefore=1;
            System.out.println( "┌─                                  ─┐");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "          You leave the shop.         ");    try{Thread.sleep(100);}catch(Exception e){}
            System.out.println( "└─                                  ─┘");    try{Thread.sleep(100);}catch(Exception e){}
            try{Thread.sleep(1000);}catch(Exception e){}
            Affinity.Affi();
            Game.decide();
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

            if(ArmorSword){                         //if the Sword and the Shield has been bought the player will be put back in shop
            GraphicUi.shopSwordandShield();
            vendor.next();
            dwarfShop();
            }
            else if(Armor){                 //if only the Shield has been bought the sword can only be bought  
                try{
                GraphicUi.shopSword();
                int swordBuy = vendor.nextInt();
                switch (swordBuy){
                    case 1:
                    if (Game.money<Affinity.swordPrice)     {GraphicUi.notEnoughMoney();break;}
                    else {
                    GraphicUi.swordBought();
                    sword=2;
                    Game.money=Game.money-Affinity.swordPrice;
                    swordEquip=1;
                    Affinity.shopAffinity=Affinity.shopAffinity+20;     //adds Affinity for the Shopkeeper(if we wait enough i may make a Shopkeeper Dating sim)
                    Affinity.Affi(); 
                    break;}
                    default:                
                    break;
                }dwarfShop();
            } catch (Exception e){dwarfShop();} // just to be sure that there's no Exception that crashes the game
        }
            else if (Sword) {                  ////if only the Shield has been bought the sword can only be bought
            try{
            GraphicUi.shopShield();
            int armorBuy = vendor.nextInt();
            switch(armorBuy){
            case 1:
                    if (Game.money<Affinity.shieldPrice)    {GraphicUi.notEnoughMoney();break;}
                    else {
                    GraphicUi.shieldBought();
                    armor=2;
                    Game.money=Game.money-Affinity.shieldPrice;
                    armorEquip=1;
                    Affinity.shopAffinity=Affinity.shopAffinity+20;
                    Affinity.Affi();
                    break;}
            default:
            break;
            } dwarfShop();
        } catch(Exception e){dwarfShop();}
    }
            else {
                try{
                GraphicUi.shopFull();
                int upgrades = vendor.nextInt();
                switch (upgrades){
                    case 1:
                    if (Game.money<Affinity.swordPrice)     {GraphicUi.notEnoughMoney();}
                    else {
                    GraphicUi.swordBought();
                    sword=2;
                    Game.money=Game.money-Affinity.swordPrice;
                    swordEquip=1;
                    Affinity.shopAffinity=Affinity.shopAffinity+20;}
                    Affinity.Affi();
                    break;
                    case 2:
                    if (Game.money<Affinity.shieldPrice)    {GraphicUi.notEnoughMoney();break;}
                    else {
                    GraphicUi.shieldBought();
                    armor=2;
                    Game.money=Game.money-Affinity.shieldPrice;
                    armorEquip=1;
                    Affinity.shopAffinity=Affinity.shopAffinity+20;
                    Affinity.Affi();}
                    break;
                    default:
                    System.out.println( " ____________________________________ ");                              try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|         \"Something else\"?          |");                            try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println( "|____________________________________|");                              try{Thread.sleep(100);}catch(Exception e){}
                    break;}
                    dwarfShop();
                } catch (Exception e){dwarfShop();}
            }   
        }

        public static void medicineShop(){  //just making the health potion shop another module because i can            
            if(Game.money>=20){
                int heal = (int) (Math.random()*3+1);

                int overheal = heal + Enemy.playerHealth;
                Game.money=Game.money-20;
                
                if (overheal <= Game.maxHealth){
                    Enemy.playerHealth = Enemy.playerHealth + heal;
                    GraphicUi.Potion();
                    Affinity.shopAffinity=Affinity.shopAffinity+5;
                    Affinity.Affi();
                    dwarfShop();
                } else if(Enemy.playerHealth == Game.maxHealth){
                    GraphicUi.overPotion();
                    Affinity.shopAffinity=Affinity.shopAffinity+5; //adds Affinity with the Shopkeeper
                    Affinity.Affi();
                    dwarfShop();     
                } else{
                    //System.out.println("overheal!");
                    medicineShop(); //rerolls until no more overheal
                } 


                
            } else{GraphicUi.notEnoughMoney();}
            dwarfShop();
        }
        public static void greetingKeeper(){ 
            int greetedKeeper=metBefore; //prevents welcome message being drawn every time you reset the menu, to choose something else
            if(metBefore==1){       //random talk from the dwarf
                int randomShop = (int) (Math.random()*100+1);
                boolean randomShop1= randomShop>=1 && randomShop<26;    //25% Chance for everything
                boolean randomShop2=randomShop>=26 && randomShop<51;
                boolean randomShop3=randomShop>=51 && randomShop<76;
                boolean randomShop4=randomShop>=76 && randomShop<101;
                    if(randomShop1){
                        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|     You have entered the Shop.     |\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|               \"Hmm?\"               |\n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop2){
                        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|     You have entered the Shop.     |\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|  \"You're still alive, impressive.\" |\n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop3){
                        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|     You have entered the Shop.     |\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|      \"Do you need a Potion?\"       |\n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop4){
                        System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|     You have entered the Shop.     |\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|  \"You should buy some Equipment\"   |\n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                }
            if(greetedKeeper==0)
                {
                System.out.print(   " ____________________________________ \n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   "|    You have entered a small cave.  |\n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   "|An old dwarf has set up a shop here.|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   "|____________________________________|\n");                              try{Thread.sleep(100);}catch(Exception e){}
                metBefore=1;
                }
        }
        public static void beerEvent(){
                if(Game.money>=50)
                {
                    System.out.println(   " ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println(   "|         \"Thanks, I guess\"          |");          try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println(   "|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
                Affinity.shopAffinity=Affinity.shopAffinity+10;
                Game.money=Game.money-50;
                dwarfShop();
                }
            else{GraphicUi.notEnoughMoney();shop();}
            
        
        } 
        public static void greetingAlchemist()
        {                         //start of the new alchemist
            if(metAlchBefore==1){       //random talk from the Alchemist
                int randomShop = (int) (Math.random()*100+1);
                boolean randomShop1= randomShop>=1 && randomShop<26;    //25% Chance for everything
                boolean randomShop2=randomShop>=26 && randomShop<51;
                boolean randomShop3=randomShop>=51 && randomShop<76;
                boolean randomShop4=randomShop>=76 && randomShop<101;
                    if(randomShop1){
                        System.out.print(   "┌─                                  ─┐\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "      You have entered the Shop.      \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "  \"You shouldn't wander aimlessly.\"   \n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "└─                                  ─┘\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop2){
                        System.out.print(   "┌─                                  ─┐\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "      You have entered the Shop.      \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "     \"Would you like some herbs?\"     \n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "└─                                  ─┘\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop3){
                        System.out.print(   "┌─                                  ─┐\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "      You have entered the Shop.      \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "       \"Do you need a Potion?\"        \n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "└─                                  ─┘\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                    if(randomShop4){
                        System.out.print(   "┌─                                  ─┐\n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "      You have entered the Shop.      \n");                              try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   " \"Have you seen some new Ingredients?\" \n");                            try{Thread.sleep(100);}catch(Exception e){}
                        System.out.print(   "└─                                  ─┘\n");                              try{Thread.sleep(100);}catch(Exception e){}
                    }
                }
            if(metAlchBefore==0)
                {
                System.out.print(   "┌─                                  ─┐\n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   "     You have entered a small cave.   \n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   " An alchemist has set up a shop here. \n");                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.print(   "└─                                  ─┘\n");                              try{Thread.sleep(100);}catch(Exception e){}
                metAlchBefore=1;
            }
        }
        public static void potionShop()
        {if(!Loot.cookbookFound){GraphicUi.noCookBook();alchemistShop();}
            Scanner shopper = new Scanner(System.in);    
            GraphicUi.potions();
            int potionChoice = shopper.nextInt();
            try{
            switch(potionChoice){
                case 1: //healing
                medicineAlchShop();
                break;
                case 2: //strength
                if(Game.money>=40&&Loot.strengthShroom>=1){
                    Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+10;
                    Loot.strengthShroom--;
                    Game.money=Game.money-40;
                    GraphicUi.increaseDefense();
                    Enemy.playerDamage++;
                } else if (Loot.strengthShroom>=1&&Game.money<40){GraphicUi.notEnoughMoneyAlch();}
                else if(Loot.strengthShroom<1&&Game.money>=40){GraphicUi.noItems();}
                else {GraphicUi.noItemsnoMoney();}
                break;
                case 3: //constitution
                if(Game.money>=60&&Loot.constitutionCabbage>=1){
                    Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+10;
                    Loot.constitutionCabbage--;
                    Game.money=Game.money-60;
                    GraphicUi.increaseHealth();
                    Game.maxHealth++;
                } else if (Loot.constitutionCabbage>=1&&Game.money<60){GraphicUi.notEnoughMoneyAlch();}
                else if(Loot.constitutionCabbage<1&&Game.money>=60){GraphicUi.noItems();}
                else {GraphicUi.noItemsnoMoney();}
                break;
                case 4: //defense
                if(Game.money>=60&&Loot.defenseDandelion>=1){
                    Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+10;
                    Loot.defenseDandelion--;
                    Game.money=Game.money-60;
                    GraphicUi.increaseDefense();
                    Enemy.playerDefense++;
                } else if (Loot.defenseDandelion>=1&&Game.money<60){GraphicUi.notEnoughMoneyAlch();}
                else if(Loot.defenseDandelion<1&&Game.money>=60){GraphicUi.noItems();}
                else {GraphicUi.noItemsnoMoney();}
                break;
                case 5: //leave
                alchemistShop();
                break;
            }alchemistShop();
        } catch(Exception e){alchemistShop();}
        }
        public static void medicineAlchShop()
        {
            if(Game.money>=Affinity.potionPrice&&Loot.healingHerb>=1){
                int heal = (int) (Math.random()*4+2);
                Loot.healingHerb--;
                int overheal = heal + Enemy.playerHealth;
                Game.money=Game.money-Affinity.potionPrice;
                
                if (overheal <= Game.maxHealth){
                    Enemy.playerHealth = Enemy.playerHealth + heal;
                    GraphicUi.AlchPotion();
                    Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+5;
                    Affinity.Affi();
                    alchemistShop();
                } else if(Enemy.playerHealth == Game.maxHealth){
                    GraphicUi.AlchoverPotion();
                    Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+5; //adds Affinity with the Shopkeeper
                    Affinity.Affi();
                    alchemistShop();     
                } else{
                    //System.out.println("overheal!");
                    medicineAlchShop(); //rerolls until no more overheal
                } 


                
            } else if (Loot.healingHerb>=1&&Game.money<Affinity.potionPrice)
            {
                GraphicUi.notEnoughMoneyAlch();
            }
            else if(Loot.healingHerb<1&&Game.money>=Affinity.potionPrice)
            {
                GraphicUi.noItems();
            }
            else {GraphicUi.noItemsnoMoney();
            }
            alchemistShop();
        }
        public static void herbEvent()
        {
            if(Game.money>=50)
            {
                System.out.println(   "┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(   "          \"Thanks, I guess\"           ");          try{Thread.sleep(100);}catch(Exception e){}
                System.out.println(   "└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
            Affinity.shopAlchAffinity=Affinity.shopAlchAffinity+15;
            Game.money=Game.money-50;
            alchemistShop();
            }
        else{GraphicUi.notEnoughMoneyAlch();alchemistShop();}
        }
    }
