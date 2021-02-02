

import java.util.Scanner;

import test.p1;
public class fuzhi {
    final int maxAge=150;
    final int minAge=0;
    int age;
    public static void main(String[] args){
        fuzhi fz=new fuzhi();
        System.out.println("hello world");
        int a=1;
        System.out.println(a++);
        System.out.println(++a);
        int b=a;
        double c=(double)b+1.1;
        System.out.println(a+":"+b+":"+c);
        Scanner RD=new Scanner(System.in);
        /*System.out.println("请输入你的年龄");
        //Integer.parseInt(x)此处将输入的字符串转换为整型数字
        fz.age=Integer.parseInt(RD.nextLine());
        */
        System.out.println(fz.age);
        System.out.println(a&b);
        System.out.println(a<<1|b);
        test.p1 p1=new test.p1();
        test2.p1 p2=new test2.p1();
        p1.helloword();
        p2.helloword();



    }
}
