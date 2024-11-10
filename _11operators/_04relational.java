/*_04relational (<,>,<=,>=) =
1 it is use to show some relation between operands
2. we can apply relational operator on every premetive data type 
except boolean type
3. we can't perform nesting of relational operator
4. we can't apply relational operator on refernce variable*/
class Test
{
    int x;
  public static void main(String[] args) {
    System.out.println(10>20);
    System.out.println(20<30);
    System.out.println(10.5<=20);
    System.out.println('a'>=58);
     // System.out.println(true>false); // rule 2
   // System.out.println(true>10); // rule 2
   //  System.out.println(10>20>30); // rule 3
   Test t1=new Test();
   Test t2=new Test();
    //System.out.println(t1>t2); //rule 4
    System.out.println(t1.x>t2.x); // in this x got default value for both t1 and t2 is 0
  }    
}
