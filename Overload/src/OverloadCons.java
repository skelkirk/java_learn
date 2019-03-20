/*В данном примере конструкторы определяются в классе Box для
инициализации размеров параллелепипида тремя разными способами*/
class Box {
    double width,height,depth;

    //конструктор, используемый при указании всех размеров
    Box(double w,double h,double d) {
        width=w;
        height=h;
        depth=d;
    }

    //конструктор, используемый, когда ни один из размеров не указан
    Box() {
        width=-1; //использовать для указания неинициализированного
        height=-1; //параллелепипида
        depth=-1;
    }

    //конструктор, используемый при создании куба
    Box (double len){
        width=height=depth=len;
    }

    //рассчитать и возвратить объём
    double volume (){
        return width*height*depth;
    }
}
class OverloadCons {
    public static void main(String[] args) {
        //создать параллелепипид, используя разные конструкторы
        Box myBox1=new Box(10,15,11);
        Box myBox2=new Box();
        Box myCube=new Box(2);

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
    }
}