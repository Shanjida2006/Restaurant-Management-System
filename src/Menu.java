/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajeybs
 */
public class Menu {
    private String ItemName;
    private int ItemNo;
    private String ItemDescription;
    
    public static void GetMenu(){
        MenuDB.GetItemList("");
    }
    
    public void GetCategory(String CategoryName)
    {
        MenuDB.GetCategoryList(CategoryName);
    }
}
