package objectsdy;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;
import java.util.Objects;
public class Objc extends Fruit implements Serializable{
    private String objname;
    private String description;
    public Objc(String objname,String description,String name, String taste)
    {
        super(name, taste);
        this.objname=objname;
        this.description=description;
    }
    public String getObjMsg(){
        return "对象名称："+this.objname+",对象描述："+this.description;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Fruit f=new Fruit("西瓜","多水，甜的");
        f.getName();
        System.out.println(f.toString());
        Book b=new Book("红楼梦","国学经典",199.99,"123456");
        System.out.println(b.toString());
        Person p=new Person("xiongze",1,23,"中国四川广安");
        System.out.println(p.toString());
        Objc ob=new Objc("test","用于测试的类","冬瓜","无味");
        System.out.println(ob.toString());
        System.out.println(ob.getObjMsg());
    }
}
