import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComputerTab extends ShowProduct{
    JPanel pc;
    JLabel pcLabel;
    ComputerTab(){
        computerPanel.setLayout(null);
        pc = new JPanel();
        pc.setBounds(30, 80, 1400, 700);
        pc.setBackground(new Color(0x722edb));
        pc.setLayout(new GridLayout(2, 3, 100, 40));

        pcLabel = new JLabel("Gaming PCs");
        computerPanel.add(pcLabel);
        pcLabel.setBounds(20, 20, 1000, 40);
        pcLabel.setFont(new Font("Raleway", Font.ITALIC, 35));
        pcLabel.setForeground(Color.white);

        computerPanel.add(pc);
        String asusRog1 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\ASUS ROG Strix G35CZ Gaming Desktop PC.jpg";
        String skyTech = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\SkyTech Shadow 3.0 Gaming Computer PC Desktop.jpg";
        String asusRog2 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\ASUS ROG Strix GL10 Gaming Desktop PC.jpg";
        String asusRog3 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\asusRog3.jpg";
        String asusRog4 = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\ROG-Strix-Helios-GX601.jpg";
        String corsair_one = "D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\images\\App Data\\Gaming Computers\\corsair_one.jpg";


        pc.add(toCall(asusRog1, "ASUS Rog", "Strix G35CZ, GeForce RTX 3080", "PCG35","$9150"));
        pc.add(toCall(skyTech, "SkyTech Shadow3.0", "Ryzen 5 3600 6-Core 3.6GHz","PC287","$4550"));
        pc.add(toCall(asusRog2, "ASUS Rog", "Strix GL10, AMD Ryzen5","PC231","$3250"));
        pc.add(toCall(asusRog3, "ASUS ROG Strix G10", "GeForce RTX 3060","PC984","$2250"));
        pc.add(toCall(asusRog4, "ASUS ROG Helios", " GX601 RGB Mid","GX601","$1950"));
        pc.add(toCall(corsair_one, "Corsair RTX", "ONE i140 - i7-9700K/RTX","PC140","$1900"));

    }

}
