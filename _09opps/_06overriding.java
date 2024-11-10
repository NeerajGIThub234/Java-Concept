//_06overriding - if child class is not satisfied with parent class method we can redefine that method in child class



class parent
{
void property()
{
    System.out.println("cash+power");
}    
void marry()
{
    System.out.println("dipika");
}
}
class child extends parent
{
    void marry()
    {
     System.out.println("nikita");
    }
    public static void main(String[] args) {
        parent p=new parent();
        p.marry();
        p.property();
        child c=new child();
        c.marry();
        c.property();
        parent p1=new child();
        p1.marry();
        p1.property();
        
    }
}
