//_07ruleoverriding- 1rule=method signature(method name+method arguments) must be same
// rule 2= until 1.4v return tyoe must be same but in 1.5v we can use covarient return type
// covarient-parent class have parent type return type and child class child type return type
// rule 2 not applicable for premitive return type
class parent
{
 Object marry()
 {
 System.out.println("dipika");
 return "new Object()";
 }
}
class child  extends parent
{
   final String marry()
    {
        System.out.println("nikita");
        return "new string()";
    }
    public static void main(String[] args) {
        parent p=new child();
        p.marry();
    }
}
//rule3= child class not override final method of parent class
class parent1 
{
 Object marry()
 {
 System.out.println("dipika");
 return "new Object()";
 }
}
class child1 extends parent1
{
    String marry()
    {
        System.out.println("nikita");
        return "new string()";
    }
    public static void main(String[] args) {
        parent1 p=new child1();
        p.marry();
    }
}
// rule 4- we can't override parent class instance method with static child method inclass-compile time error
// we can't override parent class static method with intance method in child class- compile time error
//we can't override parent class static method with static  method in child class
// this is method hiding not overriding
class parent2 
{
 static void marry()
 {
 System.out.println("dipika");
 }
}
class child2 extends parent2
{
    static void  marry()
    {
        System.out.println("nikita");
    }
    public static void main(String[] args) {
        parent2 p=new child2();
        p.marry(); //output by compiler bcz it is method hiding op is dipika
    }
}
//rule 5= during overriding we can increase access privilege
// public>protected>default>private
class parent3
{
  void marry()
 {
 System.out.println("dipika");
 }
}
class child3 extends parent3
{
public void marry()
    {
        System.out.println("nikita");
    }
    public static void main(String[] args) {
        parent3 p=new child3();
        p.marry();
    }
}
// rule 6= we can override parent class var-arg method with var-arg method in child class
//if parent class method is var-arg and child class method is normal then it is
// overloading not overriding
class parent4
{
    void marks(int... x)
    {
        System.out.println("parent-var-arg");
    }
}
class child4 extends parent4
{
    void marks(int... y)
    {
        System.out.println("child-vararg");
    }
    public static void main(String[] args) {
        parent4 p4=new child4();
        p4.marks(10);
    }
}
// rule7- overriding is not applicable on variable ->it is overlopading
class parent5
{
    int x=10;
}
class child5 extends parent5
{
    int x=100;
    public static void main(String[] args) {
        parent5 p5=new child5();
        System.out.println(p5.x); //o/p is by compiler bcz it is overloading
    }
}
// rule8- we can't override private method



















