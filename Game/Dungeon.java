import java.util.Scanner;

public class Dungeon {
    public static int depth = 0;
    public static int depth2 = 0;
    public static int depth4 = 0;
    public static int depth6 = 0;
    public static int depth8 = 0;
    public static int depth9 = 0;
    public static void main(String[] args){dungeonEnt();}
    public static void dungeon()
    {
        Exp.main();
        if (depth < 10) 
        {
        System.out.println("----------------------------------------------------------------------");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                ┌────┐");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                | 0"+depth+" |");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                └────┘");   try{Thread.sleep(100);}catch(Exception e){}
        }
        else
        {
        System.out.println("----------------------------------------------------------------------");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                ┌────┐");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                | "+depth+" |");   try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                                                                └────┘");   try{Thread.sleep(100);}catch(Exception e){}
        }
    }
    public static void dungeonEnt()
    {
        Exp.main();
        GraphicUi.status();
        try{Thread.sleep(600);}catch(Exception e){}
        System.out.println("Decide what to do next."                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Go into the dungeon"       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Return Points"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("4. Go back to the city"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("5. Leave the Game"                      );          try{Thread.sleep(100);}catch(Exception e){}
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
                Game.day++;
                depth++;
                Game.explore();
            break;
            case 2:
                depthCalc1();
                returnPoints();
            case 3: 
                City.cityCenter(); 
            break;
            case 4:
            System.exit(0);
            default: 
            System.out.println("That's not an option!");
            dungeonEnt();
     
        }
    }
    
    public static void depthCalc0(){
        if(depth2==1) {depth = 20;}
        else if (depth4==1) {depth = 40;}
        else if (depth6==1) {depth = 60;}
        else if (depth8==1) {depth = 80;}
        else if (depth9==1) {depth = 99;}}

    public static void depthCalc1(){
        if(depth >= 20) {depth2 = 1;}
        else if (depth >= 40) {depth4 = 1;}
        else if (depth >= 60) {depth6 = 1;}
        else if (depth >= 80) {depth8 = 1;}
        else if (depth >= 99) {depth9 = 1;}}
    
    public static void returnPoints(){
        System.out.println("Choose which Return Point you wish to return to"                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Return"       );          try{Thread.sleep(100);}catch(Exception e){}
        if (depth2 == 1) {System.out.println("2. Return Point in Depth 20"       );          try{Thread.sleep(100);}catch(Exception e){}}
        if (depth4 == 1) {System.out.println("3. Return Point in Depth 40"       );          try{Thread.sleep(100);}catch(Exception e){}}
        if (depth6 == 1) {System.out.println("4. Return Point in Depth 60"       );          try{Thread.sleep(100);}catch(Exception e){}}
        if (depth8 == 1) {System.out.println("5. Return Point in Depth 80"       );          try{Thread.sleep(100);}catch(Exception e){}}
        if (depth9 == 1) {System.out.println("6. Return Point in Depth 99"       );          try{Thread.sleep(100);}catch(Exception e){}}
        
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
            dungeonEnt();            
            case 2:
                depth = 20;
                Game.explore();
            case 3: 
                depth = 40;
                Game.explore();
            case 4:
                depth = 60;
                Game.explore();
            case 5:
                depth = 80;
                Game.explore();
            case 6:
                depth = 99;
                Game.explore();
            default: 
            System.out.println("That's not an option!");
            returnPoints();
        }
    }
}
