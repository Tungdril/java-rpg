import java.io.File;
import java.util.Scanner;
public class createSaveFolder{
        static String userpath = System.getProperty("user.home");
        static String savepath = userpath+"/Documents/JavaRPG/saves/";     
    public static void main(String[] args){
        Game.main(null);
    }
    public static void createFold(){
        new File(savepath).mkdirs();
        
    }
    public static void SaveLoad(){
        try{
        Scanner Name = new Scanner(System.in);
        System.out.println("Please enter your Name");
        Game.userName = Name.next();
        System.out.println("Do you wish to \n1. create \n     or \n2. load \na save file");
        int savefile = Name.nextInt();
        switch(savefile){
            case 1: Save.creatingSave();System.out.println(""); break; 
            case 2: Save.readingPain();System.out.println("//////Loading\\\\\\\\\\\\"); break;}
        } catch(Exception e){System.out.println("Use Numbers");Game.main(null);}
        
}
}