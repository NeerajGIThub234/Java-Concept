// string vs stringbuffer
//differnce 1
// class Test{
//     public static void main(String[] args) {
//         String s=new String("neeraj");
//         System.out.println(s);
//         String s1=s.concat("bhatt");
//         System.out.println(s);
//         System.out.println(s1);
//     }
// }

// class Test1{
//     public static void main(String[] args) {
//         StringBuffer s=new StringBuffer("neeraj");
//         System.out.println(s);
//         s.append("bhatt");
//         System.out.println(s);
//     }
// }

//differnce 2
// class Test{
//     public static void main(String[] args) {
//         String s1=new String("neeraj");
//         String s2=new String("neeraj");
//          System.out.println(s1==s2);
//          System.out.println(s1.equals(s2));
//     }
// }

// class Test1{
//     public static void main(String[] args) {
//         StringBuffer s1=new StringBuffer("neeraj");
//         StringBuffer s2=new StringBuffer("neeraj");
//          System.out.println(s1==s2);
//          System.out.println(s1.equals(s2));
//     }
// }