// strictfp 
//  class Test{
//     public static void main(String[] args) {
//         System.out.println(10/3.3);
//     }
// }

//static 
// class Student{
//     int rollno;
//     String name;
//     static String clgname="RTU";
//     Student(int rollno,String name){
//         this.rollno=rollno;
//         this.name=name;
//     }
//     void info(){
//         System.out.println("my name is "+name+" and rollno is "+rollno);
//     }
//     static void cinfo(){
//         System.out.println("my clg name is "+clgname);
//     }
//     public static void main(String[] args) {
//         Student s=new Student(379,"neeraj");
//         s.info();
//         Student.cinfo();
//     }
// }

//abstract
// abstract class Vehicle{
//     abstract void noOfWheels();
//     abstract void maxSpeed();
// }
// class Auto extends Vehicle{
//     void noOfWheels(){
//         System.out.println(3);
//     }
//     void maxSpeed(){
//         System.out.println(60);
//     }
//     public static void main(String[] args) {
//         // Vehicle v=new Vehicle();
//         // v.maxSpeed();
//         Auto a=new Auto();
//         a.maxSpeed();
//         a.noOfWheels();
//         Vehicle v=new Auto();
//         v.maxSpeed();
//         v.noOfWheels();
//     }
// }

// abstract class Fruit{
//    abstract  void taste();
//     void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
// }
// class Mango extends Fruit{
//     void taste(){
//         System.out.println("sweet");
//     }
//     public static void main(String[] args) {
//         // Fruit f=new Fruit();
//         // f.generalinfo();
//         Mango f=new Mango();
//         f.generalinfo();
//         f.taste();
//     }
// }

//valid final abstract combination
// abstract class Fruit{
//    final void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
//     abstract  void taste();
// }

// invalid combination
// final class Fruit{
//    final void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
//     abstract  void taste();
// }

// abstract class Fruit{
//    final void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
//     abstract final  void taste();
// }

// abstract final  class Fruit{
//    final void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
//     abstract  void taste();
// }

//  final class Fruit{
//    final void generalinfo(){
//         System.out.println("fruit are good for health");
//     }
//     abstract  void taste();
// }

// abstract class Fruit{
//   abstract  void taste(){

// }
// }

// abstract class Fruit{
//     abstract  static  void taste();
// }