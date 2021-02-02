package test2;

/**
 * 1.java的标识符
 * 字母，数字（不能在开头）。下划线，$，不能和关键字保留字重复
 * 2.常量
 * final String NAME="XIONGZE"
 * 3.八大基本数据类型
 * byte short int long float double Char boolean
 * 自动类型转换（boolean除外） 基本数据类型中
 * 4.数字表示范围小的数据类型可以自动转换成范围大的数据类型
 * 运算符
 * +，=，*，/，&,|,!,=,^
 * 5.注释
 * 单行注释双左斜杠
 * 多行注释，左斜杠星号开头，星号左斜杠结尾。
 * 文档注释：左斜杠双星号开头，星号左斜杠结尾。
 * 6.if
 *      if(布尔表达式）{
 *          执行语句
 *      }else if(布尔表达式){
 *          只有不满足上一级判断才会执行，且只执行一次，执行过后就会跳出判断，不会继续下一步判断
 *      }
 *      else{
 *          不满足表达式的执行语句
 *      }
 * 7.switch
 *      switch(捕获参数){
 *          case 1:
 *              执行语句
 *              break;
 *          case 2:
 *              执行语句
 *              break;
 *          只有捕获的参数和case语句相同才会执行响应的块，只能做等值判断，没有break语句
 *          就会向下继续执行其它的case
 *          default：
 *              所有case都不匹配的默认执行选项
 *      }
 *8.循环
 *  while(布尔表达式){
 *      执行的语句
 *  }
 *  例如：
 *  int a=0;
 *  while(a++<1000){
 *      System.out.println("helloworld")
 *  }
 * do-while
 * do{
 *     先执行一次，也就是至少要执行一次循环
 * }while(布尔表达式)
 *
 * for(表达式1;表达式2;表达式3){
 *     执行语句
 * }
 */

public class arreview {
    public static void main(String[] args){
        String t1="hello world";
        String t2="hello wrold2";
        char ax='A';
        int b=ax;
        System.out.println(b);

        if(t1.equals(t2)){
            /**
             * 此处用于判断字符串是否相同
             */

        }
        else{
            System.out.println("不是同一个字符串");
        }
        int i=0;
        while(i<10){
            System.out.println(i++);
        }
    }

}
