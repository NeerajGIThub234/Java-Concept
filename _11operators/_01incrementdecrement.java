/*1 increment and decrement operator=
 * if we want to increase or decrease the value by 1 then we can use this.
 * two types
 * 1).pre increment & decrement- first value increase or decrease then store
 * 2). post increment & decrement- first value store then icrease or decrease
 */
class Test 
{
    public static void main(String[] args) {
        int x=10;
        int a=++x;
        int b=x++;
        int c=--x;
        int d=x--;
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
/* rule 
 * 1-we can't apply on constant value
 * 2-nesting of increment & decrement operator is not possible
 * 3-can not apply on final variable
 * 4- except boolean we can apply on all primitive data type 
 */
class Rule 
{
    public static void main(String[] args) {
       // int x=10++; // rule first 
        int x=10;
        double d=10.5;
        char c='c';
        boolean b=true;
      // int y=--(--x); // rule second
      // final int y=20; // rule 3 
         // System.out.println(--y);  // rule 3
         System.out.println(x++); // rule 4
         System.out.println(x); // rule 4
         System.err.println(d); // rule 4
         System.out.println(c); // rule 4
     //   System.out.println(--b); // rule 4
        System.out.println(++x);
    }
}
// internal typecasting will automatically performed in this
// x++ => x= (type of x)(x+1);
class Student
{
    public static void main(String[] args) {
        byte b=10;
        byte x;
        b++;
         // x=b+1; give error
         x=(byte)(b+1); // typecasting 
        System.out.println(b);
        System.out.println(x);
    }
}
class Neeraj
{
    public static void main(String[] args) {
        int x=10;
        int y;
        x=x++;
        x=x++;
        x=++x;
        y=x++;
        System.out.println(x);
        System.out.println(y);
    }
}