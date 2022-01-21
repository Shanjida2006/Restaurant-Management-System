
import java.awt.Color;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x45clamibot
 */
public class GUI extends javax.swing.JFrame {

    private Table_DB tableDatabase;
    private Order_Queue queue;
    private Employee_DB employeeDatabase;
    public static Login_Page loginPage;
    public Floor_Status_Page floorStatusPage = new Floor_Status_Page();
    public Table_Tab_Page tableTabPage = new Table_Tab_Page();
    public New_Order_Page newOrderPage = new New_Order_Page();
    public Order_Page orderPage = new Order_Page();
    public Order_Queue_Page orderQueuePage = new Order_Queue_Page();
    public Waiter_Assignment_Page waiterAssignmentPage = new Waiter_Assignment_Page();
    public Table_Status_Page tableStatusPage = new Table_Status_Page();
    public Restaurant_Management_Page managementPage = new Restaurant_Management_Page();
    public Menu menu;
    public MenuDB menudb;
    public static GUI Gui;
    
    private int role;
    /**
     * Creates new form GUI
     */
    public GUI() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Gui = new GUI();
        loginPage = new Login_Page();
        loginPage.GetLoginPage();
        Gui.setVisible(true);
    }
    
    public int GetRole()
    {
        return role;
    }
    
    public void SelectTable(int TableNo)
    {
        switch (role)
        {
            case 0: // Waiter role
                Gui.tableTabPage.TitleText.setText("Table " + TableNo + " Tab");
                Gui.setContentPane(tableTabPage);
                break;
            case 1: // Host role
                Gui.setContentPane(waiterAssignmentPage);
                break;
            case 2: // Busboy role
                Gui.tableStatusPage.TitleText.setText("Table " + TableNo + " Status");
                if (floorStatusPage.tables[TableNo-1].getBackground().equals(Color.RED))
                {
                    Gui.tableStatusPage.StatusText.setText("Table Is Dirty");
                    Gui.tableStatusPage.StatusText.setForeground(Color.RED);
                    Gui.tableStatusPage.UpdateStatusButton.setEnabled(true);
                }
                Gui.tableStatusPage.tableNo = TableNo;
                Gui.setContentPane(tableStatusPage);
                break;
        }
        
        Gui.setVisible(true);
    }
    
    public void SelectAddItem(String WaiterID, int TableNo)
    {
        
    }
    
    public void SelectCategory(String CategoryName)
    {
        
    }
    
    public void AddItem(int OrderNo, String AddItemList)
    {
        
    }
    
    public void PlaceOrder(int OrderNo)
    {
        Gui.setContentPane(newOrderPage);
        Gui.setVisible(true);
    }
    
    public void SelectLogin()
    {
        role = loginPage.SendCredentials(Integer.parseInt(loginPage.ID.getText()), loginPage.Password.getText());
        
        switch (role)
        {
            case 0: // Waiter role
                floorStatusPage.RoleText.setText("Role: Waiter");
                Gui.setContentPane(floorStatusPage);
                Gui.setVisible(true);
                break;
            case 1: // Host role
                floorStatusPage.RoleText.setText("Role: Host");
                Gui.setContentPane(floorStatusPage);
                Gui.setVisible(true);
                break;
            case 2: // Busboy role
                floorStatusPage.RoleText.setText("Role: Busboy");
                Gui.setContentPane(floorStatusPage);
                Gui.setVisible(true);
                break;
            case 3: // Cook role
                Gui.setContentPane(orderQueuePage);
                Gui.setVisible(true);
                break;
            case 4: // Management role
                Gui.setContentPane(managementPage);
                Gui.setVisible(true);
                break;
        }
    }
    
    public void SendCredentials(int ID, String password)
    {
        
    }
    
    public void VerifyAuthentication()
    {
        
    }
    
    public void AssignWaiter(int waiterNo)
    {
        if (waiterAssignmentPage.waiters[waiterNo-1].getBackground().equals(Color.RED))
            waiterAssignmentPage.waiters[waiterNo-1].setBackground(Color.GREEN);
        else
            waiterAssignmentPage.waiters[waiterNo-1].setBackground(Color.RED);
    }
    
    public void UpdateTableStatus()
    {
        Gui.tableStatusPage.StatusText.setText("Table Is Clean");
        Gui.tableStatusPage.StatusText.setForeground(Color.GREEN);
        Gui.tableStatusPage.UpdateStatusButton.setEnabled(false);
        Gui.floorStatusPage.tables[tableStatusPage.tableNo-1].setBackground(Color.GREEN);
    }
    
    public void GetOrder(int OrderNo)
    {
        switch (role)
        {
            case 0: // If the user is a waiter, enable order modification
                Gui.orderPage.AddItemButton.setEnabled(true);
                Gui.orderPage.RemoveItemButton.setEnabled(true);
                Gui.orderPage.CancelOrderButton.setEnabled(true);
                Gui.orderPage.AddMenu.setEnabled(true);
                break;
            case 3: // If the user is a cook, disable order modification
                Gui.orderPage.AddItemButton.setEnabled(false);
                Gui.orderPage.RemoveItemButton.setEnabled(false);
                Gui.orderPage.CancelOrderButton.setEnabled(false);
                break;
        }
        Gui.orderPage.TitleText.setText("Order " + OrderNo + " Details");
        Gui.setContentPane(orderPage);
        Gui.setVisible(true);
    }
    
    public void DeleteItem(String WaiterID, int TableNo)
    {
        
    }
    
    public void CancelOrder(int OrderNo)
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
