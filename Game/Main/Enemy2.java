
    public class Enemy2{
        static String enemy;
        static int enemyHealth;
        static int playerHealth = 8 + Exp.expScaling;
        static String PlayerHealth;
        static int playerDamage;
        static int enemyDamage; 
        static int playerDefense = 0 + Shop.armor;
        static int enemyDefense = 0;
        static int enemyDefenseChance;
        static int enemyDamageChance;
        static double difficulty;
    
    
        public static void main(String[] args) {
            int randomEnemy = (int) (Math.random()*100+1);
            if(randomEnemy <= 50){
                enemy = "Goblin";
                enemyHealth = 4 + Exp.expScaling;
                difficulty = 0.85;
                enemyDamage = (int) (Math.random()*2);
            } else if(randomEnemy >50 & randomEnemy <=80){
                enemy = "Skeleton";
                enemyHealth = 6 + Exp.expScaling;
                difficulty = 1.0;
                enemyDamage = (int) (Math.random()*2+1);
            } else{
                enemy = "Orc";
                enemyHealth = 8 + Exp.expScaling;
                difficulty = 1.15;
                enemyDamage = (int) (Math.random()*3);
            }
            System.out.println("Type: "+enemy);
            System.out.println("Health: "+enemyHealth);
            System.out.println("Damage: "+enemyDamage);
        }
}
