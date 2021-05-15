
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
    public static void shop(){
        Scanner vendor = new Scanner(System.in);
        int ka = 0;
        boolean sop = ka==0 ;
        System.out.print(   " ____________________________________ \n"+  
                            "|      You have entered the Shop.    |\n"+
                            "|____________________________________|\n");
        while (sop) {
        System.out.print(   " ____________________________________ \n"+
                            "|       \"What are you buying?\"       |\n"+ 
                            "|    says the dwarven shopkeeper     |\n"+
                            "|  You currently have " + Game.money + "G.         |\n"+
                            "|------------------------------------|\n"+
                            "|           You choose to:           |\n"+
                            "|1. Buy Equipment                    |\n"+
                            "|2. Buy a Healing Potion (20 G)      |\n"+
                            "|3. Leave                            |\n"+
                            "|____________________________________|\n");
        int Talk = vendor.nextInt();

        switch (Talk){
            case 1:
                System.out.println( " ____________________________________ \n"+
                                    "|This cool Sword or this shiny Armor?|\n"+
                                    "|1. Sword (200 G)                    |\n"+
                                    "|2. Armor (300 G)                    |\n"+ 
                                    "|____________________________________|\n");
                int upgrades = vendor.nextInt();
                switch (upgrades){
                    case 1:
                    if (swordEquip==1) {System.out.println( " ____________________________________ \n"+
                                                            "|You have already bought that Weapon.|\n"+
                                                            "|____________________________________|\n");}  
                    else if (Game.money<200) {System.out.println(" ____________________________________ \n"+
                                                            "| You don't have enough money to buy |\n"+
                                                            "|         this cool Sword.           |\n"+ 
                                                            "|____________________________________|\n");}
                    else {System.out.println(               " ____________________________________ \n"+
                                                            "|     You bought the cool Sword!     |\n"+
                                                            "|     Hopefully it's as useful       |\n"+
                                                            "|       as it's cool looking!        |\n"+
                                                            "|____________________________________|\n");
                    sword=sword+2;
                    Game.money=Game.money-200;
                    swordEquip=1;}
                    break;
                    case 2:
                    if (armorEquip==1) {System.out.println( " ____________________________________ \n"+
                                                            "|You have already bought that Armor. |\n"+
                                                            "|____________________________________|\n");}  
                    else if (Game.money<300) {System.out.println(" ____________________________________ \n"+
                                                            "| You don't have enough money to buy |\n"+
                                                            "|         this shiny Armor.          |\n"+ 
                                                            "|____________________________________|\n");}
                    else {System.out.println(               " ____________________________________ \n"+
                                                            "|    You bought the shiny Armor!     |\n"+
                                                            "|      Hopefully it's as useful      |\n"+
                                                            "|           as it's shiny!           |\n"+
                                                            "|____________________________________|\n");
                    armor=armor+2;
                    Game.money=Game.money-300;
                    armorEquip=1;}
                    break;
                }
                break;
            case 2:
            if(Game.money>=20){
                int heal = (int) (Math.random()*3+1);
                System.out.println( " ____________________________________ \n"+
                                    "|      You bought the potion!        |\n"+
                                    "|And directly drank it. How wasteful.|\n"+
                                    "|           You gain " + heal + "HP.            |\n"+
                                    "|____________________________________|\n");
            } else                      {System.out.println(" ____________________________________ \n"+
                                                            "|       You don't have enough G.     |\n"+
                                                            "|____________________________________|\n");}
                Game.money=Game.money-20;
                break;
            case 3:
            System.out.println( " ____________________________________ \n"+
                                "|         You leave the shop.        |\n"+
                                "|____________________________________|\n");
            ka ++;
            break;
        }   ka=0;
            Game.decide();
    }        
}
}