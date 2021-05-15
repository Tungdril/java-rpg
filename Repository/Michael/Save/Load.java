
public class Load {
    public static void main(String[] args) {

    }
    public static void readingPain(){
        try {
            File f = new File("res/" + Game.userName + ".txt");
            Scanner reader = new Scanner(f);
            while (reader.hasNextLine()) {
                Game.Exp = reader.nextLine();
                Game.Money = reader.nextLine();
                Game.Day = reader.nextLine();
                Game.exp = Integer.parseInt(Game.Exp);
                Game.money = Integer.parseInt(Game.Money);
                Game.day = Integer.parseInt(Game.Day);
                System.out.println("Exp: " + Game.exp);
                System.out.println("Money: " + Game.money);
                System.out.println("Day: " + Game.day);
            }
                reader.close();
            } catch (Exception e) {}
    
}
