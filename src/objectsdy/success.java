package objectsdy;
import java.io.*;
import java.text.MessageFormat;

public class success extends Objc implements intsf,Serializable{
    private String successname;
    private int age;

    public success(String successname,int age,String objname, String description, String name, String taste) {
        super(objname, description, name, taste);
        this.successname=successname;
        this.age=age;
    }
    public String getSuccesssMsg(){
        System.out.println("已调用");
        return "继承人姓名："+this.successname+",继承人年龄："+this.age;

    }
    @Override
    public void method1(){
        System.out.println("successmethod1");
    }

    @Override
    public void method2() {
        System.out.println("successmethod2");
    }

    @Override
    public void method3() {
        System.out.println("successmethod3");
    }

    public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {
        success xiongze=new success("xiongze",23,"人","用于描述继承人的相关信息","苹果","甘甜");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("tmp"));
        oos.writeObject(xiongze);
        oos.close();
        File file=new File("tmp");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        success newSuccess=(success)ois.readObject();
        System.out.println(newSuccess.getName()+":"+newSuccess.getTaste());
        ois.close();



    }
}
