package InterviewQuestions.Pages08_25;

public class Java_P013_Q009_LargestNumber {
    public static void main(String[] args) {
// Question : largest and smallest number findings

         int x = 600;
         int y = 400;
         int z = 200;
         if (x>y && x>z){
             System.out.println("x is greatest");
         }else if (y>z){
             System.out.println("y is greatest");
         }else {
             System.out.println("z is greatest");
         }

         // 2nd way
        if (x>y){
            if (x>z) {
                System.out.println("x is greatest");
            }else {
                System.out.println("z is greatest");
            }
        }else {
            if (y>z) {
                System.out.println("y is greatest");
            }else {
                System.out.println("z is greatest");
            }
        }





    }
}
