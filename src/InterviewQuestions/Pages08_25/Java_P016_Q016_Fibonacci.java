package InterviewQuestions.Pages08_25;

public class Java_P016_Q016_Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 6 13
        int num =20;
        int t1 =0;
        int t2 =1;



        for (int i =1; i <=num; i++) {
            System.out.println(t1);
        int sum =t1+t2;
        t1=t2;
        t2=sum;

        }




    }
}
