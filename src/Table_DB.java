
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
public class Table_DB {
    
    private ArrayList<Table> tableDatabase = new ArrayList<>();
    
    public String GetTableDetails(int tableNo)
    {
        return tableDatabase.get(tableNo).GetTableDetails(tableNo);
    }
}
