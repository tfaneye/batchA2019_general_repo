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
        int score = 70;
        char grade = 'C';

        switch (score){
            case 1: grade = 'A';
            break;
            case 2: grade = 'B';
                break;
            case 3: grade = 'C';
                break;
            case 4: grade = 'D';
                break;
        }
        System.out.println("Your score is " +score + ": Grade = " +grade);
    }

}
