import javax.swing.*;
import java.awt.*;

public class ConsolesTab extends GamesTab{
    JPanel pc;
    JLabel pcLabel;
    ConsolesTab(){
        consolesPanel.setLayout(null);
        pc = new JPanel();
        pc.setBounds(30, 80, 1400, 700);
        pc.setBackground(new Color(0x722edb));
        pc.setLayout(new GridLayout(2, 3, 100, 40));

        pcLabel = new JLabel("Gaming Consoles");
        consolesPanel.add(pcLabel);
        pcLabel.setBounds(20, 20, 1000, 40);
        pcLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        pcLabel.setForeground(Color.white);

        consolesPanel.add(pc);
        String console_1 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\nintendo_switch7069.jpg";
        String console_2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\PlayStation 5 Console.jpg";
        String console_3 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\Xbox Series S.jpg";
        String console_4= "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\ps4.jpg";
        String console_5 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\Nintendo Switch – OLED Model.jpg";

        pc.add(toCall(console_1, "Nintendo Switch", "7-inch OLED screen","NS7i","$499"));
        pc.add(toCall(console_2, "PlayStation 5", "Model Number CFI-1215A01X","PS5","$1549"));
        pc.add(toCall(console_4, "PlayStation®4 1TB", "DUALSHOCK®4 Wireless Controller, Mono headset","PS4","$299"));
        pc.add(toCall(console_3, "Xbox Series S", "Equipped with AMD’s Zen 2 and RDNA 2 architectures, DirectX ray","XBX5","$599"));
        pc.add(toCall(console_5, "Nintendo Switch", "7-inch OLED screen","NS9b","$499"));

    }

}
