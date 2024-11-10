/* _11overloading_constructor= overloading of constructor is possible(same class 
can contain multiple constructors with different argument)
constructor doesn't support for inheritance so overrding of constructor is also
not possible */
class Parent
{
  int y=20;
  Parent(int x)
  {
    System.out.println("Parent constructor");
  }    
}
class Child extends Parent
{
/*compiler add here= child(){super();} so it is search for parent class no arg if 
not found then give error*/
    public static void main(String[] args) {
        Child c=new Child();
        System.out.println(c.y);
    }
}
