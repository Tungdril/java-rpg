public class Loot {

static int dice;
static boolean dropItem;
static boolean cookbookFound = false;

static String Item;

static int healingHerb;
static int strengthShroom;
static int defenseDandelion;
static int constitutionCabbage;
static int cookbook;


public static void rollDice(){ //you can use this wherever you like btw, just call Loot.rollDice() and get a random number anywhere
    dice = (int) (Math.random()*100+1); 
    return;
}

public static void dropItem(){ //should there be any item as loot?
    rollDice();
    if(dice<=33){
        dropItem=true;
    }else{
        dropItem=false;
    }
    return;
}


    public static void itemLoot(){ //always call this to get an item as loot!
        dropItem();
        rollDice();      
        if(dice<=24){
            Item="a healing herb"; //healing
        }else if(dice>=25&&dice<=48&&dropItem==true){
            Item="a strength shroom"; //damage
            healingHerb++;
        }else if(dice>=49&&dice<=72&&dropItem==true){
            Item="a constitution cabbage"; //maxHealth
            constitutionCabbage++;
        }else if(dice>=73&&dice<=95&&dropItem==true){
            Item="a defense dandelion"; //defense
            defenseDandelion++;
        }else if(dice>=96&&dropItem==true&&cookbookFound==false){
            Item="the Alchemist's Cookbook"; //cookbook
            cookbookFound=true;
            cookbook++;
        }else{itemLoot();} //if cookbook should be found, but was already, rolls itemLoot again 
    }
}
