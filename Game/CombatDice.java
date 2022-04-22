
public class CombatDice {
    
    public static String CombatDice;
    public static int diceRolled;
    public static int diceModifier; 

    public static void dice(){
        diceRolled = (int) (Math.random()*6+1);
        GraphicUi.combatDice();

        switch (diceRolled) {
            case 1:
                diceModifier = -1;
                break;
            case 2:
                diceModifier = -1;
                break;
            case 3:
                diceModifier = 0;
                break;
            case 4:
                diceModifier = 1;
                break;
            case 5:
                diceModifier = 2;
                break;
            case 6:
                diceModifier = 3;
                break;
        }
    }
}
