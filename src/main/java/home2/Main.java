package home2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Container container1 = new Container(List.of(new Leaf(50)));
        Container container2 = new Container(List.of(new Leaf(70)));
        Container container3 = new Container(List.of(new Leaf(150),container2));
        Container container4 = new Container(List.of(container1,container2,container3));
        System.out.println(container4.countPrice());
    }
}
