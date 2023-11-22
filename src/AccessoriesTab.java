import javax.swing.*;
import java.awt.*;

public class AccessoriesTab extends GadgetsTab{
    JPanel pc;
    JLabel pcLabel;
    AccessoriesTab(){
        accessoriesPanel.setLayout(null);
        pc = new JPanel();
        pc.setBounds(30, 80, 1400, 700);
        pc.setBackground(new Color(0x722edb));
        pc.setLayout(new GridLayout(2, 3, 100, 40));

        pcLabel = new JLabel("Accessories");
        accessoriesPanel.add(pcLabel);
        pcLabel.setBounds(20, 20, 1000, 35);
        pcLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        pcLabel.setForeground(Color.white);

        accessoriesPanel.add(pc);
        String monitor_1 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\w292 (5).png";
        String monitor_2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\w292.png";
        String monitor_3 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\w292 (1).png";
        String keyboard_1 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\w292 (2).png";
        String keyboard_2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Consoles\\w292 (3).png";

        pc.add(toCall(monitor_1, "ROG Swift 360Hz ", "  eSports NVIDIA® G-SYNC® Gaming Monitor – 24.5 inch FHD", "PG259","$899"));
        pc.add(toCall(monitor_2, "ROG STRIX XG258Q", "  Gaming Monitor – 25 inch (24.5 inch viewable) FHD (1920x1080)","XG258","$1599"));
        pc.add(toCall(monitor_3, "ROG STRIX XG32V", "  Curved HDR Gaming Monitor – 31.5 inch WQHD (2560x1440)", "XG32","$1749"));
        pc.add(toCall(keyboard_1, "ROG Claymore II", "TKL 80%/100% gaming mechanical keyboard with ROG RX Optical Mechanical Switches","kYB12","$499"));
        pc.add(toCall(keyboard_2, "ROG Strix Flare", "RGB mechanical gaming keyboard with Cherry MX switches","KYB28","$699"));

    }

}
