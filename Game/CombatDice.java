
public class CombatDice {
    
    public static String CombatDice;
    public static int diceRolled; 

    public static void dice(){
        diceRolled= (int) (Math.random()*5);    //0-5 translate to 1-6
    }
}
