// THROWS KEYWORD
// case1 without throws kewword anywhere
// class Test{
//     public static void main(String[] args) {
//         neeraj();
//     }
//     static void neeraj()
//     {
//         bhatt();
//     }
//     static void bhatt()
//     {
//         System.out.println("neeraj");
//         Thread.sleep(1000);
//         System.out.println("bhatt");
//     }
// }

// case 2 not use throw at main, neeraj,bhatt 
// class Test{
//      public static void main(String[] args) {
//         neeraj();
//     }
//     static void neeraj() 
//     {
//         bhatt();
//     }
//     static void bhatt()
//     {
//     {
//         System.out.println("neeraj");
//         Thread.sleep(1000);
//         System.out.println("bhatt");
//      }
//  }
// }

// case 3 use throws keyword at all 3 place main, neeraj,bhatt
class Test{
    public static void main(String[] args) throws InterruptedException
    {
        neeraj();
    }
    static void neeraj() throws InterruptedException
    {
        bhatt();
    }
    static void bhatt() throws InterruptedException
    {
    {
        System.out.println("neeraj");
        Thread.sleep(1000);
        System.out.println("bhatt");
     }
 }
}