public class Death {
    public static void death(){
        if (Encounters.playerHealth<=0){ //deathstate 
            System.out.println(
"                                 _____  _____ \n"+
"                                <     `/     | \n"+            
"                                 >          ( \n"+
"                                |   _     _  | \n"+            
"                                |  |_) | |_) | \n"+
"                                |  | \\ | |   | \n"+    
"                                |            | \n"+
"                 ______.______%_|            |_________________ \n"+            
"               _/                                              | \n"+
"              |                                                < \n"+        
"              |_____.-._________              ____/|___________| \n"+
"                                | * Day 0    | \n"+            
"                                | + Day "+Game.day+"    | \n"+    
"                                |            | \n"+            
"                                |            | \n"+
"                                |   _        < \n"+            
"                                |__/         | \n"+
"                                 / `--.      | \n"+            
"                               %|            |% \n"+
"                           |/.%%|          -< @%%% \n"+            
"                           ` %`@|     v      |@@%@%%     \n"+
"                         .%%%@@@|%    |    % @@@%%@%%%% \n"+            
"                    _.%%%%%%@@@@@@%%_/%__%@@%%@@@@@@@%%%%%% \n"
                 
            );
            System.out.print("Press [ENTER] to get to the Main \"menu\"");
            try{
                System.in.read();
            } catch(Exception e){}
            Game.main(null);

    }
}
}
