//  THROW KEYWORD
// class Test{
//     public static void main(String[] args) {
//         System.out.println(10/0); // main create AE object and 
//                                   //handover this object to jvm
//     }
// }
//  class Test{
//     public static void main(String[] args) {
//         throw new ArithmeticException(" / by zero");
//     }
//  }

// TYPES OF EXCEPTION
// 1 PREDEFINED OR BUILT IN EXCEPTION
// 2 USER DEFINED OR CUSTOMIZED EXCEPTION

import javax.lang.model.util.ElementScanner14;

class TooYoungException extends RuntimeException
{
    TooYoungException(String msg){
        super (msg);
    }
}
class TooOldException extends RuntimeException
{
    TooOldException(String msg){
        super (msg);
    }
}
class Test{
    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
        if(age<19){
            throw new TooYoungException("don't ruin your life this much early");
        }
        else if(age>40){
            throw new  TooOldException("plz wait some more time god will meet you soon");
        }
        else{
            System.out.println("we will find best match soon");
        }
    System.out.println("thank you for using our website");    
    }
}

// METHOD TO PRINT EXCEPTION INFORMATION  ON THE CONSOLE
class Test1{
    public static void main(String[] args) {
       System.out.println("start");
        try {
           System.out.println("start-try");
           System.out.println(10/0);
           System.out.println("end-try");
        } catch (ArithmeticException  ae) {
            ae.printStackTrace();
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
        }
      System.out.println("end");  
    }
}

    class Test2{
    public static void main(String[] args) {
        System.out.println("start");
        work();
        System.out.println("end");
    }
    static void work()
    {
        System.out.println("work-start");
        try {
            moreWork();
        } catch (Exception e) {
            System.out.println("neeraj");
        }
        
        System.out.println("WORK-end");
    }
    static void moreWork()
    {
        System.out.println("more-work-start");
        System.out.println(10/0);
        System.out.println("more-work-end");
    }
}
