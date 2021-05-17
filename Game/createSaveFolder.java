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
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("Do you wish to"         );  try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. create"              );  try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("     or"                );  try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2.  load"               );  try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("a save file"            );  try{Thread.sleep(100);}catch(Exception e){}
        try{Thread.sleep(100);}catch(Exception e){}
        int savefile = Name.nextInt();
        switch(savefile){
            case 1: Save.creatingSave();System.out.println(""); break; 
            case 2: Save.readingPain();System.out.println("//////Loading\\\\\\\\\\\\"); break;}
        } catch(Exception e){System.out.println("Use Numbers");Game.main(null);}
        
}
}