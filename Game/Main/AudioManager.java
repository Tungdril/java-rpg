import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


public class AudioManager{
 public static void playSound(){
    while (true){
      if(Death.stopMusic==1){
        return;
    }else{
        try {   
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./Game/Main/Audio/sawsquarenoise-Stage-3.wav"));//.getAbsoluteFile() ("./Audio/sawsquarenoise-Stage-3.wav")
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        Death.stopMusic = 1;
        Thread.sleep(100);
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
    }  
   }
 }          		
}
