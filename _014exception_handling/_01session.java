//introduction-
// class Test
// {
//     public static void main(String[] args) {
//         System.out.println("start");
//         System.out.println(10/0);
//         System.out.println("end");
//     }
// }
// RUN TIME STACK MECHANISM
class Test{
    public static void main(String[] args) {
        System.out.println("start");
        work();
        System.out.println("end");
    }
    static void work()
    {
        moreWork();
        System.out.println("WORK");
    }
    static void moreWork()
    {
        System.out.println("more-work-start");
        System.out.println("more-work-end");
    }
}