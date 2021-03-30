/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;
import Business.EcoSystem;

import Business.Restaurant.Food;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author css19
 */
public class ManageMenuWorkAreaJPanel extends javax.swing.JPanel {
private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private Food menu;
    /**
     * Creates new form ManageMenu
     */
    public ManageMenuWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
         populateFoodCatalogue();
    }
     public void populateFoodCatalogue(){
            DefaultTableModel tablemodel = (DefaultTableModel) tblMenuCatalogue.getModel();
        
        tablemodel.setRowCount(0);
        
       
        for (Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()) {
           
            if (restro.getUserName().equals(account.getUsername())) {
                System.out.println("1");
                if(!(restro.getMenu().isEmpty())){
                    for(Food menu:restro.getMenu()){
                    System.out.println("2");
                    Object[] row = new Object[3];
                    row[0] = menu.getName();
                    row[1] = menu.getDescription();
                    row[2] = menu.getPrice();
                    tablemodel.addRow(row);
               }
                }
               
                
            }
            
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtFoodDescription = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAddFoodItem = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenuCatalogue = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(53, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Food Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 51, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Food Description:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 88, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 125, -1, -1));
        jPanel1.add(txtFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 49, 107, -1));
        jPanel1.add(txtFoodDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 86, 107, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 123, 107, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu Catalogue");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 10, 147, -1));

        btnAddFoodItem.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddFoodItem.setText("Add Food Item");
        btnAddFoodItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodItemActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFoodItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 186, -1, -1));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/png/20x20/56.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 10, -1, -1));

        tblMenuCatalogue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMenuCatalogue);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 290, 375, 112));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 329, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Food Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 258, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnAddFoodItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodItemActionPerformed
        // TODO add your handling code here:
        for(Restaurant restro : ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            if(restro.getUserName().equals(account.getUsername())){
                menu = ecosystem.getRestaurantDirectory().AddMenuDishes(restro, txtFoodName.getText(), txtFoodDescription.getText(), txtPrice.getText());
            }
        }

        populateFoodCatalogue();

    }//GEN-LAST:event_btnAddFoodItemActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenuCatalogue.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                for(Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
                    if(restro.getUserName().equals(account.getUsername())){
                        ecosystem.getRestaurantDirectory().DeleteDishes(restro, menu);
                    }
                }
                populateFoodCatalogue();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row to proceed for deletion");
        }

    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFoodItem;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMenuCatalogue;
    private javax.swing.JTextField txtFoodDescription;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
