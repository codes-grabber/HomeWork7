import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        new MyWindow();

        String[] words = {"apple",
                "orange",
                "lemon",
                "banana",
                "apricot",
                "avocado",
                "broccoli",
                "carrot",
                "cherry",
                "garlic",
                "grape",
                "melon",
                "leak",
                "kiwi",
                "mango",
                "mushroom",
                "nut",
                "olive",
                "pea",
                "peanut",
                "pear",
                "pepper",
                "pineapple",
                "pumpkin",
                "potato"};
        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
        System.out.println();
        WordTest firstWord = new WordTest(words);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        while(firstWord.thingWord(s)){
            s = scanner.nextLine();

        }

    }
}
