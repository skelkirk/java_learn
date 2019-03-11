class BreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i <15 ; i++) {
            if (i==7) break;
            // выход  из цикла, если значеине i равно 7
            System.out.println("i равно " + i);
        }
        System.out.println("Цикл завершён");
    }
}
