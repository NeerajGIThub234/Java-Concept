// EXCEPTION HIERARCHY
class Test{
    public static void main(String[] args) {
       System.out.println("start");
        try {
           System.out.println("start-try");
           System.out.println(10/0);
           //System.out.println(10/5);
           System.out.println("end-try");
        } catch (RuntimeException e) {
            System.out.println(10/2);
        }
      System.out.println("end");  
    }
}
// RUNTIME EXCEPTION IS PARENT OF AIRTHEMETICS EXCEPTION SO 
//ABOVE CODE IS VALID
// class Test{
//     public static void main(String[] args) {
//        System.out.println("start");
//         try {
//            System.out.println("start-try");
//            System.out.println(10/0);
//            //System.out.println(10/5);
//            System.out.println("end-try");
//         } catch (ClassCastException e) {
//             System.out.println(10/2);
//         }
//       System.out.println("end");  
//     }
// }

//above code is give exception bcz classcast and airthemetic
// exception have no relation










