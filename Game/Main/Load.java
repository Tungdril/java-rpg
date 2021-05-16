import java.io.File;
import java.util.Scanner;
public class Load { //just for loading a savefile
    public static void main(String[] args) {
        readingPain2();
    };
    
    public static void readingPain2(){
        try {
            File f = new File("saves/" + Game.userName + ".txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                Exp.Exp = reader.nextLine();
                Game.Money = reader.nextLine();
                Game.Day = reader.nextLine();
                Shop.ArmorEquip = reader.nextLine();
                Shop.SwordEquip = reader.nextLine();
                Exp.exp = Integer.parseInt(Exp.Exp);//
                Game.money = Integer.parseInt(Game.Money);
                Game.day = Integer.parseInt(Game.Day);
                Shop.armorEquip = Integer.parseInt(Shop.ArmorEquip);
                Shop.swordEquip = Integer.parseInt(Shop.SwordEquip);
            // System.out.println("Exp: " + Game.exp);
            // System.out.println("Money: " + Game.money);
            //  System.out.println("Day: " + Game.day);
            //  System.out.println("Armor " + Shop.armorEquip);
            //  System.out.println("Sword: " + Shop.swordEquip);
                reader.close();

        }
    } catch(Exception e){System.out.println("Something went wron while loading.");}
}
}