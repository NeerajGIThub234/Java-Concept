//  3 CURSOR IN JAVA
// 1 ENUMERATION
// import java.util.Enumeration;
// import java.util.Vector;
// class Test{
//     public static void main(String[] args) {
//         Vector v=new Vector();
//         for(int i=1;i<=10;i++)
//              v.addElement(i);
//         System.out.println(v);
//        Enumeration e=v.elements();
//        while (e.hasMoreElements()) {
//          Integer i=(Integer)e.nextElement();
//            if (i%2==0) {
//               System.out.println(i);
//            }
//        }
//        System.out.println(v);
//     }
// }

// 2 ITERATOR
// import java.util.ArrayList;
// import java.util.Iterator;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l=new ArrayList();
//         for(int i=1;i<=10;i++)
//              l.add(i);
//         System.out.println(l);
//        Iterator i=l.iterator();
//        while (i.hasNext()) {
//          Integer i1=(Integer)i.next();
//            if (i1%2==0) {
//               System.out.println(i1);
//            }
//            else{
//             i.remove();
//            }
//        }
//        System.out.println(l);
//     }
// }

// 3 LIST ITERATOR
// import java.util.ArrayList;
// import java.util.ListIterator;
// class Test{
//     public static void main(String[] args) {
//         ArrayList l=new ArrayList();
//         for(int i=1;i<=10;i++)
//              l.add(i);
//         System.out.println(l);
//        ListIterator i=l.listIterator();
//        while (i.hasNext()) {
//          Integer i1=(Integer)i.next();
//            if (i1==2) {
//               i.remove();
//            }
//            else if(i1==4){
//             i.add(20);
//            }
//            else if(i1==6){
//             i.set(60);
//            }
//        }
//        System.out.println(l);
//     }
// }