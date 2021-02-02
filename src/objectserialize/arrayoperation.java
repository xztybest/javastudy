package objectserialize;
/**
 * 此文件用于对数组进行，插入，删除，排序操作
 */
import java.util.Arrays;
public class arrayoperation {
    /**
     *此函数用于整型数组插入操作
     * @param number 代表的是需要插入的整型元素
     * @param position 代表需要插入的位置
     * @param arrInsert 传入的数组
     * @return 返回int数组
     */
    static int[] addIntElement(int number,int position,int[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        int[] newArray=new int[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=number;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
               newArray[i]=arrInsert[i];
           }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     * 此函数用于长整型数组的元素插入
     * @param lnumber 插入的长整型数字
     * @param position 位置
     * @param arrInsert 操作的对象数组
     * @return 返回操作过后的数组
     */
    static long[] addLongElement(long lnumber,int position,long[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        long[] newArray=new long[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=lnumber;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     *此函数用于浮点数组的插入操作
     * @param fnumber 浮点数类型输入数据
     * @param position 插入的位置
     * @param arrInsert 操作的数组
     * @return
     */
    static float[] addFloatElement(float fnumber,int position,float[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        float[] newArray=new float[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=fnumber;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     *此函数用于double数组插入操作
     * @param dnumber 标识插入的浮点数
     * @param position 位置
     * @param arrInsert 操作数组对象
     * @return 返回double数组
     */
    static double[] addDoubleElement(double dnumber,int position,double[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        double[] newArray=new double[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=dnumber;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     * 此函数用于对char类型数组的插入操作
     * @param chr 输入的字符
     * @param position 位置
     * @param arrInsert 操作对象
     * @return 返回char类型数组
     */
    static char[] addCharElement(char chr,int position,char[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        char[] newArray=new char[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=chr;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     *此函数用户字符串数组的插入操作
     * @param str 插入的字符串
     * @param position 插入的位置
     * @param arrInsert 操作的对象数组
     * @return 返回字符串数组
     */
    static String[] addStringElement(String str,int position,String[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        String[] newArray=new String[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=str;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     * 此处用于short类型的数组插入操作
     * @param shrt short类型的数据
     * @param position 插入的位置
     * @param arrInsert 操作的对象数组
     * @return 返回short类型的数组
     */
    static short[] addShortElement(short shrt,int position,short[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        short[] newArray=new short[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=shrt;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }
    /**
     * 此处用于byte类型数组插入操作；请谨慎使用此功能，byte操作不当可能会导致数据损坏
     * @param bytd byte参数
     * @param position 插入的位置
     * @param arrInsert 操作的对象数组
     * @return 返回byte类型数组
     */
    static byte[] addByteElement(byte bytd,int position,byte[] arrInsert){
        if(position<=0){
            position=1;
        }
        if(position>=arrInsert.length){
            position=arrInsert.length;
        }
        byte[] newArray=new byte[arrInsert.length+1];
        for(int i=0;i<arrInsert.length;i++)
        {
            if(i==(position-1))
            {
                newArray[i]=bytd;
                newArray[i+1]=arrInsert[i];
            }
            if(i>position-1){
                newArray[i]=arrInsert[i-1];
            }
            if(i<position-1){
                newArray[i]=arrInsert[i];
            }
        }
        newArray[newArray.length-1]=arrInsert[arrInsert.length-1];
        return newArray;
    }

    /**
     * 此处用于删除整型数组中的元素
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static int[] deleteIntElement(int positon,int[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        int[] newArray=new int[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除long数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static long[] deleteLongElement(int positon,long[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        long[] newArray=new long[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除float数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static float[] deleteFloatElement(int positon,float[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        float[] newArray=new float[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除double数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static double[] deleteDoubleElement(int positon,double[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        double[] newArray=new double[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除char数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static char[] deleteCharElement(int positon,char[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        char[] newArray=new char[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除String数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static String[] deleteStringElement(int positon,String[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        String[] newArray=new String[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除short数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static short[] deleteShortElement(int positon,short[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        short[] newArray=new short[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
    /**
     * 此处用于删除byte[]数据类型的数组
     * @param positon 需要删除的位置
     * @param arrDelete 操作的数组对象
     * @return 返回删除后的数组
     */
    static byte[] deleteByteElement(int positon,byte[] arrDelete){
        if(positon<=0){
            positon=1;
        }
        if(positon>arrDelete.length)
        {
            positon=arrDelete.length;
        }
        byte[] newArray=new byte[arrDelete.length-1];
        for(int i=0;i<newArray.length;i++){
            if(i<positon-1){
                newArray[i]=arrDelete[i];
            }
            if(i>=positon-1){
                newArray[i]=arrDelete[i+1];
            }
        }
        return newArray;
    }
}
