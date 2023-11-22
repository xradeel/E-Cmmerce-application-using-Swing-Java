import javax.swing.*;
import java.awt.*;

public class SideTabbed extends SearchBar {
    JTabbedPane tabbedPane;
    ImageIcon computerIcon;
    JPanel mainShopPanel, dileveryDataPanel;;
    ImageIcon consoleIcon;
    ImageIcon gameIcon;
    ImageIcon accessoriesIcon, gadgetsIcon, homeIcon;
    JPanel gadgetsPanel;
    JPanel consolesPanel;
    JPanel gamesPanel;
    JPanel accessoriesPanel, computerPanel;
    SideTabbed(){
        tabbedPane= new JTabbedPane(JTabbedPane.LEFT);

        mainShopPanel = new JPanel();
        mainShopPanel.setLayout(null);
        mainShopPanel.setBackground(new Color(0x722edb));


        //set imageIcons for the tabs
        homeIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\homepage.png");
        computerIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\computerIcon.png");
        consoleIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\consoleIcon.png");
        gameIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\gameIcon.png");
        accessoriesIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\accessoriesIcon.png");
        gadgetsIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\orderNow.png");

        gadgetsPanel= new JPanel();
        computerPanel= new JPanel();
        consolesPanel= new JPanel();
        gamesPanel= new JPanel();
        accessoriesPanel= new JPanel();


        computerPanel.setBackground(new Color(0x722edb));
        consolesPanel.setBackground(new Color(0x722edb));
        gamesPanel.setBackground(new Color(0x722edb));
        accessoriesPanel.setBackground(new Color(0x722edb));
        gadgetsPanel.setBackground(new Color(0x722edb));



//        add tabs in the main panel
        tabbedPane.addTab("Home", homeIcon, mainShopPanel);
        tabbedPane.addTab("Computers", computerIcon, computerPanel);
        tabbedPane.addTab("Consoles", consoleIcon, consolesPanel);
        tabbedPane.addTab("Games", gameIcon, gamesPanel);
        tabbedPane.addTab("Accessories", accessoriesIcon, accessoriesPanel);
        tabbedPane.addTab("CPU & GPU", gadgetsIcon, gadgetsPanel);

        tabbedPane.setBorder(BorderFactory.createEmptyBorder());

        // Properties of the tabs
        tabbedPane.setBackground(new Color(0x5115C0));
        tabbedPane.setBounds(0,50,1580,810);

        frame.setResizable(false);
        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
