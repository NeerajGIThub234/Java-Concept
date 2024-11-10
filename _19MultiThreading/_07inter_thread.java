//                                              INTER THREAD COMMUNICATION
// class Calcution{
//     int total;
// }
// class MyThread extends Thread{
//     Calcution c1;
//     MyThread(Calcution c1){
//         this.c1=c1;
//     }
//     public void run(){
//         for(int i=0;i<=100;i++){
//             c1.total=c1.total+i;
//         }
//         synchronized(c1){
//             c1.notify();
//         }
//     }
// }
// class MainThread {
//     public static void main(String[] args) throws InterruptedException {
//         Calcution c=new Calcution();
//         MyThread mt=new MyThread(c);
//         mt.start();
//         synchronized(c){
//             c.wait(1000);
//         }
//         System.out.println(c.total);
//     }
// }

/////////////////////////////////////////////////////////////////////////////////////////
// class Calcution{
//     int total;
// }
// class MyThread extends Thread{
//     Calcution c1;
//     MyThread(Calcution c1){
//         this.c1=c1;
//     }
//     public void run(){
//         for(int i=0;i<=100;i++){
//             c1.total=c1.total+i;
//         }
//     }
// }
// class MainThread {
//     public static void main(String[] args) throws InterruptedException {
//         Calcution c=new Calcution();
//         MyThread mt=new MyThread(c);
//         System.out.println(c.total);
//     }
// }

///////////////////////////////////////////////////////////////////////////////
// class Calcution{
//     int total;
// }
// class MyThread extends Thread{
//     Calcution c1;
//     MyThread(Calcution c1){
//         this.c1=c1;
//     }
//     public void run(){
//         for(int i=0;i<=100;i++){
//             c1.total=c1.total+i;
//         }
//         synchronized(c1){
//             c1.notify();
//         }
//     }
// }
// class MainThread {
//     public static void main(String[] args) throws InterruptedException {
//         Calcution c=new Calcution();
//         MyThread mt=new MyThread(c);
//         mt.start();
//         c.wait(1000);
//         System.out.println(c.total);
//     }
// }

///////////////////////////////////////////////////////////////////////////////
// class Calcution{
//     int total;
// }
// class MyThread extends Thread{
//     Calcution c1;
//     MyThread(Calcution c1){
//         this.c1=c1;
//     }
//     public void run(){
//         for(int i=0;i<=100;i++){
//             c1.total=c1.total+i;
//         }
//             c1.notify();
//     }
// }
// class MainThread {
//     public static void main(String[] args) throws InterruptedException {
//         Calcution c=new Calcution();
//         MyThread mt=new MyThread(c);
//         mt.start();
//         synchronized(c){
//             c.wait(1000);
//         }
//         System.out.println(c.total);
//     }
// }


//                                   DEADLOCK
// class Calcution{
//     int total;
// }
// class MyThread extends Thread{
//     Calcution c1;
//     MyThread(Calcution c1){
//         this.c1=c1;
//     }
//     public void run(){
//         for(int i=0;i<=100;i++){
//             c1.total=c1.total+i;
//         }
//     }
// }
// class MainThread {
//     public static void main(String[] args) throws InterruptedException {
//         Calcution c=new Calcution();
//         MyThread mt=new MyThread(c);
//         mt.start();
//         synchronized(c){
//             // c.wait();  // deadlock
//             // c.wait(1000); // no deadlock wait for 1 sec
//         }
//         System.out.println(c.total);
//     }
// }