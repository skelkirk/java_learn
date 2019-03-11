class BreakLoop2 {
    public static void main(String[] args) {
        int i=0;
        while (i < 100) { //выход из цикла, если значение переменной i равно 10
            if (i == 10) break;
            System.out.println("i равно " + i);
            i++;
        }
        System.out.println("Цикл завершён");
    }
}

