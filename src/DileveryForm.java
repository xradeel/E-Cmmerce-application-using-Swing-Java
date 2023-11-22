import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DileveryForm extends SideTabbed{

    JButton backBtn, formPrevBtn, formPrevBtn2;
    JPanel rgbImagePanel, selectProductPanel, deliveryAddressPanel, paymentMethodPanel, showGreetingPanel;
    JLabel selectionHeading, addressHeading,paymentHeading, methodOfCode1, methodOfCode2, selectQuantity;

    //to store the address
    JLabel fullName,  phoneNumber, deliveryAddress, landMark,
             city, stateProvince,  homeOrOffice, accNumber, userMassage, noteMassage;
    JTextField fullNameField,  phoneNumberField, deliveryAddressField, landMarkField,
             cityField, stateProvinceField, accNumberField;
    Color formColor, fontColor;
    Font headingFont, normalFont;
    JComboBox<String> productCodeList, paymentApps;
    LineBorder lineBorder;
    DileveryForm(){
        dileveryDataPanel = new JPanel();
        formColor = new Color(0x10171b);
        fontColor =new Color(0x577a82);
        lineBorder =new LineBorder(fontColor, 5, true);
        normalFont= new Font("Raleway", Font.PLAIN, 20);
        headingFont= new Font("Raleway", Font.BOLD, 33);
        dileveryDataPanel.setBounds(0,0,1600,900);
        dileveryDataPanel.setLayout(null);
        dileveryDataPanel.setBackground(formColor);

        ImageIcon backIcon= new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\icon\\back-arrow.png");

        backBtn = new JButton();
        backBtn.setBounds(10,10,30,30);
        backBtn.setIcon(backIcon);
        backBtn.setBackground(Color.white);

        // add Logo Image and Company description
        rgbImagePanel = new JPanel();
        rgbImagePanel.setBounds(80,80,600,750);
        rgbImagePanel.setBackground(formColor);

        JLabel rgbImageLabel = new JLabel();
        rgbImageLabel.setBounds(0,0,600,600);
        ImageIcon rgbIcon = new ImageIcon("D:\\3rd Semester\\OOP\\LAB\\LabProject\\src\\assets\\RGB App Logo.png");
        Image icon1 = rgbIcon.getImage();
        Image iconSize = icon1.getScaledInstance(600, 600,Image.SCALE_SMOOTH);
        ImageIcon rgbImage=new ImageIcon(iconSize);
        rgbImageLabel.setIcon(rgbImage);

        JLabel rgbDescription= new JLabel("RGB - All Gaming Items At One Place");
        rgbDescription.setBounds(0,670, 600, 100);
        rgbDescription.setForeground(fontColor);
        rgbDescription.setFont(headingFont);

        rgbImagePanel.add(rgbImageLabel);
        rgbImagePanel.add(rgbDescription);

        // add all the delivery form e.g. name and address
        selectProductPanel = new JPanel();
        selectProductPanel.setBounds(750, 80, 900,900);
        selectProductPanel.setLayout(null);
        selectProductPanel.setBackground(formColor);

        selectionHeading = new JLabel("Select your product by product code");
        selectionHeading.setFont(headingFont);
        selectionHeading.setBounds(0,0,900,40);
        selectionHeading.setForeground(fontColor);

        String[] productNumber = {"PCG35","PC287", "PC231","PC984","GX601","PC140",
                "NS7i","PS5","NS9b","XBX5","NS9b",
                "GFF07","Fifa23","COD22",
                "PG259","XG258","XG32","kYB12","KYB28",
                "RX6800","RX6700","Z590","E274","S430"};
        productCodeList = new JComboBox<>(productNumber);
        productCodeList.setBounds(60,80,600,70);
        productCodeList.setBackground(fontColor);
        productCodeList.setForeground(Color.white);
        productCodeList.setFont(new Font("Raleway", Font.PLAIN, 20));


        methodOfCode1 = new JLabel("Go back to favourite product to see the product code. ");
        methodOfCode1.setFont(new Font("Raleway", Font.PLAIN, 20));
        methodOfCode1.setBounds(60,170, 900,20);
        methodOfCode1.setForeground(fontColor);
        methodOfCode2 = new JLabel("Remember that product code and select it here. ");
        methodOfCode2.setBounds(60,200, 900,20);
        methodOfCode2.setForeground(fontColor);
        methodOfCode2.setFont(new Font("Raleway", Font.PLAIN, 20));

        selectQuantity = new JLabel("Select how many products you want to order?");
        selectQuantity.setFont(new Font("Raleway", Font.PLAIN, 20));
        selectQuantity.setBounds(60,270, 900,20);
        selectQuantity.setForeground(fontColor);

        //check box for the product quantities
        JCheckBox quantity1 = new JCheckBox("   1", true);
        quantity1.setFont(new Font("Raleway", Font.PLAIN, 20));
        quantity1.setBounds(60,310, 900,20);
        quantity1.setForeground(fontColor);
        quantity1.setBackground(formColor);
        quantity1.setFocusable(false);
        JCheckBox quantity2 = new JCheckBox("   2");
        quantity2.setFont(new Font("Raleway", Font.PLAIN, 20));
        quantity2.setBounds(60,350, 900,20);
        quantity2.setForeground(fontColor);
        quantity2.setBackground(formColor);
        quantity2.setFocusable(false);
        JCheckBox quantity3 = new JCheckBox("   3");
        quantity3.setFont(new Font("Raleway", Font.PLAIN, 20));
        quantity3.setBounds(60,390, 900,20);
        quantity3.setForeground(fontColor);
        quantity3.setBackground(formColor);
        quantity3.setFocusable(false);
        JCheckBox quantity4 = new JCheckBox("   4");
        quantity4.setFont(new Font("Raleway", Font.PLAIN, 20));
        quantity4.setBounds(60,430, 900,20);
        quantity4.setForeground(fontColor);
        quantity4.setBackground(formColor);
        quantity4.setFocusable(false);
        JCheckBox quantity5 = new JCheckBox("   5");
        quantity5.setFont(new Font("Raleway", Font.PLAIN, 20));
        quantity5.setBounds(60,470, 900,20);
        quantity5.setForeground(fontColor);
        quantity5.setBackground(formColor);
        quantity5.setFocusable(false);

        //set a btn
        JButton formNextBtn = new JButton("Next");
        formNextBtn.setFont(new Font("Raleway", Font.PLAIN, 20));
        formNextBtn.setBounds(550,600,90, 40);
        formNextBtn.setForeground(Color.white);
        formNextBtn.setBackground(fontColor);
        formNextBtn.setFocusable(false);
        formNextBtn.setFocusPainted(false);

//add to Select Product Panel
        selectProductPanel.add(selectionHeading);
        selectProductPanel.add(productCodeList);
        selectProductPanel.add(methodOfCode1);
        selectProductPanel.add(methodOfCode2);
        selectProductPanel.add(selectQuantity);
        selectProductPanel.add(quantity1);
        selectProductPanel.add(quantity2);
        selectProductPanel.add(quantity3);
        selectProductPanel.add(quantity4);
        selectProductPanel.add(quantity5);
        selectProductPanel.add(formNextBtn);

        //add address panel
        deliveryAddressPanel= new JPanel();
        deliveryAddressPanel.setBounds(750, 80, 900,900);
        deliveryAddressPanel.setLayout(null);
        deliveryAddressPanel.setBackground(formColor);
        deliveryAddressPanel.setVisible(false);

        // for previous button
        formPrevBtn = new JButton(backIcon);
        formPrevBtn.setBounds(0,0,30,30);

        addressHeading = new JLabel("Delivery Address");
        addressHeading.setFont(headingFont);
        addressHeading.setBounds(250,0,900,40);
        addressHeading.setForeground(fontColor);

        fullName= new JLabel("Full Name: *");
        fullName.setBounds(60,40,500,20);
        fullName.setFont(normalFont);
        fullName.setForeground(fontColor);
        fullNameField= new JTextField();
        fullNameField.setBounds(130,70,500,40);
        fullNameField.setBorder(lineBorder);
        fullNameField.setFont(normalFont);
        fullNameField.setBackground(fontColor);
        fullNameField.setForeground(Color.white);

        deliveryAddress= new JLabel("Address: *");
        deliveryAddress.setBounds(60,120,500,20);
        deliveryAddress.setFont(normalFont);
        deliveryAddress.setForeground(fontColor);
        deliveryAddressField= new JTextField();
        deliveryAddressField.setBounds(130,150,500,40);
        deliveryAddressField.setBorder(lineBorder);
        deliveryAddressField.setFont(normalFont);
        deliveryAddressField.setBackground(fontColor);
        deliveryAddressField.setForeground(Color.white);

        phoneNumber= new JLabel("Mobile Number: *");
        phoneNumber.setBounds(60,200,500,20);
        phoneNumber.setFont(normalFont);
        phoneNumber.setForeground(fontColor);
        phoneNumberField= new JTextField();
        phoneNumberField.setBounds(130,230,500,40);
        phoneNumberField.setBorder(lineBorder);
        phoneNumberField.setFont(normalFont);
        phoneNumberField.setBackground(fontColor);
        phoneNumberField.setForeground(Color.white);

        landMark= new JLabel("Landmark(Optional):");
        landMark.setBounds(60,280,500,20);
        landMark.setFont(normalFont);
        landMark.setForeground(fontColor);
        landMarkField= new JTextField();
        landMarkField.setBounds(130,310,500,40);
        landMarkField.setBorder(lineBorder);
        landMarkField.setFont(normalFont);
        landMarkField.setBackground(fontColor);
        landMarkField.setForeground(Color.white);

        stateProvince= new JLabel("Province: *");
        stateProvince.setBounds(60,360,500,20);
        stateProvince.setFont(normalFont);
        stateProvince.setForeground(fontColor);
        stateProvinceField= new JTextField();
        stateProvinceField.setBounds(130,390,500,40);
        stateProvinceField.setBorder(lineBorder);
        stateProvinceField.setFont(normalFont);
        stateProvinceField.setBackground(fontColor);
        stateProvinceField.setForeground(Color.white);

        city= new JLabel("City: *");
        city.setBounds(60,440,500,20);
        city.setFont(normalFont);
        city.setForeground(fontColor);
        cityField= new JTextField();
        cityField.setBounds(130,470,500,40);
        cityField.setBorder(lineBorder);
        cityField.setFont(normalFont);
        cityField.setBackground(fontColor);
        cityField.setForeground(Color.white);

        homeOrOffice= new JLabel("Select a label for effective delivery:");
        homeOrOffice.setBounds(60,520,500,20);
        homeOrOffice.setFont(normalFont);
        homeOrOffice.setForeground(fontColor);
        JCheckBox homeLabel = new JCheckBox("    Home");
        JCheckBox officeLabel = new JCheckBox("    Office");
        homeLabel.setBounds(130,550,200,40);
        homeLabel.setFont(normalFont);
        homeLabel.setForeground(fontColor);
        homeLabel.setBackground(formColor);
        homeLabel.setFocusable(false);
        officeLabel.setBounds(330,550,200,40);
        officeLabel.setFont(normalFont);
        officeLabel.setBackground(formColor);
        officeLabel.setForeground(fontColor);
        officeLabel.setFocusable(false);

        JButton formNextBtn2 = new JButton("Next");
        formNextBtn2.setFont(new Font("Raleway", Font.PLAIN, 20));
        formNextBtn2.setBounds(550,630,90, 40);
        formNextBtn2.setForeground(Color.white);
        formNextBtn2.setBackground(fontColor);
        formNextBtn2.setFocusable(false);
        formNextBtn2.setFocusPainted(false);


        //add to delivery Address Panel
        deliveryAddressPanel.add(formPrevBtn);
        deliveryAddressPanel.add(addressHeading);
        deliveryAddressPanel.add(fullName);
        deliveryAddressPanel.add(fullNameField);
        deliveryAddressPanel.add(deliveryAddress);
        deliveryAddressPanel.add(deliveryAddressField);
        deliveryAddressPanel.add(phoneNumber);
        deliveryAddressPanel.add(phoneNumberField);
        deliveryAddressPanel.add(landMark);
        deliveryAddressPanel.add(landMarkField);
        deliveryAddressPanel.add(stateProvince);
        deliveryAddressPanel.add(stateProvinceField);
        deliveryAddressPanel.add(city);
        deliveryAddressPanel.add(cityField);
        deliveryAddressPanel.add(homeOrOffice);
        deliveryAddressPanel.add(homeLabel);
        deliveryAddressPanel.add(officeLabel);
        deliveryAddressPanel.add(formNextBtn2);

        //add payment method
        paymentMethodPanel= new JPanel();
        paymentMethodPanel.setBounds(750, 80, 900,900);
        paymentMethodPanel.setLayout(null);
        paymentMethodPanel.setBackground(formColor);
        paymentMethodPanel.setVisible(false);

        formPrevBtn2 = new JButton(backIcon);
        formPrevBtn2.setBounds(0,0,30,30);

        paymentHeading = new JLabel("Delivery Address");
        paymentHeading.setFont(headingFont);
        paymentHeading.setBounds(250,0,900,40);
        paymentHeading.setForeground(fontColor);

        String[] paymentCompanies = {"--Select Your Service Provider--","Easypaisa","JazzCash", "Credit/Debit Card","HBL Bank Account"};
        paymentApps = new JComboBox<>(paymentCompanies);
        paymentApps.setBounds(60,80,600,70);
        paymentApps.setBackground(fontColor);
        paymentApps.setForeground(Color.white);
        paymentApps.setFont(new Font("Raleway", Font.PLAIN, 20));

        userMassage= new JLabel("Unlock your phone and you will receive a MPIN Input Prompt");
        userMassage.setBounds(60,180,800,20);
        userMassage.setFont(normalFont);
        userMassage.setForeground(fontColor);
        noteMassage= new JLabel("Note: Ensure your account is Active and has sufficient balance.");
        noteMassage.setBounds(60,210,800,20);
        noteMassage.setFont(normalFont);
        noteMassage.setForeground(fontColor);

        accNumber= new JLabel("Account Number:");
        accNumber.setBounds(60,260,500,20);
        accNumber.setFont(normalFont);
        accNumber.setForeground(fontColor);
        accNumberField= new JTextField();
        accNumberField.setBounds(130,290,500,40);
        accNumberField.setBorder(lineBorder);
        accNumberField.setFont(normalFont);
        accNumberField.setBackground(fontColor);
        accNumberField.setForeground(Color.white);

        JButton formNextBtn3 = new JButton("Pay Now");
        formNextBtn3.setFont(new Font("Raleway", Font.PLAIN, 20));
        formNextBtn3.setBounds(130,380,120, 40);
        formNextBtn3.setForeground(Color.white);
        formNextBtn3.setBackground(fontColor);
        formNextBtn3.setFocusable(false);
        formNextBtn3.setFocusPainted(false);


// add into payment method
        paymentMethodPanel.add(formPrevBtn2);
        paymentMethodPanel.add(paymentHeading);
        paymentMethodPanel.add(paymentApps);
        paymentMethodPanel.add(userMassage);
        paymentMethodPanel.add(noteMassage);
        paymentMethodPanel.add(accNumber);
        paymentMethodPanel.add(accNumberField);
        paymentMethodPanel.add(formNextBtn3);

        //add greeting panel
        showGreetingPanel= new JPanel();
        showGreetingPanel.setBounds(750, 80, 900,900);
        showGreetingPanel.setLayout(null);
        showGreetingPanel.setBackground(formColor);
        showGreetingPanel.setVisible(false);

        JLabel confirmHeading = new JLabel("Order Confirm");
        confirmHeading.setFont(headingFont);
        confirmHeading.setBounds(250,0,900,40);
        confirmHeading.setForeground(fontColor);

        JLabel confirmMessage= new JLabel("Your order has been confirmed.");
        confirmMessage.setBounds(60,80,800,30);
        confirmMessage.setFont(normalFont);
        confirmMessage.setForeground(Color.white);

        JLabel getOrderMessage= new JLabel("You can get your order within 5 working days at your home.");
        getOrderMessage.setBounds(60,130,800,30);
        getOrderMessage.setFont(normalFont);
        getOrderMessage.setForeground(fontColor);


        JButton formNextBtn4 = new JButton("For more Shopping");
        formNextBtn4.setFont(new Font("Raleway", Font.PLAIN, 20));
        formNextBtn4.setBounds(130,580,320, 40);
        formNextBtn4.setForeground(Color.white);
        formNextBtn4.setBackground(fontColor);
        formNextBtn4.setFocusable(false);
        formNextBtn4.setFocusPainted(false);

        // add into greeting panel
        showGreetingPanel.add(confirmHeading);
        showGreetingPanel.add(confirmMessage);
        showGreetingPanel.add(getOrderMessage);
        showGreetingPanel.add(formNextBtn4);


        //add into main dileveryDataPanel
        dileveryDataPanel.add(backBtn);
        dileveryDataPanel.add(rgbImagePanel);
        dileveryDataPanel.add(selectProductPanel);
        dileveryDataPanel.add(deliveryAddressPanel);
        dileveryDataPanel.add(paymentMethodPanel);
        dileveryDataPanel.add(showGreetingPanel);
        dileveryDataPanel.setVisible(false);
        frame.add(dileveryDataPanel);
        frame.setVisible(true);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dileveryDataPanel.setVisible(false);
                tabbedPane.setVisible(true);
                searchBarPanel.setVisible(true);
            }
        });
        formNextBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectProductPanel.setVisible(false);
                deliveryAddressPanel.setVisible(true);
            }
        });
        formPrevBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    selectProductPanel.setVisible(true);
                    deliveryAddressPanel.setVisible(false);
            }
        });
        formNextBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fullNameField.getText().isEmpty() && deliveryAddressField.getText().isEmpty() && phoneNumberField.getText().isEmpty()
                    && stateProvinceField.getText().isEmpty() && cityField.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "All the fields are required");
                }else {
                    deliveryAddressPanel.setVisible(false);
                    paymentMethodPanel.setVisible(true);
                }
            }
        });
        formPrevBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paymentMethodPanel.setVisible(false);
                deliveryAddressPanel.setVisible(true);
            }
        });
        formNextBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value=JOptionPane.showInputDialog( "Enter MPIN: ");
                if(value.isEmpty()){
                    JLabel waringMessage = new JLabel("MPIN is required");
                    waringMessage.setForeground(Color.red);
                    waringMessage.setBounds(130,320,500,40);
                    paymentMethodPanel.add(waringMessage);
                }else {
                    paymentMethodPanel.setVisible(false);
                    showGreetingPanel.setVisible(true);
                }
            }
        });
        formNextBtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showGreetingPanel.setVisible(false);
                dileveryDataPanel.setVisible(false);
                tabbedPane.setVisible(true);
                searchBarPanel.setVisible(true);
                selectProductPanel.setVisible(true);
            }
        });
    }
}
