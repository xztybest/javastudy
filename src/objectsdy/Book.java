package objectsdy;

public class Book {
    private  String bookName;
    private  String kind;
    private  double price;
    private  String bookNumbers;
    //public  Book(){};
    public Book(String bookName,String kind,double price,String bookNumbers){
        super();
        this.bookName=bookName;
        this.kind=kind;
        this.price=price;
        this.bookNumbers=bookNumbers;
    }
    @Override
    public String toString(){
        return "书名："+bookName+",书的种类："+kind+",书的价格："+price+",书的编号："+bookNumbers;
    }

}
