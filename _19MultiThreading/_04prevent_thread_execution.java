//                                    1 JOIN()
// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)  {
//         MyThread mt=new MyThread();
//         mt.start();
//         mt.join();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)throws InterruptedException
//       {
//         MyThread mt=new MyThread();
//         mt.start();
//         mt.join();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             try {
//                 System.out.println("neeraj");
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
            
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)throws InterruptedException
//       {
//         MyThread mt=new MyThread();
//         mt.start();
//         mt.join();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             try {
//                 System.out.println("neeraj");
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
            
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)throws InterruptedException
//       {
//         MyThread mt=new MyThread();
//         mt.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("main-1");
//         }
//         mt.join();
//         for(int i=0;i<=10;i++){
//             System.out.println("main-2");
//         }
//     }
//  }

// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             try {
//                 System.out.println("neeraj");
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
            
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)throws InterruptedException
//       {
//         MyThread mt=new MyThread();
//         mt.start();
//         // for(int i=0;i<=10;i++){
//         //     System.out.println("main-1");
//         // }
//         // mt.join(5000);
//         mt.join(5000,500);
//         for(int i=0;i<=10;i++){
//             System.out.println("main-2");
//         }
//     }
//  }

//                                       2 YIELD()
// class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("CHILD-THREAD");
//             Thread.yield();
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args)  {
//         MyThread mt=new MyThread();
//         mt.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("MAIN-THREAD");
//         }
//     }
//  }

//                                   3 SLEEP()
// class Test{
//     public static void main(String[] args)throws InterruptedException {
//                for(int i=0;i<=10;i++){
//                 System.out.println("image"+i);
//                 // Thread.sleep(2000);
//                 Thread.sleep(2000,200);
//                }   
//     }
// }

