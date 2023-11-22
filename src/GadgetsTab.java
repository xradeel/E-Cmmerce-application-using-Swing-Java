import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GadgetsTab extends ComputerTab {
    JPanel gadProductPanel;
    JLabel gadLabel;
    GadgetsTab(){
        gadgetsPanel.setLayout(null);
        gadProductPanel= new JPanel();
        gadProductPanel.setBounds(30, 80, 1400, 700);
        gadProductPanel.setBackground(new Color(0x722edb));
        gadProductPanel.setLayout(new GridLayout(2, 3, 100, 40));

        gadLabel = new JLabel("CPU & GPU");
        gadgetsPanel.add(gadLabel);
        gadLabel.setBounds(20, 20, 1000, 35);
        gadLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        gadLabel.setForeground(Color.white);

        gadgetsPanel.add(gadProductPanel);
        String cpuNo_1 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\w292.png";
        String cpuNo_2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\w292 (1).png";
        String cpuNo_3 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\w292 (2).png";
        String graphicsCard = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\w292 (3).png";
        String graphicsCard_2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\w292 (4).png";

        gadProductPanel.add(toCall(graphicsCard, "ROG-STRIX-RX6800", "ROG Strix Radeon™ RX 6800, frame-crunching ","RX6800","$1199"));
        gadProductPanel.add(toCall(graphicsCard_2, "ROG-STRIX-RX6700", "ROG Strix Radeon™ RX 6700 Edition 12GB GDDR6","RX6700","$999"));
        gadProductPanel.add(toCall(cpuNo_1, "ROG XIII Glacial", "Intel® Z590 EATX motherboard with 18+2 power","Z590","$1250"));
        gadProductPanel.add(toCall(cpuNo_2, "ROG XIII Extreme", "Thunderbolt™ 4, Marvell® AQtion 10 Gb Ethernet,","E274","$900"));
        gadProductPanel.add(toCall(cpuNo_3, "ROG XIII HERO", "Intel® 2.5 Gb Ethernet, PCIe® 4.0, onboard WiFi 6E","S430","$750"));

    }

}
