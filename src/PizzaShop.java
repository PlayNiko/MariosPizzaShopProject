import java.util.Scanner;

public class PizzaShop {

    enum MenuChoices{

        WELCOME,CREATEORDER,SHOWORDER
    }

    private static Scanner scan = new Scanner(System.in);
    private static int orderId = 0;


    private static CreateOrder createOrder = new CreateOrder(orderId);

    public static void main(String[] args) {
        MenuChoices menuChoices = MenuChoices.WELCOME;

        boolean quit = false;
       // Loop the menu systen and option choices
        while(!quit) {

            menuChoices = getMenuChoices(menuChoices);

        }

            }

    private static MenuChoices getMenuChoices(MenuChoices menuChoices) {
        switch (menuChoices) {
        case WELCOME:
            System.out.println("********Welcome to the Pizza Ordering System*********");
            System.out.println("******************************************************");
            System.out.println("**What do you want to do? ");
            System.out.println("**Type Yes: To start a new order ");
            System.out.println("**Type No: To see all active orders ");
            String input = scan.nextLine();
            if (input.equals("Yes")) {
                menuChoices = MenuChoices.CREATEORDER;
            } else if (input.equals("No")) {
                menuChoices = MenuChoices.SHOWORDER;
            }
            break;
        case SHOWORDER:
            System.out.println("This is all the active orders: ");
            showAllOrders();
            System.out.println("Do you want to remove a finshed order from the list? ");
            System.out.println("Type: Yes..To remove the latest order from the list");
            System.out.println("Type: No to go back to Main Menu");
            input = scan.nextLine();
            if (scan.equals("Yes")) {
                //TODO remove order object from the list of active orderes
            } else if (scan.equals("No")) {
                menuChoices = MenuChoices.WELCOME;
            }
            menuChoices = MenuChoices.WELCOME;
            break;
        case CREATEORDER:
            String pizzaName = "Hawaian"; //TODO take from Menu or data somewhere else
            int pizzaPrice = 5;
                startNewOrder(pizzaName, pizzaPrice, scan);
            menuChoices = MenuChoices.WELCOME;

            break;
            default:
                throw new IllegalStateException("Unexpected value: " + menuChoices);
        }
        return menuChoices;
    }

    private static void startNewOrder(String pizzaName, int pizzaPrice, Scanner scan) {
        int pizzaId;
        String input;
        String orderStatus;

        System.out.println("################################# Order your pizza: ");
        System.out.println(" Type the Menu number of the pizza you wish to add to the order: ");

        pizzaId = scan.nextInt();

        System.out.println("You picked pizza Number: " + pizzaId);
        System.out.println("That is the: " + pizzaName + " Pizza. Your price will be: " + pizzaPrice);

        createOrder.addPizzaToCreateOrder(pizzaId,pizzaName,pizzaPrice);

        System.out.println("Do you want to add more Pizzas on this order? Yes/No?");

        scan.nextLine();
        input = scan.nextLine();

        if(input.equals("No")) {
            System.out.println("You Said No");
            orderStatus = "Food being prepared";
            orderId = ++ orderId;
            createOrder.addOrder(orderStatus, orderId);
            System.out.println("This is your order: " + createOrder);
        }
        else if (input.equals("Yes")) {
            startNewOrder(pizzaName,pizzaPrice,scan);

        }
        //TODO wierd bug where it prints out the showAllPizzaInOrder 2 times
        createOrder.showAllPizzaInOrder();


    }

    private static void showAllOrders() {
            //Show all orders in the ArrayList in the CreateOrder Class
            createOrder.showAllOrders();
        }

}
