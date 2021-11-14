import java.util.Scanner;

public class WordTest {
    String word;
    String userWord;
    static String pcWord;

    public WordTest(String[] pcWord) {
        int a = (int) (Math.random()*25);
        this.pcWord = pcWord[a];
        System.out.println(this.pcWord);
    }


    public boolean thingWord (String userWords){
        if (pcWord.equals(userWords)){
            System.out.println("Right!");
            return false;
        } else {
            int a = (int) (Math.random()*pcWord.length());
            System.out.println("Wrong! Буква " + pcWord.charAt(a) + " стоит на позиции " + (a + 1));
            return true;}
    }
}
