public class GraphicUi {

public static String HealthBar; 
public static String EnemyHealthBar; 

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
}
