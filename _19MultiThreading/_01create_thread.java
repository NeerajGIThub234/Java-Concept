// 1 BY EXTENDING THREAD CLASS
//  class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// class MyThread extends Thread{
//     public void run(){
        
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.start();
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
//     public void start()
//     {
//         System.out.println("hello");
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.start();
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
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         for(int i=0;i<=10;i++){
//             System.out.println("nik");
//         }
//         mt.start();
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
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.run();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

//  class MyThread extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//     public void run(int x){
//         for(int i=0;i<=10;i++){
//             System.out.println("int");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// 2 BY IMPLEMENTING RUNNABLE INTERFACE
// class MyThread implements Runnable{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         mt.start();
//     }
//  }

// class MyThread implements Runnable{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         Thread t=new Thread();
//         t.start();
//     }
//  }

// class MyThread implements Runnable{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyThread mt=new MyThread();
//         Thread t=new Thread(mt);
//         t.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }

// class MyRunnable implements Runnable{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("neeraj");
//         }
//     }
//  }
//  class Test{
//     public static void main(String[] args) {
//         MyRunnable r=new MyRunnable();
//         Thread t=new Thread(r);
//         t.start();
//         for(int i=0;i<=10;i++){
//             System.out.println("bhatt");
//         }
//     }
//  }