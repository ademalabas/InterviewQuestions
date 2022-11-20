package InterviewQuestions.Pages08_25;


public class Java_P012_Q008_CheckAlphabetIsVowelorConsonant {
    public static void main(String[] args) {
//Question :Check Whether an Alphabet is Vowel or Consonant
//a e i o u
        char ch ='c';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+ "  is vowel");
        }else {
            System.out.println(ch+ " is consonant");
        }


         // Second Way
         switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':System.out.println(ch+ " is vowel");break;
             default:System.out.println(ch+ " is consonant");break;

         }





    }
}
