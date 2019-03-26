//объекты передаются по ссылке на них
class TesT {
    int a,b;
    TesT (int i,int j) {
        a=i;
        b=j;
    }
    //передать объект
    void meth (TesT o){
        o.a*=2;
        o.b/=2;
    }
}
public class PassObjRe {
    public static void main(String[] args) {
        TesT ob=new TesT(15,20);
        System.out.println("ob.a и ob.b  до вызова: "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("ob.a и ob.b  после вызова: "+ob.a+" "+ob.b);

    }
}
