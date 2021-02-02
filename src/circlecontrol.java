import java.util.Scanner;
public class circlecontrol {
    public float averagegrade() {
        Scanner RD = new Scanner(System.in);
        System.out.println("请输入第一门课的成绩：");
        int g1 = Integer.parseInt(RD.nextLine());
        System.out.println("请输入第二门课的成绩：");
        int g2 = Integer.parseInt(RD.nextLine());
        System.out.println("请输入第三门课的成绩：");
        int g3 = Integer.parseInt(RD.nextLine());
        System.out.println("请输入第四门课的成绩：");
        int g4 = Integer.parseInt(RD.nextLine());
        System.out.println("请输入第五门课的成绩：");
        int g5 = Integer.parseInt(RD.nextLine());
        float aver = (g1 + g2 + g3 + g4 + g5) / 5;
        return aver;
    }

    public static void main(String[] args) {
        /*
         * System.out.println("乘法口诀表输出"); int i=1; int sum; while(i<=9){ int j=1;
         * while(j<=i){ sum=i*j; System.out.print(j+"*"+i+"="+sum+"  "); j++; } i++;
         * System.out.println(); } int sum1=0;
         * 
         * for( int i=1 ;i<=100;i++){ if(i%2==0) { continue; } else{ sum1=sum1+i; }
         * //System.out.println("step"); } System.out.println(sum1); int day=5; int
         * tmp=30; int status=1; if(day==6 || day==7) { if(tmp>=30) {
         * System.out.println("去游泳"); } else{ System.out.println("去爬山"); } } else{
         * if(status==1){ System.out.println("去客户单位谈业务"); } else{
         * System.out.println("在公司上网查资料"); } }
         */
        circlecontrol t1 = new circlecontrol();
        while (true) {
            float agrd = t1.averagegrade();
            System.out.println(agrd);
            System.out.print("是否继续测试Y/N");
            Scanner rd = new Scanner(System.in);
            String choice = rd.nextLine();
            System.out.println(choice);
            if (choice.equals("Y") || choice.equals("y")) {
               /* float agrd2 = t1.averagegrade();
                System.out.println(agrd2);*/
                continue;
            } else {
                System.out.println("测试结束");
                break;
            }

        }

    }
}
