// GENERICS & BOUNDED TYPE
// import java.util.ArrayList;
// class Test
// {
//  public static void main(String[] args) {
//     ArrayList<String> l=new ArrayList<String>();
//     l.add("neeraj");
//     l.add("bhavesh");
//     l.add("dipu");
//     System.out.println(l);
//     l.add(null);
//     System.out.println(l);
//     // l.add(true);
//     String o=l.get(0);
//     System.out.println(o);
//  }   
// }

// class MyGen<T>{
//     T ob;
//     MyGen(T ob){
//         this.ob=ob;
//     }
//     public void display(){
//         System.out.println(ob.getClass().getName());
//     }
//     public static void main(String[] args) {
//         MyGen<String> g=new MyGen<String>("csd");
//         g.display();
//         MyGen<Boolean> b=new MyGen<Boolean>(true);
//         b.display();
//     }
// }

// GENERICS METHOD AND WILD CARD CHARACTER(?)
// import java.util.HashSet;
// class Test{
//     public static void m1(HashSet<? super String> h){
//         System.out.println(h);
//         h.add(null);
//         h.add("neeraj");
        
//     }
//     public static void main(String[] args) {
//         HashSet<Object> h=new HashSet<Object>();
//         h.add("bhatt");
//         h.add("govind");
//         m1(h);
//         System.out.println(h);
//     }
// }

// import java.util.HashSet;
// class Test{
//     public static void m1(HashSet<?> h){
//         System.out.println(h);
//         h.add(null);
//         //h.add(30);

//     }
//     public static void main(String[] args) {
//         HashSet<Integer> h=new HashSet<Integer>();
//         h.add(20);
//         h.add(40);
//         m1(h);
//         System.out.println(h);
//     }
// }

// import java.util.HashSet;
// class Test{
//     public static void m1(HashSet<String> h){
//         System.out.println(h);
//         h.add(null);
//         h.add("neeraj");

//     }
//     public static void main(String[] args) {
//         HashSet<Integer> h=new HashSet<Integer>();
//         h.add(20);
//         h.add(40);
//         m1(h);
//         System.out.println(h);
//     }
// }

// import java.util.HashSet;
// class Test{
//     public static void m1(HashSet<String> h){
//         System.out.println(h);
//         h.add(null);
//         h.add("neeraj");

//     }
//     public static void main(String[] args) {
//         HashSet<String> h=new HashSet<String>();
//         h.add("shub");
//         h.add("lal");
//         m1(h);
//         System.out.println(h);
//     }
// }

// import java.util.HashMap;
// class Test{
//     public static void main(String[] args) {
//         HashMap<String,Integer> h=new HashMap<String,Integer>();
//         h.put("shub",100);
//         h.put("lal",200);
//         System.out.println(h);
//         h.put(100, 200);
//     }
// }