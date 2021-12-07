import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        replaceArray();
        fillArray();
        multiplyArray();
        diagonalArray();
        minMaxValueArrays();
        checkBalance(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5});


    }

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void replaceArray() {

        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1};


        for (int i = 0; i < arr.length; i++) {
            //                 int rep = (arr[i] == 1) ?  0: arr[i] = 1;
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }


    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void fillArray() {
        int[] mas = new int[100];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;

        }
        System.out.print(Arrays.toString(mas));
        System.out.println();
    }

//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void multiplyArray() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
    }

//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void diagonalArray() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j || j == arr.length - 1 - i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

// 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int[] returnMas(int len, int initialValue) {
        int[] ints = new int[len];
        Arrays.fill(ints, initialValue);
        return ints;
    }

    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    public static void minMaxValueArrays() {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        int[] arr = {5, 3, 2, 8, 9, 6, 1, 0, 7, 4};

        for (int i = 0; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("Maximum value arrays: " + maxValue);
        System.out.println("Minimum value arrays: " + minValue);
    }

    //7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    // если в массиве есть место, в котором сумма левой и правой части массива равны.

    public static boolean checkBalance(int[] mas) {

        int sum = 0;
        int right = 0;
        int left = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        for (int i = 1; i < mas.length; i++) {
            left += mas[i - 1];
            right = sum -  left;
            if (left == right){
                return true;
            }
        }
        return false;
    }
}




