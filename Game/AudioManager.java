import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


public class AudioManager{
 public static void playSound(){
  String soundFile = "./Audio/bgm.wav";
  String testmania = "./java-rpg/Game/Audio/bgm.wav";                     //only for testing
  File SoundsTest = new File(testmania);                                  //only for testing
  String soundFileTesting =SoundsTest.getAbsolutePath();                  //only for testing
  File SoundTest = new File(soundFileTesting);                            //only for testing
    while (true){
      if(Death.stopMusic==1){ //prevents playing in certain cases
        return;
    }else{
        try {                                    //changed soundFile to SoundTest and it works for me                                   
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(SoundTest);
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
