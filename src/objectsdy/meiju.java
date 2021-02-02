package objectsdy;

public class meiju {
    public enum Company{
        EBAY,PAYPAL,GOOGLE,YAHOO,ATT,OTHER
    }
    Company cName;
    public meiju(Company cName){
        this.cName=cName;
    }
    public void companyDetails(){
        switch (cName){
            case EBAY:
                System.out.println("EBAY:Biggest Market place in the world");
                break;
            case PAYPAL:
                System.out.println("PAYPAL:Simple way to manage money");
                break;
            case GOOGLE:
                System.out.println("Google:a developed internet company");
                break;
            case YAHOO:
                System.out.println("Yahoo:1st web2.0 company");
                break;
            case ATT:
                System.out.println("att:no associalated message now");
                break;
            default:
                System.out.println("please contact with the manager of the app");
                break;
        }
    }
    public static void main(String[] args){
        meiju t1=new meiju(Company.EBAY);
        t1.companyDetails();
        meiju t2=new meiju(Company.GOOGLE);
        t2.companyDetails();
        meiju t3=new meiju(Company.YAHOO);
        t3.companyDetails();
        meiju t4=new meiju(Company.PAYPAL);
        t4.companyDetails();
        meiju t5=new meiju(Company.ATT);
        t5.companyDetails();
        meiju t6=new meiju(Company.OTHER);
        t6.companyDetails();
    }



}
