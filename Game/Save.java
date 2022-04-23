import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Save {
//save and load complete
static String MetBefore;
static String ShopAffinity;
static String ShopAlchAffinity;
static String CC;
static String CB;
static String DD;
static String HH;
static String SS;
static String Gut;
static File f = new File(createSaveFolder.savepath + Game.userName + ".json");
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

    File f = new File(createSaveFolder.savepath + Game.userName + ".json");
       if(f.exists()){ 
        try {f.delete();f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");Game.main(null);} 
        } else 
        {try {f.delete();f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");Game.main(null);}}}


public static String getSavePath(){
        return createSaveFolder.savepath + Game.userName + ".json";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter(createSaveFolder.savepath + Game.userName + ".json");
    Exp.Exp = Double.toString(Exp.exp);
    Game.Money = Integer.toString(Game.money);
    Game.Day = Integer.toString(Game.day);
    Shop.ArmorEquip = Integer.toString(Shop.armorEquip);
    Shop.SwordEquip = Integer.toString(Shop.swordEquip); 
    MetBefore = Integer.toString(Shop.metBefore);
    Enemy.PlayerHealth = Integer.toString(Enemy.playerHealth); 
    ShopAffinity = Integer.toString(Affinity.shopAffinity);
    ShopAlchAffinity = Integer.toString(Affinity.shopAlchAffinity);
    Gut = Integer.toString(City.gut);
    CC=Integer.toString(Loot.constitutionCabbage);
    CB=Integer.toString(Loot.cookbook);
    DD=Integer.toString(Loot.defenseDandelion);
    HH=Integer.toString(Loot.healingHerb);
    SS=Integer.toString(Loot.strengthShroom);
    writingSave.write(Exp.Exp +"\n"+ Game.Money +"\n"+ Game.Day+"\n"+ Shop.ArmorEquip +"\n"+ Shop.SwordEquip +"\n"+ MetBefore +"\n"+ Enemy.PlayerHealth +"\n"+ ShopAffinity +"\n"+ShopAlchAffinity +"\n"+Gut +"\n"+CC+"\n"+CB+"\n"+DD+"\n"+HH+"\n"+SS );
    writingSave.close();
    System.out.println("//////Saving\\\\\\\\\\\\");
    } catch(IOException e) {System.out.println("Breeki"); e.printStackTrace();}
}
public static void readingPain(){
    if(f.exists()){try {
        File f = new File(createSaveFolder.savepath + Game.userName + ".json");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            Exp.Exp = reader.nextLine();
            Game.Money = reader.nextLine();
            Game.Day = reader.nextLine();
            Shop.ArmorEquip = reader.nextLine();
            Shop.SwordEquip = reader.nextLine();
            MetBefore = reader.nextLine();
            Enemy.PlayerHealth = reader.nextLine();
            ShopAffinity = reader.nextLine();
            ShopAlchAffinity = reader.nextLine();
            Gut = reader.nextLine();
            CC=reader.nextLine();
            CB=reader.nextLine();
            DD=reader.nextLine();
            HH=reader.nextLine();
            SS=reader.nextLine();
            Exp.exp = Double.parseDouble(Exp.Exp);
            Game.money = Integer.parseInt(Game.Money);
            Game.day = Integer.parseInt(Game.Day);
            Shop.armorEquip = Integer.parseInt(Shop.ArmorEquip);
            Shop.swordEquip = Integer.parseInt(Shop.SwordEquip);
            Shop.metBefore = Integer.parseInt(MetBefore);
            Enemy.playerHealth = Integer.parseInt(Enemy.PlayerHealth);
            Affinity.shopAffinity = Integer.parseInt(ShopAffinity);
            Affinity.shopAlchAffinity = Integer.parseInt(ShopAlchAffinity);
            City.gut = Integer.parseInt(Gut);
            Loot.constitutionCabbage=Integer.parseInt(CC);
            Loot.cookbook=Integer.parseInt(CB);
            Loot.defenseDandelion=Integer.parseInt(DD);
            Loot.healingHerb=Integer.parseInt(HH);
            Loot.strengthShroom=Integer.parseInt(SS);
           // System.out.println("Exp: " + Exp.exp);
           // System.out.println("Money: " + Game.money);
           // System.out.println("Day: " + Game.day);
           // System.out.println("Armor " + Shop.armorEquip);
           // System.out.println("Sword: " + Shop.swordEquip);
        }
            reader.close();
        } catch (Exception e) {System.out.println("The Load system is fucked.");AudioManager.stopBgm(); Game.main(null);}
        } else {System.out.println("A savefile for this username was not found.");AudioManager.stopBgm(); Game.main(null);}
    }
}