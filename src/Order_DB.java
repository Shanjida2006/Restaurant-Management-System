
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
public class Order_DB {
    
    private ArrayList<Order> orderDatabase = new ArrayList<>();
    
    public void StoreOrder(Order order)
    {
        orderDatabase.add(order);
    }
    
    public void CancelOrder(Order order)
    {
        orderDatabase.remove(order);
    }
    
    public Order GetOrder(Order order)
    {
        if (orderDatabase.contains(order))
            return orderDatabase.get(orderDatabase.indexOf(order));
        else
            return null;
    }
}
