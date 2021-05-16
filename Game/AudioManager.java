import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


public class AudioManager{
 public static void playSound(){
   String soundFile = "./java-rpg/Game/Audio/bgm.wav";
    while (true){
      if(Death.stopMusic==1){ //prevents playing in certain cases
        return;
    }else{
        try {   
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
        System.out.println();
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        Death.stopMusic = 1; //prevents endless loop
        Thread.sleep(100);
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
        System.exit(0);
      }
    }  
   }
 }          		
}
