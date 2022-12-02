import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    Color bgColor;
    MainFrame(){
        this.setBounds(0, 0, 1600,900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\device-shop.png").getImage());
        this.setTitle("RGB - All Gaming Items At One Place");
//        this.setFont("MV Boli", Font.BOLD, 25);
        this.setLayout(null);
        bgColor= new Color(0x722edb);
        this.getContentPane().setBackground(bgColor);

        //----------- Side nav panel and shop screen--------------
//
//        this.setLayout(new BorderLayout());
//        JPanel outerNavPanel= new JPanel();
//        JPanel mainShopPanel= new JPanel();
//
//        outerNavPanel.setBackground(Color.orange);
//        mainShopPanel.setBackground(Color.yellow);
//
//        outerNavPanel.setPreferredSize(new Dimension(80, 100));
//
//        this.add(outerNavPanel, BorderLayout.WEST);
//        this.add(mainShopPanel);
//
//        //------------- Icons in side navbar ----------------
//
//        JPanel navIconPanel= new JPanel();
//
//        //button for set icon
//        JButton homeIconLabel= new JButton();
//        JButton shoppingIconLabel= new JButton();
//        JButton supportIconLabel= new JButton();
//        JButton announcementIconLabel= new JButton();
//
//        //set icon images
//        ImageIcon homeIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\fastCard.png");
//        ImageIcon shoppingIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\shoppingIcon.png");
//        ImageIcon supportIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\supportIcon.png");
//        ImageIcon announcementIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\announcementIcon.png");
//
//        navIconPanel.setLayout(new GridLayout(4,1,20,30));
//        navIconPanel.setBackground(Color.orange);
//
//        outerNavPanel.add(navIconPanel);
//        // add icons into label
//        homeIconLabel.setIcon(homeIcon);
//        shoppingIconLabel.setIcon(shoppingIcon);
//        supportIconLabel.setIcon(supportIcon);
//        announcementIconLabel.setIcon(announcementIcon);
//
//
//        //set background color of the button
//        shoppingIconLabel.setBackground(Color.orange);
//        homeIconLabel.setBackground(Color.orange);
//        supportIconLabel.setBackground(Color.orange);
//        announcementIconLabel.setBackground(Color.orange);
//
//        // remove border around the button
//
//        announcementIconLabel.setBorderPainted(false);
//        homeIconLabel.setBorderPainted(false);
//        shoppingIconLabel.setBorderPainted(false);
//        supportIconLabel.setBorderPainted(false);
//
//        // focusable none of the buttons
//        announcementIconLabel.setFocusable(false);
//        homeIconLabel.setFocusable(false);
//        shoppingIconLabel.setFocusable(false);
//        supportIconLabel.setFocusable(false);
//
//        //add label into panel
//        navIconPanel.add(homeIconLabel);
//        navIconPanel.add(shoppingIconLabel);
//        navIconPanel.add(supportIconLabel);
//        navIconPanel.add(announcementIconLabel);
//
//
//        this.setVisible(true);
    }
//    public void tpCallFrame(){
//        this.setBounds(50, 50, 1500,800);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setIconImage(new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\device-shop.png").getImage());
//        this.setTitle("Dictoo");
////        this.setFont("MV Boli", Font.BOLD, 25);
//        this.setLayout(null);
//        Color bgColor= new Color(0xffffff);
//        this.getContentPane().setBackground(bgColor);
//
//        //----------- Side nav panel and shop screen--------------
//
//        this.setLayout(new BorderLayout());
//        JPanel outerNavPanel= new JPanel();
//        JPanel mainShopPanel= new JPanel();
//
//        outerNavPanel.setBackground(Color.orange);
//        mainShopPanel.setBackground(Color.yellow);
//
//        outerNavPanel.setPreferredSize(new Dimension(80, 100));
//
//        this.add(outerNavPanel, BorderLayout.WEST);
//        this.add(mainShopPanel);
//
//        //------------- Icons in side navbar ----------------
//
//        JPanel navIconPanel= new JPanel();
//
//        //button for set icon
//        JButton homeIconLabel= new JButton();
//        JButton shoppingIconLabel= new JButton();
//        JButton supportIconLabel= new JButton();
//        JButton announcementIconLabel= new JButton();
//
//        //set icon images
//        ImageIcon homeIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\fastCard.png");
//        ImageIcon shoppingIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\shoppingIcon.png");
//        ImageIcon supportIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\supportIcon.png");
//        ImageIcon announcementIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\announcementIcon.png");
//
//        navIconPanel.setLayout(new GridLayout(4,1,20,30));
//        navIconPanel.setBackground(Color.orange);
//
//        outerNavPanel.add(navIconPanel);
//        // add icons into label
//        homeIconLabel.setIcon(homeIcon);
//        shoppingIconLabel.setIcon(shoppingIcon);
//        supportIconLabel.setIcon(supportIcon);
//        announcementIconLabel.setIcon(announcementIcon);
//
//
//        //set background color of the button
//        shoppingIconLabel.setBackground(Color.orange);
//        homeIconLabel.setBackground(Color.orange);
//        supportIconLabel.setBackground(Color.orange);
//        announcementIconLabel.setBackground(Color.orange);
//
//        // remove border around the button
//
//        announcementIconLabel.setBorderPainted(false);
//        homeIconLabel.setBorderPainted(false);
//        shoppingIconLabel.setBorderPainted(false);
//        supportIconLabel.setBorderPainted(false);
//
//        // focusable none of the buttons
//        announcementIconLabel.setFocusable(false);
//        homeIconLabel.setFocusable(false);
//        shoppingIconLabel.setFocusable(false);
//        supportIconLabel.setFocusable(false);
//
//        //add label into panel
//        navIconPanel.add(homeIconLabel);
//        navIconPanel.add(shoppingIconLabel);
//        navIconPanel.add(supportIconLabel);
//        navIconPanel.add(announcementIconLabel);
//
//
//        this.setVisible(true);
//    }
}
