package entertainment;

import jdk.nashorn.internal.scripts.JO;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import  java.util.*;
import java.util.TimeZone;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class Entertainment extends JFrame implements ActionListener {
    private  static  String url = "jdbc:mysql://localhost:3306/connection_mysql_database";
    private static  String user = "root", pass = " ";


    private JPanel panelNorth, panelWest, panelCenter, panelSouth;
    private JLabel lblHeading;
    private JLabel imageIcon;
    private JLabel lbl, lbl1, lbl2, lbl3, lbl4, lbl5,lbl6;
    String[] events = {" ", "New Life Spring Jive | Clifton 1st | Secret Sunset",
            "Wild Food Land Forage Walk",
            "Blooming Spring Festival ",
            "The Chef. The Bartender",
            "Beaumont Student Wines Tasting Afternoon",
            "A night of soulful music with Lia Elise",
            "Live Music at Camissa",
            "Players Fund High Tea",
            "PHUNK-DA-PHATT",
            "Majozi and friends at The Clubhouse ",
            "Spirituals Concert"};
    private JComboBox comboBox;
    private JLabel lblText;
    private JLabel lblDate;
    private JLabel lblTime;
    private JLabel lblLocation;
    private JLabel lblCost;
    private  JLabel lblSecurity;
    private JLabel spc0, spc, spc1, spc2, spc3, spc4,spc5;
    private JLabel spcV0, spcV, spcV14, spcV1, spcV2, spcV3, spcV4,spcV5;
    private JButton btnSave, btnClear, btnQuit;
    private Font ft, ft1, ft2;

    public Entertainment() {
        super("Entertainment Application ver 1.0");
        panelNorth = new JPanel();
        lblHeading = new JLabel("Entertainment");
        imageIcon = new JLabel();


        panelCenter = new JPanel();

        panelWest = new JPanel();
        spc0 = new JLabel(" ");
        lbl = new JLabel("   Choose event:");
        comboBox = new JComboBox(events);
        lblText = new JLabel(" ");
        lblDate = new JLabel(" ");
        spcV = new JLabel(" ");
        spcV0 = new JLabel(" ");
        spcV14 = new JLabel(" ");
        spcV1 = new JLabel(" ");
        lblTime = new JLabel(" ");
        spcV2 = new JLabel(" ");
        lblLocation = new JLabel(" ");
        spcV3 = new JLabel(" ");
        lblCost = new JLabel(" ");
        spcV4 = new JLabel(" ");
        lblSecurity = new JLabel(" ");
        spcV5 = new JLabel(" ");

        spc = new JLabel(" ");
        lbl1 = new JLabel("  About: ");
        spc1 = new JLabel(" ");
        lbl2 = new JLabel("  Date: ");
        spc2 = new JLabel(" ");
        lbl3 = new JLabel("  Time: ");
        spc3 = new JLabel(" ");
        lbl4 = new JLabel("   Location: ");
        spc4 = new JLabel(" ");
        lbl5 = new JLabel("   Cost: ");
        spc5 = new JLabel(" ");
        lbl6 = new JLabel("   Security:");


        panelSouth = new JPanel();
        btnSave = new JButton("Save");
        btnClear = new JButton("Clear");
        btnQuit = new JButton("Quit");

        ft = new Font("Segoe UI Black", Font.PLAIN, 40);
        ft1 = new Font("Arial", Font.PLAIN, 12);
        ft2 = new Font("Arial", Font.ITALIC, 12);
    }

    public void setGUI() {
        //NORTH PANEL
        panelNorth.setLayout(new FlowLayout());
        imageIcon.setIcon(new ImageIcon("6.png"));
        panelNorth.setBackground(Color.decode("#072863"));
        lblHeading.setForeground(Color.white);

        //CENTER PANEL
        panelCenter.setLayout(new GridLayout(15, 1));
        panelCenter.setBackground(Color.decode("#eceff1"));
        comboBox.setFont(ft1);
        lblText.setFont(ft2);
        lblText.setForeground(Color.GRAY);

        lblDate.setFont(ft1);
        lblTime.setFont(ft2);
        lblTime.setForeground(Color.black);

        //WEST PANEL
        panelWest.setLayout(new GridLayout(15, 1));
        lbl.setFont(ft1);
        lbl1.setFont(ft1);
        lbl2.setFont(ft1);
        lbl3.setFont(ft1);
        lbl4.setFont(ft1);
        lbl5.setFont(ft1);
        lbl6.setFont(ft1);

        panelWest.setBackground(Color.decode("#eceff1"));

        //SOUTH PANEL
        panelSouth.setLayout(new GridLayout(1, 3));

        lblHeading.setFont(ft);

        btnSave.setFont(ft1);
        btnClear.setFont(ft1);
        btnQuit.setFont(ft1);

        //NORTH
        panelNorth.add(lblHeading);
        panelNorth.add(imageIcon);
        //WEST
        panelWest.add(spc0);
        panelWest.add(lbl);
        panelWest.add(spc);
        panelWest.add(lbl1);
        panelWest.add(spc1);
        panelWest.add(lbl2);
        panelWest.add(spc2);
        panelWest.add(lbl3);
        panelWest.add(spc3);
        panelWest.add(lbl4);
        panelWest.add(spc4);
        panelWest.add(lbl5);
        panelWest.add(spc5);
        panelWest.add(lbl6);


        //CENTER

        panelCenter.add(spcV0);
        panelCenter.add(comboBox);
        panelCenter.add(spcV14);
        panelCenter.add(lblText);
        panelCenter.add(spcV);
        panelCenter.add(lblDate);
        panelCenter.add(spcV1);
        panelCenter.add(lblTime);
        panelCenter.add(spcV2);
        panelCenter.add(lblLocation);
        panelCenter.add(spcV3);
        panelCenter.add(lblCost);
        panelCenter.add(spcV4);
        panelCenter.add(lblSecurity);
        panelCenter.add(spcV5);
        //SOUTH
        panelSouth.add(btnSave);
        panelSouth.add(btnClear);
        panelSouth.add(btnQuit);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelWest, BorderLayout.WEST);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        btnSave.addActionListener(this);
        btnClear.addActionListener(this);
        btnQuit.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setSize(600,600);

        comboBox.setSelectedIndex(0);
        comboBox.addActionListener(this);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == comboBox) {
                    JComboBox cb = (JComboBox) e.getSource();
                    String message = (String) cb.getSelectedItem();

                    switch (message) {
                        case " ":
                            lblText.setText(" ");
                            break;

                        case "New Life Spring Jive | Clifton 1st | Secret Sunset":
                            lblText.setText("SPRING’s coming & it's time to jump for JOY!");
                            lblDate.setText("12 September 2021 ");
                            lblTime.setText("17:15");
                            lblLocation.setText("Clifton 1st Beach");
                            lblCost.setText("R85");
                            lblSecurity.setText("Viking Protection Services");
                            break;


                        case "Wild Food Land Forage Walk":
                            lblText.setText("Educational walk and talk in and around the herb gardens ;D");
                            lblDate.setText("5 September 2021 ");
                            lblTime.setText("10:00 - 13:00");
                            lblLocation.setText("Veld and Sea 7976, Plateau Rd, Cape Peninsula");
                            lblCost.setText("R150");
                            lblSecurity.setText("Viking Protection Services");
                            break;


                        case "Blooming Spring Festival ":
                            lblText.setText("Join us on this epic spring Festival!");
                            lblDate.setText("4 September 2021 ");
                            lblTime.setText("16:00 - 21:00");
                            lblLocation.setText("42 Artillery Rd, Door De Kraal, Cape Town, 7530");
                            lblCost.setText("R150");
                            lblSecurity.setText("Pro event Security");
                            break;

                        case "The Chef. The Bartender":
                            lblText.setText("The best of both worlds brought togatha 4 U!! ");
                            lblDate.setText("10 September 2021 ");
                            lblTime.setText("12:00 - 16:00");
                            lblLocation.setText("OUI BAR + Kitchn, Radisson RED V&A Waterfront Cape Town");
                            lblCost.setText("R250");
                            lblSecurity.setText("CP Security");
                            break;


                        case "Beaumont Student Wines Tasting Afternoon":
                            lblText.setText("Be the 1st to taste our latest wine brands");
                            lblDate.setText("11 September 2021 ");
                            lblTime.setText("14:00 - 17:30");
                            lblLocation.setText("The 2 Eves 8 Kloof St, Gardens, Cape Town, 8001");
                            lblCost.setText("R250");
                            lblSecurity.setText("Red Security");
                            break;


                        case "A night of soulful music with Lia Elise":
                            lblText.setText("Lia Elise, a 19 year old singer/songwriter/recording artist ");
                            lblDate.setText("12 September 2021 ");
                            lblTime.setText("14:00 - 17:30");
                            lblLocation.setText("Chapmans Peak Dr, Noordhoek, Cape Town, 7979");
                            lblCost.setText("R75");
                            lblSecurity.setText("Viking Protection Services");
                            break;


                        case "Live Music at Camissa":
                            lblText.setText("Spring is in the air ! Come and join us at Camissa Coffee Co. on Saturday ");
                            lblDate.setText("17 September 2021 ");
                            lblTime.setText("14:00 - 17:30");
                            lblLocation.setText("55 Morningside St, Ndabeni, Cape Town, 7405");
                            lblCost.setText("R25");
                            lblSecurity.setText("Pro event Security");
                            break;


                        case "Players Fund High Tea":
                            lblText.setText("Lets celebrate the First Lady of Springbok Rugby");
                            lblDate.setText("19 September 2021 ");
                            lblTime.setText("10:00 - 12:30");
                            lblLocation.setText("14 W Quay Rd, Victoria & Alfred Waterfront, Cape Town, 8001");
                            lblCost.setText("R125");
                            lblSecurity.setText("Evsol Specialized Services");
                            break;


                        case "PHUNK-DA-PHATT":
                            lblText.setText("Get ready to party like it’s 1999!! ");
                            lblDate.setText("18 September 2021 ");
                            lblTime.setText("17:00 - 21:30");
                            lblLocation.setText("Darling St & Buitenkant St, Foreshore, Cape Town, 8001");
                            lblCost.setText("R75");
                            lblSecurity.setText("CP Security");
                            break;


                        case "Majozi and friends at The Clubhouse ":
                            lblText.setText("Lets enjoy this sunday with fun outside activities ");
                            lblDate.setText("26 September 2021 ");
                            lblTime.setText("12:00 - 16:30");
                            lblLocation.setText("5 Diamond St,Constantia, Cape Town 7850");
                            lblCost.setText("R75");
                            lblSecurity.setText("Red Security");
                            break;


                        case "Spirituals Concert":
                            lblText.setText("Come and find your inner peace with God.");
                            lblDate.setText("3 October 2021 ");
                            lblTime.setText("12:00 - 15:30");
                            lblLocation.setText("43 Adderley St, Cape Town City Centre, Cape Town, 8000");
                            lblCost.setText("FREE");
                            lblSecurity.setText("Evsol Specialized Services");
                            break;


                    }
                }
            }
        });
    }

//    public boolean unique(String chooseEvent) {
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//
//            connection = DriverManager.getConnection(url, user, pass);
//
//
//            statement = connection.createStatement();
//
//            resultSet = statement.executeQuery("select * from entertainment_name");
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt(1);
//                String choose_event = resultSet.getString(2);
//                String about = resultSet.getString(3);
//                String date = resultSet.getString(4);
//                String time = resultSet.getString(5);
//                String location = resultSet.getString(6);
//                String cost = resultSet.getString(7);
//
//                System.out.println(id + " " + choose_event + " " + about + " " + date + " " + time + " " + location + " " + cost);
//            }
//
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return unique(chooseEvent);
//    }

    public void actionPerformed(ActionEvent ed)
    {
     if(ed.getSource() == btnSave)
     {
//         String event = comboBox.getActionCommand();
//         String about = lblText.getText();
//         String date = lblDate.getText();
//         String time = lblTime.getText();
//         String location = lblLocation.getText();
//         String cost = lblCost.getText();

         JOptionPane.showMessageDialog(this,"You have booked your event Successfully!!");

         Connection connection = null;
         Statement statement = null;
         ResultSet resultSet = null;
         try {
             Class.forName("com.mysql.cj.jdbc.Driver");


             connection = DriverManager.getConnection(url, user, pass);


             statement = connection.createStatement();

             resultSet = statement.executeQuery("select * from entertainment_name");

             while (resultSet.next()) {
                 int id = resultSet.getInt(1);
                 String choose_event = resultSet.getString(2);
                 String about = resultSet.getString(3);
                 String date = resultSet.getString(4);
                 String time = resultSet.getString(5);
                 String location = resultSet.getString(6);
                 String cost = resultSet.getString(7);

                 System.out.println(id + " " + choose_event + " " + about + " " + date + " " + time + " " + location + " " + cost);
             }

         } catch (SQLException sqlException) {
             sqlException.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }

     }
     else if(ed.getSource() == btnClear){
         comboBox.setSelectedIndex(0);
         lblText.setText(" ");
         lblDate.setText(" ");
         lblTime.setText(" ");
         lblLocation.setText(" ");
         lblCost.setText(" ");
     }
     else if(ed.getSource() == btnQuit)
     {
         System.exit(0);
     }
    }

    public static void main(String[] args) {
        new Entertainment().setGUI();
    }


}

