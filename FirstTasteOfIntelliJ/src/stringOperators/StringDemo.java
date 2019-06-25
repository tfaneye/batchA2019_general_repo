package stringOperators;

public class StringDemo {

    public static void main(String[] args) {
        workWithString();
    }

    public static void workWithString(){
        String query = "SELECT regex FROM EMPLOYEE WHERE FIRSTNAME='James'";
        String car = "Benz";
        String greetings = "Hello My People";
        String money = "£40";

        //System.out.println(greetings + " I have bought a new car : " + car );

        System.out.println(greetings.concat(" I have bought a new car : ").concat(car));

        int len = greetings.length();
        System.out.println("String length is: " + len);

        String smallGreetings = greetings.toLowerCase();
        System.out.println(smallGreetings);
        String bigGreetings = smallGreetings.toUpperCase();
        System.out.println(bigGreetings);

        System.out.println(car.trim());

        if(car.equals("Benz")){
            System.out.println("My new Benz");
        }
        if(car.equalsIgnoreCase(car)){
            System.out.println("My new new Benz");
        }

        String [] splitGreetings = greetings.split(" ");
        System.out.println(splitGreetings[0]);
        System.out.println(splitGreetings[1]);
        System.out.println(splitGreetings[2]);

        String nquery = query.replace("regex", "*");
        System.out.println(nquery);

        String id = query.replace("regex", "ID");
        System.out.println(id);

        String mon = money.replaceFirst("£", "");
        int cash = Integer.parseInt(mon);
        int totalSum = 2 * cash;
        System.out.println("Today you have earned: £" + totalSum);

        int cAT = greetings.charAt(7);
        System.out.println(cAT);

        if (greetings.contains("Go"))
            System.out.println("Yes!");
        else
            System.out.println("No");
    }
}
