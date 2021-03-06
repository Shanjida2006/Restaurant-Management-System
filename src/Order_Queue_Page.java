/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x45clamibot
 */
public class Order_Queue_Page extends javax.swing.JPanel {

    /**
     * Creates new form New_Order_Page
     */
    public Order_Queue_Page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JScrollPane();
        TitleText = new javax.swing.JTextArea();
        Order1Button = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        OrdersColumnText = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Role = new javax.swing.JScrollPane();
        RoleText = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(1600, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setBorder(null);

        TitleText.setEditable(false);
        TitleText.setBackground(new java.awt.Color(240, 240, 240));
        TitleText.setColumns(20);
        TitleText.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        TitleText.setRows(5);
        TitleText.setText("Order Queue");
        Title.setViewportView(TitleText);

        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 50, -1, -1));

        Order1Button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Order1Button.setText("Order 1");
        Order1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Order1ButtonMouseClicked(evt);
            }
        });
        add(Order1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 50));

        LogOutButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LogOutButton.setText("Log Out");
        LogOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutButtonMouseClicked(evt);
            }
        });
        add(LogOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 800, 200, 50));

        OrdersColumnText.setBorder(null);

        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Orders:");
        OrdersColumnText.setViewportView(jTextArea2);

        add(OrdersColumnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        Role.setBorder(null);

        RoleText.setEditable(false);
        RoleText.setBackground(new java.awt.Color(240, 240, 240));
        RoleText.setColumns(20);
        RoleText.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        RoleText.setRows(5);
        RoleText.setText("Role: Cook");
        Role.setViewportView(RoleText);

        add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 800, 800, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Order1ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Order1ButtonMouseClicked
        GUI.Gui.GetOrder(1);
    }//GEN-LAST:event_Order1ButtonMouseClicked

    private void LogOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButtonMouseClicked
        GUI.Gui.setContentPane(GUI.Gui.loginPage);
        GUI.Gui.setVisible(true);
    }//GEN-LAST:event_LogOutButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutButton;
    private javax.swing.JButton Order1Button;
    private javax.swing.JScrollPane OrdersColumnText;
    private javax.swing.JScrollPane Role;
    public javax.swing.JTextArea RoleText;
    private javax.swing.JScrollPane Title;
    public javax.swing.JTextArea TitleText;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
