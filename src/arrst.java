import java.util.Scanner;
import java.util.Arrays;
public class arrst {
    public static void main(String[] args){

        System.out.println("一维字符串数组");
        String[] week= {"Monday","Tuesday","Winesday","Turesday","Friday","Saturday","Sunday"};
        System.out.println(week[6]);
        System.out.println("一维整型数组2");
        int[] array={1,2,3,4,5,6};
        System.out.println(array[1]);
       /* Scanner input=new Scanner(System.in);
        int array2[]=new int[6];
        for(int i=0;i<array2.length;i++){
            array2[i]=input.nextInt();
            System.out.println(array2[i]);
        }*/
        System.out.println("二维整型数组");
        int[][] t1= {{1,2,3},{4,5,6}};
        for(int a=0;a<t1.length;a++){
            for(int b=0;b<t1[a].length;b++){
                System.out.print(t1[a][b]+" ");
            }
            System.out.println();
        }
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum=0;
        System.out.println("遍历二维数组：");
        for (int i = 0; i < arr.length; i++) {    //第一层循环
            for (int j = 0; j < arr[i].length; j++) {    //第二层循环
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();

        }
        System.out.println("二位数组各项元素之和："+sum);
        int[] t2={9,4,1,3,2,0,5,8,7,6};
        Arrays.sort(t2);
        System.out.println("sort排序输出");
        for(int i=0;i<t2.length;i++)
        {
            System.out.print(t2[i]+" ");
        }
        System.out.println();
        int[] t3={9,4,1,3,2,0,5,8,7,6};
        for(int i=0;i<t3.length;i++){
            for(int j=i+1;j<t3.length;j++){
                if(t3[i]>t3[j]){
                    int k=t3[i];
                    t3[i]=t3[j];
                    t3[j]=k;
                }
            }
        }
        System.out.println("冒泡排序输出由小到大");
        for(int i=0;i<t3.length;i++){
            System.out.print(t3[i]+" ");
        }
        System.out.println();
        int[] t5={9,4,1,3,2,0,5,8,7,6};
        for(int i=0;i<t5.length;i++){
            for(int j=i+1;j<t3.length;j++){
                if(t5[i]>t5[j]){
                    continue;
                }
                else{
                    int k=t5[j];
                    t5[j]=t5[i];
                    t5[i]=k;
                }

            }
        }
        System.out.println("冒泡排序输出由大到小");
        for(int i=0;i<t5.length;i++){
            System.out.print(t5[i]+" ");
        }
        System.out.println();
        System.out.println("t5最小值:"+t5[t5.length-1]);
        System.out.println("t5最大值:"+t5[0]);
        System.out.println("数组复制");
        int[] t4=Arrays.copyOf(t3,t3.length);
        for(int i=0;i<t4.length;i++){
            System.out.print(t4[i]+" ");
        }

        int[] age={18,22,35,21,19,32,30,39,35};
        int sum1=0;
        for(int i=0;i<age.length;i++)
        {
            for(int j=i+1;j<age.length;j++){
                if(age[i]>=age[j]){
                    continue;
                }
                else{
                    int k=age[j];
                    age[j]=age[i];
                    age[i]=k;
                }
            }
        }
        System.out.println();
        System.out.print("员工最大年龄："+age[0]+","+"员工最小年龄："+age[age.length-1]);
        System.out.println();
        System.out.print("年龄序列：");
        for(int i=0;i<age.length;i++){
            System.out.print(age[i]+" ");
            sum1+=age[i];
        }
        System.out.println();
        System.out.println("员工的平均年龄："+sum1/age.length);
        int a=1;
        System.out.printf("a=%d",a);

}}
