import javax.swing.*;
import java.awt.*;

public class SideTabbed extends ShowProduct {
    JTabbedPane tabbedPane;
    ImageIcon homeIcon;
    ImageIcon shoppingIcon;
    ImageIcon supportIcon;
    ImageIcon announcementIcon;
//    JLabel homeIconLabel;
//    JLabel shoppingIconLabel;
//    JLabel supportIconLabel;
//    JLabel announcementIconLabel;
    JPanel homePanel;
    JPanel shoppingPanel;
    JPanel supportPanel;
    JPanel announcementPanel;
    SideTabbed(){
        tabbedPane= new JTabbedPane(JTabbedPane.LEFT);
        tabbedPane.setBounds(0,50,1600,900);


        //set imageIcons for the tabs
        homeIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\homepage.png");
        shoppingIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\shoppingIcon.png");
        supportIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\supportIcon.png");
        announcementIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\announcementIcon.png");

        homePanel= new JPanel();
        shoppingPanel= new JPanel();
        supportPanel= new JPanel();
        announcementPanel= new JPanel();

//        homeIconLabel= new JLabel();
//        shoppingIconLabel= new JLabel();
//        supportIconLabel= new JLabel();
//        announcementIconLabel= new JLabel();
//
//        homeIconLabel.setIcon(homeIcon);
//        shoppingIconLabel.setIcon(shoppingIcon);
//        supportIconLabel.setIcon(supportIcon);
//        announcementIconLabel.setIcon(announcementIcon);

//        add tabs in the main panel
        tabbedPane.addTab("Home", homeIcon, mainShopPanel);
        tabbedPane.addTab("Shopping", shoppingIcon, shoppingPanel);
        tabbedPane.addTab("Support", supportIcon, supportPanel);
        tabbedPane.addTab("Announcement", announcementIcon, announcementPanel);

        tabbedPane.setBorder(BorderFactory.createEmptyBorder());
//        tabbedPane.;

        // Properties of the tabs
        tabbedPane.setBackground(new Color(0x5115C0));



        this.add(tabbedPane);
        this.setVisible(true);
    }
}
