package interfacetest;
import person.student;
public class execute implements Animal{
    public static void main(String[] args){
        execute ex1=new execute();
        ex1.helloworld();
        ex1.goodmorning();
        System.out.println();
    }

    @Override
    public void helloworld() {
        System.out.println("hello world");

    }

    @Override
    public void goodmorning() {
        System.out.println("good morning");
    }
}
