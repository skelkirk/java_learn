import java.util.*;
public class DateDemo {
    public static void main(String[] args){
        Date now=new Date();
        Date old=new Date(10L);
        System.out.println("Текущая дата и время: "+now);
        System.out.println("Еще одна дата: "+old);
    }
}
