package home2;

public class Leaf implements Package{
    private int price;
    public Leaf(int price) {
        this.price = price;
    }
    @Override
    public int countPrice() {
        return price;
    }
}
