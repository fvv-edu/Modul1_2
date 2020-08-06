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

    public boolean duplicate(Integer mas[]) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=0; i<mas.length; i++) {
           if (hs.add(mas[i]) == false) {
               return false;
           }
        }
        return  true;
    }
}

