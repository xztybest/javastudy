package objectserialize;
import java.io.Serializable;
import java.util.Arrays;

/**
 * 需要序列化的类必须implements Serializable
 * 引入的相关的类，否则会序列化失败
 * 实在不知道引入什么可以直接import java.io.*
 */
public class user1 implements Serializable {
        private static final  long serialVersionUID=3604972003323896788L;
        private int age;
        private String name;
        private String sex;
        public int getAge(){
            return age;
        }
        public String getName(){
            return name;
        }
        public String getSex(){
            return sex;
        }
        public void setAge(int age){
            this.age=age;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setSex(String sex){
            this.sex=sex;
        }

}

