package NewYearsGift;

public class JellyBelly extends Gift {
    private String vkus;

    public JellyBelly(String tovar, double price, double weight, String vkus) {
        super(tovar, price, weight);
        this.vkus=vkus;
    }

    public String getVkus(){
        return vkus;
    }

    public void setVkus(){
        this.vkus=vkus;
    }

    @Override
    public String toString() {
        return "JellyBelly: "+"["+super.toString()+" Вкус: "+vkus+"]";
    }
}
