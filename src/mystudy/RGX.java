package mystudy;
import java.util.regex.*;
public class RGX {
    //带修饰符的变量
    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";
    //判断是否存在指定字符串
    public void example1(){
        String content="i am noob "+"from runoob.com";
        String pattern=".*runoob.*";
        boolean isMatch=Pattern.matches(pattern,content);
        if(isMatch){
            System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        }
    }
    //如何从一个给定的字符串中找到数字串
    public void example2() {
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);

        // 现在创建 matcher 对象
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }

    }
    //对单词cat出现在输入字符串中出现次数进行计数的例子
   public void example3(){
       Pattern p = Pattern.compile(REGEX);
       Matcher m = p.matcher(INPUT); // 获取 matcher 对象
       int count = 0;

       while(m.find()) {
           count++;
           System.out.println("Match number "+count);
           System.out.println("start(): "+m.start());
           System.out.println("end(): "+m.end());
       }
   }

}
