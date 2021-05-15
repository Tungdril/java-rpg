import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Login {
static String Exp;
static String Money;
static String Day;
static String userName;
// exp, money, day only defined for test reasons
static int exp=200;
static int money=2000;
static int day=5;
//this file is currently independet
public static void main(String[] args) {
    userName = "John"; //set userName to the name of the player
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(1000);}catch(Exception e){}
    readingPain();
}

public static void createFile() {

    File f = new File("res/" + userName + ".txt");
       if(f.exists()){ 
        f.delete();
        try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");} 
        } else 
        {try {f.createNewFile(); } catch(Exception e) {System.out.println("Something went wrong while Saving");}}
    }


public static String getSavePath(){
        return "res/" + userName + ".txt";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter("res/" + userName + ".txt");
    String Exp = Integer.toString(exp);
    String Money = Integer.toString(money);
    String Day = Integer.toString(day);
    writingSave.write(Exp +"\n"+ Money +"\n" + Day);
    writingSave.close();
    System.out.println("Cheeki");
    } catch(IOException e) {System.out.println("Breeki"); e.printStackTrace();}
}
public static void readingPain(){
    try {
        File f = new File("res/" + userName + ".txt");
        Scanner reader = new Scanner(f);
        while (reader.hasNextLine()) {
            String Exp = reader.nextLine();
            String Money = reader.nextLine();
            String Day = reader.nextLine();
            int exp = Integer.parseInt(Exp);
            int money = Integer.parseInt(Money);
            int day = Integer.parseInt(Day);
            System.out.println("Exp: " + exp);
            System.out.println("Money: " + money);
            System.out.println("Day: " + day);
        }
            reader.close();
        } catch (Exception e) {}
}
}