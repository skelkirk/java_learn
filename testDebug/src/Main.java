import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        int[][] myDoubleArray = new int[7][7];

        // Принимает незаполненный двойной массив, заполняет нулями и выводит по диагонали единички*/
        diagonalArray(myDoubleArray);

        /**задать и вывести рандомными числами от 0 до range */
        getMyAray(myArray, 16);

        /**вычисление минимального и максимального значения */
        minAndMax(myArray);

        // метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 10]) → true */
        checkBalance(myArray);

/** метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций*/
        shiftArray(myArray, 1);


    }

    public static void getMyAray(int[] myArray, int range) {

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * range);
        }

        System.out.println("random array: " + Arrays.toString(myArray)+'\n');

    }

    public static void minAndMax(int[] myArray) {
        int minArray = myArray[0];
        int maxArray = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minArray) minArray = myArray[i];
            if (myArray[i] > maxArray) maxArray = myArray[i];

        }
        System.out.println("min = " + minArray + " and max =" + maxArray+'\n');
    }


    public static void checkBalance(int[] myArray) {
        int sumLeft = 0, sumRight = 0;
        int sumLeftOver = 0, sumRightOver = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (i < myArray.length / 2) {
                sumLeft += myArray[i];
                continue;
            }
            sumRight += myArray[i];

        }

        if (myArray.length % 2 != 0) {

            for (int i = 0; i < myArray.length; i++) {
                if (i < myArray.length / 2 + 1) {
                    sumLeftOver += myArray[i];
                    continue;
                }
                sumRightOver += myArray[i];

            }

            System.out.println("Числа в разных частях: " + (sumLeft == sumRight || sumLeftOver == sumRightOver)+'\n');
            return;
        }
        System.out.println("Числа в разных частях: " + (sumLeft == sumRight)+'\n');


    }

    public static void shiftArray(int[] myArray, int shift) {
        System.out.println("Сдвиг : "+shift);
        for (int i = 0; i < shift; i++) {


            int lastTemp = myArray[0];
            for (int j = 1, nowTemp; j < myArray.length; j++) {
                nowTemp = myArray[j];
                myArray[j] = lastTemp;
                lastTemp = nowTemp;
            }
            myArray[0] = lastTemp;
        }
        System.out.println(Arrays.toString(myArray));
    }

    public static void diagonalArray (int[][] myArray) {

        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (i==j) {
                    myArray[i][j] = 1;
                    continue;
                }
                myArray[i][j] = 0;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(Arrays.toString(myArray[i]));
        }
        System.out.println();
    }

}