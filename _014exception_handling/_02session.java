//DEFAULT EXCEPTION HANDLING 
//     class Test{
//     public static void main(String[] args) {
//         System.out.println("start");
//         work();
//         System.out.println("end");
//     }
//     static void work()
//     {
//         moreWork();
//         System.out.println("WORK");
//     }
//     static void moreWork()
//     {
//         System.out.println("more-work-start");
//         System.out.println(10/0);
//         System.out.println("more-work-end");
//     }
// }

// CUSTOMIZED EXCEPTION HANDLING BY TRY-CATCH
//  class Test{
//     public static void main(String[] args) {
//         System.out.println("start");
//         work();
//         System.out.println("end");
//     }
//     static void work()
//     {
//         moreWork();
//         System.out.println("WORK");
//     }
//     static void moreWork()
//     {
//         System.out.println("more-work-start");
//         try {
//            // System.out.println(10/0);
//            System.out.println(10/5);
//         } catch (ArithmeticException e) {
//             System.out.println(10/2);
//         }
        
//         System.out.println("more-work-end");
//     }
// }

import javax.sql.rowset.spi.SyncResolver;

class Test{
    public static void main(String[] args) {
       System.out.println("start");
        try {
           System.out.println("start-try");
           System.out.println(10/0);
           //System.out.println(10/5);
           System.out.println("end-try");
        } catch (ArithmeticException e) {
            System.out.println(10/2);
        }
      System.out.println("end");  
    }
}





