//                                                 SYNCHRONIZATION
// class Codeplanet
// {
//     synchronized void wish(String name){
//         for(int i=0;i<=10;i++){
//             System.out.print("GOOD MORNING: ");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
//             System.out.println(name);
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp, "shubham");
//         mt1.start();
//         mt2.start();
//     }
// }

///////////////////////////////////////////////////////////////////////////////////////////////////////
// class Codeplanet
// {
//     void wish(String name){
//         for(int i=0;i<=10;i++){
//             System.out.print("GOOD MORNING: ");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
//             System.out.println(name);
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp, "shubham");
//         mt1.start();
//         mt2.start();
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////
// class Codeplanet
// {
//     synchronized void wish(String name){
//         for(int i=0;i<=10;i++){
//             System.out.print("GOOD MORNING: ");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
//             System.out.println(name);
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         Codeplanet cp1=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp1, "shubham");
//         mt1.start();
//         mt2.start();
//     }
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////
// class Codeplanet
// {
//     synchronized void wish(String name){
//         for(int i=0;i<=10;i++){
//             System.out.print("GOOD MORNING: ");
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
                
//             }
//             System.out.println(name);
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         Codeplanet cp1=cp;
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp1, "shubham");
//         mt1.start();
//         mt2.start();
//     }
// }

//                               Synchronized block
// class Codeplanet
// {
//     void wish(String name){
//         for(int i=0;i<=5;i++)
//             System.out.println("welcome to kota");
//         synchronized(this){
//             for(int j=0;j<=10;j++){
//                    System.out.print("GOOD MORNING: ");
//                 try {
//                 Thread.sleep(1000);
//                 } 
//                 catch (InterruptedException e) {
                
//                 }
//                 System.out.println(name);
//             }
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp, "shubham");
//         Thread t=new Thread();
//         mt1.start();
//         mt2.start();
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// class Codeplanet
// {
//     void wish(String name){
//         for(int i=0;i<=5;i++)
//             System.out.println("welcome to kota");
//         Codeplanet cp1=new Codeplanet();
//         synchronized(cp1){
//             for(int j=0;j<=10;j++){
//                    System.out.print("GOOD MORNING: ");
//                 try {
//                 Thread.sleep(1000);
//                 } 
//                 catch (InterruptedException e) {
                
//                 }
//                 System.out.println(name);
//             }
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         cp.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp, "shubham");
//         Thread t=new Thread();
//         mt1.start();
//         mt2.start();
//     }
// }


//                                  STATIC SYNCHRONIZED METHOD
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// class Codeplanet
// {
//      static synchronized void wish(String name){
//         for(int i=0;i<=5;i++)
//             System.out.println("welcome to kota");
//             for(int j=0;j<=5;j++){
//                    System.out.print("GOOD MORNING: ");
//                 try {
//                 Thread.sleep(1000);
//                 } 
//                 catch (InterruptedException e) {
                
//                 }
//                 System.out.println(name);
//         }
//     }
// }
// class MyThread extends Thread{
//     String name;
//     Codeplanet cp;
//     MyThread(Codeplanet cp,String name)
//     {
//         this.name=name;
//         this.cp=cp;
//     }
//     public void run(){
//         Codeplanet.wish(name);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         Codeplanet cp=new Codeplanet();
//         MyThread mt1=new MyThread(cp, "neeraj");
//         MyThread mt2=new MyThread(cp, "shubham");
//         Thread t=new Thread();
//         mt1.start();
//         mt2.start();
//     }
// }