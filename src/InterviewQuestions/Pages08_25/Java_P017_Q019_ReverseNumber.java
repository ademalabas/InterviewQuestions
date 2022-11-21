package InterviewQuestions.Pages08_25;

public class Java_P017_Q019_ReverseNumber {
    public static void main(String[] args) {

        //Reverse Number *** Ters Sayı

        int num=1234;
        int rev=0;

        while (num!=0){
            int n=num%10;//4-->3-->2-->1
            rev=rev*10+n;
            System.out.println(rev);//4-->43-->432-->4321
            num=num/10;
            System.out.println(num);//123-->12-->1-->0
        }
        System.out.println(rev);

        }


    }





