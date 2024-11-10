// this is also a example os single/simple inheritance(one parent one child)
class parent {
    void m1()
    {
        System.out.println("parent");
    }
}
class child extends parent
{
    void m2()
    {
        System.out.println("child");
    }
   // parent type refernce variable can be used to hold parent type
   // ref. variable and on this ref. variable we can only call parent 
   //class
 public static void main(String[] args) {
        parent p=new parent();
        p.m1();
       //p.m2(); // error
       // child type ref. var. can be used to hold child type object
       // and on this we can call both parent and child class properties
       child c=new child();
       c.m1();
       c.m2();
       // parent type ref. var. can be used to hold child type object
       // and on this ref. var. we can call only parent class properties
       parent p1= new child();
       p1.m1();
      // p1.m2(); // error
      // child type ref. var. can't hold parent type object
       // child c1=new parent(); // error
    }
}