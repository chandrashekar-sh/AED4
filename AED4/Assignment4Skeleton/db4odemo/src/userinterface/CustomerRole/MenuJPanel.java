/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Organization;
import Business.Restaurant.Food;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class MenuJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
   
    private Restaurant restaurant;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    ArrayList<Food> items=new ArrayList<Food>();
    int sum = 0;
    
    /**
     * Creates new form RequestLabTestJPanel
     */
    public MenuJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.restaurant = restaurant;
        
        populateMenuTable();
       
    }

    
public void populateMenuTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblMenu.getModel();
        
            tablemodel.setRowCount(0);
                Object[] row = new Object[3];
                for(Food f:restaurant.getMenu()){
                     row[0] = f;
                     row[1] = f.getDescription();
                     row[2] = f.getPrice();
                     tablemodel.addRow(row);
                } 
    }
    
    public void populateCart(Food dishitem){
        DefaultTableModel tablemodel = (DefaultTableModel) tblCart.getModel();
        tablemodel.setRowCount(0);
        
         items.add(dishitem);
         Object[] row = new Object[3];
                for(Food f:items){
                     row[0] = f;
                     row[1] = f.getDescription();
                     row[2] = f.getPrice();
                     sum=sum+Integer.parseInt(f.getPrice());
                     tablemodel.addRow(row);
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

        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        btnAddToCart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        btnOrder1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnRemoveFromCart = new javax.swing.JButton();

        setBackground(new java.awt.Color(53, 33, 89));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Restaurant");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 120, 30));

        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblMenu);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 130));

        btnAddToCart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAddToCart.setText("Add To Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Location:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 80, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, -1));

        btnOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 100, 30));

        btnOrder1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnOrder1.setText("Order");
        btnOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder1ActionPerformed(evt);
            }
        });
        add(btnOrder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 100, -1));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCart);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 130));

        btnRemoveFromCart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRemoveFromCart.setText("Remove Item");
        btnRemoveFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromCartActionPerformed(evt);
            }
        });
        add(btnRemoveFromCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to add","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Food f=(Food)tblMenu.getValueAt(selectedRow, 0);

            populateCart(f);

        }

    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed

        String address=txtAddress.getText();
        restaurant.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:ecosystem.getCustomerDirectory().getCustomerDirectory()){
            if(userAccount.getUsername().equals(cust.getUserName())){
                cust.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
                JOptionPane.showMessageDialog(null, "You Order placed successfully");
            }
        }

    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder1ActionPerformed

        String address=txtAddress.getText();
        restaurant.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:ecosystem.getCustomerDirectory().getCustomerDirectory()){
            if(userAccount.getUsername().equals(cust.getUserName())){
                cust.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
                JOptionPane.showMessageDialog(null, "You Order placed successfully");
            }
        }

    }//GEN-LAST:event_btnOrder1ActionPerformed

    private void btnRemoveFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromCartActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to remove from cart","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Food food=(Food)tblCart.getValueAt(selectedRow, 0);
            items.remove(food);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
            model.setRowCount(0);
            // commented no use
        }
    }//GEN-LAST:event_btnRemoveFromCartActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnOrder1;
    private javax.swing.JButton btnRemoveFromCart;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenu;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
