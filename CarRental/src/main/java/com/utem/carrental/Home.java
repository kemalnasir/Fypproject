/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.carrental;

import javax.swing.JOptionPane;

/**
 *
 * @author kemal
 */
public class Home extends javax.swing.JFrame {
    public String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
      public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if(!email.equals("admin@gmail.com"))
        {
            btnOrderDetails.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnReturnDetails.setVisible(false);
            btnReport.setVisible(false);
            jMenu4.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jSeparator5.setVisible(false);
            jSeparator6.setVisible(false);
            jSeparator7.setVisible(false);
            jSeparator8.setVisible(false);
        }
        else
        {
            btnOrder.setVisible(false);
            btnReturnCar.setVisible(false);
            btnFeedback.setVisible(false);
            jMenu5.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            jLabel14.setVisible(false);
            jLabel15.setVisible(false);
            jLabel16.setVisible(false);
            jLabel17.setVisible(false);
            jLabel18.setVisible(false);
            jLabel19.setVisible(false);
            jSeparator1.setVisible(false);
            jSeparator2.setVisible(false);
            jSeparator3.setVisible(false);
            MenuFeedback.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnOrder = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnOrderDetails = new javax.swing.JButton();
        btnReturnCar = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnFeedbackDetails = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnReturnDetails = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenuFeedback = new javax.swing.JMenuItem();
        MenuAllFeedback = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuManage = new javax.swing.JMenuItem();
        MenuOrder = new javax.swing.JMenuItem();
        MenuReturn = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Home");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("Search, book and rent car easily with us");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 700, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminLogin.png"))); // NOI18N
        jLabel6.setText("WELCOME, ADMIN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 610, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carRentalBg.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 410, 330));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 3, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jLabel3.setText("WELCOME HOME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 590, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("In order to reserve a car, please proceed with the steps below :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 430, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("1. Visit the main booking page and click \"Order Car”.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 270, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel8.setText("2. When your rental time is up, go to the booking page and click ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 340, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel9.setText("3. You may return the vehicle before the agreed upon pick-up time,");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 360, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel10.setText("4. Finally, please click the \"Feedbacks\" box and provide us with the");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 350, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel11.setText(" the \"Return Car\" button and provide your return information.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 310, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel12.setText(" but you will not be refunded for the time saved. Plan your route and ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 350, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel13.setText("allow enough of time for your trip!");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 190, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel14.setText("specifics on how we may better serve you.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 240, 20));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carRentalBg.jpg"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("For More Information Call Us :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contact.png"))); // NOI18N
        jLabel17.setText("014 329 5850");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 130, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("For Inquiry :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 100, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/email.png"))); // NOI18N
        jLabel19.setText("MotionzWheels@gmail.com");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        btnOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/order.png"))); // NOI18N
        btnOrder.setText("Order Car");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnViewEditDeleteProduct.setBackground(new java.awt.Color(255, 255, 255));
        btnViewEditDeleteProduct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/category.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("Manage Car");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setMargin(new java.awt.Insets(10, 40, 10, 35));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnOrderDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnOrderDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrderDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details.png"))); // NOI18N
        btnOrderDetails.setText("Order Details");
        btnOrderDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailsActionPerformed(evt);
            }
        });

        btnReturnCar.setBackground(new java.awt.Color(255, 255, 255));
        btnReturnCar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturnCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        btnReturnCar.setText("Return Car");
        btnReturnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnCarActionPerformed(evt);
            }
        });

        btnFeedback.setBackground(new java.awt.Color(255, 255, 255));
        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFeedback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback (1).png"))); // NOI18N
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        btnFeedbackDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnFeedbackDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFeedbackDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback (2).png"))); // NOI18N
        btnFeedbackDetails.setText("All Feedback Details");
        btnFeedbackDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackDetailsActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(255, 255, 255));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/business-report.png"))); // NOI18N
        btnReport.setText("Sales Report");
        btnReport.setMargin(new java.awt.Insets(10, 40, 10, 35));
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnReturnDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnReturnDetails.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReturnDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/file (1).png"))); // NOI18N
        btnReturnDetails.setText("Return Details");
        btnReturnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReturnDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewEditDeleteProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReturnCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(btnFeedbackDetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFeedbackDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewEditDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrderDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReturnDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReport)
                .addGap(11, 11, 11)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-carpool-64 (2).png"))); // NOI18N
        jLabel1.setText("MOTIONZ WHEELS CAR RENTAL");

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(0, 102, 102));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete_icon.jpeg"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        TxtEmail.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Email:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 970, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(89, 89, 89))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(224, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenuBar2.setBackground(new java.awt.Color(0, 0, 255));

        jMenu6.setBackground(new java.awt.Color(153, 153, 153));
        jMenu6.setText("System");

        jMenuItem7.setText("Logout");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Exit");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar2.add(jMenu6);

        jMenu1.setText("User");

        MenuFeedback.setText("Feedback");
        MenuFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFeedbackActionPerformed(evt);
            }
        });
        jMenu1.add(MenuFeedback);

        MenuAllFeedback.setText("All Feedback");
        MenuAllFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAllFeedbackActionPerformed(evt);
            }
        });
        jMenu1.add(MenuAllFeedback);

        jMenuBar2.add(jMenu1);

        jMenu4.setText("Car");

        MenuManage.setText("Manage Car");
        MenuManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuManageActionPerformed(evt);
            }
        });
        jMenu4.add(MenuManage);

        MenuOrder.setText("Order Details");
        MenuOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOrderActionPerformed(evt);
            }
        });
        jMenu4.add(MenuOrder);

        MenuReturn.setText("Return Details");
        MenuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReturnActionPerformed(evt);
            }
        });
        jMenu4.add(MenuReturn);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Order");

        jMenuItem5.setText("Place Order");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem1.setText("Return Car");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1318, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        //setVisible(false);
        new OrderCar().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void MenuManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuManageActionPerformed
        new ManageCar().setVisible(true);
    }//GEN-LAST:event_MenuManageActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new OrderCar().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Close Application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        new ManageCar().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnOrderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailsActionPerformed
        //setVisible(false);
        new OrderDetails().setVisible(true);
    }//GEN-LAST:event_btnOrderDetailsActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ReturnCar().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnReturnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnCarActionPerformed
        new ReturnCar().setVisible(true);
    }//GEN-LAST:event_btnReturnCarActionPerformed

    private void btnReturnDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnDetailsActionPerformed
        new ReturnDetails().setVisible(true);
    }//GEN-LAST:event_btnReturnDetailsActionPerformed

    private void MenuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReturnActionPerformed
        new ReturnDetails().setVisible(true);
    }//GEN-LAST:event_MenuReturnActionPerformed

    private void MenuOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOrderActionPerformed
        new OrderDetails().setVisible(true);
    }//GEN-LAST:event_MenuOrderActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        new FeedbackCust().setVisible(true);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnFeedbackDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackDetailsActionPerformed
        new FeedbackDetails().setVisible(true);
    }//GEN-LAST:event_btnFeedbackDetailsActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        new Report().setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Close Application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void MenuFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFeedbackActionPerformed
        new FeedbackCust().setVisible(true);
    }//GEN-LAST:event_MenuFeedbackActionPerformed

    private void MenuAllFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAllFeedbackActionPerformed
        new FeedbackDetails().setVisible(true);
    }//GEN-LAST:event_MenuAllFeedbackActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAllFeedback;
    private javax.swing.JMenuItem MenuFeedback;
    private javax.swing.JMenuItem MenuManage;
    private javax.swing.JMenuItem MenuOrder;
    private javax.swing.JMenuItem MenuReturn;
    public static final javax.swing.JTextField TxtEmail = new javax.swing.JTextField();
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnFeedbackDetails;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOrderDetails;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnReturnCar;
    private javax.swing.JButton btnReturnDetails;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
