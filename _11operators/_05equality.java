 /* _05equality(==,!=)=
 if operands  are equal then == operator will return true,otherwise return false  
 if operands  are equal then != operator will return false,otherwise return true   
  -- we can apply equality operator on every premitive data type
  --we can apply equality operator on refernce variable
  if both refernce variables are pointing to the same object then == return true
   otherwise false
   is there is no relation between refernce variable(either one shuld parent and other
    should be child or same type) then we get error*/
class Test
{
    public static void main(String[] args) {
        System.out.println(10==20);
        System.out.println(20!=30.5);
        System.out.println(false==true);
        // System.out.println(10==false);
        Test t1=new Test();
        Test t2=new Test(); 
        Test t3=t1;
        String s=new String();
        System.out.println(t1==t2);
        System.out.println(t2==t3);
        System.out.println(t1==t3);
      //  System.out.println(t1!=s);
    }
}