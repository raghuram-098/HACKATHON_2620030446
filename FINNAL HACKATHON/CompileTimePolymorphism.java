class IceCreamOrder {
    void serve() {
        System.out.println("Serving a plain cone");
    }

    void serve(String flavor) {
        System.out.println("Serving one scoop of " + flavor);
    }

    void serve(String flavor, int scoops) {
        System.out.println("Serving " + scoops + " scoops of " + flavor);
    }

    void serve(String flavor, int scoops, String topping) {
        System.out.println("Serving " + scoops + " scoops of " + flavor + " with " + topping);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        IceCreamOrder order = new IceCreamOrder();
        order.serve();
        order.serve("Mango");
        order.serve("Chocolate", 3);
        order.serve("Vanilla", 2, "Caramel sauce");
    }
}
