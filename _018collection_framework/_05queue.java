// queue operation on linked list
// import java.util.LinkedList;
// class Test{
//     public static void main(String[] args) {
//         LinkedList l=new LinkedList();
//         l.offer(10);
//         l.offer("neeraj");
//         l.offer(true);
//         l.offer('n');
//         System.out.println(l);
//         System.out.println(l.poll());
//         System.out.println(l);
//         System.out.println(l.peek());
//         System.out.println(l);
//         System.out.println(l.remove());
//         System.out.println(l);
//         System.out.println(l.poll());
//         System.out.println(l.remove());
//         System.out.println(l);
//         System.out.println(l.poll());
//         System.out.println(l.remove());
//     }
// }

// queue operation on priority queue
// import java.util.PriorityQueue;
// class Test{
//     public static void main(String[] args) {
//         PriorityQueue p=new PriorityQueue();
//         p.offer(10);
//         p.offer(30);
//         p.add(45);
//         p.offer(90);
//         System.out.println(p);

//     }
// }

// import java.util.Comparator;
// import java.util.PriorityQueue;
// class MyComparator implements Comparator
// {
//     public int compare(Object obj1,Object obj2){
//         Integer i1=(Integer)obj1;
//         Integer i2=(Integer)obj2;
//         return i2.compareTo(i1);
//     }
// }
// class Test{
//     public static void main(String[] args) {
//         PriorityQueue p=new PriorityQueue(new MyComparator());
//         p.offer(10);
//         p.offer(30);
//         p.add(45);
//         p.offer(90);
//         System.out.println(p);

//     }
// }