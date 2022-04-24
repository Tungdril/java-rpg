import java.util.Scanner;
public class BossFight {

    static boolean inspected = false;
 
   public static void main(String[] args) {
    try {

        //System.out.println("You come across a large set of metal doors. As you edge closer to inspect them, they suddenly open with a loud creak."); Thread.sleep(2000);
        //System.out.println("You enter the freshly opened room and find yourself in a huge hexagonally shaped room."); Thread.sleep(2000);
        //System.out.println("Before you towers an enourmous statue of some kind of winged creature."); Thread.sleep(2000);
        //System.out.println("Raising your torch to inspect the stone object, it suddenly begins to move!"); Thread.sleep(2000);
        //System.out.println("The creature lets out a deafening scream and leaps towards you!"); Thread.sleep(2000);
        
        combat();
    } catch (Exception e) {
        System.out.println(e);
    }
   
}

public static void combat(){
        
        Death.death();
        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}

        int playerDamage = (int) (Math.random()*2+1+Shop.sword); // Default player damage is 1-2 HP 

        try {
        Scanner fight = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        Enemy.Sprites();
        GraphicUi.healthometer();
        GraphicUi.enemyHealthometer();
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("\n----------------------------------------------------------------------"); 
        System.out.println("Your HP:  "+GraphicUi.HealthBar);
        if(inspected==true){
        System.out.println("Enemy HP: "+GraphicUi.EnemyHealthBar);
        }
        System.out.println("----------------------------------------------------------------------"); 
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("\nWhat will you do?");                              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("1. Attack");                                        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("2. Defend");                                        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("3. Inspect "+Enemy.enemy);                          try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("4. Flee");                                          try{Thread.sleep(100);}catch(Exception e){}
        Thread.sleep(150);
        Integer fight2 = fight.nextInt();

        switch(fight2){
            case 1://Attack
                System.out.println("--- Dice Roll ---");
                CombatDice.dice();
                try{Thread.sleep(100);}catch(Exception e){}
                playerDamage = playerDamage + CombatDice.diceModifier;
                System.out.println("You rolled a " + CombatDice.diceRolled + "!");
                System.out.println("You attack the enemy!");
                int newenemyHealth = (Enemy.enemyHealth - playerDamage);
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You dealt " + (Enemy.enemyHealth-newenemyHealth) + " damage."); 
                Enemy.enemyHealth = newenemyHealth;
                try{Thread.sleep(100);}catch(Exception e){}
            break;
            case 2://Defend
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You defend against the incoming attack.");
                try{Thread.sleep(100);}catch(Exception e){}
                Enemy.playerDefense++;
            break;
            case 3://Inspect
            try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("----------------------------------------------------------------------" );try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The "+Enemy.enemy+" seems to have " + GraphicUi.EnemyHealthBar + " HP left"                  );try{Thread.sleep(1000);}catch(Exception e){}
                System.out.println("----------------------------------------------------------------------" );try{Thread.sleep(100);}catch(Exception e){}
                inspected=true;
            break;
            case 4: //Flee
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You try to flee.");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("The doors are locked. There is no escape!");
            break;
            default: //if the Number isn't 1-3
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("That's not an option!");
        }
        
            winstate();
            Thread.sleep(200);
            Enemy.enemyDamageChance = (int) (Math.random()*100+1);
            Enemy.enemyDefenseChance = (int) (Math.random()*100+1 ) ;
            Enemy.enemyDefense=0;
            
            if(Enemy.enemyDefenseChance<16){
                try{Thread.sleep(100);}catch(Exception e){}         //15% Chance for enemy to defend
                System.out.println("\nThe enemy defends!");
                try{Thread.sleep(100);}catch(Exception e){}
                Enemy.enemyDefense++;
            } 
            else if(Enemy.enemyDamageChance>10) {
                try{Thread.sleep(100);}catch(Exception e){}               // If the Enemy doesn't defend he has a 10% Chance to miss his attack
                System.out.println("\nThe enemy attacks!");
                try{Thread.sleep(100);}catch(Exception e){}
                int newenemyDamage = Enemy.enemyDamage-Enemy.playerDefense;
                int newplayerHealth = Enemy.playerHealth-newenemyDamage;
                Enemy.playerHealth = newplayerHealth;
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The enemy did " + newenemyDamage + " HP damage!");
                try{Thread.sleep(500);}catch(Exception e){}
            } else {
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The enemy attacked and missed.");
                try{Thread.sleep(100);}catch(Exception e){}
            }
            Enemy.playerDefense=0;
            Thread.sleep(150);
        } catch(Exception e){System.out.println("use Numbers");}}

public static void healthCalc() { 
        try {Thread.sleep(200);} catch(Exception e) {System.out.println("shit");}
        while(true) {
         combat();
            if (Enemy.playerHealth<=0){
            break;
            }
            if (Enemy.enemyHealth<=0){
            break;
            }
        }
        //deathstate
        Death.death(); 
        
        //winstate
        winstate(); 
    }        

public static void winstate(){ //winstate
        if (Enemy.enemyHealth<=0){
            AudioManager.stopBoss();
            AudioManager.mainCredits();

            try{Thread.sleep(100);}catch(Exception e){}                                        
            System.out.println("----------------------------------------------------------------------");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("You have successfully beaten the "+Enemy.enemy);
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("The doors swing open behind you and an old man enters the champer to greet you.");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\"Congratulations young warrior! You have completed the initiation!\"");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\"You have earned your membership in the adventures guild. New dungeons await you now, child.\"");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\"Come, let us celebrate your victory. First round on me!\"");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("And so your first andventure ends. But there is a whole new world out there, just waiting for you to explore it!");
            try{Thread.sleep(1000);}catch(Exception e){}
            System.out.println("\"Come, let us celebrate your victory. First round on me!\"");
            try{Thread.sleep(5000);}catch(Exception e){}
            
            Credits.main(null);
            //AudioManager.main(null);
            
        }
    }

}


