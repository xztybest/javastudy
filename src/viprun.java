import java.util.Scanner;
public class viprun {
    public static void main(String[] args)
    {
        /*Scanner RD=new Scanner(System.in);
        System.out.println("请输入四位会员号");
        String vipnumber=RD.nextLine();
        int number=Integer.parseInt(vipnumber);
        
        int number=4567;
        int qw=number/1000;
        int bw=number/100-qw*10;
        int sw=number/10-qw*100-bw*10;
        int gw=number%10;
        System.out.println("千位:"+qw);
        System.out.println("百位:"+bw);
        System.out.println("十位:"+sw);
        System.out.println("个位:"+gw);
        System.out.println("千百十个位之和:"+(qw+bw+sw+gw));
        int a1=5>7?7:5;
        int a2=7>8?8:7;
        System.out.println(a1);
        System.out.println(a2);
        */
        int price=1000;
        if(price>=50){
            System.out.println("标兵");

        }
        else if(price>=40){
            System.out.println("出色");

        }
        else if(price>=30)
        {
            System.out.println("达标");

        }
        else if(price<30)
        {
            System.out.println("不达标");

        }

        String level="标兵";
        switch(level){
            case "标兵":
                System.out.println("一等奖");
                break;
            case "出色":
                System.out.println("二等奖");
                break;
            case "达标":
                System.out.println("三等奖");
                break;
            case "不达标":
                System.out.println("你被开出了");
                break;
            default:
                System.out.println("待定");
        }
        
        
    }
}

