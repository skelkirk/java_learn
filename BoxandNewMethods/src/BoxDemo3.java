//в этой програме применяется метод, введённый в класс Box
class Box {
    double height,width,depth;
    //вывести объём параллелепипида
    void volume (){
        System.out.print("Объём равен ");
        System.out.println(width*height*depth);
    }
}
class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1=new Box();
        Box myBox2=new Box();
        //присвоим значения переменной экземпляра myBox1
        myBox1.width=15;
        myBox1.height=16;
        myBox1.depth=17;
        //присвоим значения переменной экземпляра myBox2
        myBox2.width=1;
        myBox2.height=2;
        myBox2.depth=3;
        //вывести объём первого параллелепипида
        myBox1.volume();
        //вывести объём второго параллелепипида
        myBox2.volume();
    }
}
