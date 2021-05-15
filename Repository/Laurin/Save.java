import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
public class Save {
//save system complete, only need a load system
public static void main(String[] args) {
    Game.userName = "John"; //set userName to the name of the player
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(1000);}catch(Exception e){}
    readingPain();
}

public static void createFile() {

    File f = new File("res/" + Game.userName + ".txt");
       if(f.exists()){ 
        f.delete();
        try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");} 
        } else 
        {try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");}}
    }


public static String getSavePath(){
        return "res/" + Game.userName + ".txt";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter("res/" + Game.userName + ".txt");
    Game.Exp = Integer.toString(Game.exp);
    Game.Money = Integer.toString(Game.money);
    Game.Day = Integer.toString(Game.day);
    writingSave.write(Game.Exp +"\n"+ Game.Money +"\n" + Game.Day);
    writingSave.close();
    System.out.println("");
    } catch(IOException e) {System.out.println("Breeki"); e.printStackTrace();}
}
public static void readingPain(){
    try {
        File f = new File("res/" + Game.userName + ".txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            Game.Exp = reader.nextLine();
            Game.Money = reader.nextLine();
            Game.Day = reader.nextLine();
            Game.exp = Integer.parseInt(Game.Exp);
            Game.money = Integer.parseInt(Game.Money);
            Game.day = Integer.parseInt(Game.Day);
            System.out.println("Exp: " + Game.exp);
            System.out.println("Money: " + Game.money);
            System.out.println("Day: " + Game.day);
        }
            reader.close();
        } catch (Exception e) {}
}
}