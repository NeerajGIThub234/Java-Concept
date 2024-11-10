//1 ARRAY LIST
// constructors of Array List
// // 1 ArrayList l=new ArrayList();
// import java.util.ArrayList;;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l=new ArrayList();
//         l.add(10);
//         l.add("neeraj");
//         l.add(10.5); 
//         System.out.println(l);
//     }
// }

// 2 ArrayList l=new ArrayList(int initialcapacity);
// import java.util.ArrayList;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l=new ArrayList(100);
//         l.add(10);
//         l.add("neeraj");
//         l.add(10.5);
//         l.add(true);
//         System.out.println(l);
//     }
// }

// 3 ArrayList l=new ArrayList(collection c);

// EXAMPLE -1
// import java.util.ArrayList;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l = new ArrayList();
//         l.add(10);
//         l.add("neeraj");
//         l.add(10.5);
//         l.add(1,true);
//         System.out.println(l);
//         System.out.println(l.get(2));
//         l.set(0, 'b');
//         System.out.println(l);
//         l.remove(0);
//         System.out.println(l);
//         System.out.println(l.indexOf("neeraj"));
//         l.add("neeraj");
//         System.out.println(l.lastIndexOf("neeraj"));
//     }
// }

// EXAMPLE-2
// import java.util.ArrayList;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l=new ArrayList();
//          ArrayList l1=new ArrayList();
//          l.add(10);
//          l.add(20);
//          l1.add(30);
//          System.out.println(l);
//          System.out.println(l1);
//          l1.addAll(l);
//          System.out.println(l);
//          System.out.println(l1);
//         l.addAll(0,l1);
//         System.out.println(l);
//          System.out.println(l1);
//     }
// }

// 2  LINKED LIST
// import java.util.LinkedList;
// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         l.add(10);
//         l.add(20);
//         l.add("csd");
//         l.add(1,"neeraj");
//         System.out.println(l);
//     }
// }

// 3 VECTOR LIST
// 3 constructors or vector 
//1 vector v=new vector()
//2 vector v=new vector(int initialCapacity)
//3 vector v= new vector(int initalCapacity,int incrementalCapacity)

// import java.util.Vector;
// class Test{
//     public static void main(String[] args) {
//         Vector v=new Vector();
//         System.out.println(v.capacity());
//         for(int i=1;i<=10;i++)
//              v.add(i);
//         System.out.println(v.capacity());
//         v.addElement(11);
//         System.out.println(v.capacity());
//         System.out.println(v);
//     }
// }

//3.1  STACK 
// import java.util.Stack;
// class Test{
//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push('A');
//         s.push('B');
//         s.push('C');
//         System.out.println(s);
//         System.out.println(s.search('A'));
//         System.out.println(s.search(10));
//         System.out.println(s.peek());
//         System.out.println(s);
//         System.out.println(s.pop());
//         System.out.println(s);
//     }
// }