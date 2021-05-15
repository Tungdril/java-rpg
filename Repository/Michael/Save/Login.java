
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Login {
static String Exp;
static String Money;
static String Day;
static String userName;

public static void main(String[] args) {
    userName = "John"; //set userName to the name of the player
    createFile();
    System.out.print(getSavePath()+"\n");
    writingPain();
    try{Thread.sleep(3000);}catch(Exception e){}
    readingPain();
}

public static void createFile() {

    File f = new File("res/" + userName + ".txt");
    if (!f.exists())
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

}

public static String getSavePath(){
        return "res/" + userName + ".txt";


}

public static void writingPain(){
    try{
    FileWriter writingSave = new FileWriter("res/" + userName + ".txt");
    writingSave.write("1\n2\n3");
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
            System.out.println("Exp: " + Exp);
            System.out.println("Money: " + Money);
            System.out.println("Day: " + Day);
        }
            reader.close();
        } catch (Exception e) {}
}
}