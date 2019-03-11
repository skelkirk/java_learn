class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][][] nums = new int[3][5][4];
        //присвоить занчения элементам массива nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                for (int a = 0; a < 4; a++) {
                    nums[i][j][a] = (i + 1) * (j + 1) * (a + 1);
                    //использовать цикл for в стиле for each
                    //для вывода суммирования значений
                }
            }
        }
            for (int[][] x : nums) {
                for (int[] y : x) {
                    for (int o : y) {
                        System.out.println("Значение равно " + o);
                        sum += o;
                    }
                }
            }
            System.out.println("Сумма " + sum);
        }
    }


