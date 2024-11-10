 /*_12localvariable= local variable is declared inside methods,constructors,or blocks
 if we put the same name of variable inside constructor then it is work as local
 variable */

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

class Student   
{
   int rollno;
   int age;
   Student(int rollno,int age)
   {
    rollno=rollno;
    age=age;
   } 
   public static void main(String[] args) {
    Student s=new Student(1,20 );
    System.out.println(s.rollno); //output is 0(bcz local vaiuable contain the value of 
    // con. 1 and 20)
    System.out.println(s.age); // output is 0
   }
}
/* if we use this in upper code
 * Student(int rollno,int age)
   {
    this.rollno=rollno;
    this.age=age;
   }
   then output is 1and 20 
   bcz now it store value for instance variable 
   it is happen bcz we use same name if we use rollno=rno
   (differnt name then also output is change)same for age
   (output in this condition is 1 ,20)
 */