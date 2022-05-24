import java.io.Serializable;



public class Sandwitch implements Serializable {
    public String meat;

    @Override
    public String toString() {
        return "Sandwitch{" +
                "meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", bread='" + bread + '\'' +
                ", toppings='" + toppings + '\'' +
                '}';
    }

    public Sandwitch(String meat, String cheese, String bread, String toppings) {
        this.meat = meat;
        this.cheese = cheese;
        this.bread = bread;
        this.toppings = toppings;
    }

    public String cheese;
    public String bread;
    public String toppings;

}

