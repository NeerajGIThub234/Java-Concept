// metod overloading-2 or more metod having same name but differnt argument type
class animal{

}
class cat extends animal
{

}
class test
{
    void m1(animal a)
    {
        System.out.println("animal");
    }
    void m2(cat a)
    {
        System.out.println("cat");
    }
    public static void main(String[] args) {
        animal a1=new animal();
        test t=new test();
        t.m1(a1);
        cat c1=new cat();
        t.m2(c1);
        animal a2=new cat();
        t.m1(a2);
    }
}