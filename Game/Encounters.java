import java.util.Scanner;
public class Encounters {

    public static void fight(){
        Enemy.main(null); //Gets all the enemy info
        System.out.println("\n----------------------------------------------------------------------\n");
        int randomMsg = (int) (Math.random()*5+1);
        switch (randomMsg) {
            case 1:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("As you are marching deeper into the cave system, you are suprised by an angry " + Enemy.enemy+"!"); 
            try {Thread.sleep(2000);} catch(Exception e) {System.out.println("shit");}
            break;            
            case 2:
            System.out.println("You see some movement behind a rock formation. You carefully step closer, only to be surprised by a "+Enemy.enemy+"!");
            try {Thread.sleep(2000);} catch(Exception e) {System.out.println("shit");}
            break;            
            case 3:
            System.out.println("You squeeze your body through a narrow crack, but once you get to the other side, you come face to face with a "+Enemy.enemy+"!");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            break;            
            case 4:
            System.out.println("You were just examining some shiny rocks, when you hear movement behind you. It's a "+Enemy.enemy+"!");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            break;
            case 5:
            System.out.println("As you enter a new cave, you are ambushed by a "+Enemy.enemy+"!");
            try {Thread.sleep(3500);} catch(Exception e) {System.out.println("shit");}
            break;
        }
    }

    public static void combat(){
        Death.death();
        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
        int playerDamage = (int) (Math.random()*2+1+Shop.sword); // Player damage is 1-2 HP 

        try {
        Scanner fight = new Scanner(System.in);
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(Enemy.Sprite);       
        System.out.println("\n----------------------------------------------------------------------"); 
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("\nWhat will you do?\n1. Attack\n2. Defend\n3. Check Health\n4. Flee");

        Thread.sleep(150);
        Integer fight2 = fight.nextInt();
            if (fight2==1){ //Attack
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You attacked the enemy!");
                int newenemyHealth = (Enemy.enemyHealth - playerDamage);
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You did " + (Enemy.enemyHealth-newenemyHealth) + " damage."); 
                Enemy.enemyHealth = newenemyHealth;
            }
            else if (fight2==2){ //Defend
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You defend against the incoming attack.");
                Enemy.playerDefense++;
            }
            else if (fight2==3){ //Check Health
                                                                                                              try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("----------------------------------------------------------------------" );try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The enemy has still " + Enemy.enemyHealth + " HP left"                  );try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You still have " + Enemy.playerHealth + " HP left"                      );try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("----------------------------------------------------------------------" );
            }
            else if (fight2==4){ //Flee
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("You tried to flee.");
                int fleeChance = (int) (Math.random()*100+1+Game.day); //the higher day is, the harder it is to flee
                if(fleeChance<= 30){    // 30% Chance to flee from combat, the player will then be put in decision
                    try{Thread.sleep(100);}catch(Exception e){}
                    System.out.println("And succeeded at that!");
                    Game.decide();
                } else {try{Thread.sleep(100);}catch(Exception e){};
                            System.out.println("But to no avail!");} // 70% chance to not flee, the player used his turn and gained nothing
            }
            else { //if the Number isn't 1-4
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("Really... We gave pretty clear instructions. Dissapointing.");
                Enemy.playerHealth = (Enemy.playerHealth-Enemy.playerHealth); //if the player is to stupid to use 1,2,3 or 4 he will be disposed immediatly
                Death.death(); 
            }
            Thread.sleep(200);
            Enemy.enemyDamageChance = (int) (Math.random()*100+1);
            Enemy.enemyDefenseChance = (int) (Math.random()*100+1 ) ;
            Enemy.enemyDefense=0;
            
            if(Enemy.enemyDefenseChance<16){
                try{Thread.sleep(100);}catch(Exception e){}                              //15% Chance for enemy to defend
                System.out.println("\nThe enemy defends!");
                Enemy.enemyDefense++;
            } 
            else if(Enemy.enemyDamageChance>10) {
                try{Thread.sleep(100);}catch(Exception e){}                         // If the Enemy doesn't defend he has a 10% Chance to miss his attack
                System.out.println("\nThe enemy attacks!");
                int newenemyDamage = Enemy.enemyDamage-Enemy.playerDefense;
                int newplayerHealth = Enemy.playerHealth-newenemyDamage;
                Enemy.playerHealth = newplayerHealth;
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The enemy did " + newenemyDamage + " HP damage!");
                try{Thread.sleep(500);}catch(Exception e){}
            } else {
                try{Thread.sleep(100);}catch(Exception e){}
                System.out.println("The enemy attacked and missed.");
            }
            Enemy.playerDefense=0;
            Thread.sleep(150);
        } catch(Exception e){System.out.println("use Numbers");}}

        //just skips a day
    public static void nothing(){
        int nothing = (int) (Math.random()*5+1);
        switch (nothing) {
            case 1:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You walk aimlessly through the cave system.\nNothing interesting happens."); 
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;            
            case 2:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You march deeper into the cave, sometimes changing directions here and there.\nBoring!");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;            
            case 3:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("The caves seems to take no end at all.\nYou wander deeper and deeper with no events whatsoever.");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;            
            case 4:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("Other than the constant dripping of water and the echo of your own steps,\nyou fail to notice anything significant.");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;
            case 5:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("Endless rock and stone surrounds you. You feel the weight of the earth above you.\nYou're starting to wonder if you'll find your way out again...");
            try {Thread.sleep(3500);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;
        }
    } 

    //creates small, medium and large loot, by multiplying value with lootSize
    public static void loot(){ 
        int lootSize = (int) (Math.random()*3+1);
        int lootValue = (int) (Math.random()*10*lootSize+2);
        switch (lootSize) {
            case 1:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You enter a small cave, the walls are overgrown with moss. To your right you can see a faint glimmering in the overgrowth.\n"+"Upon closer inspection it seems like a few coins were reflecting the light of your torch.\n"+
            "You find ["+lootValue+"] G!");
            Game.money= Game.money+lootValue;
            try {Thread.sleep(4000);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;
            case 2:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("Examining the new cave you just entered, you see a lifeless skeleton lying collapsed against the wall.\nYou approach the body and snatch its wallet\n"+
            "It had ["+ lootValue+"] G in it!");
            Game.money= Game.money+lootValue;
            try {Thread.sleep(3500);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;
            case 3:
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("As you continue to walk deeper and deeper into the cave, you suddenly stumble over something.\n"+"You look down and discover that something is a half-buried treasure chest!\n"+
            "It is filled with ["+ lootValue+"] G!");
            Game.money= Game.money+lootValue;
            try {Thread.sleep(3500);} catch(Exception e) {System.out.println("shit");}
            Game.decide();
            break;      
        }
        
    }

    //loops combat until player or enemy is dead
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
        if (Enemy.enemyHealth<=0){
            try{Thread.sleep(100);}catch(Exception e){}                                        
            System.out.println("----------------------------------------------------------------------");
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You have successfully beaten the "+Enemy.enemy);      
            int bonus = Exp.expScaling*2;
            int reward = (int) (Math.random()*10 * Enemy.difficulty + 10 + bonus);
            try{Thread.sleep(100);}catch(Exception e){}           
            System.out.println("You found [" + reward + "] G!");
            Game.money= Game.money+reward;
            double expGain = Exp.exp + 5 * Enemy.difficulty;  //adds exp based on encounter difficulty
            Exp.exp = Exp.exp + expGain;
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("You gain [" + (int)expGain + "] EXP!");
            try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
            Game.decide(); //calls decide to let the player make the next move              
        }  
    }    

    //heals player, and returns to decide()
    public static void home(){
        int restingHealth = (int) (Math.random()*3+1);
        Enemy.playerHealth = restingHealth+Enemy.playerHealth;
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("You find your way back to the surface and walk back home to have a rest.\nThe next day you walk right back into the cave.");
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("You regenerated "+restingHealth+" health!");
        try {Thread.sleep(3000);} catch(Exception e) {System.out.println("shit");}
        Game.decide();
    }
}