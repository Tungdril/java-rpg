import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Save {
//save and load complete
public static void main(String[] args) {
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(1000);}catch(Exception e){}
    readingPain();
}

public static void creatingSave(){
    createFile();
    writingPain();
    try{Thread.sleep(200);}catch(Exception e){}
    readingPain(); 
}

public static void createFile() {

    File f = new File(createSaveFolder.savepath + Game.userName + ".txt");
       if(f.exists()){ 
        f.delete();
        try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");Game.main(null);} 
        } else 
        {try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");Game.main(null);}}
    }


public static String getSavePath(){
        return createSaveFolder.savepath + Game.userName + ".txt";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter(createSaveFolder.savepath + Game.userName + ".txt");
    Exp.Exp = Double.toString(Exp.exp);
    Game.Money = Integer.toString(Game.money);
    Game.Day = Integer.toString(Game.day);
    Shop.ArmorEquip = Integer.toString(Shop.armorEquip);
    Shop.SwordEquip = Integer.toString(Shop.swordEquip); 
    Enemy.PlayerHealth = Integer.toString(Enemy.playerHealth); 
    writingSave.write(Exp.Exp +"\n"+ Game.Money +"\n" + Game.Day+"\n"+ Shop.ArmorEquip + "\n" + Shop.SwordEquip +"\n"+ Enemy.PlayerHealth);
    writingSave.close();
    System.out.println("//////Saving\\\\\\\\\\\\");
    } catch(IOException e) {System.out.println("Breeki"); e.printStackTrace();}
}
public static void readingPain(){
    try {
        File f = new File(createSaveFolder.savepath + Game.userName + ".txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            Exp.Exp = reader.nextLine();
            Game.Money = reader.nextLine();
            Game.Day = reader.nextLine();
            Shop.ArmorEquip = reader.nextLine();
            Shop.SwordEquip = reader.nextLine();
            Enemy.PlayerHealth = reader.nextLine();
            Exp.exp = Double.parseDouble(Exp.Exp);
            Game.money = Integer.parseInt(Game.Money);
            Game.day = Integer.parseInt(Game.Day);
            Shop.armorEquip = Integer.parseInt(Shop.ArmorEquip);
            Shop.swordEquip = Integer.parseInt(Shop.SwordEquip);
            Enemy.playerHealth = Integer.parseInt(Enemy.PlayerHealth);
           // System.out.println("Exp: " + Exp.exp);
           // System.out.println("Money: " + Game.money);
           // System.out.println("Day: " + Game.day);
           // System.out.println("Armor " + Shop.armorEquip);
           // System.out.println("Sword: " + Shop.swordEquip);
        }
            reader.close();
        } catch (Exception e) {System.out.println("The Load system is fucked."); Game.main(null);}
}
}