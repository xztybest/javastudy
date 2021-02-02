package person;

public class driver extends person {
    /**
     * 创建一个司机类，继承人类的共有属性
     * carNumber代表司机的特有属性，也就是司机的车牌号
     */
    private String carNumber;

    /**
     * 此函数用于返回设置好的信息
     * @return 返回司机的个人信息参数
     */
    public String personMessage(){
        return name+":"+sex+":"+age+":"+birthplace+":"+carNumber;
    }
    public static void main(String[] args){
        //首先实例化一个类
        driver xiongze=new driver();
        //给实例化的类设置参数
        xiongze.carNumber="123456";
        xiongze.name="xiongze3";
        xiongze.age=23;
        xiongze.sex="男";
        xiongze.birthplace="中国四川";
        //输出信息，看是否正确设置响应的个人信息
        System.out.println(xiongze.personMessage());
    }
}
