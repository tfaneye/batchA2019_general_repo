package decisionStamenetsDemo;

public class Vehicle {

    private String chasisNumber = "A123456";
    private int numTyres = 4;
    private String regNum = "AB19CDE";
    private boolean isMoving = true;
    private double speed;
    private double speedRange = 30.0;
    private String zone = "30mph";

    public void applyBrakes(double speed){
        this.speed = speed;
        if(isMoving){
            speed--;
            System.out.println(speed);
        }

        if (speed <= 30 && speedRange == 30){
            System.out.println("Thank you for driving safely!");
        }
        else if ((speed > 30 && speed <= 40) && speedRange == 30){
            System.out.println("Your have have been captured and fine £40!");
        }
        else if ((speed > 40 && speed <= 50) && speedRange == 30){
            System.out.println("Your have have been captured and fine £50!");
        }


    }

    public void checkYourGrade(){

        int score = 76;
        char grade;

        if (score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        }
        else if (score >= 70){
            grade = 'C';
        }
        else if (score >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }
        System.out.println("Your score is " +score + ": Grade = " +grade);
    }

    public void switchDemo(){
        int scoreIndex = 3;
        char grade;

        switch (scoreIndex){
            case 1: grade = 'A';
                break;
            case 2: grade = 'B';
                break;
            case 3: grade = 'C';
                System.out.println("You have done brilliantly!!");
                break;
            case 4: grade = 'D';
                break;
            default:
                System.out.println("Sorry! no such grade in the this Exam");
        }
        System.out.println("Your score is " +scoreIndex);
    }

    public void selectWeekDay(){
        int weekNumber = 4;
        String day;

        switch (weekNumber){
            case 1: day = "Monday";

                break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                int price = 30;
                int item = 2;
                System.out.println("Total sales on Thursday = " + item * price);
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
             default: day = "Invalid day";
        }
        System.out.println(day);
    }

}
