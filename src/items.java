public class items {
    private catalog type;
    private String color;
    private double cost;
    public items(catalog type, String color, double cost){
        this.type=type;
        this.color=color;
        this.cost=cost;
    }

    public catalog getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }
}