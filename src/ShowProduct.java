import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class ShowProduct extends SearchBar implements MouseListener {
    static JPanel mainShopPanel,categories,topRated;
    static JPanel productPanel;
    static JLabel img,catLabel,topRateLabel;
    static ImageIcon productPic;
    static JLabel productDis;
    static JLabel productName;
    JScrollPane scrollPane;

    public <SingleClientPanel> ShowProduct() {

        mainShopPanel = new JPanel();
        mainShopPanel.setLayout(null);
        mainShopPanel.setBackground(new Color(0x722edb));

//        scrollPane.setVisible(true);

        categories = new JPanel();
        categories.setBounds(30, 80, 1400, 700);
        categories.setBackground(new Color(0x722edb));
        categories.setLayout(new GridLayout(2, 3, 100, 40));

        topRated = new JPanel();
        topRated.setBounds(30, 80, 1400, 700);
        topRated.setBackground(new Color(0x722edb));
        topRated.setLayout(new GridLayout(2, 3, 100, 40));


        catLabel = new JLabel("CATEGORIES");
        mainShopPanel.add(catLabel);
        catLabel.setBounds(20, 30, 1000, 35);
        catLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        catLabel.setForeground(Color.white);

        topRateLabel = new JLabel("TOP RATED");
        topRateLabel.setBounds(20, 800, 1000, 35);
        topRateLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        topRateLabel.setForeground(Color.white);

//
//        scrollPane = new JScrollPane(categories);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setPreferredSize(new Dimension(1700, 900));
//        scrollPane.setViewportBorder(null);
//        scrollPane.setViewportView(categories);
//        scrollPane.setViewportView(topRated);
//        scrollPane.add(topRated);
//        mainShopPanel.add(scrollPane);

        String PCLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Computer.png";
        String consoleLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\games.jpg";
        String gadgetsLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Gadgets.png";
        String gamesLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Game View.jpg";
        String AccLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Accessories.png";
        String y = "Large variety, Branded, Gaming";

        mainShopPanel.add(categories);
        mainShopPanel.add(topRateLabel);
        mainShopPanel.add(topRated);
        categories.add(toCall(PCLoc, "Computers", y));
        categories.add(toCall(consoleLoc, "Consoles", y));
        categories.add(toCall(gamesLoc, "Games", y));
        categories.add(toCall(AccLoc, "Accessories", y));
        categories.add(toCall(gadgetsLoc, "Gadgets", y));

        topRated.add(toCall(PCLoc, "Computers", y));
        topRated.add(toCall(consoleLoc, "Consoles", y));
        topRated.add(toCall(PCLoc, "Games", y));
        topRated.add(toCall(PCLoc, "Accessories", y));
        topRated.add(toCall(gadgetsLoc, "Gadgets", y));
        topRated.add(toCall(gadgetsLoc, "Gadgets", y));
        topRated.add(toCall(gadgetsLoc, "Gadgets", y));
//            this.add(mainShopPanel);

        this.setVisible(true);
    }

    public Component toCall(String productLoc, String ptName, String ptDescription) {
        productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBackground(new Color(0x9E69E7));
        productPanel.setForeground(Color.white);
        productPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        productPanel.addMouseListener(this);

        img = new JLabel();
        productPic = new ImageIcon(productLoc);

        productName = new JLabel(ptName);
        productDis = new JLabel(ptDescription);
        productName.setForeground(Color.white);
        productDis.setForeground(Color.white);
        Font pNameFont = new Font("Raleway", Font.BOLD, 35);


        img.setIcon(productPic);
        img.setBounds(0, 0, 400, 220);

        productPanel.setBounds(50, 50, productPic.getIconWidth(), 300);
        productPanel.add(img);
        productPanel.add(productName);
        productPanel.add(productDis);
//            productPanel.setBackground(Color.white);

        productName.setBounds(5, 190, productPic.getIconWidth(), 100);
        productName.setFont(pNameFont);
        productDis.setBounds(5, 230, 400, 100);
        productDis.setFont(new Font("Raleway", Font.PLAIN, 15));
//            productDis.setForeground(Color.DARK_GRAY);
//            mainShopPanel.add(productPanel);
//            this.add(mainShopPanel);
//            this.setVisible(true);
        return productPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(null, "App Under Development", "RGB - All Gaming Items At One Place", JOptionPane.INFORMATION_MESSAGE);
//        this.dispose();
//        new SearchBar();
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
