public class Pizza {
    // Have the skelton of a pizza, So can use it as and object inside of Order ++ Later and then feed from a file all the data
    private int id = 0;
   // private int idCounter;
    private String Name;
    private double price;

    public Pizza(int id, String name, double price) {
        this.id = id;
        Name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Pizza " +
                "id " + id +
                " Name " + Name + '\'' +
                ", price " + price;
    }
}
