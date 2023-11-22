import javax.swing.*;
import java.awt.*;

public class GamesTab extends AccessoriesTab{
    JPanel pc;
    JLabel pcLabel;
    GamesTab(){
        gamesPanel.setLayout(null);
        pc = new JPanel();
        pc.setBounds(30, 80, 1400, 700);
        pc.setBackground(new Color(0x722edb));
        pc.setLayout(new GridLayout(2, 3, 100, 40));

        pcLabel = new JLabel("Games");
        gamesPanel.add(pcLabel);
        pcLabel.setBounds(20, 20, 1000, 40);
        pcLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        pcLabel.setForeground(Color.white);

        gamesPanel.add(pc);
        String PCLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\Garena-Free-Fire.jpeg";
        String consoleLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\FIFA.jpg";
        String gamesLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\Garena-Free-Fire.jpeg";
        String gadgetsLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\FIFA.jpg";
        String AccLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\call_of_duty.jpg";


        pc.add(toCall(PCLoc, "Garena Free Fire", " world-famous survival shooter game", "GFF07","$250"));
        pc.add(toCall(consoleLoc, "Fifa", " EA Sports FC from 2023","Fifa23","$250"));
        pc.add(toCall(gamesLoc, "Garena Free Fire", " world-famous survival shooter game", "GFF07","$250"));
        pc.add(toCall(AccLoc, "Call Of Duty", "Team Deathmatch, Domination, and Kill-Confirmed","COD22","$250"));
        pc.add(toCall(gadgetsLoc, "Fifa", " EA Sports FC from 2023","Fifa23","$250"));

    }

}
