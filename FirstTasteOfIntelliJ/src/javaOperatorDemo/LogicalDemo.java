package javaOperatorDemo;

public class LogicalDemo {

    public double price = 2.5;
    private int unit = 10;
    private double sales;
    private double commission;

    public void doLogicalOperations(){

        sales = unit * price;

        if(price < 5.0 && unit <= 10) {
            commission = 0.1 * sales;
            System.out.println(commission + ": This is the commission for selling " + unit + " units at £" + price);
        }
        if(price > 5.0 && unit > 10) {
            commission = 0.2 * sales;
            System.out.println(commission + ": This is the commission for selling " + unit + " units at £" + price);
        }

        if((price < 5.0 && unit <= 10) || (price < 5.0 && (unit > 10 || unit <= 20))){
            commission = 0.3 * sales;
            System.out.println("£"+commission + ": This is the commission for selling " + unit + " units at £" + price + " price");
        }

        if (!(price < 5.0 && unit <= 10)){
            commission = 0.1 * sales;
            System.out.println(commission + ": This is the commission for selling " + unit + " units at £" + price);
        }
    }

    public void moreLogicalOperators(){
        int a = 5;
        int b = 3;
        System.out.println(a + b);

        a = b;
        a -= b;
        System.out.println(a + b);


    }

}
