import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SearchBar extends MainFrame{
    JPanel searchBarPanel;
    JTextField searchField;
    ImageIcon searchIcon;
    JButton searchIconBtn;
    SearchBar(){
        searchBarPanel= new JPanel();
        searchField= new JTextField(50);
        searchIcon = new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\searchIcon.png");
        searchIconBtn = new JButton();

        LineBorder lineBorder =new LineBorder(Color.white, 8, true);
        searchField.setBorder(lineBorder );

        searchBarPanel.setBackground(new Color(0x5115C0));
        searchField.setFont(new Font("Times new Roman", Font.PLAIN, 15));
        searchBarPanel.setPreferredSize(new Dimension(50, 50));
        searchBarPanel.setBounds(0,0,1600, 50);
//        this.add(searchBarPanel, BorderLayout.NORTH);

        searchIconBtn.setBorderPainted(false);
        searchIconBtn.setBackground(new Color(0x722edb));
        searchIconBtn.setFocusable(false);

        searchIconBtn.setIcon(searchIcon);
        searchBarPanel.add(searchField);
        searchBarPanel.add(searchIconBtn);

        this.add(searchBarPanel);
        this.setVisible(true);
    }

}
