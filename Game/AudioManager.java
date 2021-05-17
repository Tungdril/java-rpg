import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


public class AudioManager{

  //defines the 3 used clips, so they can be accessed later
  static Clip clipBgm;
  static Clip clipDeath;
  static Clip clipBattle;

  public static void main(String[] args){ //Background music (bgm)
         
        String path = "./Game/Audio/bgm.wav"; //defines the path
        try {
            clipBgm = AudioSystem.getClip();   //binds the AudioSystem to the clip
            File file = new File(path);       //reads the filepath
            AudioInputStream bgm = AudioSystem.getAudioInputStream(file); //defines the clip as the file
            clipBgm.open(bgm);  //initializes the clip
            clipBgm.start();    //plays the clip
            clipBgm.loop(Clip.LOOP_CONTINUOUSLY); //loops the clip
            Thread.sleep(200);
          } catch (Exception ex) {
              ex.printStackTrace();
          }
    }     


    public static void mainBattle(){ //Battle music (battle)
         
      String path = "./Game/Audio/Battle.wav";
      try {
          clipBattle = AudioSystem.getClip();
          File file = new File(path);
          AudioInputStream battle = AudioSystem.getAudioInputStream(file);
          clipBattle.open(battle);
          clipBattle.start();
          clipBattle.loop(Clip.LOOP_CONTINUOUSLY);
          Thread.sleep(200);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
}   

public static void mainDeath(){ //Death music (death)
         
  String path = "./Game/Audio/death.wav";
  try {
      clipDeath = AudioSystem.getClip();
      File file = new File(path);
      AudioInputStream death = AudioSystem.getAudioInputStream(file);
      clipDeath.open(death);
      clipDeath.start();
      clipDeath.loop(Clip.LOOP_CONTINUOUSLY);
      Thread.sleep(200);
      //stop();
  } catch (Exception ex) {
      ex.printStackTrace();
  }
}   
  
//stops the music if called, need 3 seperate ones, can't close ones that aren't playing, throws error
 public static void stopBgm(){
     try {
         clipBgm.stop();
         clipBgm.close();
         
     } catch (Exception ex) {
          ex.printStackTrace();
     }     
  }  
  public static void stopBattle(){
    try {
        clipBattle.stop();
        clipBattle.close();
        
    } catch (Exception ex) {
         ex.printStackTrace();
    }     
 }
 public static void stopDeath(){
  try {
      clipDeath.stop();
      clipDeath.close();
      
  } catch (Exception ex) {
       ex.printStackTrace();
  }     
}
}