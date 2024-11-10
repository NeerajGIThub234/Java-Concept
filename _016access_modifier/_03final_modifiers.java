// 5. final 
// class Test{
//     final void m1(){
//         System.out.println("final-m1");
//     }
// }
// class Test1 extends Test{
//     void m1(){
//         System.out.println("child-m1");
//     }
// }

//  final class Test{
//     void m1(){
//         System.out.println("final-m1");
//     }
// }
// class Test1 extends Test{
//     void m1(){
//         System.out.println("child-m1");
//     }
// }

//final instance variable
//providing value at the time of declaration
// class Test{
//     final int rollno=10; 
//     public static void main(String[] args) {
//         Test t=new Test();
//         System.out.println(t.rollno);
//     }
// }

//providing value inside instance block
// class Test{
//     final int rollno;
//     {
//         rollno=100;
//     }
//     public static void main(String[] args) {
//         Test t=new Test();
//         System.out.println(t.rollno);
//     }
// }

//providing value constructor
// class Test{
//     final int rollno;
//     Test(int rollno) {
//         this.rollno=rollno;
//     }
//     public static void main(String[] args) {
//         Test t=new Test(200);
//         System.out.println(t.rollno);
//     }
// }

//final static variable
//providing at the time of declration
// class Test{
//    static  final String clg_name="RTU";
//     public static void main(String[] args) {
//         System.out.println(clg_name);
//     }
// }

//providing value inside static block
// class Test{
//    static  final String clg_name;
//    static{
//     clg_name="rtu";
//    }

//     public static void main(String[] args) {
//         System.out.println(clg_name);
//     }
// }

//final local variable
// class Test{
//     public static void main(String[] args) {
//         final int x;
//         System.out.println("neeraj");
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         final int x;
//         System.out.println("neeraj");
//         System.out.println(x);
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         final int x;
//         System.out.println("neeraj");
//         x=10;
//         System.out.println(x);
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         final int x;
//         System.out.println("neeraj");
//         x=10;
//         x=20;
//         System.out.println(x);
//     }
// }