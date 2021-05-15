import java.util.Scanner;
public class Encounters {

static String enemy;
static int enemyHealth;
static int playerHealth = 6;
static int playerDamage;
static int enemyDamage = 1;
static int playerDefense = 0;
static int enemyDefense = 0;
static int enemyDefenseChance;
static int enemyDamageChance;

    public static void fight(){
        int randomEnemy = (int) (Math.random()*100+1);
        if(randomEnemy <= 50){
            enemy = "Goblin";
            enemyHealth = 4;
        } else if(randomEnemy >50 & randomEnemy <=80){
            enemy = "Skeleton";
            enemyHealth = 5;
        } else{
            enemy = "Orc";
            enemyHealth = 6;

        }
         System.out.println("You were just minding your own buisness, when suddenly a " + enemy + " appeared!");
        }

    public static void combat(){
        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
        int playerDamage = (int) (Math.random()*2+1); // Player damage is 1-2 HP 

        Scanner fight = new Scanner(System.in);

        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("\nWhat will you do?\n1. Attack\n2. Defend\n3. Check Health\n4. Flee");

        try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
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
                System.out.println("The Enemy has still " + enemyHealth + " HP left");
                System.out.println("You still have " + playerHealth + " HP left");
            }
            else if (fight2==4){ //Flee
                System.out.println("You tried to flee! But to no avail");
    
            }
            else { //if the Number isn't 1-4
                System.out.println("That's not an option!");
                //int newplayerHealth = (playerHealth-playerHealth);
                //playerHealth = newplayerHealth; 
            }
            try {Thread.sleep(200);} catch(Exception e) {System.out.println("shit");}
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
            try {Thread.sleep(150);} catch(Exception e) {System.out.println("shit");}
    }

    public static void nothing(){
        System.out.println("Nothing");
    }

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
        if (playerHealth<=0){
            System.out.println(
"                                 _____  _____ \n"+
"                                <     `/     | \n"+            
"                                 >          ( \n"+
"                                |   _     _  | \n"+            
"                                |  |_) | |_) | \n"+
"                                |  | \\ | |   | \n"+    //dont remove space here or it'll break        
"                                |            | \n"+
"                 ______.______%_|            |_________________ \n"+            
"               _/                                              | \n"+
"              |               B I L L   G A T E S              < \n"+    //replace with username        
"              |_____.-._________              ____/|___________| \n"+
"                                | * Day 0    | \n"+            
"                                | + 19/10/97 | \n"+    //date should reflect current day
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
        }
        if (enemyHealth<=0){
            System.out.println("You have murdered something!\nCongrats!");
            System.out.println(Game.money);
        }  
    }    
    
}






















