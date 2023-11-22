import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class ShowProduct extends DileveryForm implements MouseListener {
    static JPanel categories;
    static JPanel productPanel;
    static JLabel imgLabel,catLabel;
    JButton order;
    static JLabel productDis, productNo, productRs;
    static JLabel productName;

    public ShowProduct() {
        categories = new JPanel();
        categories.setBounds(30, 80, 1400, 700);
        categories.setBackground(new Color(0x722edb));
        categories.setLayout(new GridLayout(2, 3, 100, 40));

        catLabel = new JLabel("CATEGORIES");
        mainShopPanel.add(catLabel);
        catLabel.setBounds(20, 30, 1000, 35);
        catLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        catLabel.setForeground(Color.white);

        String PCLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Computer.png";
        String consoleLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\games.jpg";
        String gadgetsLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Gadgets.png";
        String gamesLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Game View.jpg";
        String AccLoc = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\reShapImages\\Accessories.png";
        String y = "Large variety, Branded, Gaming";

        mainShopPanel.add(categories);
        categories.add(toCall(PCLoc, "Computers", y));
        categories.add(toCall(consoleLoc, "Consoles", y));
        categories.add(toCall(gamesLoc, "Games", y));
        categories.add(toCall(AccLoc, "Accessories", y));
        categories.add(toCall(gadgetsLoc, "Gadgets", y));
        frame.setVisible(true);
    }

    public Component toCall(String productLoc, String ptName, String ptDescription) {
        productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBackground(new Color(0x9E69E7));
        productPanel.setForeground(Color.white);
        productPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        productPanel.setBorder(new LineBorder(Color.white, 2, true));
        productPanel.addMouseListener(this);

        imgLabel = new JLabel();
//        productPic = new ImageIcon(productLoc);
        ImageIcon icon= new ImageIcon(productLoc);
        Image icon1 = icon.getImage();
        Image iconSize = icon1.getScaledInstance(400, 220,Image.SCALE_SMOOTH);
        ImageIcon productPic=new ImageIcon(iconSize);

        productName = new JLabel(ptName);
        productDis = new JLabel(ptDescription);
        productName.setForeground(Color.white);
        productDis.setForeground(Color.white);
        Font pNameFont = new Font("Raleway", Font.BOLD, 35);


        imgLabel.setIcon(productPic);
        imgLabel.setBounds(0, 0, 400, 220);

        productPanel.setBounds(50, 50, productPic.getIconWidth(), 350);
        productPanel.add(imgLabel);
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
    public Component toCall(String productLoc, String ptName, String ptDescription, String  ptNumber, String ptPrice) {
        order= new JButton("Order Now");
        productPanel = new JPanel();
        productPanel.setLayout(null);
        productPanel.setBackground(new Color(0x9E69E7));
        productPanel.setForeground(Color.white);
        productPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        productPanel.setBorder(new LineBorder(Color.white, 2, true));
        productPanel.addMouseListener(this);

        imgLabel = new JLabel();
        ImageIcon icon= new ImageIcon(productLoc);
        Image icon1 = icon.getImage();
        Image iconSize = icon1.getScaledInstance(400, 220,Image.SCALE_SMOOTH);
        ImageIcon productPic=new ImageIcon(iconSize);

        productName = new JLabel(ptName);
        productNo = new JLabel(ptNumber);
        productRs = new JLabel(ptPrice);
        productDis = new JLabel(ptDescription);
        productName.setForeground(Color.white);
        productNo.setForeground(Color.white);
        productRs.setForeground(Color.red);
        productDis.setForeground(Color.white);
        Font pNameFont = new Font("Raleway", Font.BOLD, 35);


        imgLabel.setIcon(productPic);
        imgLabel.setBounds(0, 0, 400, 220);

        productPanel.setBounds(50, 50, productPic.getIconWidth(), 350);
        productPanel.add(imgLabel);
        productPanel.add(productName);
        productPanel.add(productDis);
        productPanel.add(productNo);
        productPanel.add(productRs);
        productPanel.add(order);

        order.setForeground(Color.white);
        order.setBackground(new Color(0x722edb));

        productName.setBounds(5, 190, productPic.getIconWidth(), 100);
        productName.setFont(pNameFont);
        productDis.setBounds(5, 245, 400, 50);
        productNo.setBounds(350, 210, 400, 50);
        order.setBounds(50, 283, 150, 40);
        productRs.setBounds(335, 283, 400, 40);
        productDis.setFont(new Font("Raleway", Font.PLAIN, 15));
        order.setFont(new Font("Raleway", Font.BOLD, 15));
        productNo.setFont(new Font("Raleway", Font.PLAIN, 15));
        productRs.setFont(new Font("Arial", Font.BOLD, 18));

        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane.setVisible(false);
                searchBarPanel.setVisible(false);
                dileveryDataPanel.setVisible(true);

            }
        });

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
