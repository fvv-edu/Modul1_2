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
        System.out.println("Задание 2: " + indexMas[0] + ", " + indexMas[1]);
        return indexMas;
    }

    public void duplicate(int mas[]) {
        int counter = 0;
        int a = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    counter++;
                    a = mas[i];
                }
            }
        }
        if (counter > 0) {
            System.out.println("Result: " + true);
            System.out.println("Число " + a + " повторяется " + counter + " раза");
        } else {
            System.out.println("Result: " + false);
            System.out.println("Дубликатов нет");
        }
    }
}
