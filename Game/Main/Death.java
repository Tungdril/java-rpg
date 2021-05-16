import java.util.Scanner;
public class Death { //made a file for it alone to make it easier to check for a deathstate before and after battle
    
    public static int stopMusic;

    public static void death(){
        if (Enemy.playerHealth<=0){                    //deathstate 
            try{Thread.sleep(1750);}catch(Exception e){}
            stopMusic = 1; //stops bgm   
            System.out.println("                                 You have died"); try{Thread.sleep(2000);}catch(Exception e){System.out.println("HOW?\n(exception in Death.java)");};
                System.out.println("                                 _____  _____ ");                                     try{Thread.sleep(750);}catch(Exception e){} //to make it beautiful
                System.out.println("                                <     `/     | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                 >          ( ");                                     try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |   _     _  | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |  |_) | |_) | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |  | \\ | |   | ");                                   try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |            | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                 ______.______%_|            |_________________ ");                   try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("               _/                                              | ");                  try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("              |                                                < ");                  try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("              |_____.-._________              ____/|___________| ");                  try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                | * Day 0    | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                | + Day "+Game.day+"    | ");                         try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |            | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |            | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |   _        < ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                |__/         | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                                 / `--.      | ");                                    try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                               %|            |% ");                                   try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                           |/.%%|          -< @%%% ");                                try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                           ` %`@|     v      |@@%@%%     ");                          try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                         .%%%@@@|%    |    % @@@%%@%%%% ");                           try{Thread.sleep(750);}catch(Exception e){}
                System.out.println("                    _.%%%%%%@@@@@@%%_/%__%@@%%@@@@@@@%%%%%% ");                       try{Thread.sleep(750);}catch(Exception e){}
                try{Thread.sleep(100);}catch(Exception e){}
            System.out.print("Do you wish to continue?\n1. yes\n2. no\n"); //Player can return to Titlescreen or end the programm
            Scanner d = new Scanner(System.in); //d stands for death
            int postMortem = d.nextInt();
            if(postMortem==1){
            Game.main(null);} //goes back to the Titlescreen
            
            else{System.exit(0);} //exits java

    }
}
}
