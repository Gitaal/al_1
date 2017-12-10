package NewYearsGift;

public class AllGift {
    public void allGift() {
        double weight = 0, price = 0;
        Candy candy1 = new Candy("Mentos", 200, 0.2, "lollipops");
        JellyBelly jellyBelly1 = new JellyBelly("Hello kitty", 900, 0.5, "fruit");
        Chocolate chocolate1 = new Chocolate("Alpen Gold", 250, 0.3, "dark");

        Gift[] box = {candy1, jellyBelly1, chocolate1};
        //Набираем подарок
        weight += candy1.getWeight() + jellyBelly1.getWeight() + chocolate1.getWeight();
        price += candy1.getPrice() + jellyBelly1.getPrice() + chocolate1.getPrice();
        System.out.println("Вес подарка: " + weight);
        System.out.println("Цена подарка: " + price);
        
        for (Gift someGift : box) {
            System.out.println("Состав коробки с подарками: " + someGift.toString());
        }
    }
}
