//                                               1 PATTERN & MATCHER CLASS
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         Pattern p=Pattern.compile("neeraj");
//         Matcher m=p.matcher("abxneeraj09ioneeraj");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end());
//         }
//     }
// }

//                                      2 CHARACTER CLASS
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         Pattern p=Pattern.compile("[abc]");
//         // Matcher m=p.matcher("abxneeraj09ioneeraj");
//         Matcher m=p.matcher("abDcX@8#7");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end()+" "+m.group());
//         }
//     }
// }

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         // Pattern p=Pattern.compile("[0-9]");
//         // Pattern p=Pattern.compile("[a-zA-Z0-9]");
//         Pattern p=Pattern.compile("[^a-zA-Z0-9]");
//         Matcher m=p.matcher("abDcX@8#7");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end()+" "+m.group());
//         }
//     }
// }

//                                       3 PRE DEFIND CHARACTER 
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         // Pattern p=Pattern.compile("\W");
//         // Pattern p=Pattern.compile("\\W");
//         Pattern p=Pattern.compile("\\w");
//         Matcher m=p.matcher("abDcX@8#7");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end()+" "+m.group());
//         }
//     }
// }

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         // Pattern p=Pattern.compile("\\s");
//          Pattern p=Pattern.compile("\\S");
//         Matcher m=p.matcher("abD cX@ 8# 7");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end()+" "+m.group());
//         }
//     }
// }

//                                  4 QUANTIFIERS
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//         // Pattern p=Pattern.compile("d+");
//         // Pattern p=Pattern.compile("d");
//         // Pattern p=Pattern.compile("d?");
//         // Pattern p=Pattern.compile("d*");
//         // Pattern p=Pattern.compile("d{2}");
//         // Pattern p=Pattern.compile("d{2,3}");
//         Pattern p=Pattern.compile("[a-z]{4}");
//         Matcher m=p.matcher("avbcndddhfbdddbcjjddcjjkkddkdd");
//         while (m.find()==true) {
//             System.out.println(m.start()+" "+m.end()+" "+m.group());
//         }
//     }
// }


//                                    5 EXAMPLES
// program for mobile no
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;
// class Test{
//     public static void main(String[] args) {
//     Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
//     Matcher m=p.matcher(args[0]);
//     if (m.find()==true && m.group().equals(args[0])==true) 
//     //  if (m.find()==true)
//     {
//         System.out.println("valid mobile no. "+m.group());
//     } else {
//         System.out.println("invalid mobile no.");
//     }
//   }
// }