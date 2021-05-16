
public class Exp {
    static String Exp;
    static double exp;
    static int expScaling;

    public static void main(){
        if(exp<10){
            expScaling = 0;
        } else if(exp>=10 && exp<30){
            expScaling = 1;
        } else if(exp>=30 && exp<60){
            expScaling = 2;
        } else if(exp>=60 && exp<100){
            expScaling = 3;
        } else{
            expScaling = 4;
        }
       //System.out.println(expScaling);
        
    }


}
