class Box2 {
    double width, height, depth;
}


class BoxDemo2 {
    public static void main(String[] args) {
        Box2 myBox1=new Box2();
        Box2 myBox2=new Box2();
        double vol;
        //присвоить значение переменным экземпляра myBox1
        myBox1.width=10;
        myBox1.height=15;
        myBox1.depth=20;
        /*присвоить другие значение переменным
        экземпляра myBox2*/
        myBox2.width=1;
        myBox2.height=2;
        myBox2.depth=3;
        //рассчитать объём первого параллелепипида
        vol=myBox1.width*myBox1.height*myBox1.depth;
        System.out.println("ОБъём myBox1 равен "+vol);
        //рассчитать объём второго параллелепипида
        vol=myBox2.width*myBox2.height*myBox2.depth;
        System.out.println("ОБъём myBox2 равен "+vol);

    }
}
