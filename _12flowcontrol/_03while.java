/*_03while-
if we don't know no. of iteration in advance then it is
recommended to use while loop 
in this condition must be boolean*/  
   class Test
   {
    public static void main(String[] args) {
        int a=10;
        while (a>5) {
            System.out.println("hello");
            a--;
        }
    }
   } 

// unreacability problem
// class Test1
// {
//     public static void main(String[] args) {
//         while(true)
//         {
//             System.out.println("hiii");
//         }
//         System.out.println("end"); // unreachable 
//     }
// }
// class Test1
// {
//     public static void main(String[] args) {
//         while(false)
//         {
//             System.out.println("hiii"); // unreachable
//         }
//         System.out.println("end"); 
//     }
// }
class Test1
{
    public static void main(String[] args) {
        boolean b=false;
        while(b) // not error bcz complier not work here on b 
        {
            System.out.println("hiii");
        }
        System.out.println("end"); // unreachable 
    }
}

// {} is optional in while without {} we can write single 
// statement inside while and that statement should not be declarative
class Test2
{
    public static void main(String[] args) {
        int a=10;
        while (9>a) 
            System.out.println("hii");
        System.out.println("end");
    }
}