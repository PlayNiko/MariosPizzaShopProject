import java.util.ArrayList;


public class Order {
    private int orderId;
    private String OrderStatus;

    //List of Pizza objects we want to add to a order
    private  ArrayList <Pizza> pizzaActiveOrders = new ArrayList();

//constructors
    public Order(int orderId, String OrderStatus) {
        this.orderId = orderId;
    }
    // We add a Pizza Object to our PizzaList
    public  void addPizza(int id, String name, int price) {
        Pizza newPizza = new Pizza(id,name,price);
        pizzaActiveOrders.add(newPizza);
    }

    //TODO Create show all pizzas on the actual order method

    public void showAllPizzasInOrder()
    {
        System.out.println("All Pizzas in order: ");
        for (int counter = 0; counter < pizzaActiveOrders.size(); counter++) {
            System.out.println("*--------This is ur pizza :" + pizzaActiveOrders.get(counter));
        }
    }

    @Override
    public String toString() {
        return " *-------*Pizza Order: Number: " + orderId;

    }

}
