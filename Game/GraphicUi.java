public class GraphicUi {

public static String HealthBar; 
static String AffinityMeter;

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
    System.out.println(    " ______________________________________");                      try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            .-.       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                           {{#}}      |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            888       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                            8@8       |");                     try{Thread.sleep(100);}catch(Exception e){}
    System.out.println(    "|                       _    )8(    _ |");                      try{Thread.sleep(100);}catch(Exception e){}
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
    System.out.println(    "|______________________________________|");                     try{Thread.sleep(100);}catch(Exception e){}}
}