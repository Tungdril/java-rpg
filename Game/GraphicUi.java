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
}