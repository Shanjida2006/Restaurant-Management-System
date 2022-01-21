
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x45clamibot
 */
public class Employee_DB {
    
    private ArrayList<Employee> employeeDatabase = new ArrayList<>();
    
    public void GetStaffDetails(String userID, String password)
    {
        int user = Integer.parseInt(userID);
        employeeDatabase.get(user).GetStaffDetails(userID, password);
    }
}
