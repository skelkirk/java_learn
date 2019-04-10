//продемонстрировать применение аргументов переменной длины
class VarArgs {
    //метод с аргументами переменной длины (разное количество аргументом)
    static void vaTest (int ...v){
        System.out.print("Количество аргументов: "+v.length+" Содержимое: ");

        for (int x:v)
            System.out.print(x+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10); //1 аргумент
        vaTest(1,2,3);//три аргумента
        vaTest();//без аргументов
    }
}
