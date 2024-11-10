// 1 public char charAt(int index)
// class Test{
//    public static void main(String[] args) {
//     String s=new String("neeraj");
//     System.out.println(s.charAt(4));
//     char ch=s.charAt(6);
//     System.out.println(ch);
//    } 
// }

// 2 public String concat(String s)
// class Test{
//    public static void main(String[] args) {
//     String s=new String("neeraj");
//     String s1=s.concat(" bhatt");
//     System.out.println(s);
//     System.out.println(s1);
//    } 
// }

// 3 public boolean equals(Object o)
// 4 public boolean equalsIgnoreCase(String s)
// class Test
// {
//     public static void main(String[] args) {
//         String s1=new String("neeraj");
//         String s2=new String("Neeraj");
//         String s3=new String("neeraj");
//         System.out.println(s1.equals(s2));
//         System.out.println(s1.equals(s3));
//         System.out.println(s1.equalsIgnoreCase(s2));
//         System.out.println(s1.equalsIgnoreCase(s3));
//     }
// }

//5 public String subString(int begin)
//6 public String subString(int begin,int end)
// class Test{
//     public static void main(String[] args) {
//         String s1=new String("shubham");
//         String s2=s1.substring(3);
//         String s3=s1.substring(0,3);
//         System.out.println(s1);
//         System.out.println(s2);
//         System.out.println(s3);
//     }
// }

//7 public int length()
// class Test{
//    public static void main(String[] args) {
//     String s=new String("neeraj");
//     System.out.println(s.length());
//    } 
// }

// 8 public String replace(char oldch,char newch)
// class Test{
//    public static void main(String[] args) {
//     String s=new String("neeraj");
//     String s1=s.replace('e', 'k');
//     System.out.println(s);
//     System.out.println(s1);
//    } 
// }

// 9 public String toLowerCase()
// 10 public String toUpperCase()
// class Test{
//     public static void main(String[] args) {
//         String s=new String("SHUbhAm");
//         String s1=s.toLowerCase();
//         String s2=s.toUpperCase();
//         System.out.println(s);
//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }

// 11 public String trim()
// class Test{
//     public static void main(String[] args) {
//         String s1=args[0].trim();
//         if (s1.equals("kota")) {
//              System.out.println("welcome to kota");
//         } else {
//             System.out.println("bhaad me jao");
//         }
//         String s=new String("      neeraj bhat   ");
//         String s2=s.trim();
//         System.out.println(s);
//         System.out.println(s2);
//     }
// }

// 12 public int indexOf(char ch)
// 13 public int lastIndexOf(char ch)
// class Test{
//     public static void main(String[] args) {
//         String s= new String("shubham");
//         System.out.println(s.indexOf('h'));
//         System.out.println(s.lastIndexOf('h'));
//         System.out.println(s.indexOf('c'));
//         System.out.println(s.lastIndexOf('c'));
//     }
// }`