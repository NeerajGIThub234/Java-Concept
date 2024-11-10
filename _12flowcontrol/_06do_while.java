/*_06do_while 
 *if we want to execute loop first time and after that if we want
 *to execute it on the basis of condition then we can use do-while
 *loop

 {} is optional in do while loop without {} we can write single 
statement inside do while loop and that statement should not be declarative*/
    class Test {
        public static void main(String[] args) {
            int x=12;
            do {
                System.out.println("neeraj"); 
                x--; 
            } while (x>8);
        }
    }

    class Test1 {
        public static void main(String[] args) {
            int x=12;
            do {
                System.out.println("neeraj"); 
            } while (false);
            System.out.println("end");
        }
    }
    class Test2 {
        public static void main(String[] args) {
            int x=12;
            do 
                System.out.println("neeraj");  
             while (true); // infinite loop
        }
    }
    // class Test3 {
    //     public static void main(String[] args) {
    //         int x=12;
    //         do {
    //             System.out.println("neeraj"); 
    //         } while (true);
    //         System.out.println("end"); //unreachable
    //     }
    // }
    

