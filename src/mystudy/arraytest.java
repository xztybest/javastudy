package mystudy;

public class arraytest {
    public void arrayteststart(){
        double[] myList={1,2,3,5,6,7,8,9,0};
        for(int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        double total=0;
        for(int i=0;i<myList.length;i++){
            total+=myList[i];
        }
        System.out.println("Total is "+total);

        double max=myList[0];
        for(int i=1;i<myList.length;i++){
            if(myList[i]>max) max=myList[i];
        }
        System.out.println("Max is "+max);
    }
}
