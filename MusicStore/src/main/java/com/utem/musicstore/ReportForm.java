/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utem.musicstore;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.text.*;
import java.awt.Color;
import javax.swing.UIManager;
/**
 *
 * @author User
 */
public class ReportForm extends javax.swing.JFrame {
    // declare object for class AddNewProduct to use methods for dealing with database
    private ConnectionData itemsCon = new ConnectionData();
    private ConnectionData categoryCon = new ConnectionData();
    private ConnectionData reportCon = new ConnectionData();
    
    // declare object for class Item to set and get values of Item
    private Items items;
    private Category category;
    //private Report report;
    
    private static ArrayList <Items> itemsList;
    private static ArrayList <Category> categoryList;
    //private static ArrayList <Report> reportList;
    /**
     * Creates new form ReportForm
     */
    public ReportForm() {
        initComponents();
        comboBoxCategory.removeAllItems();
    }
    
    public void itemsNameByCategory(String category) {
        comboBoxTitle.removeAllItems();
        // Call method readAll() to fetch all data from database
        //itemsList = itemsCon.readAllItems2();
        ArrayList<Items> itemsList = itemsCon.readAllItemsByCategory(category);
        Iterator<Items> itemsItr = itemsList.iterator();
        
        Object rowData[] = new Object[1];
        
        // use repetition structure to read all item attributes of the ArrayList
        // and display the data in the table according to the columns and row
        for(Items x:itemsList){
            comboBoxTitle.addItem(x.getTitle());
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
        jLabel1 = new javax.swing.JLabel();
        labelExit = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        buttonSearch = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTitle = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(290, 0));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 0, 130));
        jLabel1.setText("Sales Report");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labelExit.setBackground(new java.awt.Color(255, 255, 255));
        labelExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelExit.setForeground(new java.awt.Color(75, 0, 130));
        labelExit.setText("X");
        labelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelExitMouseClicked(evt);
            }
        });
        jPanel1.add(labelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 11, 20, -1));

        reportTable.setBackground(new java.awt.Color(75, 0, 130));
        reportTable.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        reportTable.setForeground(new java.awt.Color(255, 255, 255));
        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Album Title", "Category", "Quantity", "Price", "Sub Total", "Date"
            }
        ));
        jScrollPane1.setViewportView(reportTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 660, 440));

        buttonSearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(75, 0, 130));
        buttonSearch.setText("Search");
        buttonSearch.setBorder(null);
        buttonSearch.setBorderPainted(false);
        buttonSearch.setIconTextGap(10);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 160, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(75, 0, 130));
        jLabel16.setText("Album Title :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(75, 0, 130));
        jLabel20.setText("Total : RM");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, -1, 30));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(75, 0, 130));
        txtTotal.setText("00.00");
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 60, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(75, 0, 130));
        jLabel24.setText("Quantity :");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, -1, 30));

        txtQuantity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(75, 0, 130));
        jPanel1.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 90, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(75, 0, 130));
        jLabel21.setText("From: ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, 30));

        lblFrom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(75, 0, 130));
        jPanel1.add(lblFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 170, 50));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(75, 0, 130));
        jLabel22.setText("To:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, 30));

        lblTo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTo.setForeground(new java.awt.Color(75, 0, 130));
        jPanel1.add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 170, 50));

        comboBoxTitle.setBackground(new java.awt.Color(204, 255, 255));
        comboBoxTitle.setBorder(null);
        jPanel1.add(comboBoxTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 160, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(75, 0, 130));
        jLabel9.setText("From ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 60, 20));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(75, 0, 130));
        jLabel17.setText("To ");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 70, 20));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(75, 0, 130));
        jLabel18.setText("Category");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, 20));
        jPanel1.add(txtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 170, 30));
        jPanel1.add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 170, 30));

        comboBoxCategory.setBackground(new java.awt.Color(204, 255, 255));
        comboBoxCategory.setBorder(null);
        comboBoxCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCategoryItemStateChanged(evt);
            }
        });
        comboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoryActionPerformed(evt);
            }
        });
        jPanel1.add(comboBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 160, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(75, 0, 130));
        jLabel19.setText("Album Title");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 70, 20));

        txtCategoryID.setEditable(false);
        txtCategoryID.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.add(txtCategoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 40, 30));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtTitle.setEditable(false);
        txtTitle.setColumns(20);
        txtTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(75, 0, 130));
        txtTitle.setLineWrap(true);
        txtTitle.setRows(5);
        jScrollPane2.setViewportView(txtTitle);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 220, 60));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(75, 0, 130));
        jLabel23.setText("Category :");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, 30));

        txtCategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCategory.setForeground(new java.awt.Color(75, 0, 130));
        jPanel1.add(txtCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelExitMouseClicked
        // Close form and reset table
        DefaultTableModel tableContent = (DefaultTableModel) reportTable.getModel();
        tableContent.setRowCount(0);
        comboBoxTitle.setSelectedItem(null);
        txtFrom.setCalendar(null);
        txtTo.setCalendar(null);
        txtTitle.setText("");
        txtTotal.setText("");
        txtQuantity.setText("");
        lblFrom.setText("");
        lblTo.setText("");
        // Close form
        setVisible(false);
    }//GEN-LAST:event_labelExitMouseClicked

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        try
        {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = df.format(txtFrom.getDate());
            String date2 = df.format(txtTo.getDate());
            String name = String.valueOf(comboBoxTitle.getSelectedItem());
            
            Date date = new Date();

            Date firstDate = txtFrom.getDate();
            Date secondDate = txtTo.getDate();

            long difference = secondDate.getTime() - firstDate.getTime();

            long diffInDays = (long) (difference / 1000 / 60 / 60 / 24);

            long day = diffInDays;
            // Check wether the form are completed or empty
            if (!date1.equals("") && !date2.equals("")) {
                if (day <= 0) {
                    JOptionPane.showMessageDialog(null, "To Date can't be lower than From Date!!!");
                }
                else {
                    reportCon.readReport2Date(name, date1, date2);

                    double total = 0;
                    for (int i = 0, rows = reportTable.getRowCount(); i < rows; i++) {
                        double totalSub = Double.valueOf(reportTable.getValueAt(i, 5).toString());
                        total += totalSub;
                    }
                    int quantity = 0;
                    for (int i = 0; i < reportTable.getRowCount(); i++) {
                        String amount = reportTable.getValueAt(i, 3).toString();
                        quantity += Integer.parseInt(amount);
                    }

                    txtTitle.setText(String.valueOf(comboBoxTitle.getSelectedItem()));
                    txtCategory.setText(String.valueOf(comboBoxCategory.getSelectedItem()));
                    txtTotal.setText(Double.toString(total).trim().format("%.2f", total));
                    txtQuantity.setText(Integer.toString(quantity).trim());
                    lblFrom.setText(date1);
                    lblTo.setText(date2);
                }
            } else if (date1.equals("") && date2.equals("")) {
                //jLabel5.setText("From date are an empty!!!");
                //jLabel4.setText("To date are an empty!!!");
            } else if (date1.equals("")) {
                //jLabel5.setText("From date are an empty!!!");
            } else if (date2.equals("")) {
                //jLabel4.setText("To date are an empty!!!");
            } else {
                //validateAll.setText("Price's field is empty!");
            }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void comboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoryActionPerformed
        String category = txtCategoryID.getText().trim();
        itemsNameByCategory(category);
    }//GEN-LAST:event_comboBoxCategoryActionPerformed

    private void comboBoxCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCategoryItemStateChanged
        String categoryName = (String)comboBoxCategory.getSelectedItem();
        Category category = categoryCon.getCategoryByName(categoryName);
        txtCategoryID.setText(category.getCategoryID());
    }//GEN-LAST:event_comboBoxCategoryItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        ArrayList<Category> categoryList = categoryCon.readAllCategory();
        Iterator<Category> categoryItr = categoryList.iterator();
        
        while (categoryItr.hasNext()) {
            Category x = categoryItr.next();
            comboBoxCategory.addItem(x.getName());
        }
        String category = (String) comboBoxCategory.getSelectedItem();
        itemsNameByCategory(category);
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSearch;
    public static final javax.swing.JComboBox<String> comboBoxCategory = new javax.swing.JComboBox<>();
    public static final javax.swing.JComboBox<String> comboBoxTitle = new javax.swing.JComboBox<>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTo;
    public static final javax.swing.JTable reportTable = new javax.swing.JTable();
    public static javax.swing.JLabel txtCategory;
    public static final javax.swing.JTextField txtCategoryID = new javax.swing.JTextField();
    public static final com.toedter.calendar.JDateChooser txtFrom = new com.toedter.calendar.JDateChooser();
    public static javax.swing.JLabel txtQuantity;
    private javax.swing.JTextArea txtTitle;
    public static final com.toedter.calendar.JDateChooser txtTo = new com.toedter.calendar.JDateChooser();
    public static javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
