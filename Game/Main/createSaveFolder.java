import java.io.File;
import java.nio.file.Path;

public class createSaveFolder{
        static String userpath = System.getProperty("user.home");
        static String savepath = userpath+"/Documents/JavaRPG/saves/";     
    public static void main(String[] args){
        createFold();
    }
    public static void createFold(){
        new File(savepath).mkdirs();
        
    }
}