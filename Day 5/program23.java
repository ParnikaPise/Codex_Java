import java.util.Scanner;

class Alphabet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter= sc.next().charAt(0);
        Vowel v = new Vowel();
        v.vowels(letter);
    }
}

class Vowel{
    char ch;
   

    void vowels(char ch){
        if(ch=='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A'|| 
        ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }
    }
}
