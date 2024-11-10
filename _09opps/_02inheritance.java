//2.multilevel inheritance-1 parent class 1 child class and 
//multiple intermidate base class
class A
{
    int a=10;
    }
class B extends A
{
    int b=20;
    }
class C extends B
{
    int c=30;
}
class D extends C
{
    int d=40;
    public static void main(String[] args) {
        D d1=new D();
        System.out.println(d1.c);
        System.out.println(d1.d);
        System.out.println(d1.a);
        System.out.println(d1.b);
    }
}
// 3.Hierarchical inheritance- 1parent class and multiple child class
class E extends A
{
  int e=50;
  public static void main(String[] args) {
     E e1=new E();
    System.out.println(e1.a);
    System.out.println(e1.e);
  }
}
// 4 Hybrid inheritance-combination of any single multilevel hierarc hical inheritance
class F extends B
{
    int f=60;
    public static void main(String[] args) {
        F f1=new F();
        System.out.println(f1.a);
        System.out.println(f1.b);
        System.out.println(f1.f);
    } {
        
    }
}
// 5 MULTIPLE inheritance-1child class and multiple parent class
// note:- java don't support for multiple inher.
// class G  extends A,B
// {

// }
// 6 cyclic inher.- java don't support cyclic inher.
// class H extends I
// {

// }
// class I extends H
// {

// }