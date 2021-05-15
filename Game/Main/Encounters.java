import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
public class Encounters {

static String enemy;
static int enemyHealth;
static int playerHealth = 8;
static int playerDamage;
static int enemyDamage = 1;
static int playerDefense = 0 + Shop.armor;
static int enemyDefense = 0;
static int enemyDefenseChance;
static int enemyDamageChance;
static double difficulty;

    public static void fight(){
        int randomEnemy = (int) (Math.random()*100+1);
        if(randomEnemy <= 50){
            enemy = "Goblin";
            enemyHealth = 4;
            difficulty = 0.85;
        } else if(randomEnemy >50 & randomEnemy <=80){
            enemy = "Skeleton";
            enemyHealth = 6;
            difficulty = 1.0;
        } else{
            enemy = "Orc";
            enemyHealth = 8;
            difficulty = 1.15;
        }
         System.out.println("As you are marching deeper into the cave system, you are suprised by an angry " + enemy+"!");
        }

    public static void combat(){
        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
        int playerDamage = (int) (Math.random()*2+1+Shop.sword); // Player damage is 1-2 HP 

        try {
        Scanner fight = new Scanner(System.in);       
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("\nWhat will you do?\n1. Attack\n2. Defend\n3. Check Health\n4. Flee");

        Thread.sleep(150);
        Integer fight2 = fight.nextInt();
            if (fight2==1){ //Attack
                System.out.println("You attacked the Enemy!");
                int newenemyHealth = (enemyHealth - playerDamage);
                System.out.println("You did " + (enemyHealth-newenemyHealth) + " Damage."); //
                enemyHealth = newenemyHealth;
            }
            else if (fight2==2){ //Defend
                System.out.println("You defend against the incoming attack.");
                playerDefense++;
            }
            else if (fight2==3){ //Check Health
                System.out.println("----------------------------------------------------------------------");
                System.out.println("The Enemy has still " + enemyHealth + " HP left");
                System.out.println("You still have " + playerHealth + " HP left");
                System.out.println("----------------------------------------------------------------------");
            }
            else if (fight2==4){ //Flee
                System.out.println("You tried to flee! But to no avail");
    
            }
            else { //if the Number isn't 1-4
                System.out.println("That's not an option!");
                //int newplayerHealth = (playerHealth-playerHealth);
                //playerHealth = newplayerHealth; 
            }
            Thread.sleep(200);
            enemyDamageChance = (int) (Math.random()*100+1);
            enemyDefenseChance = (int) (Math.random()*100+1 ) ;
            enemyDefense=0;
            
            if(enemyDefenseChance<16){                              //15% Chance for enemy to defend
                System.out.println("The Enemy defends!");
                enemyDefense++;
            } 
            else if(enemyDamageChance>1) {                         // If the Enemy doesn't defend he has a 1% Chance to miss his attack
                System.out.println("The Enemy attacks!");
                int newenemyDamage = enemyDamage-playerDefense;
                int newplayerHealth = playerHealth-newenemyDamage;
                playerHealth = newplayerHealth;
                System.out.println("The Enemy did " + newenemyDamage + " HP damage!");
            } else {
                System.out.println("The Enemy attacked and missed.");
            }
            playerDefense=0;
            Thread.sleep(150);
        } catch(Exception e){System.out.println("shit");}}

    public static void nothing(){
        int nothing = (int) (Math.random()*5+1);
        switch (nothing) {
            case 1:
            System.out.println("You walk aimlessly through the cave system.\nNothing interesting happens."); 
            break;            
            case 2:
            System.out.println("You march deeper into the cave, sometimes changing directions here and there.\nBoring!");
            break;            
            case 3:
            System.out.println("The caves seems to take no end at all.\nYou wander deeper and deeper with no events whatsoever.");
            break;            
            case 4:
            System.out.println("Other than the constant dripping of water and the echo of your own steps,\nyou fail to notice anything significant.");
            break;
            case 5:
            System.out.println("Endless rock and stone surrounds you. You feel the weight of the earth above you.\nYou're starting to wonder if you'll find your way out again...");
            break;
        }
    } 

    //creates small, medium, large loot, by multiplying with lootSize
    public static void loot(){ 
        int lootSize = (int) (Math.random()*3+1);
        int lootValue = (int) (Math.random()*10*lootSize+5);
        switch (lootSize) {
            case 1:
            System.out.println("You enter a small cave, the walls are overgrown with moss. To your right you can see a faint glimmering in the overgrowth.\n"+"Upon closer inspection it seems like a few coins were reflecting the light of your torch.\n"+
            "You find ["+ lootValue+"] G!");
            break;
            case 2:
            System.out.println("Examining the new cave you just entered, you see a lifeless skeleton lying collapsed against the wall.\nYou approach the body and snatch it's wallet\n"+
            "It had ["+ lootValue+"] G in it!");
            break;
            case 3:
            System.out.println("As you continue to walk deeper and deeper into the cave, you suddenly stumble over something.\n"+"You look down and discover that something is a half-buried treasure chest!\n"+
            "It is filled with ["+ lootValue+"] G!");
            break;      
        }
        
    }

    //loops combat until player or enemy is dead
    public static void healthCalc() { 
        try {Thread.sleep(200);} catch(Exception e) {System.out.println("shit");}
        while(true) {
         combat();
            if (playerHealth<=0){
            break;
            }
            if (enemyHealth<=0){
            break;
            }
        }
        if (playerHealth<=0){ //deathstate
            Game.day ++; 
            System.out.println(
"                                 _____  _____ \n"+
"                                <     `/     | \n"+            
"                                 >          ( \n"+
"                                |   _     _  | \n"+            
"                                |  |_) | |_) | \n"+
"                                |  | \\ | |   | \n"+    //don't remove space here or it'll break        
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
            Game.day --; //need this to undo the previous increment, which was used for the graphic only
        }

        if (enemyHealth<=0){                                        
            System.out.println("You have successfully beaten the "+enemy);      //winstate
            int reward = (int) (Math.random()*10 * difficulty + 10);
            int loot = Game.money + reward;
            System.out.println("You found [" + loot + "] G!");
            Game.decide(); //calls decide to let the player make the next move              
        }  
    }    

    //home, heals player, and returns to decide()
    public static void home(){
        int restingHealth = (int) (Math.random()*3);
        playerHealth = restingHealth+playerHealth;
        System.out.println("You find your way back to the surface and walk back home to have a rest.\nThe next day you walk right back into the cave.");
        System.out.println("You regenerated "+restingHealth+" health!");
        Game.decide();
    }

    
}