/**
 * @author 熊择
 */
import java.util.Map;
import java.util.Map.Entry;

/***
 * public class hello{

  public String name;
  public String age;
  int id;
  static void eat2() {
   System.out.println("I'm eat2");
   }
  public static void main(String[] args) {
	// write your code here
        System.out.println("hello world");
        String s="goodmorning";
        System.out.println(s);
        eat();
        eat2();
        int sum=sum(50);
        System.out.println(sum);
        hello xiongze=new hello();
        xiongze.name="xiongze";
        xiongze.age="23";
        System.out.println(xiongze.name);
        System.out.println(xiongze.age);
        System.out.println(xiongze.sum(50));
        test1();
        System.out.println((int)10.2);
        System.out.println(xiongze.id);
    }
    static void eat() {
        System.out.println("I'm eat");
    }
    static void test1(){
    double marchsale=30.62;
    double aprilsale;
    int rise=22;
    aprilsale=marchsale+rise;
    System.out.println(aprilsale);
    }
    private static int sum(int i) {
    if(i==1) {
    return 1;}
    return i+sum(i-1);
    }
  }

 */
public class Main {

    //常量定义，常量定义过后不能修改
    final int maxAge=150;
    final int minAge=0;
    int age;
    public void setAge(int age){
        if(age<minAge||age>maxAge)
        {
            this.age=0;
        }
        else
        {
            this.age=age;

        }
        
    }
    public static void main(String[] args) {
    Main XIONG=new Main();
    XIONG.setAge(23);
    System.out.println(XIONG.maxAge);
    System.out.println(XIONG.age);

    }
}
