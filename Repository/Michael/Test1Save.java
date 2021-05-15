
import java.io.File;
import java.io.IOException;

public class Test1Save{
    public static void main(String[] args) throws IOException{
        File save = new File("/filename.txt");
        if(!save.exists()) {System.out.println("Y");}
    }
}