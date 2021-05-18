public class Affinity {
    static int shopAffinity;
    static double shopPriceReduce;
    static int swordPrice=(int) (200-200*shopPriceReduce);
    static int shieldPrice= (int) (300-300*shopPriceReduce);
    static int potionPrice= (int) (20-20*shopPriceReduce);
    static int easierShopAff=shopAffinity/10;
    static String AffinityMeter;

    public static void Affi(){              //don't question my reasons for I myself don't know them
    swordPrice= (int) (200-200*shopPriceReduce);
    shieldPrice= (int) (300-300*shopPriceReduce);
    potionPrice= (int) (20-20*shopPriceReduce);
    System.out.println("Affinity: "+shopAffinity);
    int easierShopAff=shopAffinity/10;    //making it that if the player hit a multiple of 10 in Affinity, it will translate in a 1 but only then
    if(easierShopAff>=3 && easierShopAff<5){shopPriceReduce=0.125;}
    if(easierShopAff>=5 && easierShopAff<8){shopPriceReduce=0.25;}
    if(easierShopAff>=8 && easierShopAff<10){shopPriceReduce=0.375;}
    if(easierShopAff>=10){shopPriceReduce=0.5;}
    }
    public static void Affimeter(){
        int easierShopAff=shopAffinity/10;             //Added an Affinity Meter to let the player know how much affinity he has accumulated
        switch(easierShopAff){
            case 0:
            AffinityMeter="──┤------------------------------├──"; break;        // @Tungdril Should i use █ or ■? //@SmyloG this: ■
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
            AffinityMeter="──┤■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■├──"; break;
        }
    }
}
