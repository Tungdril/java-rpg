import java.util.Scanner;
public class City {
    public static int gut=0;
    public static void guild(){
        System.out.println("Decide what to do next."                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Go to sleep"       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Go to the City Center"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Talk to the drunkard"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("4. Leave the Game"                      );          try{Thread.sleep(100);}catch(Exception e){}
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
            Encounters.home();
            break;
            case 2: 
            cityCenter(); 
            break;
            case 3:
                drunk();
            break;
            case 4: //ends the code
            System.exit(0);
            default: 
            System.out.println("That's not an option!");
            guild();
        }
    }


    public static void cityCenter(){
        System.out.println("Decide what to do next."                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Go to the Guild"       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Go exploring"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Leave the Game"                      );          try{Thread.sleep(100);}catch(Exception e){}
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
            guild();
            break;
            case 2:
            Game.decide(); 
            break;
            case 3: //ends the code
            System.exit(0);
            default: 
            System.out.println("That's not an option!");
            cityCenter();
        }
    }
    public static void drunk(){
        System.out.println("\"Ever heard of the legendary leek?\""                );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. \"You mean the <<Leek of Legends>>?\""       );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Punch him in the Gut ["+gut+"]"    );          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Ignore him"                      );          try{Thread.sleep(100);}catch(Exception e){}
        Scanner choice = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        int option = choice.nextInt();
        switch (option) {
            case 1:
            Enemy.playerHealth=0;
            Death.death();
            break;
            case 2:
            System.out.println("You punched him in the gut"                    );          try{Thread.sleep(100);}catch(Exception e){}
            gut++;
            guild();
            break;
            case 3: //ends the code
            guild();
            default: 
            System.out.println("That's not an option!");
            drunk();
        }
    }
}
