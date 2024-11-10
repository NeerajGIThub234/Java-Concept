/*_11instanceof=
if we know whether a particular reference variable is pointing 
to a particular object or not then we can use instance of operator

for using this there must be some relation between both operands
(either both same tyoe or one should parent type and one should 
child type) otherwise we will get error

new operator
used to create object*/
class Inst
{
  public static void main(String[] args) {
    Object o=new Inst();
    Inst i=new Inst();
    System.out.println(o instanceof Inst);
    System.out.println(o instanceof String);
   // System.out.println(i instanceof String);
     System.out.println(i instanceof Inst);
  }  
}
