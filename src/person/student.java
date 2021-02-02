package person;
import java.lang.Object;

/**
 * 学生类，继承人类共有属性
 * 特有属性school学校
 * SID学号
 */
public class student extends person {
    private String school;
    private String SID;

    /**
     * 此处用于设置学号
     * @param SID 学号参数
     */
    public void setID(String SID){
        if(SID==null||SID.length()==0||SID.length()>100){
            System.out.println("您输入的数据不符合规范，请检查过后在输入");
            return;
        }
        else{
            this.SID=SID;
        }

    }

    /**
     * 此处用于设置学校名称信息
     * @param school 学校名称参数
     */
    public void setSchool(String school){
        this.school=school;
    }

    /**
     * 此处用于返回学校信息
     * @return 返回学校的名称
     */
    public String getSchool(){
        return school;
    }

    /**
     * 此处用于返回学号
     * @return 返回学号SID
     */
    public String getSID(){
        return SID;
    }

    /**
     * 此处用于返回学生个人信息
     * @return 返回人类的共有属性信息加上学生类特有的信息
     */
    public String personMessage(){
        return name+":"+sex+":"+age+":"+birthplace+":"+school+":"+SID;
    }
    public static void main(String[] args){
        student xiongze=new student();
        xiongze.school="成都东软学院";
        xiongze.SID="123456";
        xiongze.name="xiongze1";
        xiongze.age=23;
        xiongze.sex="男";
        xiongze.birthplace="中国四川";
        System.out.println(xiongze.personMessage());
    }
}
