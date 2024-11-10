 /*_03stringconcatenation=
 if any operator is string type and we are applying + operator then it will 
 act as _stringconcatenation */ 
 class   Test
{
 public static void main(String[] args) {
    int a=10;
    int b=20;
    int c=30;
    String s="neeraj";
    System.out.println("10"+20);
    System.out.println("code"+"planet");
    System.out.println("neeraj"+"bhatt");
    System.out.println("neeraj"+10);
    System.out.println(a+s+c+b);
    System.out.println(a+b+s+c);
    System.out.println(s+a+c+b);
    System.out.println(a+b+c+s);
 }    
}
