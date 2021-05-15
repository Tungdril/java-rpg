
import java.util.Scanner;

//building a vendor
public class Shop {
    static int money=2000;
    static int sword=0;
    static int armor=0;
    static int swordEquip;
    static int armorEquip;
    
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
                            "|  You currently have " + money + "G.         |\n"+
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
                    else if (money<200) {System.out.println(" ____________________________________ \n"+
                                                            "| You don't have enough money to buy |\n"+
                                                            "|         this cool Sword.           |\n"+ 
                                                            "|____________________________________|\n");}
                    else {System.out.println(               " ____________________________________ \n"+
                                                            "|     You bought a cool sword!       |\n"+
                                                            "|     Hopefully it's as useful       |\n"+
                                                            "|       as it's cool looking!        |\n"+
                                                            "|____________________________________|\n");
                    sword=sword+2;
                    money=money-200;
                    swordEquip=1;}
                        break;
                    case 2:
                    
                    break;
                }
                break;
            case 2:
            if(money>=20){
                int heal = (int) (Math.random()*3+1);
                System.out.println( " ____________________________________ \n"+
                                    "|      You bought the potion!        |\n"+
                                    "|And directly drank it. How wasteful.|\n"+
                                    "|           You gain " + heal + "HP.            |\n"+
                                    "|____________________________________|\n");
            } else                      {System.out.println("You don't have enough G.");}
                money=money-20;
                break;
            case 3:
            System.out.println( " ____________________________________ \n"+
                                "|         You leave the shop.        |\n"+
                                "|____________________________________|\n");
            ka ++;
            Game.decide();
                break;
        } ka=0;
    }        
}
}