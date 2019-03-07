//проверить на простые числа, правильная программа
 class FindPrime {
    public static void main(String[] args) {
    int  num=-8;
    if (num>0 & num!=1 & (num==2 | num==3) || num%2!=0 & num%3!=0) {
        System.out.println(num + " - простое число");
    } else {
        System.out.println(num+" - не простое число");
    }
    }
}