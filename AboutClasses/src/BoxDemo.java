//программа, использующая класс Box

class Box {
    double width, height, depth;
}
//В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        //присвоить значение переменным экземпляра myBox
        myBox.width=10;
        myBox.height=15;
        myBox.depth=20;
        //рассчитать объём параллелепипида
        vol=myBox.width*myBox.height*myBox.depth;
        System.out.println("ОБъём равен "+vol);
    }
}