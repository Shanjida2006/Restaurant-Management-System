/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajeybs
 */
import java.util.ArrayList;
public class MenuDB {
    public static ArrayList<String> menulist = new ArrayList<String>();
    
    public static void GetItemList(String ItemName)
    {
        menulist.add (" ");
        menulist.add("                 APPETIZERS");
        menulist.add ("Buffalo Style Chicken Egg Rolls------------$8.50");
        menulist.add ("Grilled Shrimp-----------------------------$8.50");
        menulist.add ("Chicken Wings------------------------------$9.50");
        menulist.add ("Pepperjack Cheese Bites--------------------$10.99");
        menulist.add ("Hot Pretzel Sticks-------------------------$10.50");
        menulist.add (" ");
        menulist.add ("                 PIZZAS");
        menulist.add ("Smoked Chicken Pizza-----------------------$10.99");
        menulist.add ("Greek Pizza--------------------------------$9.50");
        menulist.add ("Italian Pizza------------------------------$13.99");
        menulist.add ("Red Sauce Pizza----------------------------$9.99");
        menulist.add (" ");
        menulist.add ("                SOUPS AND SALADS");
        menulist.add ("Greek Salad--------------------------------$6");
        menulist.add ("Caesar Salad-------------------------------$8");
        menulist.add ("House Salad--------------------------------$10");
        menulist.add (" ");
        menulist.add ("                 SANDWICHES");
        menulist.add ("Fish Sandwich------------------------------$9.50");
        menulist.add ("Meatball Sandwich--------------------------$7.99");
        menulist.add ("Cheesesteak Sandwich-----------------------$10.50");
        menulist.add ("Angus Hamburger----------------------------$8");
        menulist.add ("Mushroom and Swiss Burger------------------$11");
        menulist.add ("Western Burger-----------------------------$9.50");
        menulist.add ("Black and Bleu Burger----------------------$7.50");
        menulist.add (" ");
        menulist.add ("                  PASTAS");
        menulist.add ("Redmoor Linguine---------------------------$10");
        menulist.add ("Linguine and Meatballs---------------------$8.50");
        menulist.add ("Chicken Marsala----------------------------$6.99");
        menulist.add (" ");
        menulist.add ("                  SIDES");
        menulist.add ("Herb Roasted Potatoes----------------------$5");
        menulist.add ("Fresh Vegetable Medley---------------------$8");
        menulist.add ("Garlic Whipped Potatoe---------------------$6");
        menulist.add ("House-Cut Fries----------------------------$7");
    }
    
    public static void GetCategoryList(String CategoryName)
    {
        menulist.add (" ");
        menulist.add("                 APPETIZERS");
        menulist.add (" ");
        menulist.add ("                 PIZZAS");
        menulist.add (" ");
        menulist.add ("                SOUPS AND SALADS");
        menulist.add (" ");
        menulist.add ("                 SANDWICHES");
        menulist.add (" ");
        menulist.add ("                  PASTAS");
        menulist.add (" ");
        menulist.add ("                  SIDES");
    }
}
