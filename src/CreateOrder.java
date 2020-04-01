import java.util.ArrayList;

public class CreateOrder {

    private static int orderId = 1;
    private  String orderStatus;
    private Order newOrder = new Order(orderId, orderStatus);
    public static ArrayList<Order> pizzaOrders = new ArrayList();


    //Construtor
    public CreateOrder (int orderId) {
        this.orderId = orderId;
    }

    //Methods

    public void addPizzaToCreateOrder(int PizzaId, String pizzaName, int pizzaPrice) {

        newOrder.addPizza(PizzaId,pizzaName,pizzaPrice);

    }
// new method to add the order after the pizzas have been add to the objects list
    public void addOrder(String orderStatus, int orderId)
    {
            this.orderStatus = orderStatus;
            this.orderId = orderId;

            pizzaOrders.add(newOrder);
    }

    public void showAllPizzaInOrder ()
    {
        newOrder.showAllPizzasInOrder();
    }

    public void showAllOrders()
    {

        System.out.println("All Orders: ");
        for (int counter = 0; counter < pizzaOrders.size(); counter++) {
            System.out.println(pizzaOrders.get(counter));
        }

    }

    public void removeOrder(){

    }

    @Override
    public String toString() {
        return "OrderStatus " + orderStatus +
                " Your order number is " + orderId;
    }
}

