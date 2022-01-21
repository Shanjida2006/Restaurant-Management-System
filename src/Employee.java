/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x45clamibot
 */
class Employee {
    private String Name;
    private String Email;
    private String Address;
    private String Phone;
    private String EmployeeID;
    private String DOB;
    private String Type;
    
    public void GetStaffDetails(String userID, String password)
    {
        System.out.print("Employee Details:\n");
        System.out.print("Name: " + Name);
        System.out.print("Email: " + Email);
        System.out.print("Address: " + Address);
        System.out.print("Phone: " + Phone);
        System.out.print("EmployeeID: " + EmployeeID);
        System.out.print("DOB: " + DOB);
        System.out.print("Type: " + Type);
    }
}
