/* _08constructor-  it is use to intialise the object
 (provide meaningful value to all the instance variable)*/

import java.lang.reflect.Method;

class Student {
    int rollno;
    String name; 
    Student(int rno,String nm)
    {
        rollno=rno;
        name=nm;
    }
    public static void main(String[] args) {
        Student s1=new Student(1,"neeraj");
        Student s2=new Student(2,"shubham");
        System.out.println(s1.rollno);
        System.out.println(s1.name);
        System.out.println(s2.rollno);
        System.out.println(s2.name);
    }
}
/*properties of constructor-
 * 1 constructor name sould be same as class name
 * 2 automatically called at the time of object creation
 * 3 return type concept not applicable for constructor if we add return type
 * then iot will become method
 * 4 4 modifierin java is applicable for constructor
 * 1 public 2 private 3 protected 4<default>
 */
class Student2{
    void Student2() //it is method bcz it have return type
    {
        System.out.println("method");
    }
    public static void main(String[] args) {
       Student2 s1=new Student2();
       s1.Student2();
    }
}
class Student3
{
    public Student3()// constructor bcs not have return type
    {
        System.out.println("constructor");
    }
    public static void main(String[] args) {
        Student3 s3=new Student3();
    }
}
// class Student4
// {
//     static Student4()// constructor bcz not have return type
//     {
//         System.out.println("constructor");
//     }
//     public static void main(String[] args) {
//         Student4 s4=new Student4();
//     }
// }





