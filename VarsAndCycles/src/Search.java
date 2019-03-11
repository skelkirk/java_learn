class Search {
    public static void main(String[] args) {
        int[] nums = {8, 2, 1, 6, 2, 5, 7, 21};
        int val = 55;
        boolean found = false;
        //использовать цикл в форме for each для поиска значения
        //переменной val
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("ЗНачение найдено!");
        } else {
        System.out.println("Значение не найдено!");
    }
        }
    }

