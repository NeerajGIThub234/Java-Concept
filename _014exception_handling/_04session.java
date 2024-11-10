// TRY WITH MULTI CATCH BLOCK
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         } catch (ArithmeticException e) {
//             System.out.println("AE");
//         }
//         catch (Exception e){
//               System.out.println("EXCEPTION");
//         }
//       System.out.println("end");  
//     }
// }

// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         }catch (Exception e){
//               System.out.println("EXCEPTION");
//         }
//          catch (ArithmeticException e) {
//             System.out.println("AE");
//         }
        
//       System.out.println("end");  
//     }
// }
//  class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         } catch (ArithmeticException e) {
//             System.out.println("AE");
//         }
//         catch (ArithmeticException e) {
//             System.out.println("AE1");
//         }
//       System.out.println("end");  
//     }
// }

//FINALLY BLOCK
// CASE 1 no  exception 
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/2);
//            System.out.println("end-try");
//         } catch (ArithmeticException e) {
//             System.out.println("AE");
//         }
//         finally{
//             System.out.println("finally");
//         }
//       System.out.println("end");  
//     }
// }

// case 2 exception come and catch block matched
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         } catch (ArithmeticException e) {
//             System.out.println("AE");
//         }
//         finally{
//             System.out.println("finally");
//         }
//       System.out.println("end");  
//     }
// }

// case 3 exception come and catch block  not matched
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         } catch (ClassCastException e) {
//             System.out.println("AE");
//         }
//         finally{
//             System.out.println("finally");
//         }
//       System.out.println("end");  
//     }
// }

// control not comes inside try block
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         System.out.println(10/0);
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            System.out.println("end-try");
//         } catch (Exception e) {
//             System.out.println("AE");
//         }
//         finally{
//             System.out.println("finally");
//         }
//       System.out.println("end");  
//     }
// }

// stop finally block when control inside try block
 class Test{
    public static void main(String[] args) {
       System.out.println("start");
        try {
           System.out.println("start-try");
          System.exit(0);
           System.out.println(10/0);
           System.out.println("end-try");
        } catch (ArithmeticException e) {
            System.out.println("AE");
        }
        finally{
            System.out.println("finally");
        }
      System.out.println("end");  
    }
}