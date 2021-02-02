import java.util.*;

public class yanghui {
    public void yanghui(int number){
        int[][] yhs=new int [number][number];
        for(int i=0;i<yhs.length;i++)
        {

            for(int j=0;j<=i;j++)
            {
                if(i==j||j==0){
                    yhs[i][j]=1;
                }
                else{
                    yhs[i][j]=yhs[i-1][j-1]+yhs[i-1][j];
                }
            }
        }
        for(int i=0;i<yhs.length;i++){
            for(int k=0;k<(yhs.length-i);k++){
                System.out.print(" ");
            }
            for(int j=0;j<yhs[i].length;j++)
            {
                if(yhs[i][j]==0)
                {
                    continue;
                }
                else{

                    System.out.print(yhs[i][j]+" ");

                }

            }
            System.out.println();
        }
    }
    public void Mapt(){
        Map<String, String>map1=new HashMap<String ,String>();
        map1.put("test1","test1");
        map1.put("test2","test1");
        map1.put("test3","test1");
        map1.put("test4","test1");
        Set<String>keySet=map1.keySet();
        Iterator<String> it=keySet.iterator();
        while (it.hasNext()){
            String key= it.next();
            String value=map1.get(key);
            System.out.printf("%s=%s\n",key,value);
        }

    }
    public static void main(String[] args){

        yanghui yh=new yanghui();
        yh.Mapt();
        System.out.print("请输入杨辉三角矩阵边长：");
        Scanner RD=new Scanner(System.in);
        int numbers=RD.nextInt();
        yh.yanghui(numbers);
    }
}
