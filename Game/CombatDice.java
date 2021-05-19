
public class CombatDice {
    
    public static String CombatDice;
    public static int diceRolled; 

    public static void dice(){
        diceRolled= (int) (Math.random()*5+1);    //0-5 translate to 1-6 //@Tungdril no it doesn't it translate to 1-5
    }
}
