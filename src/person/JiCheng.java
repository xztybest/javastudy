package person;

public class JiCheng extends student{
    public static void main(String[] args){
        student t1=new student();
        t1.name="t1";
        t1.age=100;
        t1.sex="男";
        t1.birthplace="中国四川";
        t1.setSchool("t1大学");
        t1.setID("t123456");
        System.out.println(t1.personMessage());
    }

}
