package InterviewQuestions.Pages08_25;

public class Java_P011_Q006_SwapNumber {
    public static void main(String[] args) {
        // Swap numbers
        // 1st way
        int a= 20;
        int b= 10;
        int temp;
        System.out.println("before swap  value of a ;" +a);
        System.out.println("before swap  value of b ;" +b);
        temp = a;
        a =b;
        b = temp;
        System.out.println("After swap  value of a ;" +a);
        System.out.println("After swap  value of b ;" +b);

        // 2nd way without temp variable

        int x =50;
        int y = 30;
        System.out.println("before swap  value of x ;" +x);
        System.out.println("before swap  value of y ;" +y);
        x = x -y;
        y = y +x;
        x = y-x;
        System.out.println("After swap  value of x ;" +x);
        System.out.println("After swap  value of y ;" +y);




    }
}
