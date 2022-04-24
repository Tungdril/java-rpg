import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;


public class AudioManager{

  //defines the 3 used clips, so they can be accessed later
  static Clip clipBgm;
  static Clip clipDeath;
  static Clip clipBattle;
  static Clip clipBoss;
  static Clip clipCredits;

  public static void main(String[] args){ //Background music (bgm)
        File starting = new File(System.getProperty("user.dir")); //defines working directory

        try {
            clipBgm = AudioSystem.getClip();   //binds the AudioSystem to the clip
            File file = new File(starting,"/Game/Audio/bgm.wav");       //reads the filepath
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
         
      File starting = new File(System.getProperty("user.dir"));
      try {
          clipBattle = AudioSystem.getClip();
          File file = new File(starting,"/Game/Audio/battle.wav");
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
         
  File starting = new File(System.getProperty("user.dir"));
  try {
      clipDeath = AudioSystem.getClip();
      File file = new File(starting,"/Game/Audio/death.wav");
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

public static void mainBoss(){ //Battle music (battle)
         
      File starting = new File(System.getProperty("user.dir"));
      try {
          clipBoss = AudioSystem.getClip();
          File file = new File(starting,"/Game/Audio/boss.wav");
          AudioInputStream boss = AudioSystem.getAudioInputStream(file);
          clipBoss.open(boss);
          clipBoss.start();
          clipBoss.loop(Clip.LOOP_CONTINUOUSLY);
          Thread.sleep(200);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
} 

public static void mainCredits(){ //Battle music (battle)
         
      File starting = new File(System.getProperty("user.dir"));
      try {
          clipCredits = AudioSystem.getClip();
          File file = new File(starting,"/Game/Audio/credits.wav");
          AudioInputStream credits = AudioSystem.getAudioInputStream(file);
          clipCredits.open(credits);
          clipCredits.start();
          clipCredits.loop(Clip.LOOP_CONTINUOUSLY);
          Thread.sleep(200);
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
public static void stopBoss(){
    try {
        clipBoss.stop();
        clipBoss.close();
        
    } catch (Exception ex) {
         ex.printStackTrace();
    }     
 }
 public static void stopCredits(){
    try {
        clipCredits.stop();
        clipCredits.close();
        
    } catch (Exception ex) {
         ex.printStackTrace();
    }     
 }
}