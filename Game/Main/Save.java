import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Save {
//save system complete, only need a load system
public static void main(String[] args) {
    //set userName to the name of the player
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(1000);}catch(Exception e){}
    readingPain();
}

public static void creatingSave(){
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(1000);}catch(Exception e){}
    readingPain(); 
}

public static void createFile() {

    File f = new File("saves/" + Game.userName + ".txt");
       if(f.exists()){ 
        f.delete();
        try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");} 
        } else 
        {try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");}}
    }


public static String getSavePath(){
        return "saves/" + Game.userName + ".txt";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter("saves/" + Game.userName + ".txt");
    Exp.Exp = Integer.toString(Exp.exp);
    Game.Money = Integer.toString(Game.money);
    Game.Day = Integer.toString(Game.day);
    Shop.ArmorEquip = Integer.toString(Shop.armorEquip);
    Shop.SwordEquip = Integer.toString(Shop.swordEquip); 
    writingSave.write(Exp.Exp +"\n"+ Game.Money +"\n" + Game.Day+"\n"+ Shop.ArmorEquip + "\n" + Shop.SwordEquip);
    writingSave.close();
    System.out.println("Saved");
    } catch(IOException e) {System.out.println("Breeki"); e.printStackTrace();}
}
public static void readingPain(){
    try {
        File f = new File("saves/" + Game.userName + ".txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            Exp.Exp = reader.nextLine();
            Game.Money = reader.nextLine();
            Game.Day = reader.nextLine();
            Shop.ArmorEquip = reader.nextLine();
            Shop.SwordEquip = reader.nextLine();
            Exp.exp = Integer.parseInt(Exp.Exp);
            Game.money = Integer.parseInt(Game.Money);
            Game.day = Integer.parseInt(Game.Day);
            Shop.armorEquip = Integer.parseInt(Shop.ArmorEquip);
            Shop.swordEquip = Integer.parseInt(Shop.SwordEquip);
           // System.out.println("Exp: " + Exp.exp);
           // System.out.println("Money: " + Game.money);
           // System.out.println("Day: " + Game.day);
           // System.out.println("Armor " + Shop.armorEquip);
           // System.out.println("Sword: " + Shop.swordEquip);
        }
            reader.close();
        } catch (Exception e) {}
}
}