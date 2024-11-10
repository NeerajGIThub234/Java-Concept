/*_02arithmetic =
 *1 whenever we are applying airthmetic operator on operands then always result will 
 * come in the following type-
 *  max(int,type of first operand,type of 2nd operand )
 *2 if we are dividing any number with 0 and result will come in integral type(byte,
  short,int,long) then jvm will give exception
  3. if we are dividing any number with 0 and result will come in  floating point 
  (float,double) then jvm will give no exception
  4 we can apply air. oper. on premitive data type except boolean type
 */
class Student
{
    public static void main(String[] args) {
        System.out.println(10+2);
        System.out.println(10-2);
        System.out.println(10*3);
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(10.5-2);
        System.out.println(10.8/4);
     //   System.out.println(10/0);
        System.out.println(10/0.0);
        System.out.println(10.0/0);
        System.out.println('a'+10);
        System.out.println('a'+'b');
      //  System.out.println(true+1);
    }
}