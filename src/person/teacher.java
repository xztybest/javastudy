package person;

public class teacher extends person{
    private String grade;
    private String school;
    public String personMessage(){
        return name+":"+sex+":"+age+":"+birthplace+":"+school+":"+grade;
    }
    public static void main(String[] args){
        teacher xiongze=new teacher();
        xiongze.school="成都东软学院";
        xiongze.grade="大三12345班";
        xiongze.name="xiongze2";
        xiongze.age=23;
        xiongze.sex="男";
        xiongze.birthplace="中国四川";
        System.out.println(xiongze.personMessage());
    }
}
