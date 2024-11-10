/* _09defaultconstructor=if we  are not defining any constructor 
inside a java class then compiler will automatically add 1 
constructor to that class is known as default constructor
properties of default constructor 
1. name of def. con. will be same as class name
2.it doesn't take any argument
3it contain 1 line code- super();
4.its modifier  is same as class modifier
so it only contain public or <default> bcz class do not have protected and
private modifier
this(),super()= this(),super() is used for con. to con. communication
this()-calling current class no arg con.
this(10)-calling current class int arg con.
super()- calling parent class no arg con.
super(10)- calling parent class int arg con. */

import javax.annotation.processing.SupportedSourceVersion;

class Parent
{
 Parent()
 {
    this(10);
    System.out.println("parent-no-arg");
 }    
 Parent(int x)
 {
    System.out.println("parent-int-arg");
 }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("child-no-arg");
    }
    Child(int x)
    {
        this();
        System.out.println("child-int-arg");
    }
    public static void main(String[] args) {
        Child c=new Child(10);
        //  Child c=new Child();
       // Parent p=new Parent();
      // Parent p=new Parent(10);
     // Parent  p=new Child(10);
    }
} 
/*note- this(),super() must be first statement inside constructor
 * and if we try to write at any other position then we get error
 * note-we can only use this(),super() inside constructor
 */
// class Parent1{
//     Parent1()
//     {
//         System.out.println("hello");
//         super();
//     }
// }
// class Parent1{
//     Parent1()
//     {
//         System.out.println("hello");
        
//     }
//     public static void main(String[] args) {
//         this();
//         Parent1 p1=new Parent1();
//     }
// }