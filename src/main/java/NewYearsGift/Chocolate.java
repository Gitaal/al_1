package NewYearsGift;

public class Chocolate extends Gift {
    private String color;

    public Chocolate(String tovar, double price, double weight, String color) {
        super(tovar, price, weight);
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Chocolate "+"["+super.toString() +" Цвет: "+color+"]";
    }
}
