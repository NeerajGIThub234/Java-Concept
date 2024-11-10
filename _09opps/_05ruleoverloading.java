//rule 1-automatic promotion
//byte->short->int->long->float->double
//char->int
// rule 2- we can overload var arg method 
class test {
    void m1(float a)
    {
        System.out.println("float");
    }
    void m1(int... a)
    {
        System.out.println("var-arg");
    }
    void m1(int a,float b)
    {
        System.out.println("int-float");
    }
    void m1(float a,int b)
    {
        System.out.println("float-int");
    }
  public static void main(String[] args) {
        test t=new test();
        t.m1(10); //float automatic promotion
        t.m1(10,20f); //int-float
        t.m1(10f,10); //float-int
        t.m1(10,20,30);    //var-arg
        //t.m1(10,10); // ambigous error
        //t.m1(10f,10f); //no suitable method found error
    }
}
//rule 2- child get higher priority than parent
class test1
{
    void m2(String x)
    {
        System.out.println("string");
    }
    void m2(Object x)
    {
        System.out.println("object");
    }
    public static void main(String[] args) {
        test1 t1=new test1();
        t1.m2(new String());
        t1.m2(new Object());
        t1.m2(null);
    }
}