import java.util.Scanner;

public class Test1Fight {
    // Money        not added, will be 
    // playerExp    not added, will be
    static int enemyHealth = 10;
    static int playerHealth = 10;
    static int playerDamage;
    static int enemyDamage = 1;
    static int playerDefense = 0;
    static int enemyDefense = 0;
    static int enemyDefenseChance;
    static int enemyDamageChance;

    public static void fightRound(){
    try {Thread.sleep(1500);} catch(Exception e) {System.out.println("shit");}
    int playerDamage = (int) (Math.random()*2+1); // Player damage is 1-2 HP
    Scanner fight = new Scanner(System.in);
    System.out.println("\n\n\n\nWhat will you do?\n1. Attack\n2. Defend\n3. Check Health\n4. Flee");
    try {Thread.sleep(1500);} catch(Exception e) {System.out.println("shit");}
    Integer fight2 = fight.nextInt();
        if (fight2==1){
            System.out.println("You attacked the enemy!");
            int newenemyHealth = (enemyHealth - playerDamage);
            System.out.println("You did " + (enemyHealth-newenemyHealth) + " Damage."); //
            enemyHealth = newenemyHealth;
        }
        else if (fight2==2){
            System.out.println("You defend against the next Enemy attack.");
            playerDefense++;
        }
        else if (fight2==3){
            System.out.println("The Enemy has still " + enemyHealth + " HP left");
            System.out.println("You still have " + playerHealth + " HP left");
        }
        else if (fight2==4){
            System.out.println("You tried to flee! But to no avail");

        }
        else {
            System.out.println("wrong");
            int newplayerHealth = (playerHealth-playerHealth);
            playerHealth = newplayerHealth; 
        }
        try {Thread.sleep(2000);} catch(Exception e) {System.out.println("shit");}
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
            System.out.println("The enemy did " + newenemyDamage + " HP damage!");
        } else {
            System.out.println("The Enemy attacked and missed.");
        }
        playerDefense=0;
        try {Thread.sleep(1500);} catch(Exception e) {System.out.println("shit");}
    }
    public static void main(String[] args){    
    System.out.println("An Enemy has attacked You by being in your way!");
    try {Thread.sleep(2000);} catch(Exception e) {System.out.println("shit");}
    while(true) {
     fightRound();
        if (playerHealth<=0){
        break;
        }
        if (enemyHealth<=0){
        break;
        }
    }
    if (playerHealth<=0){
        System.out.println("You died. RIP");
    }
    if (enemyHealth<=0){
        System.out.println("You have murdered something!\nCongrats!");
    }
}
}
