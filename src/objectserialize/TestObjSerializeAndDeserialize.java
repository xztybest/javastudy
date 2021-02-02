package objectserialize;
//import objectsdy.Person;

import java.io.*;
import java.text.MessageFormat;

/**
 * 此类是序列化与反序列化的示例文档
 */

public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception {
        SerializePerson();
        user1 p=DeserializePerson();
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",p.getName(), p.getAge(), p.getSex()));
    }

    /**
     * 此处用于对对象的序列化操作
     * @throws FileNotFoundException 无法找到文件错误
     * @throws IOException io操作错误
     */
    private static void SerializePerson() throws FileNotFoundException,
            IOException{
        user1 person=new user1();
        person.setName("test1");
        person.setAge(23);
        person.setSex("男");
        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(
                new File("Person.txt")));
        oo.writeObject(person);
        System.out.println("person对象序列化成功");
        oo.close();
    }

    /**
     * 此处用于反序列化操作
     * @return 返回反序列化的对象
     * @throws Exception 异常情况处理模块
     * @throws IOException io异常处理模块
     */
    private static user1 DeserializePerson() throws Exception,
            IOException{
        ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File("Person.txt")) );
        user1 person=(user1)ois.readObject();
        System.out.println("Person 反序列化成功");
        return person;

    }
}
