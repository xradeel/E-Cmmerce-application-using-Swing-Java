import java.awt.*;
import javax.swing.*;

public class MainFrame  {
    Color bgColor;
    JFrame frame;
    MainFrame(){
        frame=new JFrame();
        frame.setBounds(0, 0, 1600,900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\RGB App Logo.png").getImage());
        frame.setTitle("RGB - All Gaming Items At One Place: ");
        frame.getContentPane().setLayout(null);
        bgColor= new Color(0x722edb);
        frame.getContentPane().setBackground(bgColor);
    }
}
