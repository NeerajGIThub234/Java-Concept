/*  _08typecasting =
two types- 
1. Implicit typecasting-
if we are trying to assign  smaller data type value in the bigger data type then
 implicit typecasting will perform 
 compiler will responsible to perform this
 no chance of loss of information
 known as  upcasting or widening
 byte->short->int->long->float->double
 char->int
 
2. explicit typecasting-
if we are trying to assign  bigger data type value in the smaller data type then
 implicit typecasting will perform 
 programmer will responsible to perform this
chance of loss of information
 known as  downcasting or narrowing
 byte<-short<-int<-long<-float<-double
 char<-int*/
 class Imp
 {
    public static void main(String[] args) {
        byte b=14;
        int x=b; // ipmlicit typecasting
        System.out.println(x);
    }
}
class Exp 
{
    public static void main(String[] args) {
        int b=238;
        byte x=(byte)(b);
        short s=(short)(b);
        char c=(char)(b);
        System.out.println(x);
        System.out.println(s);
        System.out.println(c);
    }
}