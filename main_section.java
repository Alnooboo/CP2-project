/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cp2vize;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author habee
 */
public class main_section extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public main_section() {
        initComponents();

        // Set the table models for each table
        SandwichTable1.setModel(sandwichtable);
        JuicesTable1.setModel(juicestable);
        SnacksTable1.setModel(snackstable);

        // Set the column headers for each table model
        sandwichtable.setColumnIdentifiers(new String[]{"Name", "Description", "Quantity", "Price"});
        juicestable.setColumnIdentifiers(new String[]{"Name", "Description", "Quantity", "Price"});
        snackstable.setColumnIdentifiers(new String[]{"Name", "Description", "Quantity", "Price"});

        // Add products to each product type
        sandwiches.addProduct("cheese", 10, 15, "two bread, two piece of cheese, and tomato slice");
        sandwiches.addProduct("chocolate", 12, 15, "two bread, chocolate");
        juices.addProduct("Orange juice", 3, 20, "Freshly squeezed orange juice");
        juices.addProduct("Apple juice", 3.5, 15, "Freshly squeezed apple juice");
        snacks.addProduct("Chips", 2, 30, "A classic salty snack");
        snacks.addProduct("dark chocolate", 1.5, 35, "dark chocolate bar");

        // Create data lists for each product type
        String sandwichDataList[][] = {
            {sandwiches.getProducts().get(0).getName(),
                sandwiches.getProducts().get(0).getDescription(),
                sandwiches.getProducts().get(0).getQuantity() + "",
                sandwiches.getProducts().get(0).getPrice() + ""
            },
            {sandwiches.getProducts().get(1).getName(),
                sandwiches.getProducts().get(1).getDescription(),
                sandwiches.getProducts().get(1).getQuantity() + "",
                sandwiches.getProducts().get(1).getPrice() + ""
            }
        };

        String juiceDataList[][] = {
            {juices.getProducts().get(0).getName(),
                juices.getProducts().get(0).getDescription(),
                juices.getProducts().get(0).getQuantity() + "",
                juices.getProducts().get(0).getPrice() + ""
            },
            {juices.getProducts().get(1).getName(),
                juices.getProducts().get(1).getDescription(),
                juices.getProducts().get(1).getQuantity() + "",
                juices.getProducts().get(1).getPrice() + ""
            }
        };

        String snackDataList[][] = {
            {
                snacks.getProducts().get(0).getName(),
                snacks.getProducts().get(0).getDescription(),
                snacks.getProducts().get(0).getQuantity() + "",
                snacks.getProducts().get(0).getPrice() + ""
            },
            {
                snacks.getProducts().get(1).getName(),
                snacks.getProducts().get(1).getDescription(),
                snacks.getProducts().get(1).getQuantity() + "",
                snacks.getProducts().get(1).getPrice() + ""
            }
        };

        // Add the data to each table model
        for (int i = 0; i < sandwichDataList.length; i++) {
            sandwichtable.addRow(sandwichDataList[i]);
        }
        for (int i = 0; i < juiceDataList.length; i++) {
            juicestable.addRow(juiceDataList[i]);
        }
        for (int i = 0; i < snackDataList.length; i++) {
            snackstable.addRow(snackDataList[i]);
        }

    }
    //table models:
    DefaultTableModel sandwichtable = new DefaultTableModel();
    DefaultTableModel juicestable = new DefaultTableModel();
    DefaultTableModel snackstable = new DefaultTableModel();
    DefaultTableModel cartProducts = new DefaultTableModel();

    //definig the products types
    ProductType sandwiches = new ProductType();
    ProductType juices = new ProductType();
    ProductType snacks = new ProductType();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        HomePage = new javax.swing.JPanel();
        WelcomeMessage1 = new javax.swing.JLabel();
        DefinitionMessage1 = new javax.swing.JLabel();
        ProductTable = new javax.swing.JTabbedPane();
        Sandwich1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SandwichTable1 = new javax.swing.JTable();
        NextPage1 = new javax.swing.JButton();
        Juices1 = new javax.swing.JPanel();
        PreviousPage2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JuicesTable1 = new javax.swing.JTable();
        NextPage2 = new javax.swing.JButton();
        Snacks1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SnacksTable1 = new javax.swing.JTable();
        PreviousPage3 = new javax.swing.JButton();
        AddToCart = new javax.swing.JButton();
        GoToCart2 = new javax.swing.JButton();
        AdminLogIn1 = new javax.swing.JButton();
        GoToCart1 = new javax.swing.JButton();
        ShoppingCartPage = new javax.swing.JPanel();
        AdminLogIn2 = new javax.swing.JButton();
        GoToShop1 = new javax.swing.JButton();
        WelcomeMessage2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CartTabel = new javax.swing.JTable();
        DecreaseAmount = new javax.swing.JButton();
        IncreaseAmount = new javax.swing.JButton();
        RemoveFromCart = new javax.swing.JButton();
        OrderSummaryMessage1 = new javax.swing.JLabel();
        ProductTotal1 = new javax.swing.JLabel();
        ProductTotal1Price1 = new javax.swing.JLabel();
        VAT1 = new javax.swing.JLabel();
        VAT1Price1 = new javax.swing.JLabel();
        Total1 = new javax.swing.JLabel();
        Total1Price1 = new javax.swing.JLabel();
        GoToCheckOut = new javax.swing.JButton();
        CheckoutPage = new javax.swing.JPanel();
        AdminLogIn3 = new javax.swing.JButton();
        GoToCart3 = new javax.swing.JButton();
        GoToShop2 = new javax.swing.JButton();
        WelcomeMessage3 = new javax.swing.JLabel();
        CardNumberL = new javax.swing.JLabel();
        CardNameL = new javax.swing.JLabel();
        CardDateL = new javax.swing.JLabel();
        CardCVCL = new javax.swing.JLabel();
        CardNumber = new javax.swing.JTextField();
        CardName = new javax.swing.JTextField();
        CardDateMonth = new javax.swing.JComboBox<>();
        CardDateYear = new javax.swing.JComboBox<>();
        CardCVC = new javax.swing.JTextField();
        CheckOut = new javax.swing.JButton();
        ProductTotal2Price2 = new javax.swing.JLabel();
        VAT2 = new javax.swing.JLabel();
        VAT2Price2 = new javax.swing.JLabel();
        Total2 = new javax.swing.JLabel();
        Total2Price2 = new javax.swing.JLabel();
        OrderSummaryMessage2 = new javax.swing.JLabel();
        ProductTotal2 = new javax.swing.JLabel();
        NumberCheck = new javax.swing.JLabel();
        NameCheck = new javax.swing.JLabel();
        CVCCheck = new javax.swing.JLabel();
        AdminLogInPage = new javax.swing.JPanel();
        GoToShop3 = new javax.swing.JButton();
        WelcomeMessage4 = new javax.swing.JLabel();
        UserNameL = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        PasswordL = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        MenuControlPage = new javax.swing.JPanel();
        GoToOrders = new javax.swing.JButton();
        GoToShop4 = new javax.swing.JButton();
        WelcomeMessage5 = new javax.swing.JLabel();
        ProductTable1 = new javax.swing.JTabbedPane();
        Sandwich2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        PreviousPage4 = new javax.swing.JButton();
        NextPage4 = new javax.swing.JButton();
        Juices2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        PreviousPage5 = new javax.swing.JButton();
        NextPage5 = new javax.swing.JButton();
        Snacks2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        PreviousPage6 = new javax.swing.JButton();
        NextPage6 = new javax.swing.JButton();
        ChangeName = new javax.swing.JButton();
        ChangeNameL = new javax.swing.JTextField();
        ChangePrice = new javax.swing.JButton();
        ChangePriceL = new javax.swing.JTextField();
        ChangeAmount = new javax.swing.JButton();
        ChangeAmountSlider = new javax.swing.JSlider();
        ChangeDescription = new javax.swing.JButton();
        ChangeDescriptionText = new javax.swing.JTextField();
        ChangeAmountNum = new javax.swing.JLabel();
        NewDescription = new javax.swing.JButton();
        NewName = new javax.swing.JButton();
        NewNameL = new javax.swing.JTextField();
        NewDescriptionText = new javax.swing.JTextField();
        NewPrice = new javax.swing.JButton();
        NewPriceL = new javax.swing.JTextField();
        NewAmount = new javax.swing.JButton();
        NewAmountSlider = new javax.swing.JSlider();
        NewAmountNum = new javax.swing.JLabel();
        OrdersPage = new javax.swing.JPanel();
        GoToControl = new javax.swing.JButton();
        GoToShop5 = new javax.swing.JButton();
        WelcomeMessage6 = new javax.swing.JLabel();
        OrdersList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ShowOrder = new javax.swing.JButton();
        OrderTable = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        HomePage.setPreferredSize(new java.awt.Dimension(1000, 500));

        WelcomeMessage1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        WelcomeMessage1.setText("Welcome To FSM Canteen");

        DefinitionMessage1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        DefinitionMessage1.setText("please choose your order");

        SandwichTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(SandwichTable1);

        NextPage1.setText("=>");
        NextPage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Sandwich1Layout = new javax.swing.GroupLayout(Sandwich1);
        Sandwich1.setLayout(Sandwich1Layout);
        Sandwich1Layout.setHorizontalGroup(
            Sandwich1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(Sandwich1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NextPage1))
        );
        Sandwich1Layout.setVerticalGroup(
            Sandwich1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sandwich1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextPage1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ProductTable.addTab("Sandwich ", Sandwich1);

        PreviousPage2.setText("<=");
        PreviousPage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousPage2ActionPerformed(evt);
            }
        });

        JuicesTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JuicesTable1);

        NextPage2.setText("=>");
        NextPage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPage2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Juices1Layout = new javax.swing.GroupLayout(Juices1);
        Juices1.setLayout(Juices1Layout);
        Juices1Layout.setHorizontalGroup(
            Juices1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(Juices1Layout.createSequentialGroup()
                .addComponent(PreviousPage2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextPage2))
        );
        Juices1Layout.setVerticalGroup(
            Juices1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Juices1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Juices1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextPage2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProductTable.addTab("Juices", Juices1);

        SnacksTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(SnacksTable1);

        PreviousPage3.setText("<=");
        PreviousPage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousPage3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Snacks1Layout = new javax.swing.GroupLayout(Snacks1);
        Snacks1.setLayout(Snacks1Layout);
        Snacks1Layout.setHorizontalGroup(
            Snacks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(Snacks1Layout.createSequentialGroup()
                .addComponent(PreviousPage3)
                .addGap(0, 823, Short.MAX_VALUE))
        );
        Snacks1Layout.setVerticalGroup(
            Snacks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Snacks1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PreviousPage3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ProductTable.addTab("Snacks", Snacks1);

        AddToCart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AddToCart.setText("Add To Cart");
        AddToCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToCartMouseClicked(evt);
            }
        });
        AddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartActionPerformed(evt);
            }
        });

        GoToCart2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToCart2.setText("Go to Cart");
        GoToCart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCart2ActionPerformed(evt);
            }
        });

        AdminLogIn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminLogIn1.setText("Admin Log In");
        AdminLogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLogIn1ActionPerformed(evt);
            }
        });

        GoToCart1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToCart1.setText("Cart");
        GoToCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoToCart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HomePageLayout = new javax.swing.GroupLayout(HomePage);
        HomePage.setLayout(HomePageLayout);
        HomePageLayout.setHorizontalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomePageLayout.createSequentialGroup()
                        .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DefinitionMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(WelcomeMessage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(HomePageLayout.createSequentialGroup()
                                        .addGap(781, 781, 781)
                                        .addComponent(GoToCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(HomePageLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddToCart)
                                    .addComponent(ProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GoToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminLogIn1)))
                .addContainerGap())
        );
        HomePageLayout.setVerticalGroup(
            HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePageLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminLogIn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DefinitionMessage1)
                .addGap(36, 36, 36)
                .addComponent(ProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HomePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("tab1", HomePage);

        ShoppingCartPage.setPreferredSize(new java.awt.Dimension(1000, 500));

        AdminLogIn2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminLogIn2.setText("Admin Log In");

        GoToShop1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop1.setText("Back to shop");

        WelcomeMessage2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage2.setText("Shopping Cart:");

        CartTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(CartTabel);

        DecreaseAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        DecreaseAmount.setText("Decrease");
        DecreaseAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecreaseAmountActionPerformed(evt);
            }
        });

        IncreaseAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        IncreaseAmount.setText("Increase");
        IncreaseAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncreaseAmountActionPerformed(evt);
            }
        });

        RemoveFromCart.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RemoveFromCart.setText("Remove");

        OrderSummaryMessage1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OrderSummaryMessage1.setText("Order Summary");

        ProductTotal1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProductTotal1.setText("Products Total");

        ProductTotal1Price1.setText("00");

        VAT1.setText("VAT");

        VAT1Price1.setText("00");

        Total1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Total1.setText("Total");

        Total1Price1.setText("00");

        GoToCheckOut.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToCheckOut.setText("Check Out Page");

        javax.swing.GroupLayout ShoppingCartPageLayout = new javax.swing.GroupLayout(ShoppingCartPage);
        ShoppingCartPage.setLayout(ShoppingCartPageLayout);
        ShoppingCartPageLayout.setHorizontalGroup(
            ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(DecreaseAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncreaseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RemoveFromCart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShoppingCartPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GoToShop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AdminLogIn2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShoppingCartPageLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                            .addComponent(ProductTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(ProductTotal1Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                            .addComponent(VAT1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VAT1Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                            .addComponent(Total1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Total1Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(GoToCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addComponent(OrderSummaryMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGap(158, 158, 158))
        );
        ShoppingCartPageLayout.setVerticalGroup(
            ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminLogIn2)
                    .addComponent(GoToShop1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ShoppingCartPageLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(OrderSummaryMessage1)
                        .addGap(18, 18, 18)
                        .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductTotal1)
                            .addComponent(ProductTotal1Price1))
                        .addGap(18, 18, 18)
                        .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VAT1)
                            .addComponent(VAT1Price1))
                        .addGap(18, 18, 18)
                        .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total1)
                            .addComponent(Total1Price1))
                        .addGap(59, 59, 59)
                        .addComponent(GoToCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ShoppingCartPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DecreaseAmount)
                    .addComponent(IncreaseAmount)
                    .addComponent(RemoveFromCart))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", ShoppingCartPage);

        CheckoutPage.setPreferredSize(new java.awt.Dimension(1000, 500));

        AdminLogIn3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AdminLogIn3.setText("Admin Log In");

        GoToCart3.setText("Back To Cart");

        GoToShop2.setText("Back To Shop");

        WelcomeMessage3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage3.setText("Please Fill In The Card Below:");

        CardNumberL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardNumberL.setText("Card number ");

        CardNameL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardNameL.setText("Name on card ");

        CardDateL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardDateL.setText("Expiration date ");

        CardCVCL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardCVCL.setText("CVC");

        CardNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardNumber.setText("**** **** **** ****");

        CardName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        CardDateMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CardDateYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CardCVC.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CardCVC.setText("***");

        CheckOut.setText("Check Out");

        ProductTotal2Price2.setText("00");

        VAT2.setText("VAT");

        VAT2Price2.setText("00");

        Total2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Total2.setText("Total");

        Total2Price2.setText("00");

        OrderSummaryMessage2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OrderSummaryMessage2.setText("Order Summary");

        ProductTotal2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ProductTotal2.setText("Product Total");

        NumberCheck.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NumberCheck.setText(" ");

        NameCheck.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NameCheck.setText(" ");

        CVCCheck.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CVCCheck.setText(" ");

        javax.swing.GroupLayout CheckoutPageLayout = new javax.swing.GroupLayout(CheckoutPage);
        CheckoutPage.setLayout(CheckoutPageLayout);
        CheckoutPageLayout.setHorizontalGroup(
            CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckoutPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addComponent(WelcomeMessage3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckoutPageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(GoToShop2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GoToCart3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AdminLogIn3)
                        .addGap(11, 11, 11))
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CardNumberL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CheckoutPageLayout.createSequentialGroup()
                                .addGap(506, 596, Short.MAX_VALUE)
                                .addComponent(OrderSummaryMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(CheckoutPageLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                                        .addComponent(ProductTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(ProductTotal2Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                                        .addComponent(VAT2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(VAT2Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                                        .addComponent(Total2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Total2Price2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(154, 154, 154))))
            .addGroup(CheckoutPageLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addComponent(CardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NumberCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addComponent(CardDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CardDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CardCVCL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CardCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CVCCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addComponent(CardName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NameCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CheckoutPageLayout.setVerticalGroup(
            CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckoutPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminLogIn3)
                    .addComponent(GoToCart3)
                    .addComponent(GoToShop2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WelcomeMessage3)
                .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardNumberL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberCheck))
                        .addGap(27, 27, 27)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameCheck))
                        .addGap(37, 37, 37)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CardDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CardCVCL)
                            .addComponent(CardCVC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CVCCheck)))
                    .addGroup(CheckoutPageLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(OrderSummaryMessage2)
                        .addGap(18, 18, 18)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProductTotal2)
                            .addComponent(ProductTotal2Price2))
                        .addGap(18, 18, 18)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VAT2)
                            .addComponent(VAT2Price2))
                        .addGap(18, 18, 18)
                        .addGroup(CheckoutPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Total2)
                            .addComponent(Total2Price2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        jTabbedPane1.addTab("tab3", CheckoutPage);

        AdminLogInPage.setPreferredSize(new java.awt.Dimension(1000, 500));

        GoToShop3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop3.setText("Back To Shop");

        WelcomeMessage4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage4.setText("Hello Admin!!");

        UserNameL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        UserNameL.setText("User Name:");

        PasswordL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PasswordL.setText("Password:");

        LogIn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LogIn.setText("Enter");

        javax.swing.GroupLayout AdminLogInPageLayout = new javax.swing.GroupLayout(AdminLogInPage);
        AdminLogInPage.setLayout(AdminLogInPageLayout);
        AdminLogInPageLayout.setHorizontalGroup(
            AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInPageLayout.createSequentialGroup()
                .addContainerGap(403, Short.MAX_VALUE)
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                        .addComponent(GoToShop3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                        .addComponent(WelcomeMessage4)
                        .addGap(433, 433, 433))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                        .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserNameL))
                        .addGap(49, 49, 49)
                        .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UserName)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminLogInPageLayout.createSequentialGroup()
                        .addComponent(LogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450))))
        );
        AdminLogInPageLayout.setVerticalGroup(
            AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLogInPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GoToShop3)
                .addGap(47, 47, 47)
                .addComponent(WelcomeMessage4)
                .addGap(42, 42, 42)
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameL)
                    .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AdminLogInPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordL)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(LogIn)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", AdminLogInPage);

        MenuControlPage.setPreferredSize(new java.awt.Dimension(1000, 500));

        GoToOrders.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToOrders.setText("Go To Order Page");

        GoToShop4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop4.setText("Back To Shop");

        WelcomeMessage5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage5.setText("Please Select Product To Edit:");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        PreviousPage4.setText("<=");

        NextPage4.setText("=>");

        javax.swing.GroupLayout Sandwich2Layout = new javax.swing.GroupLayout(Sandwich2);
        Sandwich2.setLayout(Sandwich2Layout);
        Sandwich2Layout.setHorizontalGroup(
            Sandwich2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(Sandwich2Layout.createSequentialGroup()
                .addComponent(PreviousPage4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextPage4))
        );
        Sandwich2Layout.setVerticalGroup(
            Sandwich2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Sandwich2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Sandwich2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousPage4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextPage4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProductTable1.addTab("Sandwich", Sandwich2);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        PreviousPage5.setText("<=");

        NextPage5.setText("=>");

        javax.swing.GroupLayout Juices2Layout = new javax.swing.GroupLayout(Juices2);
        Juices2.setLayout(Juices2Layout);
        Juices2Layout.setHorizontalGroup(
            Juices2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(Juices2Layout.createSequentialGroup()
                .addComponent(PreviousPage5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextPage5))
        );
        Juices2Layout.setVerticalGroup(
            Juices2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Juices2Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Juices2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PreviousPage5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextPage5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ProductTable1.addTab("Juices", Juices2);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable7);

        PreviousPage6.setText("<=");

        NextPage6.setText("=>");

        javax.swing.GroupLayout Snacks2Layout = new javax.swing.GroupLayout(Snacks2);
        Snacks2.setLayout(Snacks2Layout);
        Snacks2Layout.setHorizontalGroup(
            Snacks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
            .addGroup(Snacks2Layout.createSequentialGroup()
                .addComponent(PreviousPage6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextPage6))
        );
        Snacks2Layout.setVerticalGroup(
            Snacks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Snacks2Layout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Snacks2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextPage6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousPage6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ProductTable1.addTab("Snacks", Snacks2);

        ChangeName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeName.setText("Change Name");

        ChangeNameL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeNameL.setText("Type New Name");

        ChangePrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangePrice.setText("Increase Price");

        ChangePriceL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangePriceL.setText("New Price");

        ChangeAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeAmount.setText("Increase Amount");

        ChangeDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeDescription.setText("Change Description");

        ChangeDescriptionText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeDescriptionText.setText("New Description");

        ChangeAmountNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ChangeAmountNum.setText("jLabel31");

        NewDescription.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewDescription.setText("Add Description");

        NewName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewName.setText("Add Name");

        NewNameL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewNameL.setText("Type Name");

        NewDescriptionText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewDescriptionText.setText("Description");

        NewPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewPrice.setText("Add Price");

        NewPriceL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewPriceL.setText("Price");

        NewAmount.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewAmount.setText("Add Amount");

        NewAmountNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        NewAmountNum.setText("jLabel31");

        javax.swing.GroupLayout MenuControlPageLayout = new javax.swing.GroupLayout(MenuControlPage);
        MenuControlPage.setLayout(MenuControlPageLayout);
        MenuControlPageLayout.setHorizontalGroup(
            MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuControlPageLayout.createSequentialGroup()
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addComponent(WelcomeMessage5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(GoToShop4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GoToOrders))))
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(ProductTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 875, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuControlPageLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChangeDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChangeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChangeName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChangeNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChangePriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChangeDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                                        .addComponent(ChangeAmountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ChangeAmountNum)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NewNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewPriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NewDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                                        .addComponent(NewAmountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NewAmountNum)))))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );
        MenuControlPageLayout.setVerticalGroup(
            MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuControlPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GoToOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GoToShop4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(WelcomeMessage5)
                .addGap(26, 26, 26)
                .addComponent(ProductTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addComponent(ChangeName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChangeDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addComponent(ChangeNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChangePriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ChangeAmountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addComponent(ChangeAmountNum)
                                .addGap(2, 2, 2)))
                        .addComponent(ChangeDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addComponent(NewName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuControlPageLayout.createSequentialGroup()
                        .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuControlPageLayout.createSequentialGroup()
                                .addComponent(NewNameL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewPriceL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(MenuControlPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NewAmountNum)
                                .addComponent(NewAmountSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(NewDescriptionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", MenuControlPage);

        OrdersPage.setPreferredSize(new java.awt.Dimension(1000, 500));

        GoToControl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToControl.setText("Back To Control List");

        GoToShop5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        GoToShop5.setText("Back To Shop");

        WelcomeMessage6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        WelcomeMessage6.setText("Check The Orders:");

        jList1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        OrdersList.setViewportView(jList1);

        ShowOrder.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ShowOrder.setText("Show Order");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        OrderTable.setViewportView(jTable1);

        javax.swing.GroupLayout OrdersPageLayout = new javax.swing.GroupLayout(OrdersPage);
        OrdersPage.setLayout(OrdersPageLayout);
        OrdersPageLayout.setHorizontalGroup(
            OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeMessage6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrdersPageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GoToShop5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GoToControl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OrdersPageLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(OrdersList, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(ShowOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(OrderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)))
                .addContainerGap())
        );
        OrdersPageLayout.setVerticalGroup(
            OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrdersPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OrderTable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OrdersPageLayout.createSequentialGroup()
                        .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GoToControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GoToShop5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(OrdersPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrdersPageLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(OrdersList, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OrdersPageLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WelcomeMessage6)
                                .addGap(157, 157, 157)
                                .addComponent(ShowOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab6", OrdersPage);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //go to cart page
    private void GoToCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCart1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);//geo to cart page

        //defining table info
        cartProducts.setColumnIdentifiers(new String[]{"Name", "Quantity", "Price"});//cart table's headers
        CartTabel.setModel(cartProducts);//for cart table

        // Add the data to each table model
        for (int i = 0; i < selectedProducts.size(); i++) {
            cartProducts.addRow(new String[]{
                selectedProducts.get(i).getName(),
                selectedProducts.get(i).getCartquantity() + "",
                selectedProducts.get(i).getPrice() + ""});
        }


    }//GEN-LAST:event_GoToCart1ActionPerformed

    //go to admin log in page
    private void AdminLogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLogIn1ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_AdminLogIn1ActionPerformed

    //go to next prroduct page
    private void NextPage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPage1ActionPerformed
        ProductTable.setSelectedIndex(1);
    }//GEN-LAST:event_NextPage1ActionPerformed
    //go back to prevuis product page
    private void PreviousPage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousPage2ActionPerformed
        ProductTable.setSelectedIndex(0);
    }//GEN-LAST:event_PreviousPage2ActionPerformed
    //go to next prroduct page
    private void NextPage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPage2ActionPerformed
        ProductTable.setSelectedIndex(2);
    }//GEN-LAST:event_NextPage2ActionPerformed
    private void AddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartActionPerformed

    }//GEN-LAST:event_AddToCartActionPerformed

    //Define an ArrayList to store selected products
    ArrayList<Product> selectedProducts = new ArrayList<>();

    //add product to cart!
    private void AddToCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToCartMouseClicked

        // Get the selected row index in the Sandwich, Juice, Snack table
        int selectedRowInSandwich = SandwichTable1.getSelectedRow();
        int selectedRowInJuice = JuicesTable1.getSelectedRow();
        int selectedRowInSnack = SnacksTable1.getSelectedRow();

        // If a sandwich is selected and its quantity is greater than zero
        if (selectedRowInSandwich != -1 && sandwiches.getProducts().get(selectedRowInSandwich).getQuantity() > 0) {
            // If a sandwich is selected and it's in stock
            Product selectedProduct = sandwiches.getProducts().get(selectedRowInSandwich);
            if (selectedProducts.contains(selectedProduct)) {
                // If the selected sandwich already exists in the cart
                JOptionPane.showMessageDialog(null, "The product already exists in the cart.");
            } else {
                // Otherwise, add the selected sandwich to the cart and update its quantity in the sandwich table
                
                JOptionPane.showMessageDialog(null, "Product added to cart: " + selectedProduct.getName());
                sandwichtable.setValueAt(selectedProduct.getQuantity() - 1 + "", selectedRowInSandwich, 2);
                selectedProduct.setQuantity(selectedProduct.getQuantity() - 1);
                selectedProduct.setCartQuantity(1);
                selectedProducts.add(selectedProduct);


            }
            // Clear the selection of the previous table
            SandwichTable1.clearSelection();

            // If a juice is selected and its quantity is greater than zero
        } else if (selectedRowInJuice != -1 && juices.getProducts().get(selectedRowInJuice).getQuantity() > 0) {
            // If a juice is selected and it's in stock
            Product selectedProduct = juices.getProducts().get(selectedRowInJuice);
            if (selectedProducts.contains(selectedProduct)) {
                // If the selected juice already exists in the cart
                JOptionPane.showMessageDialog(null, "The product already exists in the cart.");
            } else {
                // Otherwise, add the selected juice to the cart and update its quantity in the juice table
                JOptionPane.showMessageDialog(null, "Product added to cart: " + selectedProduct.getName());
                JuicesTable1.setValueAt(selectedProduct.getQuantity() - 1 + "", selectedRowInJuice, 2);
                selectedProduct.setQuantity(selectedProduct.getQuantity() - 1);
                selectedProduct.setCartQuantity(1);
                                selectedProducts.add(selectedProduct);

            }
            // Clear the selection of the previous table
            JuicesTable1.clearSelection();

            // If a snack is selected and its quantity is greater than zero
        } else if (selectedRowInSnack != -1 && snacks.getProducts().get(selectedRowInSnack).getQuantity() > 0) {
            // If a snack is selected and it's in stock
            Product selectedProduct = snacks.getProducts().get(selectedRowInSnack);
            if (selectedProducts.contains(selectedProduct)) {
                // If the selected snack already exists in the cart
                JOptionPane.showMessageDialog(null, "The product already exists in the cart.");
            } else {
                // Otherwise, add the selected snack to the cart and update its quantity in the snack table
                JOptionPane.showMessageDialog(null, "Product added to cart: " + selectedProduct.getName());
                SnacksTable1.setValueAt(selectedProduct.getQuantity() - 1 + "", selectedRowInSnack, 2);
                selectedProduct.setQuantity(selectedProduct.getQuantity() - 1);
                selectedProduct.setCartQuantity(1);
            }
            // Clear the selection of the previous table
            SnacksTable1.clearSelection();
        }


    }//GEN-LAST:event_AddToCartMouseClicked

    //go to cart page
    private void GoToCart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoToCart2ActionPerformed

        jTabbedPane1.setSelectedIndex(1);//go to cart page

        //defining table info
        cartProducts.setColumnIdentifiers(new String[]{"Name", "Quantity", "Price"});//cart table's headers
        CartTabel.setModel(cartProducts);//for cart table

        // Add the data to each table model
        for (int i = 0; i < selectedProducts.size(); i++) {
            cartProducts.addRow(new String[]{
                selectedProducts.get(i).getName(),
                selectedProducts.get(i).getCartquantity() + "",
                selectedProducts.get(i).getPrice() + ""});
        }

    }//GEN-LAST:event_GoToCart2ActionPerformed

    //go back to prevuis product page
    private void PreviousPage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousPage3ActionPerformed
        ProductTable.setSelectedIndex(1);
    }//GEN-LAST:event_PreviousPage3ActionPerformed

    private void DecreaseAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecreaseAmountActionPerformed

        int selectedRowInCart = CartTabel.getSelectedRow();

        if (selectedRowInCart != -1 && sandwiches.getProducts().get(selectedRowInCart).getCartquantity() > 1) {
            sandwiches.getProducts().get(selectedRowInCart).setCartquantity(
                    sandwiches.getProducts().get(selectedRowInCart).getCartQuantity() - 1);
            sandwiches.getProducts().get(selectedRowInCart).setQuantity(
                    sandwiches.getProducts().get(selectedRowInCart).getQuantity()+1);
            CartTabel.setValueAt(sandwiches.getProducts().get(selectedRowInCart).getCartQuantity(), selectedRowInCart, 1);
            JOptionPane.showMessageDialog(null, "The product quantity has been decreased.");
        } else {
            
            int i = JOptionPane.showConfirmDialog(rootPane, "do you want to delete the product?");
            if (i == JOptionPane.YES_OPTION) {
                cartProducts.removeRow(selectedRowInCart);
                
            }
        }
    }//GEN-LAST:event_DecreaseAmountActionPerformed

    private void IncreaseAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncreaseAmountActionPerformed
        int selectedRowInCart = CartTabel.getSelectedRow();

        if (selectedRowInCart != -1 && sandwiches.getProducts().get(selectedRowInCart).getCartquantity() <
                sandwiches.getProducts().get(selectedRowInCart).getQuantity())
        {
            sandwiches.getProducts().get(selectedRowInCart).setCartquantity(
                    sandwiches.getProducts().get(selectedRowInCart).getCartQuantity() + 1);
            sandwiches.getProducts().get(selectedRowInCart).setQuantity(
                    sandwiches.getProducts().get(selectedRowInCart).getQuantity()-1);
            CartTabel.setValueAt(sandwiches.getProducts().get(selectedRowInCart).getCartQuantity(), selectedRowInCart, 1);
            JOptionPane.showMessageDialog(null, "The product quantity has been increased.");
        } else {
            JOptionPane.showMessageDialog(null, "sorry we cant add another one because htere is not enough quantity in the stock","cant do that!",JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_IncreaseAmountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_section.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_section().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCart;
    private javax.swing.JButton AdminLogIn1;
    private javax.swing.JButton AdminLogIn2;
    private javax.swing.JButton AdminLogIn3;
    private javax.swing.JPanel AdminLogInPage;
    private javax.swing.JLabel CVCCheck;
    private javax.swing.JTextField CardCVC;
    private javax.swing.JLabel CardCVCL;
    private javax.swing.JLabel CardDateL;
    private javax.swing.JComboBox<String> CardDateMonth;
    private javax.swing.JComboBox<String> CardDateYear;
    private javax.swing.JTextField CardName;
    private javax.swing.JLabel CardNameL;
    private javax.swing.JTextField CardNumber;
    private javax.swing.JLabel CardNumberL;
    private javax.swing.JTable CartTabel;
    private javax.swing.JButton ChangeAmount;
    private javax.swing.JLabel ChangeAmountNum;
    private javax.swing.JSlider ChangeAmountSlider;
    private javax.swing.JButton ChangeDescription;
    private javax.swing.JTextField ChangeDescriptionText;
    private javax.swing.JButton ChangeName;
    private javax.swing.JTextField ChangeNameL;
    private javax.swing.JButton ChangePrice;
    private javax.swing.JTextField ChangePriceL;
    private javax.swing.JButton CheckOut;
    private javax.swing.JPanel CheckoutPage;
    private javax.swing.JButton DecreaseAmount;
    private javax.swing.JLabel DefinitionMessage1;
    private javax.swing.JButton GoToCart1;
    private javax.swing.JButton GoToCart2;
    private javax.swing.JButton GoToCart3;
    private javax.swing.JButton GoToCheckOut;
    private javax.swing.JButton GoToControl;
    private javax.swing.JButton GoToOrders;
    private javax.swing.JButton GoToShop1;
    private javax.swing.JButton GoToShop2;
    private javax.swing.JButton GoToShop3;
    private javax.swing.JButton GoToShop4;
    private javax.swing.JButton GoToShop5;
    private javax.swing.JPanel HomePage;
    private javax.swing.JButton IncreaseAmount;
    private javax.swing.JPanel Juices1;
    private javax.swing.JPanel Juices2;
    private javax.swing.JTable JuicesTable1;
    private javax.swing.JButton LogIn;
    private javax.swing.JPanel MenuControlPage;
    private javax.swing.JLabel NameCheck;
    private javax.swing.JButton NewAmount;
    private javax.swing.JLabel NewAmountNum;
    private javax.swing.JSlider NewAmountSlider;
    private javax.swing.JButton NewDescription;
    private javax.swing.JTextField NewDescriptionText;
    private javax.swing.JButton NewName;
    private javax.swing.JTextField NewNameL;
    private javax.swing.JButton NewPrice;
    private javax.swing.JTextField NewPriceL;
    private javax.swing.JButton NextPage1;
    private javax.swing.JButton NextPage2;
    private javax.swing.JButton NextPage4;
    private javax.swing.JButton NextPage5;
    private javax.swing.JButton NextPage6;
    private javax.swing.JLabel NumberCheck;
    private javax.swing.JLabel OrderSummaryMessage1;
    private javax.swing.JLabel OrderSummaryMessage2;
    private javax.swing.JScrollPane OrderTable;
    private javax.swing.JScrollPane OrdersList;
    private javax.swing.JPanel OrdersPage;
    private javax.swing.JTextField Password;
    private javax.swing.JLabel PasswordL;
    private javax.swing.JButton PreviousPage2;
    private javax.swing.JButton PreviousPage3;
    private javax.swing.JButton PreviousPage4;
    private javax.swing.JButton PreviousPage5;
    private javax.swing.JButton PreviousPage6;
    private javax.swing.JTabbedPane ProductTable;
    private javax.swing.JTabbedPane ProductTable1;
    private javax.swing.JLabel ProductTotal1;
    private javax.swing.JLabel ProductTotal1Price1;
    private javax.swing.JLabel ProductTotal2;
    private javax.swing.JLabel ProductTotal2Price2;
    private javax.swing.JButton RemoveFromCart;
    private javax.swing.JPanel Sandwich1;
    private javax.swing.JPanel Sandwich2;
    private javax.swing.JTable SandwichTable1;
    private javax.swing.JPanel ShoppingCartPage;
    private javax.swing.JButton ShowOrder;
    private javax.swing.JPanel Snacks1;
    private javax.swing.JPanel Snacks2;
    private javax.swing.JTable SnacksTable1;
    private javax.swing.JLabel Total1;
    private javax.swing.JLabel Total1Price1;
    private javax.swing.JLabel Total2;
    private javax.swing.JLabel Total2Price2;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel UserNameL;
    private javax.swing.JLabel VAT1;
    private javax.swing.JLabel VAT1Price1;
    private javax.swing.JLabel VAT2;
    private javax.swing.JLabel VAT2Price2;
    private javax.swing.JLabel WelcomeMessage1;
    private javax.swing.JLabel WelcomeMessage2;
    private javax.swing.JLabel WelcomeMessage3;
    private javax.swing.JLabel WelcomeMessage4;
    private javax.swing.JLabel WelcomeMessage5;
    private javax.swing.JLabel WelcomeMessage6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    // End of variables declaration//GEN-END:variables
}
