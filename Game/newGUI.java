import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class newGUI 
{
    public static void main(String[] args){MainMenu();}
    public static void MainMenu()
    {
        String s =
        "                                                                                    " + "\n" +
        "      O))                                      O)))))))     O)))))))      O))))     " + "\n" +
        "      O))                                      O))    O))   O))    O))  O)    O))   " + "\n" +
        "      O))    O))    O))     O))   O))           O))    O))   O))    O)) O))         " + "\n" +
        "      O))  O))  O))  O))   O))  O))  O))        O) O))       O)))))))   O))         " + "\n" +
        "      O)) O))   O))   O)) O))  O))   O))        O))  O))     O))        O))   O)))) " + "\n" +
        " O)   O))  O))   O))   O)O))   O))   O))        O))    O))   O))         O))    O)  " + "\n" +
        "  O))))     O)) O)))    O))      O)) O)))       O))      O)) O))          O)))))    ";
        JFrame mainmenu = new JFrame("Java RPG");
        JButton butt1 = new JButton("PLAY");
        JButton butt2 = new JButton("QUIT");
        FlowLayout flow = new FlowLayout();
        JTextPane text = new JTextPane();

        butt1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
            System.out.print("d");
        }}
        );
        butt2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                mainmenu.dispose();
                System.exit(-1);
            }}
            );
        text.setText(s);
        mainmenu.add(text);
        mainmenu.add(butt1);
        mainmenu.add(butt2);
        mainmenu.setVisible(true);
        mainmenu.setLayout(flow);
        mainmenu.pack();
    }
}
    