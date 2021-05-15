import java.util.Scanner;

//building a vendor
public class Shop {
    static int healthPotion;
    static int money=20;
    public static void main(String[] args){
            shop();
    
        }
    public static void shop(){
        Scanner vendor = new Scanner(System.in);
        System.out.print(   "--------------------------\n"+
                            "You have entered the Shop.\n"+
                            "--------------------------\n"+
                            "What are you buying? says the shopkeeper."+
                            "You choose to do:\n"+
                            "1. Buy Equipment\n"+
                            "2. Buy a Healing Potion (20 G)\n"+
                            "3. Leave\n");
        int Talk = vendor.nextInt()+1;

        switch (Talk){
            case 1:
                System.out.println("ye");

            case 2:
            if(money>=20){
                int heal = (int) (Math.random()*3+1);
                System.out.println("You bought the potion! \nAnd directly drank it. How wasteful.\nYou heal " + heal + "HP.");
            } else                      {System.out.println("You don't have enough G.");}
            case 3:
            System.out.println("nonye");
        
        }        
    }
}
