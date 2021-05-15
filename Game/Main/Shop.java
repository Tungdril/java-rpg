import java.util.Scanner;

//building a vendor
public class Shop {
    static int money=20;
    static int sword;
    
public static void main(){ 
  shop();  
}
    public static void shop(){
        Scanner vendor = new Scanner(System.in);
        int ka = 0;
        boolean sop = ka==0 ;
        while (sop) {
        System.out.print(   "--------------------------\n"+
                            "You have entered the Shop.\n"+
                            "--------------------------\n"+
                            "What are you buying? says the shopkeeper."+
                            "You choose to do:\n"+
                            "1. Buy Equipment\n"+
                            "2. Buy a Healing Potion (20 G)\n"+
                            "3. Leave\n");
        int Talk = vendor.nextInt();

        switch (Talk){
            case 1:
                System.out.println("A new Sword or a new Armor?\n1. Sword (200 G)\n2. Armor ()");
                int upgrades = vendor.nextInt();
                switch (upgrades){
                    case 1:
                    case 2:
                }
                break;
            case 2:
            if(money>=20){
                int heal = (int) (Math.random()*3+1);
                System.out.println("You bought the potion! \nAnd directly drank it. How wasteful.\nYou heal " + heal + "HP.");
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