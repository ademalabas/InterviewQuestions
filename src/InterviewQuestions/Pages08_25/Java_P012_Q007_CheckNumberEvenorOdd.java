package InterviewQuestions.Pages08_25;

import java.util.Scanner;


public class Java_P012_Q007_CheckNumberEvenorOdd {
    public static void main(String[] args) {

// Questtion Even or odd number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Bir sayi giriniz  ;");
        int num = scanner.nextInt();
        if (num %2 ==0) {
            System.out.println("Girdiginiz sayi Cift = " + num);
        }else{
            System.out.println("Girdiginiz sayi tek  = " + num);
        }
    }
}
