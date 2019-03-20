//в этой версии классаа BoX один объект допускается инициализировать
//другим объектом
class BoX {
    double width,height,depth;

    //обратите внимание на этот конструктор. В качестве параметра
    //в нём используется объект типа BoX
    BoX (BoX ob) {  //передать объект конструктору
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    //конструктор, исопльзуемый при указании всех размеров
    BoX (double w,double h,double d) {
        width=w;
        height=h;
        depth=d;
    }
    //конструктор, используемый, если ни один из объектов не указан
    BoX () {
        width=-1;
        height=-1;
        depth=-1; //неинициализированный параллелепипид
    }

    //конструктор, используемый при создании куба
    BoX (double len) {
        width=height=depth=len;
    }
    //рассчитать и возвратить объём
    double volume () {
        return depth*height*depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        //создать параллелепипиды , используя разные конструкторы
        BoX myBox1=new BoX(10,15,11);
        BoX myBox2=new BoX();
        BoX myCube=new BoX(2);

        BoX myclone=new BoX(myBox1);
        //создать копию объекта myBox1
        double vol;

        //получить объём первого параллелепипида
        vol=myBox1.volume();
        System.out.println("Объём myBox1 равен "+vol);

        //получить объём второго параллелепипида
        vol=myBox2.volume();
        System.out.println("Объём myBox2 равен "+vol);

        //получить объём куба
        vol=myCube.volume();
        System.out.println("Объём myCube равен "+vol);

        //получить объём клона
        vol=myclone.volume();
        System.out.println("Объём клона равен "+vol+"А значение переменной а равно "+myclone.height);
    }
}
