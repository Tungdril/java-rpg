import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;
public class createSaveFolder{
        static String userpath = System.getProperty("user.home");
        static String savepath = userpath+"/Documents/JavaRPG/saves/";     
    public static void main(String[] args){
        createFold();
    }
    public static void createFold(){
        new File(savepath).mkdirs();
        
    }
    public static void SaveLoad(){
        Scanner Name = new Scanner(System.in);
        System.out.println("Please enter your Username");
        Game.userName = Name.next();
        System.out.println("Do you wish to \n1. create \nor \n2. load \na save file");
        int savefile = Name.nextInt();
        switch(savefile){
            case 1: Save.creatingSave();System.out.println(""); break; 
            case 2: Save.readingPain();System.out.println("//////Loading\\\\\\\\\\\\"); break;
            default: System.out.print("Please use 1 or 2"); SaveLoad();
        }}
}