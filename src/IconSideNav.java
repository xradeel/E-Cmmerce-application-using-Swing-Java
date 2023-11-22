import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class IconSideNav extends MainFrame implements MouseListener {

    JPanel outerNavPanel;
//    JPanel /*mainShopPanel*/;
    JPanel navIconPanel;
    JButton homeIconLabel;
    JButton shoppingIconLabel;
    JButton supportIconLabel;
    JButton announcementIconLabel;
    ImageIcon homeIcon;
    ImageIcon shoppingIcon;
    ImageIcon supportIcon;
    ImageIcon announcementIcon;
    IconSideNav(){

        frame.setLayout(new BorderLayout());
        outerNavPanel= new JPanel();
//        /*mainShopPanel*/= new JPanel();


        outerNavPanel.setBackground(new Color(0x5115C0));
//        /*mainShopPanel*/.setBackground(Color.yellow);
//        /*mainShopPanel*/.setLayout(null);
////        mainShopPanel.setBounds(0,0 ,1000,1000);


        outerNavPanel.setPreferredSize(new Dimension(80, 100));
//        /*mainShopPanel*/.setPreferredSize(new Dimension(400,500));

        frame.add(outerNavPanel, BorderLayout.WEST);
//        this.add(/*mainShopPanel*/, BorderLayout.CENTER);

        //------------- Icons in side navbar ----------------

        navIconPanel= new JPanel();

        //button for set icon
        homeIconLabel= new JButton();
        shoppingIconLabel= new JButton();
        supportIconLabel= new JButton();
        announcementIconLabel= new JButton();

        //set icon images
        homeIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\homepage.png");
        shoppingIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\shoppingIcon.png");
        supportIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\supportIcon.png");
        announcementIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\announcementIcon.png");

        navIconPanel.setLayout(new GridLayout(4,1,20,30));
        navIconPanel.setBackground(new Color(0x5115C0));

        outerNavPanel.add(navIconPanel);
        // add icons into label
        homeIconLabel.setIcon(homeIcon);
        shoppingIconLabel.setIcon(shoppingIcon);
        supportIconLabel.setIcon(supportIcon);
        announcementIconLabel.setIcon(announcementIcon);


        //set background color of the button
        shoppingIconLabel.setBackground(new Color(0x5115C0));
        homeIconLabel.setBackground(new Color(0x5115C0));
        supportIconLabel.setBackground(new Color(0x5115C0));
        announcementIconLabel.setBackground(new Color(0x5115C0));

        // remove border around the button

        announcementIconLabel.setBorderPainted(false);
        homeIconLabel.setBorderPainted(false);
        shoppingIconLabel.setBorderPainted(false);
        supportIconLabel.setBorderPainted(false);

        // focusable none of the buttons
        announcementIconLabel.setFocusable(false);
        homeIconLabel.setFocusable(false);
        shoppingIconLabel.setFocusable(false);
        supportIconLabel.setFocusable(false);

        //set Hand cursor
        announcementIconLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        homeIconLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        shoppingIconLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        supportIconLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //Mouse action listener
        announcementIconLabel.addMouseListener(this);
        homeIconLabel.addMouseListener(this);
        shoppingIconLabel.addMouseListener(this);
        supportIconLabel.addMouseListener(this);

        //add label into panel
        navIconPanel.add(homeIconLabel);
        navIconPanel.add(shoppingIconLabel);
        navIconPanel.add(supportIconLabel);
        navIconPanel.add(announcementIconLabel);


////        mainShopPanel.

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null,"Sorry! Project is continue.","Apology",JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
