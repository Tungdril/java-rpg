import java.util.Scanner;
public class Encounters {

static String enemy;
static int enemyHealth;
static int playerHealth = 8 + Exp.expScaling;
static String PlayerHealth;
static int playerDamage;
static int enemyDamage = (int) (Math.random()*2+1); //TODO @Tungdril enemy always does 2HP damage
static int playerDefense = 0 + Shop.armor;
static int enemyDefense = 0;
static int enemyDefenseChance;
static int enemyDamageChance;
static double difficulty;
static int fleeChance;

    public static void fight(){
        int randomEnemy = (int) (Math.random()*100+1);
        if(randomEnemy <= 50){
            enemy = "Goblin";
            enemyHealth = 4 + Exp.expScaling;
            difficulty = 0.85;
        } else if(randomEnemy >50 & randomEnemy <=80){
            enemy = "Skeleton";
            enemyHealth = 6 + Exp.expScaling;
            difficulty = 1.0;
        } else{
            enemy = "Orc";
            enemyHealth = 8 + Exp.expScaling;
            difficulty = 1.15;
        }
         System.out.println("As you are marching deeper into the cave system, you are suprised by an angry " + enemy + "!");
        }

    public static void combat(){
        Death.death();
        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
        int playerDamage = (int) (Math.random()*2+1+Shop.sword); // Player damage is 1-2 HP 

        try {
        Scanner fight = new Scanner(System.in);       
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("\nWhat will you do?\n1. Attack\n2. Defend\n3. Check Health\n4. Flee");

        Thread.sleep(150);
        Integer fight2 = fight.nextInt();
            if (fight2==1){ //Attack
                System.out.println("You attacked the enemy!");
                int newenemyHealth = (enemyHealth - playerDamage);
                System.out.println("You did " + (enemyHealth-newenemyHealth) + " damage."); 
                enemyHealth = newenemyHealth;
            }
            else if (fight2==2){ //Defend
                System.out.println("You defend against the incoming attack.");
                playerDefense++;
            }
            else if (fight2==3){ //Check Health
                System.out.println("----------------------------------------------------------------------");
                System.out.println("The enemy has still " + enemyHealth + " HP left");
                System.out.println("You still have " + playerHealth + " HP left");
                System.out.println("----------------------------------------------------------------------");
            }
            else if (fight2==4){ //Flee
                System.out.println("You tried to flee.");
                fleeChance = (int) (Math.random()*100+1);
                if(fleeChance<= 40){    // 40% Chance to flee from combat, the player will then be put in decision
                    System.out.println("And succeeded at that!");
                    Game.decide();
                } else {System.out.println("But to no avail!");} // 60% chance to not flee, the player used his turn and gained nothing
            }
            else { //if the Number isn't 1-4
                System.out.println("That's not an option!");
                playerHealth = (playerHealth-playerHealth); //if the player is to stupid to use 1,2,3 or 4 he will be disposed immediatly
                Death.death(); 
            }
            Thread.sleep(200);
            enemyDamageChance = (int) (Math.random()*100+1);
            enemyDefenseChance = (int) (Math.random()*100+1 ) ;
            enemyDefense=0;
            
            if(enemyDefenseChance<16){                              //15% Chance for enemy to defend
                System.out.println("The enemy defends!");
                enemyDefense++;
            } 
            else if(enemyDamageChance>1) {                         // If the Enemy doesn't defend he has a 1% Chance to miss his attack
                System.out.println("The enemy attacks!");
                int newenemyDamage = enemyDamage-playerDefense;
                int newplayerHealth = playerHealth-newenemyDamage;
                playerHealth = newplayerHealth;
                System.out.println("The enemy did " + newenemyDamage + " HP damage!");
            } else {
                System.out.println("The enemy attacked and missed.");
            }
            playerDefense=0;
            Thread.sleep(150);
        } catch(Exception e){System.out.println("use Numbers");}}

        //just skips a day
    public static void nothing(){
        int nothing = (int) (Math.random()*5+1);
        switch (nothing) {
            case 1:
            System.out.println("You walk aimlessly through the cave system.\nNothing interesting happens."); 
            Game.decide();
            break;            
            case 2:
            System.out.println("You march deeper into the cave, sometimes changing directions here and there.\nBoring!");
            Game.decide();
            break;            
            case 3:
            System.out.println("The caves seems to have no end at all.\nYou wander deeper and deeper with no events whatsoever.");
            Game.decide();
            break;            
            case 4:
            System.out.println("Other than the constant dripping of water and the echo of your own steps,\nyou fail to notice anything significant.");
            Game.decide();
            break;
            case 5:
            System.out.println("Endless rock and stone surrounds you. You feel the weight of the earth above you.\nYou're starting to wonder if you'll find your way out again...");
            Game.decide();
            break;
        }
    } 

    //creates small, medium and large loot, by multiplying value with lootSize
    public static void loot(){ 
        int lootSize = (int) (Math.random()*3+1);
        int lootValue = (int) (Math.random()*10*lootSize+5);
        switch (lootSize) {
            case 1:
            System.out.println("You enter a small cave, the walls are overgrown with moss. To your right you can see a faint glimmering in the overgrowth.\n"+"Upon closer inspection it seems like a few coins were reflecting the light of your torch.\n"+
            "You find ["+lootValue+"] G!");
            Game.money= Game.money+lootValue;
            Game.decide();
            break;
            case 2:
            System.out.println("Examining the new cave you just entered, you see a lifeless skeleton lying collapsed against the wall.\nYou approach the body and snatch its wallet\n"+
            "It had ["+ lootValue+"] G in it!");
            Game.money= Game.money+lootValue;
            Game.decide();
            break;
            case 3:
            System.out.println("As you continue to walk deeper and deeper into the cave, you suddenly stumble over something.\n"+"You look down and discover that something is a half-buried treasure chest!\n"+
            "It is filled with ["+ lootValue+"] G!");
            Game.money= Game.money+lootValue;
            Game.decide();
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
        Death.death(); //death state
        

        if (enemyHealth<=0){                                        
            System.out.println("----------------------------------------------------------------------");
            System.out.println("You have successfully beaten the "+enemy);      //winstate
            int bonus = Exp.expScaling*2;
            int reward = (int) (Math.random()*10 * difficulty + 10 + bonus);           
            System.out.println("You found [" + reward + "] G!");
            Game.money= Game.money+reward;
            double expGain = Exp.exp + 5 * difficulty;  //adds exp based on encounter difficulty
            Exp.exp = + expGain;
            System.out.println("You gain [" + (int)expGain + "] EXP!");
            Game.decide(); //calls decide to let the player make the next move              
        }  
    }    

    //heals player, and returns to decide()
    public static void home(){
        int restingHealth = (int) (Math.random()*3+1);
        playerHealth = restingHealth+playerHealth;
        System.out.println("You find your way back to the surface and walk back home to have a rest.\nThe next day you walk right back into the cave.");
        System.out.println("You regenerated "+restingHealth+" health!");
        Game.decide();
    }

    
}