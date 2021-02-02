public class personmessage {
    public String name;
    public int age;
    public int year;
    public int programe;
    public String position;
    public String interest;
    public void setMessage(String name,int age,int year,int programe,String position,String interest){
        this.age=age;
        this.name=name;
        this.year=year;
        this.programe=programe;
        this.position=position;
        this.interest=interest;
    }
   
    public static void main(String[] args){
        personmessage p1=new personmessage();
       /* p1.age=25;
        p1.name="小明";
        p1.programe=5;
        p1.position="java";
        p1.interest="篮球";
        p1.year=3;
        */
        p1.setMessage("xiongze", 23, 4, 5, "java", "music");
        System.out.println("这个同学的姓名是:"+p1.name);
        System.out.println("这个同学的年龄是:"+p1.age);
        System.out.println("这个同学工作了"+p1.year+"年");
        System.out.println("这个同学做了"+p1.programe+"个项目");
        System.out.println("这个同学的方向是:"+p1.position);
        System.out.println("这个同学的兴趣爱好是:"+p1.interest);
    }


    
}
