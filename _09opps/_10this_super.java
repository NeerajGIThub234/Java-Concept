/*_10this_super=
this=if we want to access current class instance property then we use this
super=if we want to access parent class instance property then we use super
note we can use this and super inside instance area otherwise we will get error */
class Parent
{
  int x=20;    
}
class Child extends Parent
{
    int x=30;
    public static void main(String[] args) {
        Child c=new Child();
        c.m1();
    }
    void m1()
    {
       // int x=100;
        int x=this.x+super.x;
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}
