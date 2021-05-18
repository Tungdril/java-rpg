public class Affinity {
    static int shopAffinity;
    static int shopAlchAffinity;
    static double shopPriceReduce;
    static double shopAlchPriceReduce;
    static int swordPrice=(int) (150-150*shopPriceReduce);
    static int shieldPrice= (int) (300-300*shopPriceReduce);
    static int potionPrice= (int) (20-20*shopPriceReduce);
    static int easierShopAff=shopAffinity/10;
    static int easierAlchShopAff=shopAlchAffinity/10;

    public static void Affi(){              //don't question my reasons for I myself don't know them
    swordPrice= (int) (200-200*shopPriceReduce);
    shieldPrice= (int) (300-300*shopPriceReduce);
    potionPrice= (int) (20-20*shopAlchPriceReduce);
    int easierShopAff=shopAffinity/10;    //making it that if the player hit a multiple of 10 in Affinity, it will translate to a 1 but only then
    if(easierShopAff>=3 && easierShopAff<5){shopPriceReduce=0.125;}
    if(easierShopAff>=5 && easierShopAff<8){shopPriceReduce=0.25;}
    if(easierShopAff>=8 && easierShopAff<10){shopPriceReduce=0.375;}
    if(easierShopAff>=10){shopPriceReduce=0.5;}
    if(easierAlchShopAff>=3 && easierAlchShopAff<5){shopAlchPriceReduce=0.125;}
    if(easierAlchShopAff>=5 && easierAlchShopAff<8){shopAlchPriceReduce=0.25;}
    if(easierAlchShopAff>=8 && easierAlchShopAff<10){shopAlchPriceReduce=0.375;}
    if(easierAlchShopAff>=10){shopAlchPriceReduce=0.5;}
    }
}
