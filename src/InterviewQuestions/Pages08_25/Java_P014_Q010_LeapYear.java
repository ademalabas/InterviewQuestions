package InterviewQuestions.Pages08_25;

public class Java_P014_Q010_LeapYear {
    public static void main(String[] args) {
        // Question : Find the leap year
        int year = 1904;
       boolean leapYear = false;
        if (year %4 ==0){
            if (year %100 ==0){
                if (year %400 ==0){
                    leapYear = true;
                }else {
                    leapYear = false;
                }
            }else {
                leapYear = true;
            }
        }else {
            leapYear = false;
        }
        if (leapYear){
            System.out.println( year + " is a Leap Year");
        }else {
            System.out.println(year +" is not a Leap Year");
        }
// 2nd Way
        System.out.println("*** 2nd way**");

        if (year%4 ==0 && year % 100 !=0 || year % 400 ==0 ){
            System.out.println( year + " is a Leap Year");
        }else {
            System.out.println(year +" is not a Leap Year");
        }


    }
}
