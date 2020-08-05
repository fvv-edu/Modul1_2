import java.util.Arrays;
import java.util.HashSet;

public class Exercise {

    public int[] indexSum(int[] mas, int inputNum) {
        int[] indexMas = new int[2];
        loop:
        {
            for (int i = 0; i < mas.length; i++) {

                for (int j = 0; j < mas.length; j++) {
                    if (j == i) continue;

                    int sum1 = (mas[i] + mas[j]);
                    if (sum1 == inputNum) {
                        indexMas[0] = i;
                        indexMas[1] = j;
                        break loop;
                    }
                }
            }
        }
        return indexMas;
    }

    public void duplicate(Integer mas[]) {

        HashSet<Integer> hs = new HashSet<Integer>();
        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (hs.contains(mas[i])) {
                counter++;
            }
            hs.add(mas[i]);
        }
        if (counter > 0) {
            System.out.println("Result: " + true);
        }else {
            System.out.println("Result: " + false);
        }

         /*int counter = 0;

        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    counter++;
                }
            }
        }
            if (counter > 0) {
                System.out.println("Result: " + true);
            } else {
                System.out.println("Result: " + false);
            }*/
    }
}
