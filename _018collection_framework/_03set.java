// 1 HASHSET
// import java.util.HashSet;
// class Test
// {
//     public static void main(String[] args) {
//         HashSet h=new HashSet();
//         h.add(10);
//         h.add('b');
//         h.add(null);
//         h.add(10.5);
//         System.out.println(h.add('b'));
//         System.out.println(h);
//     }
// }

//1.2 LinkedHashSet
// import java.util.LinkedHashSet;
// class Test
// {
//     public static void main(String[] args) {
//         LinkedHashSet h=new LinkedHashSet();
//         h.add(10);
//         h.add('b');
//         h.add(null);
//         h.add(10.5);
//         System.out.println(h.add('b'));
//         System.out.println(h);
//     }
// }

// 2 SORTED SET
// Tree Set
// import java.util.TreeSet;
// class Test{
//     public static void main(String[] args) {
//         TreeSet t=new TreeSet();
//         t.add(10);
//         t.add(50);
//         t.add(30);
//         t.add(20);
//         System.out.println(t);
//         System.out.println(t.add(20));
//         //t.add("csd");
//         //t.add(null);
//         TreeSet t1=new TreeSet();
//         t1.add("neeraj");
//         t1.add("madan lal");
//         t1.add("rajeshwari");
//         t1.add("shubham");
//         System.out.println(t1);
//     }
// }

// COMPARABLE INTERFACE AND COMPARATOR INTERFACE
// import java.util.TreeSet;
// class Test{
//     public static void main(String[] args) {
//         System.out.println("A".compareTo("Z"));
//         System.out.println("Z".compareTo("A"));
//         System.out.println("A".compareTo("A"));
//     }
// }

// import java.util.TreeSet;
// import java.util.Comparator;
// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2){
//         Integer i1=(Integer)obj1;
//         Integer i2=(Integer)obj2;
//         if(i1>i2)
//            return -1;
//         else if(i1<i2)
//             return 1;
//         else 
//             return 0;
//     }
// }
// class Test{
//         public static void main(String[] args) {
//             MyComparator c=new MyComparator();
//             TreeSet t=new TreeSet(c);
//             t.add(10);
//             t.add(50);
//             t.add(30);
//             t.add(20);
//             System.out.println(t);
//         }
// }

// import java.util.TreeSet;
// import java.util.Comparator;
// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2){
//         Integer i1=(Integer)obj1;
//         Integer i2=(Integer)obj2;
//         // return i1.compareTo(i2);
//         // return i2.compareTo(i1);
//         // return -i2.compareTo(i1);
//         // return 1;
//         // return -1;
//         return 0;
//     }
// }
// class Test{
//         public static void main(String[] args) {
//             MyComparator c=new MyComparator();
//             TreeSet t=new TreeSet(c);
//             t.add(10);
//             t.add(50);
//             t.add(30);
//             t.add(20);
//             System.out.println(t);
//         }
// }

// import java.util.TreeSet;
// import java.util.Comparator;
// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2){
//         String s1=(String)obj1;
//         String s2=(String)obj2;
//         // return s1.compareTo(s2);
//         return -s1.compareTo(s2);
//     }
// }
// class Test{
//         public static void main(String[] args) {
//             MyComparator c=new MyComparator();
//             TreeSet t=new TreeSet(c);
//             t.add("neeraj");
//             t.add("nikita");
//             t.add("nisha");
//             t.add("ankit");
//             System.out.println(t);
//         }
// }

// import java.util.TreeSet;
// import java.util.Comparator;
// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2){
//         String s1=obj1.toString();
//         String s2=obj2.toString();
//         // return s1.compareTo(s2);
//         return -s1.compareTo(s2);
//     }
// }
// class Test{
//         public static void main(String[] args) {
//             MyComparator c=new MyComparator();
//             TreeSet t=new TreeSet(c);
//             t.add(new StringBuffer("neeraj"));
//             t.add(new StringBuffer("nikita"));
//             t.add(new StringBuffer("nisha"));
//             t.add(new StringBuffer("ankit"));
//             System.out.println(t);
//         }
// }
