public abstract class Cake

{
    protected String name;
    protected double rate;

    public Cake(String n, double r)

    {
        name = n;
        rate = r;
    }

    public abstract double calcPrice();

    public String toString() {
        return name + "\t" + rate;
    }

}class OrderCake extends Cake {
    protected double weight;

    public OrderCake(String n, double r, double weight) {
        super(n, r);
        this.weight = weight;
    }

    @Override
    public double calcPrice() {
        return rate * weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + weight;
    }


}
class ReadymadeCake extends Cake {
    protected int quantity;


    public ReadymadeCake(String n, double r, int quantity) {
        super(n, r);
        this.quantity = quantity;
    }

    @Override
    public double calcPrice() {
        return rate * quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + quantity;
    }
}
 class Main {

    public static void main(String[] args) {
        // declare an array of 20 cake objects;
        Cake[] cakes = new Cake[20];

        // input data for cake objects and store them into the array;
        // 20 cake objects input
        cakes[0] = new ReadymadeCake("James", 1000, 123);
        cakes[1] = new ReadymadeCake("Patrick", 230, 10);
        cakes[2] = new ReadymadeCake("Meegan", 366, 5);
        cakes[3] = new OrderCake("John", 500, 2.5);
        cakes[5] = new OrderCake("Paul", 600, 2.5);
        cakes[6] = new OrderCake("Harry", 700, 2.5);
        cakes[7] = new OrderCake("Jill", 200, 2.5);
        cakes[8] = new OrderCake("Phil", 654, 2.5);
        cakes[9] = new OrderCake("Augustus", 655, 2.5);
        cakes[10] = new OrderCake("Cesar", 656, 2.5);
        cakes[11] = new OrderCake("Jack", 657, 2.5);
        cakes[12] = new OrderCake("Raj", 658, 2.5);
        cakes[13] = new OrderCake("Jerry", 659, 2.5);
        cakes[14] = new OrderCake("Emily", 610, 2.5);
        cakes[15] = new OrderCake("Nick", 620, 2.5);
        cakes[16] = new OrderCake("Enoch", 630, 2.5);
        cakes[17] = new OrderCake("Johansen", 640, 2.5);
        cakes[18] = new OrderCake("Stuart", 672, 2.5);
        cakes[19] = new OrderCake("Carlie", 90, 2.5);

        // display the total price for all types of cakes;
        double totalPrice=0;
        for (int i = 0; i < cakes.length; i++) {
            if(cakes[i] !=null) {
                totalPrice = totalPrice + cakes[i].calcPrice();
            }
        }
        System.out.println("Total price for all types of cakes: $"+totalPrice);
        //display the total price and the quantity sold for ready made cakes;
        totalPrice=0;
        int totalQuantity = 0;
        for (int i = 0; i < cakes.length; i++) {
            if(cakes[i] !=null) {
                if(cakes[i] instanceof ReadymadeCake) {
                    totalPrice = totalPrice + cakes[i].calcPrice();
                    ReadymadeCake readymadeCake = (ReadymadeCake) cakes[i];
                    totalQuantity = totalQuantity + readymadeCake.quantity;
                }

            }
        }
        System.out.println("Total price and the quantity sold for ready made cakes: "+totalPrice+" and "+totalQuantity);

        //Information for the cake that has been sold for the highest price.
        double price = 0;
        Cake highestPriceCake=null;
        for (int i = 0; i < cakes.length; i++) {
            if(cakes[i] !=null) {
                if(cakes[i].calcPrice()>price) {
                    price = cakes[i].calcPrice();
                    highestPriceCake=cakes[i];
                }
            }
        }
        //display the information for the cake that has been sold for the highest price
        System.out.println("Highest Price Cake: "+highestPriceCake);

    }

}


