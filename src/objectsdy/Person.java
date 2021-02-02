package objectsdy;

public class Person implements intsf{
    private String name;
    private int sex;
    private int age;
    private String birthplace;
    public Person(String name,int sex,int age,String birthplace){
        super();
        this.name=name;
        if(sex!=1&&sex!=0)
        {
            this.sex=0;
        }
        else{
            this.sex=sex;
        }
        this.age=age;
        this.birthplace=birthplace;
    }
    @Override
    public String toString(){
        return "名字："+name+",性别："+sex+",年龄："+age+",出生地："+birthplace;
    }

    @Override
    public void method1() {
        System.out.println("personmethod2");
    }

    @Override
    public void method2() {
        System.out.println("personmethod2");
    }

    @Override
    public void method3() {
        System.out.println("personmethod2");
    }
    public static void main(String[] args){
        Person p=new Person("xiongtianyun",1,23,"中国四川");
        System.out.println(p.toString());
        p.method1();
        p.method2();
        p.method3();
    }
}
