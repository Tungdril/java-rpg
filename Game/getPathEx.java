import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//responsible for correctly finding the location of the audio 
public class getPathEx {
    public static void main(String[] args){
        File sound = new File("java-rpg/Game/Main/Audio/bgm.wav");
        Path path = Paths.get("./Audio/bgm.wav");
        System.out.println(sound.getAbsolutePath());
         
    }
}
