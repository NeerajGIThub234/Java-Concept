/*                                             DAEMON THREAD                                                                    */
// class MyThread extends Thread{
    
// }
// class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         Thread t=Thread.currentThread();
//         System.out.println(mt.isDaemon());
//         System.out.println(t.isDaemon());
//         // mt.start();
//         mt.setDaemon(true);
//         System.out.println(mt.isDaemon());
//         t.setDaemon(true);
//         System.out.println(t.isDaemon());
//     }
// }

// class MyThread extends Thread{
//     public void run(){
//         try {
//             for (int i=0;i<=10;i++) {
//                 System.out.println("daemon-thread");
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
        
//         }
//     }
// }
// class Test{
//     public static void main(String[] args) throws InterruptedException{
//         MyThread mt=new MyThread();
//         // mt.setDaemon(true);
//         mt.start();
//         for(int i=0;i<=5;i++){
//             System.out.println("main-thread");
//             Thread.sleep(1000);
//         }
//     }
// }

