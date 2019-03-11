class ForEach2 {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        /*использовать цикл в виде for each для вывода и
        суммирования значений первых 5 элементов массива*/
        for (int x : nums) {
            System.out.println("This element has the value of " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("sum equals "+sum);
    }
}
