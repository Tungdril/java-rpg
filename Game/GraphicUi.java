public class GraphicUi {

public static String HealthBar;
public static String EnemyHealthBar;
public static String AffinityMeter;
public static String AffinityAlchMeter;

public static void healthometer(){
    switch(Enemy.playerHealth){
        case 1: HealthBar="|-----------■-----------|";
        break;
        case 2: HealthBar="|----------■-■----------|";
        break;
        case 3: HealthBar="|---------■-■-■---------|";
        break;
        case 4: HealthBar="|--------■-■-■-■--------|";
        break;
        case 5: HealthBar="|-------■-■-■-■-■-------|";
        break;
        case 6: HealthBar="|------■-■-■-■-■-■------|";
        break;
        case 7: HealthBar="|-----■-■-■-■-■-■-■-----|";
        break;
        case 8: HealthBar="|----■-■-■-■-■-■-■-■----|";
        break;
        case 9: HealthBar="|---■-■-■-■-■-■-■-■-■---|";
        break;
        case 10:HealthBar="|--■-■-■-■-■-■-■-■-■-■--|";
        break;
        case 11:HealthBar="|-■-■-■-■-■-■-■-■-■-■-■-|";
        break;
        case 12:HealthBar="|■-■-■-■-■-■-■-■-■-■-■-■|";
        break;
      }
    }

    public static void enemyHealthometer(){
        switch(Enemy.enemyHealth){
            case 1: EnemyHealthBar="|-----------■-----------|";
            break;
            case 2: EnemyHealthBar="|----------■-■----------|";
            break;
            case 3: EnemyHealthBar="|---------■-■-■---------|";
            break;
            case 4: EnemyHealthBar="|--------■-■-■-■--------|";
            break;
            case 5: EnemyHealthBar="|-------■-■-■-■-■-------|";
            break;
            case 6: EnemyHealthBar="|------■-■-■-■-■-■------|";
            break;
            case 7: EnemyHealthBar="|-----■-■-■-■-■-■-■-----|";
            break;
            case 8: EnemyHealthBar="|----■-■-■-■-■-■-■-■----|";
            break;
            //case 9: EnemyHealthBar="|---■-■-■-■-■-■-■-■-■---|";
            //break;
            //case 10:EnemyHealthBar="|--■-■-■-■-■-■-■-■-■-■--|";
            //break;
            //case 11:EnemyHealthBar="|-■-■-■-■-■-■-■-■-■-■-■-|";
            //break;
            //case 12:EnemyHealthBar="|■-■-■-■-■-■-■-■-■-■-■-■|";
            //break;
          }
        }

    public static void combatDice(){

      switch (CombatDice.diceRolled){ 
        case 1:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+    //dice get squished in the command line, look weird here but good when playing ○
                     "   │       │\n"+    
                     "   │   o   │\n"+
                     "   │       │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        case 2:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+    
                     "   │ o     │\n"+  
                     "   │       │\n"+
                     "   │     o │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        case 3:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+
                     "   │ o     │\n"+
                     "   │   o   │\n"+
                     "   │     o │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        case 4:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+
                     "   │ o   o │\n"+
                     "   │       │\n"+
                     "   │ o   o │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        case 5:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+
                     "   │ o   o │\n"+
                     "   │   o   │\n"+
                     "   │ o   o │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        case 6:
        CombatDice.CombatDice = 
                     "   ┌───────┐\n"+
                     "   │ o   o │\n"+
                     "   │ o   o │\n"+
                     "   │ o   o │\n"+
                     "   └───────┘\n";
        System.out.println(CombatDice.CombatDice);
        break;
        
      }
    }

    public static void status(){  //added status window because fuck you (and it's easier to just call it if needed inistead of hard coding)
      Exp.main();
      GraphicUi.healthometer();
      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(" _______________________ "             );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println("|        Health:        |"             );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(""+ GraphicUi.HealthBar+""        );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println("      Money: "+ Game.money               );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println("      Exp: "+(int)Exp.exp           );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println("      Day: "+Game.day                    );                                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println("|_______________________|"             );                                      try{Thread.sleep(100);}catch(Exception e){}
    }

    public static void Affimeter(){
      int easierShopAff=Affinity.shopAffinity/10;             //Added an Affinity Meter to let the player know how much affinity he has accumulated
      switch(easierShopAff){
          case 0:
          AffinityMeter="──┤------------------------------├──"; break;
          case 1: 
          AffinityMeter="──┤■■■---------------------------├──"; break;
          case 2:
          AffinityMeter="──┤■■■■■■------------------------├──"; break;
          case 3:
          AffinityMeter="──┤■■■■■■■■■---------------------├──"; break;
          case 4:
          AffinityMeter="──┤■■■■■■■■■■■■------------------├──"; break;
          case 5:
          AffinityMeter="──┤■■■■■■■■■■■■■■■---------------├──"; break;
          case 6:
          AffinityMeter="──┤■■■■■■■■■■■■■■■■■■------------├──"; break;
          case 7:
          AffinityMeter="──┤■■■■■■■■■■■■■■■■■■■■■---------├──"; break;
          case 8:
          AffinityMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■------├──"; break;
          case 9:
          AffinityMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■■■■---├──"; break;
          case 10:
          AffinityMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■├──"; break;}  

        }
    public static void shopSwordandShield(){
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|─────────────────────────────────────| ");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| \"There's no Equipment to be bought.\" |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 1. Leave                             |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}

    }
    public static void shopSword(){
    if(Affinity.swordPrice<100){
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       _    )8(     _ |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |L|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|─────────────────────────────────────| ");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \"Are you here to buy this Sword?\" |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 1. Sword ["+Affinity.swordPrice+" G]                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 2. No                                |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
    }else
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       _    )8(     _ |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |L|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|─────────────────────────────────────| ");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \"Are you here to buy this Sword?\" |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 1. Sword ["+Affinity.swordPrice+" G]                     |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 2. No                                |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
    }
    public static void shopShield(){
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                                      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  ____________________                |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<><><>  |  |  <><><>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>      |  |      <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>      |  |      <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>   .--------.   <>|               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |     |   ()   |     |               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |_____| (O\\/O) |_____|               |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |     \\   /\\   /     |               |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |------\\  \\/  /------|               |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |       '.__.'       |               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |        |  |        |               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| :        |  |        :               |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \\       |  |       /                |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|   \\<>    |  |    <>/                 |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|    \\<>   |  |   <>/                  |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|     `\\<> |  | <>/'                   |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|       `-.|__|.-`                     |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|──────────────────────────────────────| ");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \"Are you here to buy this Shield?\"  |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 1. Yes ["+Affinity.shieldPrice+" G]                       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 2. No                                |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}}
    public static void shopFull(){
    if(Affinity.swordPrice<100){
      System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                       _    )8(    _  |");                      try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|  ____________________ `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |<><><>  |  |  <><><>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |<>      |  |      <>|     |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |<>      |  |      <>|     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |<>   .--------.   <>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |     |   ()   |     |     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |_____| (O\\/O) |_____|     |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |     \\   /\\   /     |     |.|       |");                   try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |------\\  \\/  /------|     |O|       |");                   try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |       '.__.'       |     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| |        |  |        |     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| :        |  |        :     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|  \\       |  |       /      |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|   \\<>    |  |    <>/       |.|       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|    \\<>   |  |   <>/        |L|       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|     `\\<> |  | <>/'         |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|       `-.|__|.-`           \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|──────────────────────────────────────| ");                   try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|  \"The cool Sword or a shiny Shield?\" |");                   try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| 1. Sword ["+Affinity.swordPrice+" G]                      |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| 2. Shield ["+Affinity.shieldPrice+" G]                    |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "| 3. Leave                             |");                     try{Thread.sleep(100);}catch(Exception e){}
      System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
    }else
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       _    )8(    _  |");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                      (O)__/ W \\__(O) |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  ____________________ `~\"-=):(=-\"~`  |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<><><>  |  |  <><><>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>      |  |      <>|     |C|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>      |  |      <>|     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |<>   .--------.   <>|     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |     |   ()   |     |     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |_____| (O\\/O) |_____|     |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |     \\   /\\   /     |     |.|       |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |------\\  \\/  /------|     |O|       |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |       '.__.'       |     |'|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| |        |  |        |     |.|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| :        |  |        :     |O|       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \\       |  |       /      |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|   \\<>    |  |    <>/       |.|       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|    \\<>   |  |   <>/        |L|       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|     `\\<> |  | <>/'         |'|       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|       `-.|__|.-`           \\ /       |");                    try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|──────────────────────────────────────| ");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|  \"The cool Sword or a shiny Shield?\" |");                   try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 1. Sword ["+Affinity.swordPrice+" G]                     |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 2. Shield ["+Affinity.shieldPrice+" G]                    |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "| 3. Leave                             |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void notEnoughMoney(){
    System.out.println(" ____________________________________ ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("|       You don't have enough G.     |");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("|____________________________________|");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void Potion(){
  System.out.println(" ____________________________________ ");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                _____               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               `.___,'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                (___)               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                <   >               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                 ) (                |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                /`-.\\               |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               /     \\              |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|              / _    _\\             |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             :,' `-.' `:            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             |         |            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             :         ;            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|              \\       /             |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               `.___.'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|────────────────────────────────────|");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|      You bought the potion!        |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|And directly drank it. How wasteful.|");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|          You regain " + Shop.heal + "HP.           |");                       try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|____________________________________|");                                  try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void overPotion(){
  System.out.println(" ____________________________________ ");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                _____               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               `.___,'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                (___)               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                <   >               |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                 ) (                |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|                /`-.\\               |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               /     \\              |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|              / _    _\\             |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             :,' `-.' `:            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             |         |            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|             :         ;            |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|              \\       /             |");                                 try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|               `.___.'              |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|────────────────────────────────────|");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|      You bought the potion!        |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("| It has no effect, but you at least |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|     contributed to the economy.    |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|          You regain no HP.         |");                                  try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("|____________________________________|");                                  try{Thread.sleep(100);}catch(Exception e){}
}
  public static void swordBought(){
    System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|     You bought the cool Sword!     |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|     Hopefully it's as useful       |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|       as it's cool looking!        |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void shieldBought(){
    System.out.println(               " ____________________________________ ");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|    You bought the shiny Shield!    |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|      Hopefully it's as useful      |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|           as it's shiny!           |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(               "|____________________________________|");                  try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void AffiAlchmeter(){
    int easierAlchShopAff=Affinity.shopAlchAffinity/10;             //Added an Affinity Meter to let the player know how much affinity he has accumulated
    switch(easierAlchShopAff){
        case 0:
        AffinityAlchMeter="──┤------------------------------├──"; break;
        case 1: 
        AffinityAlchMeter="──┤■■■---------------------------├──"; break;
        case 2:
        AffinityAlchMeter="──┤■■■■■■------------------------├──"; break;
        case 3:
        AffinityAlchMeter="──┤■■■■■■■■■---------------------├──"; break;
        case 4:
        AffinityAlchMeter="──┤■■■■■■■■■■■■------------------├──"; break;
        case 5:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■---------------├──"; break;
        case 6:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■■■■------------├──"; break;
        case 7:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■■■■■■■---------├──"; break;
        case 8:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■------├──"; break;
        case 9:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■■■■---├──"; break;
        case 10:
        AffinityAlchMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■├──"; break;}  

      }
  public static void notEnoughMoneyAlch(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("        You don't have enough G.      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void noCookBook(){
  System.out.println("┌─                                  ─┐");             try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("      Sorry but to brew something     ");             try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("     different I need my cookbook.    ");             try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("      Coould you find it for me?      ");             try{Thread.sleep(100);}catch(Exception e){}
  System.out.println("└─                                  ─┘");             try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void noItems(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("   You don't have the needed Items.      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void noItemsnoMoney(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("     You don't have enough G and      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("   you don't have the needed Items.      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void increaseDefense(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("    Your defense is increase by 1!      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void increaseHealth(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("   Your max Health is increase by 1!      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void increaseDamage(){
    System.out.println("┌─                                  ─┐");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("    Your attack is increase by 1!      ");          try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");          try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void AlchPotion(){
    System.out.println("┌─                                  ─┐");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 _____                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                `.___,'               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 (___)                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 <   >                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                  ) (                 ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 /`-.\\               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                /     \\              ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("               / _    _\\             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              :,' `-.' `:             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              |         |             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              :         ;             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("               \\       /             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                `.___.'               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                                      ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("       You bought the potion!         ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(" And directly drank it. How wasteful. ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("           You regain " + Shop.heal + "HP.           |");                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(" ─                                  ─ ");                                  try{Thread.sleep(100);}catch(Exception e){}
    }
    public static void AlchoverPotion(){
    System.out.println("┌─                                  ─┐");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 _____                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                `.___,'               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 (___)                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 <   >                ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                  ) (                 ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                 /`-.\\               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                /     \\              ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("               / _    _\\             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              :,' `-.' `:             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              |         |             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("              :         ;             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("               \\       /             ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                `.___.'               ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("                                      ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("       You bought the potion!         ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("  It has no effect, but you at least  ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("      contributed to the economy.     ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("           You regain no HP.          ");                                  try{Thread.sleep(100);}catch(Exception e){}
    System.out.println("└─                                  ─┘");                                  try{Thread.sleep(100);}catch(Exception e){}
  }
  public static void potions(){
    System.out.println(    "┌─                                  ─┐");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "        \"What should I brew?\"       ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "         You choose him to brew:      ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    " 1. a healing potion ["+Affinity.potionPrice+" G]                      ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    " 2. a strenght potion [40 G] ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    " 3. a health potion [60 G]                    ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    " 4. a skin hardening potion [60 G] ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    " 5. nothing                             ");                           try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "└─                                  ─┘");                           try{Thread.sleep(100);}catch(Exception e){}

  }
}