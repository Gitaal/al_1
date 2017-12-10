package NewYearsGift;

public class Candy extends Gift{
    private String type;
    public Candy(String tovar,double price, double weight,  String type){
        super(tovar, price, weight);
        this.type = type;
    }

    public String getType(){
        return type;
    }
    public void setType(){
        this.type=type;
    }

    @Override
    public String toString() {
        return "Candy: "+"["+super.toString()+" Тип: "+type+"]";
    }
}
