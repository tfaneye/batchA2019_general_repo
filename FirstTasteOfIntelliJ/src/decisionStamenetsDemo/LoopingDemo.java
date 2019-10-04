package decisionStamenetsDemo;

public class LoopingDemo {

    public void testWhileDemo(){

        int number = 2;
        /*while(number < 11){
            System.out.println("printing ..." + number);
            number++;
        }*/


        do{
            System.out.println("printing ..." + number);
            number++;
        }while (number < 11);

    }

    /**
     * for Loop syntax:
     *
     *    for (initialisation; termination; increment){
     *     //statement
     *    }
     */

    public int testForStatement(){
        /*for(int number = 0; number < 11; number++){
            System.out.println("printing ..." + number);
        }*/

        int[] numbers = {1,2,3, 4, 5, 6, 7, 8};
        for(int number : numbers){
            if(number == 5){
                System.out.println("Give award!!");
                return 5;
            }

            //System.out.println(number);
        }
        return 0;
    }

    public void testContinue(String gender){
        for(int i = 0; i < 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i+ " ");
        }

        //String gender = "Female";

        if(gender.equalsIgnoreCase("Male")){
            System.out.println(gender);
        }else if(gender.equalsIgnoreCase("Female")){
            System.out.println(gender);
        }

    }
}
