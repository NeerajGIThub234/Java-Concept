// INTERFACE METHODS
// interface Interf {
//     void m1();
// }
// class child implements Interf{
//     //void m1(){}
//     public void m1(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         child c=new child();
//         c.m1();
//     }
// }

//INTERFACE VARIABLE 
// interface Interf {
//     int x=10;
// }
// class child implements Interf{
//     public static void main(String[] args) {
//         // x=100;
//         System.out.println(Interf.x);
//         System.out.println(child.x);
//         System.out.println(x);
//         int x=1000;
//         System.out.println(x);
//     }
// }
  
// METHOD NAMING CONFLICTS 
//case 1
// interface Interf {
//     void m1();
// }
// interface Interf1 {
//     void m1();
// }
// class Test implements Interf,Interf1{
//     public void m1(){
//         System.out.println("hello");
//     }
//     public static void main(String[] args) {
//         child c=new child();
//         c.m1();
//     }
// }

//case 2
// interface Interf {
//     void m1();
// }
// interface Interf1 {
//     void m1(int x);
// }
// class child implements Interf,Interf1{
//     public void m1(){
//         System.out.println("NEERAJ");
//     }
//     public void m1(int x){
//         System.out.println("BHATT");
//     }
//     public static void main(String[] args) {
//         child c=new child();
//         c.m1();
//         c.m1(10);
//     }
// }

//case3
// interface Interf {
//     Object m1();
// }
// interface Interf1 {
//     String m1();
// }
// class child implements Interf,Interf1{
//      public String m1(){
//          return "NEERAJ";
//     }
//     public static void main(String[] args) {
//         child c=new child();
//         System.out.println(c.m1());
//     }
// }

//VARIABLE NAMING CONFLICTS 
// interface Interf {
//     int x=10;
// }
// interface Interf1 {
//     int x=100;
// }
// class child implements Interf,Interf1{
//     public static void main(String[] args) {
//       // System.out.println(child.x);
//        System.out.println(Interf.x);
//        System.out.println(Interf1.x);
//     }
// }


// 1.8 VERSION INHANCEMENTS OF INTERFACE
// 1 DEFAULT METHOD
//  interface interf {
//       void m1();
//       default void m2()
//       {
//         System.out.println("default");
//       }
// }
// class Test implements interf{
//     public void m1(){
//         System.out.println("Test-m1");
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         t.m1();
//         t.m2();
//     }
// }

// 2 STATIC METHOD
// interface Interf{
//     static void sum(int a,int b)
//     {
//         System.out.println(a+b);
//     }
// }
// class Test implements Interf{
//     public static void main(String[] args) {
//         Interf.sum(10, 20);
//     }
// }
