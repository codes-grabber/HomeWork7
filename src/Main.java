public class Main {
    public static void main(String[] args) {
//       Cat firstCat = new Cat ("Васька", "Белый");
//       Cat secondCat = new Cat ("Васька", "Белый");
//
//        System.out.println(firstCat.equals(secondCat)); // сравниваем два обьекта

        String s1 = "";

        long startTime = System.nanoTime();
        for (int i = 0; i < 50000; i++) {
            s1 += "a";
        }
        long endTime = System.nanoTime();

        float result = (endTime - startTime) * 0.000000001f;
        System.out.println(result);
    }
}
