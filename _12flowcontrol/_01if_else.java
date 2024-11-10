import javax.lang.model.util.ElementScanner14;

class Test
{

    public static void main(String[] args) {
       // if(1) // this is  give error because condition
       // use be in boolean
       int x=10;
       if(x==10) 
       // if(x=10) // then this line give error 
        {
            System.out.println("hi");
        }
        else{
            System.out.println("bye");
        }
    }
}

// {} is optional in if and else without {} we can write single 
// statement inside if and else and that statement should not be declarative
class Test1
{
    public static void main(String[] args) {
        boolean b=true;
        if(b==true)
        
            System.out.println("neeraj");
        else
            System.out.println("bhatt");
        if(b=false)
        {
            System.out.println("neeraj");
        }
        else{
            System.out.println("bhatt");
        }
        // if(b==false) //error
        //    int x=10;
    }
}
// we can't write else block without if block
// intermediate statements are not allowed in between if and else
class Test2
{
    public static void main(String[] args) {
        boolean b=false;
        // else 
        // {
        //     System.out.println("error");
        // }
        // if(b==false); // ; means if block end here 
        // System.out.println("error");
        // else{
        //     System.out.println("error");
        // }
    }
}