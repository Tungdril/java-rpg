public class Enemy{
    static String enemy;
    static int enemyHealth;
    static int playerHealth = 0;
    static String PlayerHealth;
    static int playerDamage;
    static int enemyDamage; 
    static int playerDefense = 0 + Shop.armor;
    static int enemyDefense = 0;
    static int enemyDefenseChance;
    static int enemyDamageChance;
    static double difficulty;
    static String Sprite;

        
    public static void main(String[] args) {
        int randomEnemy = (int) (Math.random()*100+1);
        if(randomEnemy <= 50){
            enemy = "Goblin";
            enemyHealth = 4 + Exp.expScaling;
            difficulty = 0.85;
            enemyDamage = (int) (Math.random()+1);
        } else if(randomEnemy >50 & randomEnemy <=80){
            enemy = "Skeleton";
            enemyHealth = 6 + Exp.expScaling;
            difficulty = 1.0;
            enemyDamage = (int) (Math.random()*3+1);
        } else{
            enemy = "Orc";
            enemyHealth = 8 + Exp.expScaling;
            difficulty = 1.15;
            enemyDamage = (int) (Math.random()*3+1);
        }
        //System.out.println("Type: "+enemy);
        //System.out.println("Health: "+enemyHealth);
        //System.out.println("Damage: "+enemyDamage);
    }
    
    public static void Sprites(){
        boolean Gablins = enemy=="Goblin";
        boolean Skelly = enemy=="Skeleton";
        boolean Orks = enemy=="Orc";
        boolean Gargle = enemy =="Gargoyle";
        if(Gablins){
            try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "             ,      ,  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "            /(.-\"\"-.)\\  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "        |\\  \\/      \\/  /|  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "        | \\ / =.  .= \\ / |  ");               try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "        \\( \\   o\\/o   / )/  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "         \\_, '-/  \\-' ,_/  ");                try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "           /   \\__/   \\  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "           \\ \\__/\\__/ /  ");             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "         ___\\ \\|--|/ /___  ");                try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "       /`    \\      /    `\\  ");              try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "      /       '----'        \\  ");             try{Thread.sleep(100);}catch(Exception e){}
        }
        if(Skelly){
            try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("                              _.--\"\"-._");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("  .                         .\"         \".");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println(" / \\    ,^.         /(     Y             |      )\\");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("|        :|    `>   '.     l_..-------.._l      .'");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println(" \\  .-' | |  `              l._       _.'");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println(" \\/    | |                   l`^^'^^'j");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        | |                _   \\_____/     _");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        j |               l `--__)-'(__.--' |");            try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("        | |               | /`---``-----'\"1 |  ,-----.");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        | |               )/  `--' '---'   \'-'  ___  `-.");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        | |              //  `-'  '`----'  /  ,-'   I`.  \\");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("      `._;/7(-.......'  /        ) (     |  |            | |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("      `._;l _'--------_/        )-'/     :  |___.    _._./ ;");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        | |                 .__ )-'\\  __  \\  \\  I   1   / /");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                           \\__  `-'    __/  `-. `---'',-'");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                              )-._.-- (        `-----'");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                             )(  l\\ o ('..-.");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                       _..--' _'-' '--'.-. |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                __,,-'' _,,-''            \\ \\");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("               f'. _,,-'                   \\ \\");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("              ()--  |                       \\ \\");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                \\.  |                       /  \\");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                  \\ \\                      |._  |");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                   \\ \\                     |  ()|");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                    \\ \\                     \\  /");          try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                     ) `-.                   | |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                    // .__)                  | |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                 _.//7'                      | |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("               '---'                         j_| ");            try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                                            (| |");         try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                                             |  \\");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                                             |lllj");           try{Thread.sleep(50);}catch(Exception e){}
        System.out.println("                                             ||||| ");            try{Thread.sleep(50);}catch(Exception e){}
        }
        if(Orks){
                                                                                           try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                   (    )"                  );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                  ((((()))"                 );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                  |o\\ /o)|"                );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                  ( (  _')"                 );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                   (._.  /\\__"             );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                  ,\\___,/ '  ')"           );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "    '.,_,,       (  .- .   .    )"          );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "     \\   \\\\     ( '        )(    )"      );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "      \\   \\\\    \\.  _.__ ____( .  |"    );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "       \\  /\\\\   .(   .'  /\\  '.  )"     );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "        \\(  \\\\.-' ( /    \\/    \\)"     );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "         '  ()) _'.-|/\\/\\/\\/\\/\\|"      );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "             '\\\\ .( |\\/\\/\\/\\/\\/|"    );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "               '((  \\    /\\    /"         );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "               ((((  '.__\\/__.')"          );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                ((,) /   ((()   )"          );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                 \"..-,  (()(\"   /"        );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                  _//.   ((() .\""          );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "          _____ //,/\" ___ ((( ', ___"      );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                           ((  )"           );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                            / /"            );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                          _/,/'"            );             try{Thread.sleep(100);}catch(Exception e){}
        System.out.println(    "                        /,/,\""             );             try{Thread.sleep(100);}catch(Exception e){}
        }
        if (Gargle){
            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(",                                                               ,");            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("\\'.                                                           .'/");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(" ),\\                                                         /,( ");         try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("/__\\'.                                                     .'/__\\");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("\\  `'.'-.__                                           __.-'.'`  /");           try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(" `)   `'-. \\                                         / .-'`   ('");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(" /   _.--'\\ '.          ,               ,          .' /'--._   \\");            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(" |-'`      '. '-.__    / \\             / \\    __.-' .'      `'-|");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println(" \\         _.`'-.,_'-.|/\\ \\    _,_    / /\\|.-'_,.-'`._         /");         try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("  `\\    .-'       /'-.|| \\ |.-\"   \"-.| / ||.-'\\       '-.    /`");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("    )-'`        .'   :||  / -.\\\\ //.- \\  ||:   '.        `'-(");           try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("   /          .'    / \\\\_ |  /o`^'o\\  | _// \\    '.          \\");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("   \\       .-'    .'   `--|  `\"/ \\\"`  |--`   '.    '-.       /");            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("    `)  _.'     .'    .--.; |\\__\"__/| ;.--.    '.     '._  ('");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("    /_.'     .-'  _.-'     \\\\ \\/^\\/ //     `-._  '-.     '._\\");         try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("    \\     .'`_.--'          \\\\     //          `--._`'.     /");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("     '-._' /`            _   \\\\-.-//   _            `\\ '_.-'");           try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("         `<     _,..--''`|    \\`\"`/    |`''--..,_     >`");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("          _\\  ``--..__   \\     `'`     /   __..--``  /_");            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("         /  '-.__     ``'-;    / \\    ;-'``     __.-'  \\");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("        |    _   ``''--..  \\'-' | '-'/  ..--''``   _    |");         try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("        \\     '-.       /   |/--|--\\|   \\       .-'     /");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("         '-._    '-._  /    |---|---|    \\  _.-'    _.-'");           try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("             `'-._   '/ / / /---|---\\ \\ \\ \\'   _.-'`");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("                  '-./ / / / \\`---`/ \\ \\ \\ \\.-'");            try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("                      `)` `  /'---'\\  ` `(`");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("                jgs  /`     |       |     `\\");         try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("                    /  /  | |       | |  \\  \\");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("                .--'  /   | '.     .' |   \\  '--.");           try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("               /_____/|  / \\._\\   /_./ \\  |\\_____\\");          try{Thread.sleep(100);}catch(Exception e){}
            System.out.println("              (/      (/'     \\) (/     `\\)      \\)");            try{Thread.sleep(100);}catch(Exception e){}
        }
    }
}