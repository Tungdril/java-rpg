public class Encounters {

static String enemy;

    public static void fight(){
        int randomEnemy = (int) (Math.random()*100+1);
        if(randomEnemy <= 50){
            enemy = "Goblin";
        } else if(randomEnemy >50 & randomEnemy <=80){
            enemy = "Skeleton";
        } else{
            enemy = "Orc";
        }
         System.out.println("You were just minding your own buisness, when suddenly a " + enemy + " appeared!");    
        }

    public static void nothing(){
        System.out.println("Nothing");
    }


}
