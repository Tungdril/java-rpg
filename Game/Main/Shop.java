import java.util.Scanner;

//building a vendor
public class Shop {
    static int money=2000;
    static int sword=0;
    static int armor=0;
    static boolean Sword = money >= 200;
    static boolean Armor = money >= 300;
    static int swordEquip;
    static int armorEquip;
    
public static void main(String[] args){ 
    shop();  
}
    public static void shop(){
        boolean S=swordEquip!=0;
        boolean A=armorEquip!=0;
        Scanner vendor = new Scanner(System.in);
        int ka = 0;
        boolean sop = ka==0 ;
        System.out.print(   " ____________________________________ \n"+  
                            "|      You have entered the Shop.    |\n"+
                            "|____________________________________|\n");
        while (sop) {
        System.out.print(   "|       \"What are you buying?\"       |\n"+ 
                            "|    says the dwarven shopkeeper     |\n"+
                            "|  You currently have " + money + "G.         |\n"+
                            "|------------------------------------|\n"+
                            "|           You choose to:           |\n"+
                            "|1. Buy Equipment                    |\n"+
                            "|2. Buy a Healing Potion (20 G)      |\n"+
                            "|3. Leave                            |\n"+
                            "|____________________________________|");
        int Talk = vendor.nextInt();

        switch (Talk){
            case 1:
                System.out.println("This cool Sword or this shiny Armor?\n1. Sword (200 G)\n2. Armor (300 G)");
                int upgrades = vendor.nextInt();
                switch (upgrades){
                    case 1:
                    if (swordEquip==1) {System.out.println( "|------------------------------------|\n"+
                                                            "|You have already bought that Weapon.|\n"+
                                                            "|------------------------------------|\n");}  
                    else if (money<200) {System.out.println("|------------------------------------|\n"+
                                                            "| You don't have enough money to buy |\n"+
                                                            "|         this cool Sword.           |\n"+ 
                                                            "|------------------------------------|\n");}
                    else {System.out.println("You bought a cool sword!\nHopefully it's as useful as it's cool looking!");
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
                System.out.println("You bought the potion! \nAnd directly drank it. How wasteful.\nYou gain " + heal + "HP.");
            } else                      {System.out.println("You don't have enough G.");}
                money=money-20;
                break;
            case 3:
            System.out.println("You leave the shop.");
            ka ++;
                break;
        } ka=0;
    }        
}
}