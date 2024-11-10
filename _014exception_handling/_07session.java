//  1.7 VERSION ENHANCEMENTS W.R.T EXCEPTION HANDLING
//1 TRY WITH MULTI CATCH BLOCK

import java.io.FileReader;

class Test{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
// class Test1{
//     public static void main(String[] args) {
//         try {
//             System.out.println(10/0);
//         } catch (ArithmeticException |Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

// 2 try with multi resources
class Test2{
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("_07session.java");             
        FileReader fr1=new FileReader("_06session.java"))
        {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println(10/2);
        }
    }
}