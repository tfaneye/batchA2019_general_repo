package javaOperatorDemo;

public class RelationalDemo {

    public void compareTwoNumbers(){

        int value1 = 50;
        int value2 = 10;
        int divisionResult;

        if(value1 == value2){
            System.out.println("the two values are equal");
        }
        if(value1 != value2){
            System.out.println("the two values are not equal");
        }
        if (value1 < value2){
            System.out.println("Value1 is less than Value2");
        }
        if (value1 > value2){
            System.out.println("Value1 is greater than Value2");
        }
        if(value2 != 0){
            divisionResult = value1 / value2;
            System.out.println(divisionResult);
        }else {
            System.out.println("Division by zero (0) is undefined!");
        }

        if(value1 <= value2){
            System.out.println("Indeed Value1 is less than or equal to value2");
        }
        if(value1 >= value2){
            System.out.println("Indeed Value1 is greater than or equal to value2");
        }
    }
}
